describe('test hooks',() =>{
    before(()=>{
        cy.log('before metho')
    })
    after(() =>{
        cy.log('after method')

    })
    beforeEach(()=>{

    })
    afterEach(()=>{
        
    })
    it('Testcase 1',()=>{
        cy.log('Testcase 1 method')

    })
    it('Testcase 2',()=>{
        
    })
})