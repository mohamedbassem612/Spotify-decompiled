package p;

import com.comscore.streaming.State;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class azh implements pf40 {
    public static final azh a;
    private static final h661 descriptor;

    static {
        azh azhVar = new azh();
        a = azhVar;
        m0v0 m0v0Var = new m0v0("com.spotify.hubs.model.Component", azhVar, 11);
        m0v0Var.j("component", true);
        m0v0Var.j("text", true);
        m0v0Var.j("images", true);
        m0v0Var.j("metadata", true);
        m0v0Var.j("logging", true);
        m0v0Var.j("custom", true);
        m0v0Var.j("target", true);
        m0v0Var.j("id", true);
        m0v0Var.j("group", true);
        m0v0Var.j("events", true);
        m0v0Var.j("children", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = szh.l;
        nma0 nma0VarZ = m5n1.z(xm70.a);
        nma0 nma0VarZ2 = m5n1.z(mzd1.a);
        nma0 nma0VarZ3 = m5n1.z(i180.a);
        xga0 xga0Var = xga0.a;
        nma0 nma0VarZ4 = m5n1.z(xga0Var);
        nma0 nma0VarZ5 = m5n1.z(xga0Var);
        nma0 nma0VarZ6 = m5n1.z(xga0Var);
        nma0 nma0VarZ7 = m5n1.z(brd1.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0VarZ6, nma0VarZ7, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z((nma0) znb0VarArr[9].getValue()), m5n1.z((nma0) znb0VarArr[10].getValue())};
    }

    public final Object deserialize(dar darVar) {
        znb0[] znb0VarArr;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = szh.l;
        x1kVarB.getClass();
        List list = null;
        Map map = null;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        an70 an70Var = null;
        vzd1 vzd1Var = null;
        k180 k180Var = null;
        uga0 uga0Var = null;
        uga0 uga0Var2 = null;
        uga0 uga0Var3 = null;
        erd1 erd1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    znb0VarArr = znb0VarArr2;
                    an70Var = (an70) x1kVarB.B(h661Var, 0, xm70.a, an70Var);
                    i |= 1;
                    break;
                case 1:
                    znb0VarArr = znb0VarArr2;
                    vzd1Var = (vzd1) x1kVarB.B(h661Var, 1, mzd1.a, vzd1Var);
                    i |= 2;
                    break;
                case 2:
                    znb0VarArr = znb0VarArr2;
                    k180Var = (k180) x1kVarB.B(h661Var, 2, i180.a, k180Var);
                    i |= 4;
                    break;
                case 3:
                    znb0VarArr = znb0VarArr2;
                    uga0Var = (uga0) x1kVarB.B(h661Var, 3, xga0.a, uga0Var);
                    i |= 8;
                    break;
                case 4:
                    znb0VarArr = znb0VarArr2;
                    uga0Var2 = (uga0) x1kVarB.B(h661Var, 4, xga0.a, uga0Var2);
                    i |= 16;
                    break;
                case 5:
                    znb0VarArr = znb0VarArr2;
                    uga0Var3 = (uga0) x1kVarB.B(h661Var, 5, xga0.a, uga0Var3);
                    i |= 32;
                    break;
                case 6:
                    znb0VarArr = znb0VarArr2;
                    erd1Var = (erd1) x1kVarB.B(h661Var, 6, brd1.a, erd1Var);
                    i |= 64;
                    break;
                case 7:
                    znb0VarArr = znb0VarArr2;
                    str2 = (String) x1kVarB.B(h661Var, 7, chc1.a, str2);
                    i |= 128;
                    break;
                case 8:
                    znb0VarArr = znb0VarArr2;
                    str = (String) x1kVarB.B(h661Var, 8, chc1.a, str);
                    i |= 256;
                    break;
                case 9:
                    znb0VarArr = znb0VarArr2;
                    map = (Map) x1kVarB.B(h661Var, 9, (nma0) znb0VarArr[9].getValue(), map);
                    i |= 512;
                    break;
                case 10:
                    znb0VarArr = znb0VarArr2;
                    list = (List) x1kVarB.B(h661Var, 10, (nma0) znb0VarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
            znb0VarArr2 = znb0VarArr;
            z = z;
        }
        x1kVarB.a(h661Var);
        return new szh(i, an70Var, vzd1Var, k180Var, uga0Var, uga0Var2, uga0Var3, erd1Var, str2, str, map, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        szh szhVar = (szh) obj;
        List list = szhVar.k;
        Map map = szhVar.j;
        String str = szhVar.i;
        String str2 = szhVar.h;
        erd1 erd1Var = szhVar.g;
        uga0 uga0Var = szhVar.f;
        uga0 uga0Var2 = szhVar.e;
        uga0 uga0Var3 = szhVar.d;
        k180 k180Var = szhVar.c;
        vzd1 vzd1Var = szhVar.b;
        an70 an70Var = szhVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = szh.l;
        if (z1kVarB.d0() || an70Var != null) {
            z1kVarB.s(h661Var, 0, xm70.a, an70Var);
        }
        if (z1kVarB.d0() || vzd1Var != null) {
            z1kVarB.s(h661Var, 1, mzd1.a, vzd1Var);
        }
        if (z1kVarB.d0() || k180Var != null) {
            z1kVarB.s(h661Var, 2, i180.a, k180Var);
        }
        if (z1kVarB.d0() || uga0Var3 != null) {
            z1kVarB.s(h661Var, 3, xga0.a, uga0Var3);
        }
        if (z1kVarB.d0() || uga0Var2 != null) {
            z1kVarB.s(h661Var, 4, xga0.a, uga0Var2);
        }
        if (z1kVarB.d0() || uga0Var != null) {
            z1kVarB.s(h661Var, 5, xga0.a, uga0Var);
        }
        if (z1kVarB.d0() || erd1Var != null) {
            z1kVarB.s(h661Var, 6, brd1.a, erd1Var);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str);
        }
        if (z1kVarB.d0() || map != null) {
            z1kVarB.s(h661Var, 9, (nma0) znb0VarArr[9].getValue(), map);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 10, (nma0) znb0VarArr[10].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
