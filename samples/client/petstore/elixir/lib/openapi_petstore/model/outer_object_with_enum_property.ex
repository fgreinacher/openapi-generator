# NOTE: This file is auto generated by OpenAPI Generator 7.15.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.OuterObjectWithEnumProperty do
  @moduledoc """
  
  """

  @derive JSON.Encoder
  defstruct [
    :value
  ]

  @type t :: %__MODULE__{
    :value => OpenapiPetstore.Model.OuterEnumInteger.t
  }

  alias OpenapiPetstore.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:value, :struct, OpenapiPetstore.Model.OuterEnumInteger)
  end
end

