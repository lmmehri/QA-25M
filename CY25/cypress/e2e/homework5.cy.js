import login from "./pom/login";
import Reg from "./pom/regisration";
describe('test POM',() => {
    let b
    before(()=>{
        cy.fixture('mydata').then((mydata) =>{
            b = mydata
        })
    })
    
    it('test data',() =>{
        cy.visit('https://rahulshettyacademy.com/angularpractice/')
        const  register=new Reg()
       // register.getName().type("Kebede")
       // register.getemail().type('kebe12@gmail.com')
       register.getName().type(b.Name)
       register.getemail().type(b.email)
       register.getpassword().type(b.password)
       registery.getcheckbox().check
       register.getgender().select(b)
       register.getstatus().check
       register.getdateofbirth().type(b.dateofbirt)

       const lp =new login()
        lp.display()
       
    }
    );
}) 