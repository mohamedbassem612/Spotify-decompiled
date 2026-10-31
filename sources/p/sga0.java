package p;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sga0 implements nma0 {
    public static final sga0 a = new sga0();
    public static final j661 b = omo1.l("kotlinx.serialization.json.JsonNull", l661.h, new h661[0]);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object deserialize(dar darVar) throws SerializationException {
        dem1.t(darVar);
        if (darVar.X()) {
            throw new JsonDecodingException(vvm1.w(-1, "Expected 'null' literal", (String) null, (String) null, (String) null));
        }
        return rga0.INSTANCE;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dem1.u(uaxVar);
        uaxVar.J();
    }
}
