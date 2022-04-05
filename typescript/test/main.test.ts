import { increment } from "../src/main";

test('increment', () => {
    expect(increment(1)).toBe(2);
});