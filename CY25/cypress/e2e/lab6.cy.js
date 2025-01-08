describe('test hooks',() =>{
    before(()=>{
        cy.log('before metho')
    })

    after(() =>{
        cy.log('after method')

    })
    beforeEach(()=>{
        cy.log('beforeeach method')
        
    })
    afterEach(()=>{
        cy.log('aftereach method')
        
    })
    it('Testcase1', () => {
        cy.log('testcase1 method')
        
    });
   
    it('Testcase2', () => {
        cy.log('testcase2 method')
        
    });
    beforeEach(()=>{

    })
    it('Testcase3', () => {
        cy.log('testcase3 method')
        
    });
    
    


        
    
})