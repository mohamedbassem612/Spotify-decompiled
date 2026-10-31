package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class wbf implements pf40 {
    public static final wbf a;
    private static final h661 descriptor;

    static {
        wbf wbfVar = new wbf();
        a = wbfVar;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatMetadata", wbfVar, 2);
        m0v0Var.j("bucket", true);
        m0v0Var.j("isPinned", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(wr80.a), m5n1.z(gpb.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Boolean bool = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                bool = (Boolean) x1kVarB.B(h661Var, 1, gpb.a, bool);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new ybf(i, num, bool);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ybf ybfVar = (ybf) obj;
        Boolean bool = ybfVar.b;
        Integer num = ybfVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num);
        }
        if (z1kVarB.d0() || bool != null) {
            z1kVarB.s(h661Var, 1, gpb.a, bool);
        }
        z1kVarB.a(h661Var);
    }
}
