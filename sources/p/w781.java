package p;

import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class w781 implements pf40 {
    public static final w781 a;
    private static final h661 descriptor;

    static {
        w781 w781Var = new w781();
        a = w781Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.preferences.ShowOptInMetadata", w781Var, 5);
        m0v0Var.j("showUri", false);
        m0v0Var.j(ContextTrack$Metadata.KEY_TITLE, false);
        m0v0Var.j("publisher", false);
        m0v0Var.j("showImageId", false);
        m0v0Var.j("optedIn", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else if (iP == 3) {
                strF4 = x1kVarB.f(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new y781(strF, i, strF2, strF3, zM, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        y781 y781Var = (y781) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, y781Var.a);
        z1kVarB.G(h661Var, 1, y781Var.b);
        z1kVarB.G(h661Var, 2, y781Var.c);
        z1kVarB.G(h661Var, 3, y781Var.d);
        z1kVarB.E(h661Var, 4, y781Var.e);
        z1kVarB.a(h661Var);
    }
}
