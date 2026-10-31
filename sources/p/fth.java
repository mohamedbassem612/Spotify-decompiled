package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class fth implements pf40 {
    public static final fth a;
    private static final h661 descriptor;

    static {
        fth fthVar = new fth();
        a = fthVar;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.message.CommunicationNotification", fthVar, 5);
        m0v0Var.j("sender", false);
        m0v0Var.j("conversation_id", false);
        m0v0Var.j("group", true);
        m0v0Var.j("media_attachment", true);
        m0v0Var.j("message_uri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{jrs0.a, nma0Var, m5n1.z(ith.a), m5n1.z(lth.a), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        lrs0 lrs0Var = null;
        String strF = null;
        kth kthVar = null;
        nth nthVar = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                lrs0Var = (lrs0) x1kVarB.A(h661Var, 0, jrs0.a, lrs0Var);
                i |= 1;
            } else if (iP == 1) {
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                kthVar = (kth) x1kVarB.B(h661Var, 2, ith.a, kthVar);
                i |= 4;
            } else if (iP == 3) {
                nthVar = (nth) x1kVarB.B(h661Var, 3, lth.a, nthVar);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 4, chc1.a, str);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new hth(i, lrs0Var, strF, kthVar, nthVar, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hth hthVar = (hth) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        jrs0 jrs0Var = jrs0.a;
        lrs0 lrs0Var = hthVar.a;
        String str = hthVar.e;
        nth nthVar = hthVar.d;
        kth kthVar = hthVar.c;
        z1kVarB.k(h661Var, 0, jrs0Var, lrs0Var);
        z1kVarB.G(h661Var, 1, hthVar.b);
        if (z1kVarB.d0() || kthVar != null) {
            z1kVarB.s(h661Var, 2, ith.a, kthVar);
        }
        if (z1kVarB.d0() || nthVar != null) {
            z1kVarB.s(h661Var, 3, lth.a, nthVar);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
