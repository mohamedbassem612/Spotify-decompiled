package p;

import com.comscore.streaming.State;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class s6k1 implements pf40 {
    public static final s6k1 a;
    private static final h661 descriptor;

    static {
        s6k1 s6k1Var = new s6k1();
        a = s6k1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.hubs.model.View", s6k1Var, 7);
        m0v0Var.j("id", true);
        m0v0Var.j("title", true);
        m0v0Var.j("header", true);
        m0v0Var.j("body", true);
        m0v0Var.j("overlays", true);
        m0v0Var.j("extension", true);
        m0v0Var.j("custom", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = u6k1.h;
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(azh.a), m5n1.z((nma0) znb0VarArr[3].getValue()), m5n1.z((nma0) znb0VarArr[4].getValue()), m5n1.z(chc1Var), m5n1.z(xga0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = u6k1.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        szh szhVar = null;
        List list = null;
        List list2 = null;
        String str3 = null;
        uga0 uga0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    szhVar = (szh) x1kVarB.B(h661Var, 2, azh.a, szhVar);
                    i |= 4;
                    break;
                case 3:
                    list = (List) x1kVarB.B(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) x1kVarB.B(h661Var, 5, chc1.a, str3);
                    i |= 32;
                    break;
                case 6:
                    uga0Var = (uga0) x1kVarB.B(h661Var, 6, xga0.a, uga0Var);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new u6k1(i, str, str2, szhVar, list, list2, str3, uga0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        u6k1 u6k1Var = (u6k1) obj;
        uga0 uga0Var = u6k1Var.g;
        String str = u6k1Var.f;
        List list = u6k1Var.e;
        List list2 = u6k1Var.d;
        szh szhVar = u6k1Var.c;
        String str2 = u6k1Var.b;
        String str3 = u6k1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = u6k1.h;
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        if (z1kVarB.d0() || szhVar != null) {
            z1kVarB.s(h661Var, 2, azh.a, szhVar);
        }
        if (z1kVarB.d0() || list2 != null) {
            z1kVarB.s(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list2);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str);
        }
        if (z1kVarB.d0() || uga0Var != null) {
            z1kVarB.s(h661Var, 6, xga0.a, uga0Var);
        }
        z1kVarB.a(h661Var);
    }
}
