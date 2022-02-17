import Test.Hspec

import qualified CoreSpec

main :: IO ()
main = hspec spec

spec :: Spec
spec = do
  describe "Core" CoreSpec.spec