package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class arj1 implements pf40 {
    public static final arj1 a;
    private static final h661 descriptor;

    static {
        arj1 arj1Var = new arj1();
        a = arj1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.contextplayercoordinatorimpl.cosmos.VideoPlayerAdvanceReason", arj1Var, 4);
        m0v0Var.j("reason", false);
        m0v0Var.j("unplayable_reason", true);
        m0v0Var.j("playback_id", true);
        m0v0Var.j("stop_position", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = crj1.e;
        return new nma0[]{znb0VarArr[0].getValue(), m5n1.z((nma0) znb0VarArr[1].getValue()), m5n1.z(chc1.a), m5n1.z(o5f0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = crj1.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        sg01 sg01Var = null;
        yjh1 yjh1Var = null;
        String str = null;
        Long l = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                sg01Var = (sg01) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), sg01Var);
                i |= 1;
            } else if (iP == 1) {
                yjh1Var = (yjh1) x1kVarB.B(h661Var, 1, (nma0) znb0VarArr[1].getValue(), yjh1Var);
                i |= 2;
            } else if (iP == 2) {
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                l = (Long) x1kVarB.B(h661Var, 3, o5f0.a, l);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new crj1(i, sg01Var, yjh1Var, str, l);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        crj1 crj1Var = (crj1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = crj1.e;
        z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), crj1Var.a);
        yjh1 yjh1Var = crj1Var.b;
        if (yjh1Var != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), yjh1Var);
        }
        String str = crj1Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        Long l = crj1Var.d;
        if (l != null) {
            z1kVarB.s(h661Var, 3, o5f0.a, l);
        }
        z1kVarB.a(h661Var);
    }
}
