package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class pgv implements pf40 {
    public static final pgv a;
    private static final h661 descriptor;

    static {
        pgv pgvVar = new pgv();
        a = pgvVar;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.Durations", pgvVar, 2);
        m0v0Var.j("values", false);
        m0v0Var.j("timescale", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{rgv.c[0].getValue(), wr80.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = rgv.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        List list = null;
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
                iO = x1kVarB.o(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new rgv(i, iO, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        rgv rgvVar = (rgv) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) rgv.c[0].getValue(), rgvVar.a);
        z1kVarB.e(1, rgvVar.b, h661Var);
        z1kVarB.a(h661Var);
    }
}
