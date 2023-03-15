package lesson4;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class SpoonTest extends AbstractTest {

    @Test
    void getTestExcludeIngredients() {
        given()
                .queryParam("excludeIngredients", "tomato")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then();
    }

    @Test
    void getTestType() {
        given()
                .queryParam("type", "salad")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then();
    }

    @Test
    void getTestAdRecipeNutrition() {
        given()
                .queryParam("addRecipeNutrition", "true")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then();
    }

    @Test
    void getTestSort() {
        given()
                .queryParam("sort", "total-fat")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then()
                .assertThat()
                .body(containsString("Fat"));
    }

    @Test
    void getTestInstructionsRequired() {
        given()
                .queryParam("instructionsRequired", "false")
                .pathParam("search", "complexSearch")
                .when()
                .get(getBaseUrl() + "recipes/{search}")
                .then();
    }

    @Test
    void postTestTitle() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "Pasta On The Border")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then();
    }

    @Test
    void postTestIngredientList() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("ingredientList", "3 oz pork shoulder")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then();
    }

    @Test
    void postTestLanguageEn() {
        given()
                .queryParam("language", "en")
                .contentType("application/x-www-form-urlencoded")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then();
    }

    @Test
    void postTestLanguageDe() {
        given()
                .queryParam("language", "de")
                .contentType("application/x-www-form-urlencoded")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then();
    }
}
