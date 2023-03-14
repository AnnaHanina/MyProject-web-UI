package lesson3;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class SpoonacularTest extends AbstractTest {


    @Test
    void getTestExcludeIngredients() {
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("excludeIngredients", "tomato")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then()
                .assertThat()
                .body(equalTo("tomato"))
                .time(lessThan(3000L))
                .statusCode(200);
    }

    @Test
    void getTestType() {
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("type", "salad")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then()
                .assertThat()
                .body(equalTo("salad"))
                .statusCode(200);
    }

    @Test
    void getTestAdRecipeNutrition() {
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("addRecipeNutrition", "true")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200);
    }

    @Test
    void getTestSort() {
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("sort", "total-fat")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then()
                .assertThat()
                .body(equalTo("Fat"))
                .statusCode(200);
    }

    @Test
    void getTestInstructionsRequired() {
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("instructionsRequired", "false")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200);
    }

    @Test
    void postTestTitle() {
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "Pasta On The Border")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .assertThat()
                .header("Connection", "keep-alive")
                .statusCode(200);
    }

    @Test
    void postTestIngredientList() {
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("ingredientList", "3 oz pork shoulder")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .assertThat()
                .header("Connection", "keep-alive")
                .statusCode(200);
    }

    @Test
    void postTestLanguageEn() {
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("language", "en")
                .contentType("application/x-www-form-urlencoded")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .assertThat()
                .header("Connection", "keep-alive")
                .statusCode(200);
    }

    @Test
    void postTestLanguageDe() {
        given()
                .queryParam("apiKey", getApiKey())
                .queryParam("language", "de")
                .contentType("application/x-www-form-urlencoded")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .assertThat()
                .header("Connection", "keep-alive")
                .statusCode(200);
    }

    @Test
    void postTestValidContentType () {
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "Summer Berry Salad")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200);
    }
}
