package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class fds0 implements pf40 {
    public static final fds0 a;
    private static final h661 descriptor;

    static {
        fds0 fds0Var = new fds0();
        a = fds0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.payment.paymentimpl.view.field.PciBridgeConfig", fds0Var, 7);
        m0v0Var.j("providers", false);
        m0v0Var.j("translations", false);
        m0v0Var.j("errorMessages", false);
        m0v0Var.j("isRtl", true);
        m0v0Var.j("enableKoreaFields", true);
        m0v0Var.j("isCvcOnly", true);
        m0v0Var.j("cvcLength", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{hds0.h[0].getValue(), pds0.a, ids0.a, gpbVar, gpbVar, gpbVar, wr80.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = hds0.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        int iO = 0;
        List list = null;
        rds0 rds0Var = null;
        kds0 kds0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    rds0Var = (rds0) x1kVarB.A(h661Var, 1, pds0.a, rds0Var);
                    i |= 2;
                    break;
                case 2:
                    kds0Var = (kds0) x1kVarB.A(h661Var, 2, ids0.a, kds0Var);
                    i |= 4;
                    break;
                case 3:
                    zM = x1kVarB.M(h661Var, 3);
                    i |= 8;
                    continue;
                case 4:
                    zM2 = x1kVarB.M(h661Var, 4);
                    i |= 16;
                    continue;
                case 5:
                    zM3 = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    continue;
                case 6:
                    iO = x1kVarB.o(h661Var, 6);
                    i |= 64;
                    continue;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new hds0(i, list, rds0Var, kds0Var, zM, zM2, zM3, iO);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hds0 hds0Var = (hds0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        nma0 nma0Var = (nma0) hds0.h[0].getValue();
        List list = hds0Var.a;
        int i = hds0Var.g;
        boolean z = hds0Var.f;
        boolean z2 = hds0Var.e;
        boolean z3 = hds0Var.d;
        z1kVarB.k(h661Var, 0, nma0Var, list);
        z1kVarB.k(h661Var, 1, pds0.a, hds0Var.b);
        z1kVarB.k(h661Var, 2, ids0.a, hds0Var.c);
        if (z1kVarB.d0() || z3) {
            z1kVarB.E(h661Var, 3, z3);
        }
        if (z1kVarB.d0() || z2) {
            z1kVarB.E(h661Var, 4, z2);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 5, z);
        }
        if (z1kVarB.d0() || i != 3) {
            z1kVarB.e(6, i, h661Var);
        }
        z1kVarB.a(h661Var);
    }
}
