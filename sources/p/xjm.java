package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xjm implements nma0 {
    public static final xjm a = new xjm();
    public static final j661 b = omo1.i("ContextPlayerConfiguration", new h661[0], afm.W0);

    public final Object deserialize(dar darVar) {
        j661 j661Var = b;
        x1k x1kVarB = darVar.b(j661Var);
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        while (true) {
            int iP = x1kVarB.p(j661Var);
            if (iP == -1) {
                x1kVarB.a(j661Var);
                return new wjm((String) objB, (Boolean) objB2, (Float) objB3);
            }
            if (iP == 0) {
                objB = x1kVarB.B(j661Var, iP, m5n1.z(pma.a), (Object) null);
            } else if (iP == 1) {
                objB2 = x1kVarB.B(j661Var, iP, m5n1.z(hma.a), (Object) null);
            } else {
                if (iP != 2) {
                    uh61.j(f4i1.c(iP, "Unexpected ContextPlayerConfiguration field index "));
                    return null;
                }
                objB3 = x1kVarB.B(j661Var, iP, m5n1.z(mma.a), (Object) null);
            }
        }
    }

    public final h661 getDescriptor() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void serialize(uax uaxVar, Object obj) throws SerializationException {
        throw new SerializationException("Serializing ContextPlayerConfiguration is not supported");
    }
}
