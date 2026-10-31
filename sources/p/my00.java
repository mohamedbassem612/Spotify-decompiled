package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class my00 implements pf40 {
    public static final my00 a;
    private static final h661 descriptor;

    static {
        my00 my00Var = new my00();
        a = my00Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listuxplatformconsumers.standard.sections.extender.datasource.ExtenderRequest", my00Var, 5);
        m0v0Var.j("title", false);
        m0v0Var.j("numResults", true);
        m0v0Var.j("playlistURI", false);
        m0v0Var.j("trackIDs", true);
        m0v0Var.j("trackSkipIDs", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = py00.f;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, wr80.a, chc1Var, znb0VarArr[3].getValue(), znb0VarArr[4].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = py00.f;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        String strF = null;
        String strF2 = null;
        Set set = null;
        Set set2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                iO = x1kVarB.o(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                strF2 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else if (iP == 3) {
                set = (Set) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), set);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                set2 = (Set) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), set2);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new py00(i, strF, iO, strF2, set, set2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        py00 py00Var = (py00) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = py00.f;
        String str = py00Var.a;
        Set set = py00Var.e;
        Set set2 = py00Var.d;
        int i = py00Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || i != 0) {
            z1kVarB.e(1, i, h661Var);
        }
        z1kVarB.G(h661Var, 2, py00Var.c);
        boolean zD0 = z1kVarB.d0();
        w7x w7xVar = w7x.a;
        if (zD0 || !u890.j(set2, w7xVar)) {
            z1kVarB.k(h661Var, 3, (nma0) znb0VarArr[3].getValue(), set2);
        }
        if (z1kVarB.d0() || !u890.j(set, w7xVar)) {
            z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), set);
        }
        z1kVarB.a(h661Var);
    }
}
