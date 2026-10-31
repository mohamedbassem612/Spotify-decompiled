package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class vg90 implements pf40 {
    public static final vg90 a;
    private static final h661 descriptor;

    static {
        vg90 vg90Var = new vg90();
        a = vg90Var;
        m0v0 m0v0Var = new m0v0("com.spotify.inappuserfeedback.issuereporterimpl.IssueRequest", vg90Var, 4);
        m0v0Var.j("summary", false);
        m0v0Var.j("description", false);
        m0v0Var.j("files", false);
        m0v0Var.j("is_employee", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = xg90.e;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, znb0VarArr[2].getValue(), gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = xg90.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        List list = null;
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
                list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new xg90(i, strF, strF2, list, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xg90 xg90Var = (xg90) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = xg90.e;
        z1kVarB.G(h661Var, 0, xg90Var.a);
        z1kVarB.G(h661Var, 1, xg90Var.b);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), xg90Var.c);
        z1kVarB.E(h661Var, 3, xg90Var.d);
        z1kVarB.a(h661Var);
    }
}
