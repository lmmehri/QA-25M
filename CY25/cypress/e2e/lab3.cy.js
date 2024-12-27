describe("Test loop,checkbox and dropdown" , () =>{

    it('Test loop', () =>{
        cy.visit("https://rahulshettyacademy.com/seleniumPractise/")
        cy.get('.search-keyword').type("ca")

        cy.get(".products")
          .find(".product")  // descdent element
          .eq(1)   // index
          .contains("ADD TO CART")
          .click()

          cy.get(".products")
          .find(".product")
          .each(($el, $index, $list) =>{
            const x =$el.find('.product-name').text()  // to fetch or group textfrom the browser
            if(x.includes('carrot')){
                $el.find('button').click()
            }
          })

    });
    
    it.only('Test checkbox and dropdown ',() =>{
        cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
        cy.get(('#checkBoxOption1')) 
          .check()
          .should('be.checked')
          .and('have.value','option1')

        cy.get('#checkBoxOption1')
          .uncheck()
          .should('be.not.checked')

        cy.get("#dropdown-class-example") 
          .select('option3') 
          .should('have.value','option3')

        cy.get('#autocomplete').type('eth') 
        cy.get('.ui-menu-item div').each(($el, $index, $list)=>{
            const ctr =$el.text()
            if(ctr==='Netherlands'){
                $el.click()
            }
        })
     }) 

});

