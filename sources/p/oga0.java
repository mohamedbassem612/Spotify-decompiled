package p;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oga0 implements nma0 {
    public static final oga0 a = new oga0();
    public static final qnw0 b = omo1.c("kotlinx.serialization.json.JsonLiteral", knw0.o);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object deserialize(dar darVar) throws SerializationException {
        bga0 bga0VarT = dem1.t(darVar);
        ega0 ega0VarM = bga0VarT.m();
        if (ega0VarM instanceof nga0) {
            return (nga0) ega0VarM;
        }
        throw new JsonDecodingException(vvm1.w(-1, us71.f(rc11.a, ega0VarM.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), (String) null, (String) null, bga0VarT.d().a.m ? vvm1.C(-1, ega0VarM.toString()).toString() : null));
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        nga0 nga0Var = (nga0) obj;
        String str = nga0Var.c;
        dem1.u(uaxVar);
        if (nga0Var.a) {
            uaxVar.h0(str);
            return;
        }
        h661 h661Var = nga0Var.b;
        if (h661Var != null) {
            uaxVar.v(h661Var).h0(str);
            return;
        }
        Long lD0 = nhc1.d0(10, str);
        if (lD0 != null) {
            uaxVar.z(lD0.longValue());
            return;
        }
        z4h1 z4h1VarC = zno1.C(str);
        if (z4h1VarC != null) {
            uaxVar.v(d5h1.b).z(z4h1VarC.a);
            return;
        }
        Double dA0 = nhc1.a0(str);
        if (dA0 != null) {
            uaxVar.h(dA0.doubleValue());
            return;
        }
        Boolean boolD1 = ihc1.d1(str);
        if (boolD1 != null) {
            uaxVar.P(boolD1.booleanValue());
        } else {
            uaxVar.h0(str);
        }
    }
}
