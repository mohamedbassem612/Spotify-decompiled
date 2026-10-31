package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class oa90 implements pf40 {
    public static final oa90 a;
    private static final h661 descriptor;

    static {
        oa90 oa90Var = new oa90();
        a = oa90Var;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.tastematch.api.IntroStory", oa90Var, 7);
        m0v0Var.j("title1", false);
        m0v0Var.j("subtitle1", true);
        m0v0Var.j("title2", false);
        m0v0Var.j("subtitle2", true);
        m0v0Var.j("audio_uri", true);
        m0v0Var.j("background_color", false);
        m0v0Var.j("share_metadata", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = o9c1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0Var2 = chc1.a;
        return new nma0[]{nma0Var, nma0VarZ, nma0Var, nma0VarZ2, m5n1.z(nma0Var2), nma0Var2, m5n1.z(gb71.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        q9c1 q9c1Var = null;
        q9c1 q9c1Var2 = null;
        q9c1 q9c1Var3 = null;
        q9c1 q9c1Var4 = null;
        String str = null;
        String strF = null;
        dc71 dc71Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    q9c1Var = (q9c1) x1kVarB.A(h661Var, 0, o9c1.a, q9c1Var);
                    i |= 1;
                    break;
                case 1:
                    q9c1Var2 = (q9c1) x1kVarB.B(h661Var, 1, o9c1.a, q9c1Var2);
                    i |= 2;
                    break;
                case 2:
                    q9c1Var3 = (q9c1) x1kVarB.A(h661Var, 2, o9c1.a, q9c1Var3);
                    i |= 4;
                    break;
                case 3:
                    q9c1Var4 = (q9c1) x1kVarB.B(h661Var, 3, o9c1.a, q9c1Var4);
                    i |= 8;
                    break;
                case 4:
                    str = (String) x1kVarB.B(h661Var, 4, chc1.a, str);
                    i |= 16;
                    break;
                case 5:
                    strF = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    dc71Var = (dc71) x1kVarB.B(h661Var, 6, gb71.a, dc71Var);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new qa90(i, q9c1Var, q9c1Var2, q9c1Var3, q9c1Var4, str, strF, dc71Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qa90 qa90Var = (qa90) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        o9c1 o9c1Var = o9c1.a;
        z1kVarB.k(h661Var, 0, o9c1Var, qa90Var.a);
        q9c1 q9c1Var = qa90Var.b;
        if (q9c1Var != null) {
            z1kVarB.s(h661Var, 1, o9c1Var, q9c1Var);
        }
        z1kVarB.k(h661Var, 2, o9c1Var, qa90Var.c);
        q9c1 q9c1Var2 = qa90Var.d;
        if (q9c1Var2 != null) {
            z1kVarB.s(h661Var, 3, o9c1Var, q9c1Var2);
        }
        String str = qa90Var.e;
        if (str != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str);
        }
        z1kVarB.G(h661Var, 5, qa90Var.f);
        dc71 dc71Var = qa90Var.g;
        if (dc71Var != null) {
            z1kVarB.s(h661Var, 6, gb71.a, dc71Var);
        }
        z1kVarB.a(h661Var);
    }
}
