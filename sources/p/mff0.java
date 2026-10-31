package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class mff0 implements pf40 {
    public static final mff0 a;
    private static final h661 descriptor;

    static {
        mff0 mff0Var = new mff0();
        a = mff0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity.Line", mff0Var, 3);
        m0v0Var.j("startTimeInMs", false);
        m0v0Var.j("words", false);
        m0v0Var.j("syllables", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{o5f0.a, chc1.a, off0.d[2].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = off0.d;
        x1kVarB.getClass();
        int i = 0;
        long jI0 = 0;
        String strF = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                jI0 = x1kVarB.i0(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new off0(i, jI0, strF, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        off0 off0Var = (off0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = off0.d;
        z1kVarB.l(h661Var, 0, off0Var.a);
        z1kVarB.G(h661Var, 1, off0Var.b);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), off0Var.c);
        z1kVarB.a(h661Var);
    }
}
