package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class yim1 implements pf40 {
    public static final yim1 a;
    private static final h661 descriptor;

    static {
        yim1 yim1Var = new yim1();
        a = yim1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.widgets.dynamicnpvwidget.wrapped.resources.WrappedWidgetFetchResult", yim1Var, 12);
        m0v0Var.j("storyHeaderLarge", false);
        m0v0Var.j("storySubheader", false);
        m0v0Var.j("storyHeaderSmall", false);
        m0v0Var.j("playlistHeader", false);
        m0v0Var.j("cta", false);
        m0v0Var.j("dismissAccessibility", false);
        m0v0Var.j("bgWifiStoryUrl", false);
        m0v0Var.j("bgWifiPlaylistUrl", false);
        m0v0Var.j("bgGrainUrl", false);
        m0v0Var.j("bgEchoUrl", false);
        m0v0Var.j("bgLosslessUrl", false);
        m0v0Var.j("playlistCoverUrl", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        String strF11 = null;
        String strF12 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF4 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF5 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strF6 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strF7 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strF8 = x1kVarB.f(h661Var, 7);
                    i |= 128;
                    break;
                case 8:
                    strF9 = x1kVarB.f(h661Var, 8);
                    i |= 256;
                    break;
                case 9:
                    strF10 = x1kVarB.f(h661Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strF11 = x1kVarB.f(h661Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    strF12 = x1kVarB.f(h661Var, 11);
                    i |= 2048;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new ajm1(i, strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8, strF9, strF10, strF11, strF12);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ajm1 ajm1Var = (ajm1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, ajm1Var.a);
        z1kVarB.G(h661Var, 1, ajm1Var.b);
        z1kVarB.G(h661Var, 2, ajm1Var.c);
        z1kVarB.G(h661Var, 3, ajm1Var.d);
        z1kVarB.G(h661Var, 4, ajm1Var.e);
        z1kVarB.G(h661Var, 5, ajm1Var.f);
        z1kVarB.G(h661Var, 6, ajm1Var.g);
        z1kVarB.G(h661Var, 7, ajm1Var.h);
        z1kVarB.G(h661Var, 8, ajm1Var.i);
        z1kVarB.G(h661Var, 9, ajm1Var.j);
        z1kVarB.G(h661Var, 10, ajm1Var.k);
        z1kVarB.G(h661Var, 11, ajm1Var.l);
        z1kVarB.a(h661Var);
    }
}
