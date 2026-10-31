package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class rq5 implements pf40 {
    public static final rq5 a;
    private static final h661 descriptor;

    static {
        rq5 rq5Var = new rq5();
        a = rq5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.CrossfadeState", rq5Var, 2);
        m0v0Var.j("isEnabled", true);
        m0v0Var.j("duration", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(gpb.a), m5n1.z(wr80.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                bool = (Boolean) x1kVarB.B(h661Var, 0, gpb.a, bool);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                num = (Integer) x1kVarB.B(h661Var, 1, wr80.a, num);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        tq5 tq5Var = new tq5();
        if ((i & 1) == 0) {
            tq5Var.b = null;
        } else {
            tq5Var.b = bool;
        }
        if ((i & 2) == 0) {
            tq5Var.c = null;
            return tq5Var;
        }
        tq5Var.c = num;
        return tq5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        tq5 tq5Var = (tq5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Boolean bool = tq5Var.b;
        if (bool != null) {
            z1kVarB.s(h661Var, 0, gpb.a, bool);
        }
        Integer num = tq5Var.c;
        if (num != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num);
        }
        z1kVarB.a(h661Var);
    }
}
