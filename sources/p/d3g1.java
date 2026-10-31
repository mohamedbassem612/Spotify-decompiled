package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class d3g1 implements pf40 {
    public static final d3g1 a;
    private static final h661 descriptor;

    static {
        d3g1 d3g1Var = new d3g1();
        a = d3g1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.leavebehindads.ctaimpl.model.TrackingEvents", d3g1Var, 2);
        m0v0Var.j("viewed", false);
        m0v0Var.j("clicked", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = f3g1.c;
        return new nma0[]{znb0VarArr[0].getValue(), znb0VarArr[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = f3g1.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                list2 = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new f3g1(i, list, list2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        f3g1 f3g1Var = (f3g1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = f3g1.c;
        z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), f3g1Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), f3g1Var.b);
        z1kVarB.a(h661Var);
    }
}
