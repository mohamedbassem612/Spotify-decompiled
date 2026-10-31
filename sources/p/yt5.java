package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class yt5 implements pf40 {
    public static final yt5 a;
    private static final h661 descriptor;

    static {
        yt5 yt5Var = new yt5();
        a = yt5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.TokenRequest", yt5Var, 3);
        m0v0Var.j("client_id", true);
        m0v0Var.j("scopes", true);
        m0v0Var.j("redirect_uri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = au5.e;
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z((nma0) znb0VarArr[1].getValue()), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = au5.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                list = (List) x1kVarB.B(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        au5 au5Var = new au5();
        if ((i & 1) == 0) {
            au5Var.b = null;
        } else {
            au5Var.b = str;
        }
        if ((i & 2) == 0) {
            au5Var.c = null;
        } else {
            au5Var.c = list;
        }
        if ((i & 4) == 0) {
            au5Var.d = null;
            return au5Var;
        }
        au5Var.d = str2;
        return au5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        au5 au5Var = (au5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = au5.e;
        String str = au5Var.b;
        List list = au5Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        String str2 = au5Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
