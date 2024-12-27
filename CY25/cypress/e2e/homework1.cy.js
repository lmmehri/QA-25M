describe("homework1",()=>{
    it("locatorHomework",()=>{
        cy.visit("https://rahulshettyacademy.com/angularpractice/")
        cy.get('form.ng-untouched > :nth-child(1)').type('Mersy')
        cy.get(':nth-child(2) > .form-control').type ('mercy2@gmail.com')
        cy.get('#exampleInputPassword1').type('123456')
        cy.get('#exampleCheck1')
          .check()
          .should("be.checked")
      
       cy.get(':nth-child(6) > label') 
       cy.get('#exampleFormControlSelect1')
         .select('Female')
         .should('have.value','Female')
         cy.get('#inlineRadio2')
           .check()
           .should('have.value','option2')  
           cy.get(':nth-child(8) > .form-control') 
             .type('9000-12-12')

             cy.get('.btn')  
               .should('have.value','Submit').click()
                    
        
    })
})

    
        //cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
       // cy.get("#name").type("kebede")
       // cy.get("input[name='enter-name']").type("Abebe")
        //cy.get(cy.get('#alertbtn').click)

       // cy.xpath("//input[@id='displayed-text']").type("from xpath locators")
        //cy.get('#displayed-text').type(