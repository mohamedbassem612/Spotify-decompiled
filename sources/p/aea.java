package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class aea implements pf40 {
    public static final aea a;
    private static final h661 descriptor;

    static {
        aea aeaVar = new aea();
        a = aeaVar;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.tastematch.api.BasicStory", aeaVar, 9);
        m0v0Var.j("story_type", true);
        m0v0Var.j("title", false);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("body", true);
        m0v0Var.j("image", true);
        m0v0Var.j("button", true);
        m0v0Var.j("audio_uri", true);
        m0v0Var.j("background_color", false);
        m0v0Var.j("share_metadata", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0Var2 = o9c1.a;
        return new nma0[]{nma0VarZ, nma0Var2, m5n1.z(nma0Var2), m5n1.z(nma0Var2), m5n1.z(nma0Var), m5n1.z(tdc.a), m5n1.z(nma0Var), nma0Var, m5n1.z(gb71.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        dc71 dc71Var = null;
        String str = null;
        q9c1 q9c1Var = null;
        q9c1 q9c1Var2 = null;
        q9c1 q9c1Var3 = null;
        String str2 = null;
        ydc ydcVar = null;
        String str3 = null;
        String strF = null;
        int i = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    q9c1Var = (q9c1) x1kVarB.A(h661Var, 1, o9c1.a, q9c1Var);
                    i |= 2;
                    break;
                case 2:
                    q9c1Var2 = (q9c1) x1kVarB.B(h661Var, 2, o9c1.a, q9c1Var2);
                    i |= 4;
                    break;
                case 3:
                    q9c1Var3 = (q9c1) x1kVarB.B(h661Var, 3, o9c1.a, q9c1Var3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    ydcVar = (ydc) x1kVarB.B(h661Var, 5, tdc.a, ydcVar);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) x1kVarB.B(h661Var, 6, chc1.a, str3);
                    i |= 64;
                    break;
                case 7:
                    strF = x1kVarB.f(h661Var, 7);
                    i |= 128;
                    break;
                case 8:
                    dc71Var = (dc71) x1kVarB.B(h661Var, 8, gb71.a, dc71Var);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new cea(i, str, q9c1Var, q9c1Var2, q9c1Var3, str2, ydcVar, str3, strF, dc71Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        cea ceaVar = (cea) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = ceaVar.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        o9c1 o9c1Var = o9c1.a;
        z1kVarB.k(h661Var, 1, o9c1Var, ceaVar.b);
        q9c1 q9c1Var = ceaVar.c;
        if (q9c1Var != null) {
            z1kVarB.s(h661Var, 2, o9c1Var, q9c1Var);
        }
        q9c1 q9c1Var2 = ceaVar.d;
        if (q9c1Var2 != null) {
            z1kVarB.s(h661Var, 3, o9c1Var, q9c1Var2);
        }
        String str2 = ceaVar.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        ydc ydcVar = ceaVar.f;
        if (ydcVar != null) {
            z1kVarB.s(h661Var, 5, tdc.a, ydcVar);
        }
        String str3 = ceaVar.g;
        if (str3 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str3);
        }
        z1kVarB.G(h661Var, 7, ceaVar.h);
        dc71 dc71Var = ceaVar.i;
        if (dc71Var != null) {
            z1kVarB.s(h661Var, 8, gb71.a, dc71Var);
        }
        z1kVarB.a(h661Var);
    }
}
