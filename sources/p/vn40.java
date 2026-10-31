package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class vn40 implements pf40 {
    public static final vn40 a;
    private static final h661 descriptor;

    static {
        vn40 vn40Var = new vn40();
        a = vn40Var;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.members.api.GetInvitation", vn40Var, 4);
        m0v0Var.j("title", false);
        m0v0Var.j("button_text", false);
        m0v0Var.j("invitation_link", false);
        m0v0Var.j("members", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = xn40.f;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, znb0VarArr[3].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = xn40.f;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
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
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new xn40(i, strF, strF2, strF3, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xn40 xn40Var = (xn40) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = xn40.f;
        z1kVarB.G(h661Var, 0, xn40Var.b);
        z1kVarB.G(h661Var, 1, xn40Var.c);
        z1kVarB.G(h661Var, 2, xn40Var.d);
        z1kVarB.k(h661Var, 3, (nma0) znb0VarArr[3].getValue(), xn40Var.e);
        z1kVarB.a(h661Var);
    }
}
