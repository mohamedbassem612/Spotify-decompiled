package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class mch1 implements pf40 {
    public static final mch1 a;
    private static final h661 descriptor;

    static {
        mch1 mch1Var = new mch1();
        a = mch1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.promptedplaylists.ucpapiimpl.UcpPromptsParserImpl.ErrorEntry", mch1Var, 4);
        m0v0Var.j("display_text", true);
        m0v0Var.j("retryable", true);
        m0v0Var.j("prompt_ids", true);
        m0v0Var.j("details", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, gpb.a, och1.e[2].getValue(), m5n1.z(xga0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = och1.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        List list = null;
        uga0 uga0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                zM = x1kVarB.M(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                uga0Var = (uga0) x1kVarB.B(h661Var, 3, xga0.a, uga0Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new och1(i, strF, zM, list, uga0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        och1 och1Var = (och1) obj;
        uga0 uga0Var = och1Var.d;
        List list = och1Var.c;
        boolean z = och1Var.b;
        String str = och1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = och1.e;
        if (z1kVarB.d0() || !u890.j(str, "")) {
            z1kVarB.G(h661Var, 0, str);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 1, z);
        }
        if (z1kVarB.d0() || !u890.j(list, z6x.a)) {
            z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        if (z1kVarB.d0() || uga0Var != null) {
            z1kVarB.s(h661Var, 3, xga0.a, uga0Var);
        }
        z1kVarB.a(h661Var);
    }
}
