fn increment(i: i32) -> i32 {
    return i + 1;
}

#[cfg(test)]
mod tests {
    #[test]
    fn increment_adds_one() {
        assert_eq!(super::increment(1), 2);
    }
}
