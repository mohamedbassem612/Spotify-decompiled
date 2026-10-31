package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class mgo implements pf40 {
    public static final mgo a;
    private static final h661 descriptor;

    static {
        mgo mgoVar = new mgo();
        a = mgoVar;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.datalayermessages.CurateAudiobookMessageRequest", mgoVar, 4);
        m0v0Var.j("audiobookUri", false);
        m0v0Var.j("destinationUri", false);
        m0v0Var.j("isRemoving", false);
        m0v0Var.j("interaction", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(rv80.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, gpb.a, nma0VarZ};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        tv80 tv80Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                zM = x1kVarB.M(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                tv80Var = (tv80) x1kVarB.B(h661Var, 3, rv80.a, tv80Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new ogo(i, strF, strF2, zM, tv80Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ogo ogoVar = (ogo) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = ogoVar.a;
        tv80 tv80Var = ogoVar.d;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, ogoVar.b);
        z1kVarB.E(h661Var, 2, ogoVar.c);
        if (z1kVarB.d0() || tv80Var != null) {
            z1kVarB.s(h661Var, 3, rv80.a, tv80Var);
        }
        z1kVarB.a(h661Var);
    }
}
