package runner;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 

@io.cucumber.testng.CucumberOptions(  
					features="E:\\complete_Drive\\complete Cucumber Practies\\CucumberDemo\\TutorialsNinja\\src\\test\\resources\\features",
					glue={"stepdefinitions","hooks"},
					publish=true,
		            plugin= {"pretty",
		            			  "html:target/CHR/subash1_HReport.html" ,
		            			   "json:target/CHR1/subash2_HReport.json",
		            			   "junit:target/CHR2/subash3_HReport.xml"    }
		            
		         )
public class Test_Data_table_Registartion_Runner extends AbstractTestNGCucumberTests {

}
