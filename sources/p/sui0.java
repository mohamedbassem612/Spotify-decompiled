package p;

import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class sui0 implements pf40 {
    public static final sui0 a;
    private static final h661 descriptor;

    static {
        sui0 sui0Var = new sui0();
        a = sui0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.merch.merchdataloader.MerchItem", sui0Var, 5);
        m0v0Var.j("merchId", false);
        m0v0Var.j(ContextTrack$Metadata.KEY_TITLE, false);
        m0v0Var.j(ContextTrack$Metadata.KEY_SUBTITLE, true);
        m0v0Var.j("imageUrl", false);
        m0v0Var.j("navigationUrl", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var), nma0Var, nma0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String str = null;
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
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                i |= 4;
            } else if (iP == 3) {
                strF3 = x1kVarB.f(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                strF4 = x1kVarB.f(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new uui0(i, strF, strF2, str, strF3, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uui0 uui0Var = (uui0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, uui0Var.a);
        z1kVarB.G(h661Var, 1, uui0Var.b);
        String str = uui0Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.G(h661Var, 3, uui0Var.d);
        z1kVarB.G(h661Var, 4, uui0Var.e);
        z1kVarB.a(h661Var);
    }
}
