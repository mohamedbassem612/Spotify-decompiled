package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class t3c1 implements pf40 {
    public static final t3c1 a;
    private static final h661 descriptor;

    static {
        t3c1 t3c1Var = new t3c1();
        a = t3c1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.tastematch.api.Stories", t3c1Var, 3);
        m0v0Var.j("playlist_uri", false);
        m0v0Var.j("intro_story", false);
        m0v0Var.j("stories", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, oa90.a, v3c1.d[2].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = v3c1.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        qa90 qa90Var = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                qa90Var = (qa90) x1kVarB.A(h661Var, 1, oa90.a, qa90Var);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new v3c1(i, strF, qa90Var, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        v3c1 v3c1Var = (v3c1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = v3c1.d;
        z1kVarB.G(h661Var, 0, v3c1Var.a);
        z1kVarB.k(h661Var, 1, oa90.a, v3c1Var.b);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), v3c1Var.c);
        z1kVarB.a(h661Var);
    }
}
