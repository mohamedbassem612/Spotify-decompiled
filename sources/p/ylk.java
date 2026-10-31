package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class ylk implements pf40 {
    public static final ylk a;
    private static final h661 descriptor;

    static {
        ylk ylkVar = new ylk();
        a = ylkVar;
        m0v0 m0v0Var = new m0v0("com.spotify.ontour.concertfriendmatcherimpl.data.ConcertFriendMatch", ylkVar, 2);
        m0v0Var.j("friendUsername", false);
        m0v0Var.j("concert", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, bmk.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        dmk dmkVar = null;
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
                dmkVar = (dmk) x1kVarB.A(h661Var, 1, bmk.a, dmkVar);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new amk(i, strF, dmkVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        amk amkVar = (amk) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, amkVar.a);
        z1kVarB.k(h661Var, 1, bmk.a, amkVar.b);
        z1kVarB.a(h661Var);
    }
}
