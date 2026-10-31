package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class umy0 implements pf40 {
    public static final umy0 a;
    private static final h661 descriptor;

    static {
        umy0 umy0Var = new umy0();
        a = umy0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.login.credentialmanager.passkeys.PublicKeyCredentialDescriptor", umy0Var, 3);
        m0v0Var.j("type", false);
        m0v0Var.j("id", false);
        m0v0Var.j("transports", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z((nma0) wmy0.d[2].getValue());
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, nma0VarZ};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = wmy0.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.B(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new wmy0(i, strF, strF2, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        wmy0 wmy0Var = (wmy0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = wmy0.d;
        String str = wmy0Var.a;
        List list = wmy0Var.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, wmy0Var.b);
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
