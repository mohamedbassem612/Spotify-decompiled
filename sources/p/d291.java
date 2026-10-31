package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class d291 implements pf40 {
    public static final d291 a;
    private static final h661 descriptor;

    static {
        d291 d291Var = new d291();
        a = d291Var;
        m0v0 m0v0Var = new m0v0("com.spotify.thestage.vtec.datasource.Site", d291Var, 11);
        m0v0Var.j("lookupToken", false);
        m0v0Var.j("url", false);
        m0v0Var.j("authType", false);
        m0v0Var.j("clientId", true);
        m0v0Var.j("hasAudio", false);
        m0v0Var.j("enableLegacySharing", true);
        m0v0Var.j("hidePlayer", true);
        m0v0Var.j("legacyBackBehavior", true);
        m0v0Var.j("enableCheckout", true);
        m0v0Var.j("restoreOnKilled", true);
        m0v0Var.j("enableMediaDevices", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = f291.l;
        chc1 chc1Var = chc1.a;
        gpb gpbVar = gpb.a;
        return new nma0[]{chc1Var, chc1Var, znb0VarArr[2].getValue(), m5n1.z(chc1Var), gpbVar, gpbVar, gpbVar, gpbVar, gpbVar, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = f291.l;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        boolean zM7 = false;
        String strF = null;
        String strF2 = null;
        ci8 ci8Var = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    ci8Var = (ci8) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), ci8Var);
                    i |= 4;
                    break;
                case 3:
                    str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                    i |= 8;
                    break;
                case 4:
                    zM = x1kVarB.M(h661Var, 4);
                    i |= 16;
                    continue;
                case 5:
                    zM2 = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    continue;
                case 6:
                    zM3 = x1kVarB.M(h661Var, 6);
                    i |= 64;
                    continue;
                case 7:
                    zM4 = x1kVarB.M(h661Var, 7);
                    i |= 128;
                    continue;
                case 8:
                    zM5 = x1kVarB.M(h661Var, 8);
                    i |= 256;
                    continue;
                case 9:
                    zM6 = x1kVarB.M(h661Var, 9);
                    i |= 512;
                    continue;
                case 10:
                    zM7 = x1kVarB.M(h661Var, 10);
                    i |= 1024;
                    continue;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new f291(i, strF, strF2, ci8Var, str, zM, zM2, zM3, zM4, zM5, zM6, zM7);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        f291 f291Var = (f291) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = f291.l;
        String str = f291Var.a;
        boolean z = f291Var.k;
        boolean z2 = f291Var.j;
        boolean z3 = f291Var.i;
        boolean z4 = f291Var.h;
        boolean z5 = f291Var.g;
        boolean z6 = f291Var.f;
        String str2 = f291Var.d;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, f291Var.b);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), f291Var.c);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.E(h661Var, 4, f291Var.e);
        if (z1kVarB.d0() || z6) {
            z1kVarB.E(h661Var, 5, z6);
        }
        if (z1kVarB.d0() || !z5) {
            z1kVarB.E(h661Var, 6, z5);
        }
        if (z1kVarB.d0() || !z4) {
            z1kVarB.E(h661Var, 7, z4);
        }
        if (z1kVarB.d0() || z3) {
            z1kVarB.E(h661Var, 8, z3);
        }
        if (z1kVarB.d0() || z2) {
            z1kVarB.E(h661Var, 9, z2);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 10, z);
        }
        z1kVarB.a(h661Var);
    }
}
