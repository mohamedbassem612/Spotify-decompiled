package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class smg0 implements pf40 {
    public static final smg0 a;
    private static final h661 descriptor;

    static {
        smg0 smg0Var = new smg0();
        a = smg0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.puffin.core.data.MapDeviceToFiltersResponse", smg0Var, 7);
        m0v0Var.j("specificEnabled", true);
        m0v0Var.j("specificDisabled", false);
        m0v0Var.j("externalizationEnabled", false);
        m0v0Var.j("externalizationDisabled", false);
        m0v0Var.j("status", false);
        m0v0Var.j("ambiguousEntityName", true);
        m0v0Var.j("ambiguousEntityType", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = umg0.h;
        return new nma0[]{m5n1.z(zoa1.a), qoa1.a, ib10.a, cb10.a, znb0VarArr[4].getValue(), m5n1.z(chc1.a), m5n1.z((nma0) znb0VarArr[6].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = umg0.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        bpa1 bpa1Var = null;
        soa1 soa1Var = null;
        kb10 kb10Var = null;
        eb10 eb10Var = null;
        ovt ovtVar = null;
        String str = null;
        lz3 lz3Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    bpa1Var = (bpa1) x1kVarB.B(h661Var, 0, zoa1.a, bpa1Var);
                    i |= 1;
                    break;
                case 1:
                    soa1Var = (soa1) x1kVarB.A(h661Var, 1, qoa1.a, soa1Var);
                    i |= 2;
                    break;
                case 2:
                    kb10Var = (kb10) x1kVarB.A(h661Var, 2, ib10.a, kb10Var);
                    i |= 4;
                    break;
                case 3:
                    eb10Var = (eb10) x1kVarB.A(h661Var, 3, cb10.a, eb10Var);
                    i |= 8;
                    break;
                case 4:
                    ovtVar = (ovt) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), ovtVar);
                    i |= 16;
                    break;
                case 5:
                    str = (String) x1kVarB.B(h661Var, 5, chc1.a, str);
                    i |= 32;
                    break;
                case 6:
                    lz3Var = (lz3) x1kVarB.B(h661Var, 6, (nma0) znb0VarArr[6].getValue(), lz3Var);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new umg0(i, bpa1Var, soa1Var, kb10Var, eb10Var, ovtVar, str, lz3Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        umg0 umg0Var = (umg0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = umg0.h;
        bpa1 bpa1Var = umg0Var.a;
        lz3 lz3Var = umg0Var.g;
        if (bpa1Var != null) {
            z1kVarB.s(h661Var, 0, zoa1.a, bpa1Var);
        }
        z1kVarB.k(h661Var, 1, qoa1.a, umg0Var.b);
        z1kVarB.k(h661Var, 2, ib10.a, umg0Var.c);
        z1kVarB.k(h661Var, 3, cb10.a, umg0Var.d);
        z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), umg0Var.e);
        String str = umg0Var.f;
        if (str != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str);
        }
        if (lz3Var != null) {
            z1kVarB.s(h661Var, 6, (nma0) znb0VarArr[6].getValue(), lz3Var);
        }
        z1kVarB.a(h661Var);
    }
}
