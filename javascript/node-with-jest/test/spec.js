const helloWorld = require("../src/index");

describe("Hello world", () => {
  it("example test", () => {
    var result = helloWorld();
    expect(result).toEqual(1);
  });
});
