package p;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dha0 implements nma0 {
    public static final dha0 a = new dha0();
    public static final j661 b = omo1.l("kotlinx.serialization.json.JsonPrimitive", knw0.o, new h661[0]);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object deserialize(dar darVar) throws SerializationException {
        bga0 bga0VarT = dem1.t(darVar);
        ega0 ega0VarM = bga0VarT.m();
        if (ega0VarM instanceof aha0) {
            return (aha0) ega0VarM;
        }
        throw new JsonDecodingException(vvm1.w(-1, us71.f(rc11.a, ega0VarM.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), (String) null, (String) null, bga0VarT.d().a.m ? vvm1.C(-1, ega0VarM.toString()).toString() : null));
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        aha0 aha0Var = (aha0) obj;
        dem1.u(uaxVar);
        if (aha0Var instanceof rga0) {
            uaxVar.i(sga0.a, rga0.INSTANCE);
        } else {
            uaxVar.i(oga0.a, (nga0) aha0Var);
        }
    }
}
