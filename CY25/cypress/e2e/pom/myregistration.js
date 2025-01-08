class myReg{
     getName(){
        return cy.get(':nth-child(1) > .form-control')
     }
     getEmail(){
        return cy.get(':nth-child(2) > .form-control')
     }
     getpassword(){
        return cy.get(':nth-child(3) > .form-control')
     }
     getcheckbox(){
        return cy.get('#exampleCheck1')
        
     }
    getgender(){
        return cy.get('#exampleFormControlSelect1')
    }
    getEmployedStatus(){
        return cy.get('#inlineRadio2')
    }
    getdateofbirth(){
        return cy.get(':nth-child(8) > .form-control')
    }

    submit(){
        return cy.get('.btn')
    }

    getSubmitSuccessMessage(){
        cy.scrollTo('top');
        return cy.get('.alert-success')
    }
}
export default myReg;