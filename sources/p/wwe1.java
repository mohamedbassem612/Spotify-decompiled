package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class wwe1 implements pf40 {
    public static final wwe1 a;
    private static final h661 descriptor;

    static {
        wwe1 wwe1Var = new wwe1();
        a = wwe1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.domain.models.TimestampType.Days", wwe1Var, 3);
        m0v0Var.j("days", false);
        m0v0Var.j("timestamp_seconds", true);
        m0v0Var.j("timestamp_nanos", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, o5f0.a, wr80.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int i = 0;
        int iO = 0;
        String strF = null;
        long jI0 = 0;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                jI0 = x1kVarB.i0(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                iO = x1kVarB.o(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new ywe1(i, jI0, strF, iO);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ywe1 ywe1Var = (ywe1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = ywe1Var.b;
        int i = ywe1Var.d;
        long j = ywe1Var.c;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || j != 0) {
            z1kVarB.l(h661Var, 1, j);
        }
        if (z1kVarB.d0() || i != 0) {
            z1kVarB.e(2, i, h661Var);
        }
        z1kVarB.a(h661Var);
    }
}
