package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class vff0 implements pf40 {
    public static final vff0 a;
    private static final h661 descriptor;

    static {
        vff0 vff0Var = new vff0();
        a = vff0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity.Translation", vff0Var, 3);
        m0v0Var.j("language", false);
        m0v0Var.j("translatedLines", false);
        m0v0Var.j("isRTL", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, xff0.d[1].getValue(), gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = xff0.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new xff0(i, strF, list, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xff0 xff0Var = (xff0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = xff0.d;
        z1kVarB.G(h661Var, 0, xff0Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), xff0Var.b);
        z1kVarB.E(h661Var, 2, xff0Var.c);
        z1kVarB.a(h661Var);
    }
}
