package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class t29 implements pf40 {
    public static final t29 a;
    private static final h661 descriptor;

    static {
        t29 t29Var = new t29();
        a = t29Var;
        m0v0 m0v0Var = new m0v0("com.spotify.artist.creatorartist.model.Autobiography", t29Var, 3);
        m0v0Var.j("body", true);
        m0v0Var.j("urls", true);
        m0v0Var.j("links", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(chc1.a), v29.d[1].getValue(), m5n1.z(amc0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = v29.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        cmc0 cmc0Var = null;
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                cmc0Var = (cmc0) x1kVarB.B(h661Var, 2, amc0.a, cmc0Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new v29(i, str, list, cmc0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        v29 v29Var = (v29) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = v29.d;
        String str = v29Var.a;
        List list = v29Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        if (z1kVarB.d0() || !u890.j(list, z6x.a)) {
            z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        cmc0 cmc0Var = v29Var.c;
        if (cmc0Var != null) {
            z1kVarB.s(h661Var, 2, amc0.a, cmc0Var);
        }
        z1kVarB.a(h661Var);
    }
}
