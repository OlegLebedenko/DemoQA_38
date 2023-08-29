import manager.HelperStudent;
import models.Gender;
import models.Hobby;
import models.StudentDTO;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentFormTest extends TestBase implements HelperStudent {

    @BeforeMethod
    public void precondition(){
        selectForms();
        selectPracticeForm();
    }

    @Test
    public void studentFormPositive(){

        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(Hobby.MUSIC);
        hobbies.add(Hobby.READING);


        StudentDTO studentDTO = StudentDTO.builder()
                .firstName("Boris")
                .lastName("Kogan")
                .email("boris@mail.com")
                .gender(Gender.MALE)
                .phone("0548034872")
                .birthday("6 8 2000")
                .subjects("Maths,Physics")
                .hobbies(hobbies)
                .address("Main street, 5")
                .state("NCR")
                .city("Delhi")
                .build();

        hideFooter();
        hideDiv();
        fillForm(studentDTO);
        submit();

    }

}
