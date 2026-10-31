package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class zjp0 implements pf40 {
    public static final zjp0 a;
    private static final h661 descriptor;

    static {
        zjp0 zjp0Var = new zjp0();
        a = zjp0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.Occupancy", zjp0Var, 5);
        m0v0Var.j("partyUri", true);
        m0v0Var.j("totalOccupancy", true);
        m0v0Var.j("leanbackOccupancy", true);
        m0v0Var.j("interactiveOccupancy", true);
        m0v0Var.j("isInteractiveFull", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(chc1.a);
        wr80 wr80Var = wr80.a;
        return new nma0[]{nma0VarZ, m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z(gpb.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                num = (Integer) x1kVarB.B(h661Var, 1, wr80.a, num);
                i |= 2;
            } else if (iP == 2) {
                num2 = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num2);
                i |= 4;
            } else if (iP == 3) {
                num3 = (Integer) x1kVarB.B(h661Var, 3, wr80.a, num3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                bool = (Boolean) x1kVarB.B(h661Var, 4, gpb.a, bool);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new bkp0(i, str, num, num2, num3, bool);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        bkp0 bkp0Var = (bkp0) obj;
        Boolean bool = bkp0Var.e;
        Integer num = bkp0Var.d;
        Integer num2 = bkp0Var.c;
        Integer num3 = bkp0Var.b;
        String str = bkp0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        if (z1kVarB.d0() || num3 != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num3);
        }
        if (z1kVarB.d0() || num2 != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num2);
        }
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 3, wr80.a, num);
        }
        if (z1kVarB.d0() || bool != null) {
            z1kVarB.s(h661Var, 4, gpb.a, bool);
        }
        z1kVarB.a(h661Var);
    }
}
