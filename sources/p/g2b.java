package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class g2b implements pf40 {
    public static final g2b a;
    private static final h661 descriptor;

    static {
        g2b g2bVar = new g2b();
        a = g2bVar;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.attribution.domain.BlendMultiUserAttributionMetadata", g2bVar, 1);
        m0v0Var.j("attributed_users", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{i2b.b[0].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = i2b.b;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new i2b(i, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) i2b.b[0].getValue(), ((i2b) obj).a);
        z1kVarB.a(h661Var);
    }
}
