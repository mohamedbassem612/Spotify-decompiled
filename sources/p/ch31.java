package p;

import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ch31 implements pf40 {
    public static final ch31 a;
    private static final h661 descriptor;

    static {
        ch31 ch31Var = new ch31();
        a = ch31Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.message.RichPushFields", ch31Var, 5);
        m0v0Var.j("image_url", true);
        m0v0Var.j(ContextTrack$Metadata.KEY_TITLE, true);
        m0v0Var.j(ContextTrack$Metadata.KEY_SUBTITLE, true);
        m0v0Var.j("description", true);
        m0v0Var.j("duration_ms", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else if (iP == 2) {
                str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                i |= 4;
            } else if (iP == 3) {
                str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                str5 = (String) x1kVarB.B(h661Var, 4, chc1.a, str5);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new eh31(i, str, str2, str3, str4, str5);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        eh31 eh31Var = (eh31) obj;
        String str = eh31Var.e;
        String str2 = eh31Var.d;
        String str3 = eh31Var.c;
        String str4 = eh31Var.b;
        String str5 = eh31Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
