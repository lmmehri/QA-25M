
describe('test commands',()=>{
    let a;
    before(()=>{
     cy.fixture("product").then((data)=>{
        a = data
     })   
    })
    it('commands data',()=> {
        cy.visit('https://rahulshettyacademy.com/AutomationPractice/')
        cy.tabledata(a.position1)  //call
        cy.tabledata(a.Position2)
        cy.tabledata(a.Position3)

        cy.second()
    });
})