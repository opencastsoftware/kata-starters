module CoreSpec where

import qualified Core (increment)
import Test.Hspec
import Test.Hspec.QuickCheck

spec :: Spec
spec = describe "Core.increment" $ do
  it "increments 1" $ do
    Core.increment 1 `shouldBe` 2
  prop "increments any integer" $ do
    \i -> Core.increment i - i `shouldBe` 1