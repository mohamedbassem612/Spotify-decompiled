package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class jhk0 implements pf40 {
    public static final jhk0 a;
    private static final h661 descriptor;

    static {
        jhk0 jhk0Var = new jhk0();
        a = jhk0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.playlistmixing.elementsimpl.MixingReorderPlaylistEducationStorageImpl.Data", jhk0Var, 2);
        m0v0Var.j("interactedPlaylists", true);
        m0v0Var.j("globalInteractionCount", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{lhk0.c[0].getValue(), wr80.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = lhk0.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        Set set = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                set = (Set) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), set);
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
        return new lhk0(i, iO, set);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lhk0 lhk0Var = (lhk0) obj;
        int i = lhk0Var.b;
        Set set = lhk0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = lhk0.c;
        if (z1kVarB.d0() || !u890.j(set, w7x.a)) {
            z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), set);
        }
        if (z1kVarB.d0() || i != 0) {
            z1kVarB.e(1, i, h661Var);
        }
        z1kVarB.a(h661Var);
    }
}
