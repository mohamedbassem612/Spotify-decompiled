package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class xw70 implements pf40 {
    public static final xw70 a;
    private static final h661 descriptor;

    static {
        xw70 xw70Var = new xw70();
        a = xw70Var;
        m0v0 m0v0Var = new m0v0("com.spotify.artist.creatorartist.model.ImageModel", xw70Var, 4);
        m0v0Var.j("uri", false);
        m0v0Var.j("width", true);
        m0v0Var.j("height", true);
        m0v0Var.j("moderationUri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        wr80 wr80Var = wr80.a;
        return new nma0[]{nma0Var, wr80Var, wr80Var, nma0VarZ};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        String strF = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                iO = x1kVarB.o(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                iO2 = x1kVarB.o(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new zw70(strF, i, iO, iO2, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        zw70 zw70Var = (zw70) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = zw70Var.a;
        int i = zw70Var.c;
        int i2 = zw70Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || i2 != 0) {
            z1kVarB.e(1, i2, h661Var);
        }
        if (z1kVarB.d0() || i != 0) {
            z1kVarB.e(2, i, h661Var);
        }
        String str2 = zw70Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
