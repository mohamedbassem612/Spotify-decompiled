package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class xq5 implements pf40 {
    public static final xq5 a;
    private static final h661 descriptor;

    static {
        xq5 xq5Var = new xq5();
        a = xq5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.HelloDetailsAppProtocol.HelloDetails", xq5Var, 5);
        m0v0Var.j("roles", true);
        m0v0Var.j("info", true);
        m0v0Var.j("authmethods", true);
        m0v0Var.j("authid", true);
        m0v0Var.j("extras", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = zq5.g;
        return new nma0[]{m5n1.z(dr5.a), m5n1.z(ar5.a), m5n1.z((nma0) znb0VarArr[2].getValue()), m5n1.z(chc1.a), m5n1.z((nma0) znb0VarArr[4].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = zq5.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fr5 fr5Var = null;
        cr5 cr5Var = null;
        List list = null;
        String str = null;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                fr5Var = (fr5) x1kVarB.B(h661Var, 0, dr5.a, fr5Var);
                i |= 1;
            } else if (iP == 1) {
                cr5Var = (cr5) x1kVarB.B(h661Var, 1, ar5.a, cr5Var);
                i |= 2;
            } else if (iP == 2) {
                list = (List) x1kVarB.B(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            } else if (iP == 3) {
                str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                map = (Map) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), map);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        zq5 zq5Var = new zq5();
        if ((i & 1) == 0) {
            zq5Var.b = null;
        } else {
            zq5Var.b = fr5Var;
        }
        if ((i & 2) == 0) {
            zq5Var.c = null;
        } else {
            zq5Var.c = cr5Var;
        }
        if ((i & 4) == 0) {
            zq5Var.d = null;
        } else {
            zq5Var.d = list;
        }
        if ((i & 8) == 0) {
            zq5Var.e = null;
        } else {
            zq5Var.e = str;
        }
        if ((i & 16) == 0) {
            zq5Var.f = null;
            return zq5Var;
        }
        zq5Var.f = map;
        return zq5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        zq5 zq5Var = (zq5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = zq5.g;
        fr5 fr5Var = zq5Var.b;
        Map map = zq5Var.f;
        List list = zq5Var.d;
        if (fr5Var != null) {
            z1kVarB.s(h661Var, 0, dr5.a, fr5Var);
        }
        cr5 cr5Var = zq5Var.c;
        if (cr5Var != null) {
            z1kVarB.s(h661Var, 1, ar5.a, cr5Var);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        String str = zq5Var.e;
        if (str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        if (map != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
