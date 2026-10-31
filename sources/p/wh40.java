package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class wh40 implements pf40 {
    public static final wh40 a;
    private static final h661 descriptor;

    static {
        wh40 wh40Var = new wh40();
        a = wh40Var;
        m0v0 m0v0Var = new m0v0("com.spotify.puffin.crossdevicesyncing.data.GenericFilters", wh40Var, 3);
        m0v0Var.j("specificDisabled", false);
        m0v0Var.j("externalizationEnabled", false);
        m0v0Var.j("externalizationDisabled", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        th40 th40Var = th40.a;
        return new nma0[]{th40Var, th40Var, th40Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        vh40 vh40Var = null;
        vh40 vh40Var2 = null;
        vh40 vh40Var3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                vh40Var = (vh40) x1kVarB.A(h661Var, 0, th40.a, vh40Var);
                i |= 1;
            } else if (iP == 1) {
                vh40Var2 = (vh40) x1kVarB.A(h661Var, 1, th40.a, vh40Var2);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                vh40Var3 = (vh40) x1kVarB.A(h661Var, 2, th40.a, vh40Var3);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new yh40(i, vh40Var, vh40Var2, vh40Var3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        yh40 yh40Var = (yh40) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        th40 th40Var = th40.a;
        z1kVarB.k(h661Var, 0, th40Var, yh40Var.a);
        z1kVarB.k(h661Var, 1, th40Var, yh40Var.b);
        z1kVarB.k(h661Var, 2, th40Var, yh40Var.c);
        z1kVarB.a(h661Var);
    }
}
