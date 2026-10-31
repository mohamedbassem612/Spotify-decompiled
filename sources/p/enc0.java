package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class enc0 implements pf40 {
    public static final enc0 a;
    private static final h661 descriptor;

    static {
        enc0 enc0Var = new enc0();
        a = enc0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.datalayermessages.ListConfigurationDto", enc0Var, 5);
        m0v0Var.j("sortOrder", true);
        m0v0Var.j("filters", true);
        m0v0Var.j("lenses", true);
        m0v0Var.j("sourceLengthRestriction", true);
        m0v0Var.j("supportedPlaceholderTypes", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = hnc0.f;
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), znb0VarArr[1].getValue(), znb0VarArr[2].getValue(), m5n1.z(chc1Var), m5n1.z(o2d1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = hnc0.f;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        r2d1 r2d1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            } else if (iP == 2) {
                list2 = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list2);
                i |= 4;
            } else if (iP == 3) {
                str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                r2d1Var = (r2d1) x1kVarB.B(h661Var, 4, o2d1.a, r2d1Var);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new hnc0(i, str, list, list2, str2, r2d1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hnc0 hnc0Var = (hnc0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = hnc0.f;
        String str = hnc0Var.a;
        List list = hnc0Var.c;
        List list2 = hnc0Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        boolean zD0 = z1kVarB.d0();
        z6x z6xVar = z6x.a;
        if (zD0 || !u890.j(list2, z6xVar)) {
            z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list2);
        }
        if (z1kVarB.d0() || !u890.j(list, z6xVar)) {
            z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        String str2 = hnc0Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        r2d1 r2d1Var = hnc0Var.e;
        if (r2d1Var != null) {
            z1kVarB.s(h661Var, 4, o2d1.a, r2d1Var);
        }
        z1kVarB.a(h661Var);
    }
}
