package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class yre implements pf40 {
    public static final yre a;
    private static final h661 descriptor;

    static {
        yre yreVar = new yre();
        a = yreVar;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatChannelEvent.DeleteMessageEvent", yreVar, 2);
        m0v0Var.j("common", false);
        m0v0Var.j("deleteMessage", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, l8t.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        n8t n8tVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                fshVar = (fsh) x1kVarB.A(h661Var, 0, dsh.a, fshVar);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                n8tVar = (n8t) x1kVarB.A(h661Var, 1, l8t.a, n8tVar);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new ase(i, fshVar, n8tVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ase aseVar = (ase) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, dsh.a, aseVar.a);
        z1kVarB.k(h661Var, 1, l8t.a, aseVar.b);
        z1kVarB.a(h661Var);
    }
}
