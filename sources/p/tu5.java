package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class tu5 implements pf40 {
    public static final tu5 a;
    private static final h661 descriptor;

    static {
        tu5 tu5Var = new tu5();
        a = tu5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.UriWithOptionExtras", tu5Var, 3);
        m0v0Var.j("uri", true);
        m0v0Var.j("options", true);
        m0v0Var.j("feature_identifier", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = vu5.e;
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z((nma0) znb0VarArr[1].getValue()), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = vu5.e;
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
        vu5 vu5Var = new vu5();
        if ((i & 1) == 0) {
            vu5Var.b = null;
        } else {
            vu5Var.b = str;
        }
        if ((i & 2) == 0) {
            vu5Var.c = null;
        } else {
            vu5Var.c = list;
        }
        if ((i & 4) == 0) {
            vu5Var.d = null;
            return vu5Var;
        }
        vu5Var.d = str2;
        return vu5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        vu5 vu5Var = (vu5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = vu5.e;
        String str = vu5Var.b;
        List list = vu5Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        String str2 = vu5Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
