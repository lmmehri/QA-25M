//import { assert } from "chai"

describe("lab2",()=>{

    it.only('id locator', () => {
        //cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
       // cy.get("#name").type("kebede")
       // cy.get("input[name='enter-name']").type("Abebe")
        //cy.get(cy.get('#alertbtn').click)

       // cy.xpath("//input[@id='displayed-text']").type("from xpath locators")
        //cy.get('#displayed-text').type("locator")
    cy.visit("https://rahulshettyacademy.com/seleniumPractise/")
    cy.get('.search-keyword')
      .type("ca")
      .should('have.value','ca')
      .and('have.length',1)
      .and('have.attr','type','search')
   // cy.get('.products').find('.product')
    //cy.get('.product').should('have.length', 4)
    cy.get('.product:visible').should('have.length',4)

    //parent to childe
    cy.get('.products').find('.product').should('have.length',4)
})

it("Assertions",()=>{
    expect(true).to.be.true;

    assert.isAbove(6, 1,"6 > 1")  
    assert.isBelow(1,6)

})

})