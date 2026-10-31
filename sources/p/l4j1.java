package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l4j1 implements nma0 {
    public static final l4j1 a = new l4j1();
    public static final nma0 b;
    public static final h661 c;

    static {
        nma0 nma0VarZ = m5n1.z(chc1.a);
        b = nma0VarZ;
        c = nma0VarZ.getDescriptor();
    }

    public final Object deserialize(dar darVar) {
        String str = (String) darVar.Y(b);
        if (str != null) {
            return o0p1.n(str);
        }
        return null;
    }

    public final h661 getDescriptor() {
        return c;
    }

    public final void serialize(uax uaxVar, Object obj) {
        m4j1 m4j1Var = (m4j1) obj;
        uaxVar.i(b, m4j1Var != null ? m4j1Var.toString() : null);
    }
}
