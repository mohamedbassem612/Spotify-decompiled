package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class brd1 implements pf40 {
    public static final brd1 a;
    private static final h661 descriptor;

    static {
        brd1 brd1Var = new brd1();
        a = brd1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.hubs.model.Target", brd1Var, 2);
        m0v0Var.j("uri", true);
        m0v0Var.j("actions", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(chc1.a), m5n1.z((nma0) erd1.c[1].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = erd1.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.B(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new erd1(str, list, i);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        erd1 erd1Var = (erd1) obj;
        List list = erd1Var.b;
        String str = erd1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = erd1.c;
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
