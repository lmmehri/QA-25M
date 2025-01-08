//import cypress from 'cypress'
import 'cypress-xpath'
//**********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
Cypress.Commands.add('tabledata', (xy)=>{

    cy.get('tr td:nth-child(2)').each(($el,$index, $list ) =>{
        const txt =$el.text()
        if(txt.includes(xy)){
            cy.get("tr td:nth-child(2)").eq($index).next().then(function(City) {
           const p = City.text() 
           
           //expect(p).to.be.equal('25') 
           cy.log(p)
        }) 
        cy.get("tr td:nth-child(2)").eq($index).prev().then(function(name) {
            const p = name.text()  
           // expect(p).to.be.equal('25') 
            cy.log(p)   
       })
        
      
    }
    })
})
Cypress.Commands.add("second",function(){
    cy.log("data from commands file")

})

//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })