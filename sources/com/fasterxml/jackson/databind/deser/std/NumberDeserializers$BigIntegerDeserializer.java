package com.fasterxml.jackson.databind.deser.std;

import java.math.BigInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class NumberDeserializers$BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
    public static final NumberDeserializers$BigIntegerDeserializer instance = new NumberDeserializers$BigIntegerDeserializer();

    public NumberDeserializers$BigIntegerDeserializer() {
        super(BigInteger.class);
    }
}
