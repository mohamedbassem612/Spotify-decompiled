package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class i180 implements pf40 {
    public static final i180 a;
    private static final h661 descriptor;

    static {
        i180 i180Var = new i180();
        a = i180Var;
        m0v0 m0v0Var = new m0v0("com.spotify.hubs.model.Images", i180Var, 4);
        m0v0Var.j("main", true);
        m0v0Var.j("background", true);
        m0v0Var.j("custom", true);
        m0v0Var.j("icon", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = k180.e;
        ip70 ip70Var = ip70.a;
        return new nma0[]{m5n1.z(ip70Var), m5n1.z(ip70Var), m5n1.z((nma0) znb0VarArr[2].getValue()), m5n1.z(chc1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = k180.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        bq70 bq70Var = null;
        bq70 bq70Var2 = null;
        Map map = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                bq70Var = (bq70) x1kVarB.B(h661Var, 0, ip70.a, bq70Var);
                i |= 1;
            } else if (iP == 1) {
                bq70Var2 = (bq70) x1kVarB.B(h661Var, 1, ip70.a, bq70Var2);
                i |= 2;
            } else if (iP == 2) {
                map = (Map) x1kVarB.B(h661Var, 2, (nma0) znb0VarArr[2].getValue(), map);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new k180(i, bq70Var, bq70Var2, map, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        k180 k180Var = (k180) obj;
        String str = k180Var.d;
        Map map = k180Var.c;
        bq70 bq70Var = k180Var.b;
        bq70 bq70Var2 = k180Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = k180.e;
        if (z1kVarB.d0() || bq70Var2 != null) {
            z1kVarB.s(h661Var, 0, ip70.a, bq70Var2);
        }
        if (z1kVarB.d0() || bq70Var != null) {
            z1kVarB.s(h661Var, 1, ip70.a, bq70Var);
        }
        if (z1kVarB.d0() || map != null) {
            z1kVarB.s(h661Var, 2, (nma0) znb0VarArr[2].getValue(), map);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
