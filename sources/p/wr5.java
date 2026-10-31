package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class wr5 implements pf40 {
    public static final wr5 a;
    private static final h661 descriptor;

    static {
        wr5 wr5Var = new wr5();
        a = wr5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.ListItems", wr5Var, 4);
        m0v0Var.j("limit", true);
        m0v0Var.j("offset", true);
        m0v0Var.j("total", true);
        m0v0Var.j("items", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = yr5.f;
        wr80 wr80Var = wr80.a;
        return new nma0[]{m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z((nma0) znb0VarArr[3].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = yr5.f;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
                i |= 1;
            } else if (iP == 1) {
                num2 = (Integer) x1kVarB.B(h661Var, 1, wr80.a, num2);
                i |= 2;
            } else if (iP == 2) {
                num3 = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num3);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.B(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        yr5 yr5Var = new yr5();
        if ((i & 1) == 0) {
            yr5Var.b = null;
        } else {
            yr5Var.b = num;
        }
        if ((i & 2) == 0) {
            yr5Var.c = null;
        } else {
            yr5Var.c = num2;
        }
        if ((i & 4) == 0) {
            yr5Var.d = null;
        } else {
            yr5Var.d = num3;
        }
        if ((i & 8) == 0) {
            yr5Var.e = null;
            return yr5Var;
        }
        yr5Var.e = list;
        return yr5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        yr5 yr5Var = (yr5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = yr5.f;
        Integer num = yr5Var.b;
        List list = yr5Var.e;
        if (num != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num);
        }
        Integer num2 = yr5Var.c;
        if (num2 != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num2);
        }
        Integer num3 = yr5Var.d;
        if (num3 != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num3);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
