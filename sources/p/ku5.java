package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ku5 implements pf40 {
    public static final ku5 a;
    private static final h661 descriptor;

    static {
        ku5 ku5Var = new ku5();
        a = ku5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.TrackElapsed", ku5Var, 3);
        m0v0Var.j("elapsed_time", true);
        m0v0Var.j("duration_ms", true);
        m0v0Var.j("percentage", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        return new nma0[]{m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z(wr80Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                num3 = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num3);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        mu5 mu5Var = new mu5();
        if ((i & 1) == 0) {
            mu5Var.b = null;
        } else {
            mu5Var.b = num;
        }
        if ((i & 2) == 0) {
            mu5Var.c = null;
        } else {
            mu5Var.c = num2;
        }
        if ((i & 4) == 0) {
            mu5Var.d = null;
            return mu5Var;
        }
        mu5Var.d = num3;
        return mu5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        mu5 mu5Var = (mu5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Integer num = mu5Var.b;
        if (num != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num);
        }
        Integer num2 = mu5Var.c;
        if (num2 != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num2);
        }
        Integer num3 = mu5Var.d;
        if (num3 != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num3);
        }
        z1kVarB.a(h661Var);
    }
}
