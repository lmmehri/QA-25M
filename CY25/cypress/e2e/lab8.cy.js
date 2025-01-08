import login from "./pom/login";
import Reg from "./pom/regisration";
describe('test POM',() => {
    let b
    before(()=>{
        cy.fixture('data').then((data) =>{
            b = data
        })
    })
    
    it('test data',() =>{
        cy.visit('https://rahulshettyacademy.com/angularpractice/')
        const  register=new Reg()
       // register.getName().type("Kebede")
       // register.getemail().type('kebe12@gmail.com')
       register.getName().type(b.Name)
       register.getName().type(b.email)

       const lp =new login()
        lp.display()
       
    }
    );
}) 