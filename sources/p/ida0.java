package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ida0 implements pf40 {
    public static final ida0 a;
    private static final h661 descriptor;

    static {
        ida0 ida0Var = new ida0();
        a = ida0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.JoinOption", ida0Var, 3);
        m0v0Var.j("playback_control", false);
        m0v0Var.j("host_approval", false);
        m0v0Var.j("listen_mode", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, gs60.a, k8d0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        qs60 qs60Var = null;
        m8d0 m8d0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                qs60Var = (qs60) x1kVarB.A(h661Var, 1, gs60.a, qs60Var);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                m8d0Var = (m8d0) x1kVarB.A(h661Var, 2, k8d0.a, m8d0Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new lda0(i, strF, qs60Var, m8d0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lda0 lda0Var = (lda0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = lda0Var.a;
        m8d0 m8d0Var = lda0Var.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.k(h661Var, 1, gs60.a, lda0Var.b);
        if (z1kVarB.d0() || !u890.j(m8d0Var, new m8d0())) {
            z1kVarB.k(h661Var, 2, k8d0.a, m8d0Var);
        }
        z1kVarB.a(h661Var);
    }
}
