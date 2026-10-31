package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ni40 implements pf40 {
    public static final ni40 a;
    private static final h661 descriptor;

    static {
        ni40 ni40Var = new ni40();
        a = ni40Var;
        m0v0 m0v0Var = new m0v0("com.spotify.assistedcuration.content.model.GenreCluster", ni40Var, 2);
        m0v0Var.j("genre_name", false);
        m0v0Var.j("genre_tracks", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, pi40.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = pi40.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new pi40(strF, list, i);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pi40 pi40Var = (pi40) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = pi40.c;
        z1kVarB.G(h661Var, 0, pi40Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), pi40Var.b);
        z1kVarB.a(h661Var);
    }
}
