package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cjo0 implements nma0 {
    public static final cjo0 a = new cjo0();
    public static final bjo0 b = bjo0.a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object deserialize(dar darVar) throws SerializationException {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    public final h661 getDescriptor() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void serialize(uax uaxVar, Object obj) throws SerializationException {
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
