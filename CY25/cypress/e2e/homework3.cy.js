describe('Test confirm', () => {
    it('Test confirm',() => {
      cy.visit("https://rahulshettyacademy.com/AutomationPractice/");
      cy.get('#confirmbtn').click()

      cy.on("window:alert",(str)=>{
        expect(str).to.be.equal("Hello , Are you sure you want to confirm?")
      })
      
  })
  it.only('Test Table',() =>{
    cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
    cy.get('.tableFixHead > #product > tbody > :nth-child(5) > :nth-child(1)').each(($el,$index, $list ) =>{
      const txt =$el.text()
      if(txt.includes('Jack')){
        cy.get('.tableFixHead > #product > tbody > :nth-child(5) > :nth-child(1)').eq($index).next().then(function(positionIndex) {
         const position = positionIndex.text() 
         
         expect(position).to.be.equal('Engineer') 
        
         //cy.log(25)
      }) 
      cy.get('.tableFixHead > #product > tbody > :nth-child(5) > :nth-child(2)').eq($index).next().then(function(cityIndex) {
        const city = cityIndex.text() 
        
        expect(city).to.be.equal('Pune') 
       
        //cy.log(25)
     }) 
     cy.get('.tableFixHead > #product > tbody > :nth-child(5) > :nth-child(3)').eq($index).next().then(function(amountIndex) {
        const amount = amountIndex.text() 
        
        expect(amount).to.be.equal('32') 

     })     
    
      }
  })
})
})