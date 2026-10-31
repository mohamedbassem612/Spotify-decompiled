package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ebf implements pf40 {
    public static final ebf a;
    private static final h661 descriptor;

    static {
        ebf ebfVar = new ebf();
        a = ebfVar;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatMessage", ebfVar, 5);
        m0v0Var.j("messageUuid", false);
        m0v0Var.j("textMessage", true);
        m0v0Var.j("metadata", false);
        m0v0Var.j("senderUser", false);
        m0v0Var.j("sentAt", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(zae1.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, nma0VarZ, wbf.a, m4i1.a, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        bbe1 bbe1Var = null;
        ybf ybfVar = null;
        y4i1 y4i1Var = null;
        String strF2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                bbe1Var = (bbe1) x1kVarB.B(h661Var, 1, zae1.a, bbe1Var);
                i |= 2;
            } else if (iP == 2) {
                ybfVar = (ybf) x1kVarB.A(h661Var, 2, wbf.a, ybfVar);
                i |= 4;
            } else if (iP == 3) {
                y4i1Var = (y4i1) x1kVarB.A(h661Var, 3, m4i1.a, y4i1Var);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                strF2 = x1kVarB.f(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new ibf(i, strF, bbe1Var, ybfVar, y4i1Var, strF2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ibf ibfVar = (ibf) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = ibfVar.a;
        bbe1 bbe1Var = ibfVar.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || bbe1Var != null) {
            z1kVarB.s(h661Var, 1, zae1.a, bbe1Var);
        }
        z1kVarB.k(h661Var, 2, wbf.a, ibfVar.c);
        z1kVarB.k(h661Var, 3, m4i1.a, ibfVar.d);
        z1kVarB.G(h661Var, 4, ibfVar.e);
        z1kVarB.a(h661Var);
    }
}
