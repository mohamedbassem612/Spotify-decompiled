package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class bri1 implements pf40 {
    public static final bri1 a;
    private static final h661 descriptor;

    static {
        bri1 bri1Var = new bri1();
        a = bri1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.tastematch.api.ValidInvitation", bri1Var, 3);
        m0v0Var.j("sender", false);
        m0v0Var.j("recipient", false);
        m0v0Var.j("playlist_uri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(chc1.a);
        o2b o2bVar = o2b.a;
        return new nma0[]{o2bVar, o2bVar, nma0VarZ};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        s2b s2bVar = null;
        s2b s2bVar2 = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                s2bVar = (s2b) x1kVarB.A(h661Var, 0, o2b.a, s2bVar);
                i |= 1;
            } else if (iP == 1) {
                s2bVar2 = (s2b) x1kVarB.A(h661Var, 1, o2b.a, s2bVar2);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new dri1(i, s2bVar, s2bVar2, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dri1 dri1Var = (dri1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        cri1 cri1Var = dri1.Companion;
        o2b o2bVar = o2b.a;
        z1kVarB.k(h661Var, 0, o2bVar, dri1Var.b);
        z1kVarB.k(h661Var, 1, o2bVar, dri1Var.c);
        String str = dri1Var.d;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
