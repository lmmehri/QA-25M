
import myReg from "./pom/myregistration";
describe('test POM',() => {
    let a
    before(()=>{
        cy.fixture('mydata').then((mydata) =>{
            a = mydata
        })
    })
    
    it('test data',() =>{
        cy.visit('https://rahulshettyacademy.com/angularpractice/')
        const  register=new myReg()

       register.getName().type(a.name)
       register.getEmail().type(a.email)
       register.getpassword().type(a.password)
       if(a.loveicecream){
           register.getcheckbox().check()
       }
       register.getgender().select(a.gender[0])
       if(a.employmentStatus === "Employed"){
           register.getEmployedStatus().check()
       }
            
       register.getdateofbirth().type(a.dateofbirth)

       register.submit().click();
        
       register.getSubmitSuccessMessage().contains("The Form has been submitted successfully!");
    }
    );
}) 