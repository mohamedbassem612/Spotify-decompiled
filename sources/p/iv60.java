package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class iv60 implements pf40 {
    public static final iv60 a;
    private static final h661 descriptor;

    static {
        iv60 iv60Var = new iv60();
        a = iv60Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.HostApprovalResponseError", iv60Var, 3);
        m0v0Var.j("code", true);
        m0v0Var.j("message", true);
        m0v0Var.j("details", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(wr80.a), m5n1.z(chc1.a), m5n1.z((nma0) kv60.d[2].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = kv60.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
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
        return new kv60(i, num, str, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kv60 kv60Var = (kv60) obj;
        List list = kv60Var.c;
        String str = kv60Var.b;
        Integer num = kv60Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = kv60.d;
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
