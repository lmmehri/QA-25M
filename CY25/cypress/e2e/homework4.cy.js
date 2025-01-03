describe('Fixture' ,() => {
    let myd
    before(() => {

        cy.fixture("mydata").then(function(x){
           myd = x
        
        })

    })
    it('datadriving(fixture)', () =>{
        cy.visit("https://rahulshettyacademy.com/angularpractice/")
        cy.get(':nth-child(1) > .form-control').type(myd.name)
        cy.get(':nth-child(2) > .form-control').type(myd.email)
        cy.get(':nth-child(3) > .form-control').type(myd.password)
        cy.get('#exampleFormControlSelect1').select(myd.gender[0])
        cy.get(':nth-child(8) > .form-control').type(myd.dateofbirth)
        cy.get('.btn').click();
        cy.scrollTo('top');
        cy.get('.alert-success').contains("The Form has been submitted successfully!");
       
        //expect(alert).to.be.equal("Success! The Form has been submitted successfully!.");


    })
})