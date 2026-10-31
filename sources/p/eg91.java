package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class eg91 {
    public static final void a(WidgetState.WrappedPlaylist wrappedPlaylist, whb1 whb1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1129573934);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wrappedPlaylist) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(whb1Var) ? 32 : 16;
        }
        int i3 = i & 384;
        et40 et40Var = et40.a;
        if (i3 == 0) {
            i2 |= x340Var.i(et40Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            j2h1.b(d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var), (ql3) null, apo.r(943106960, new yf91(wrappedPlaylist, b(x340Var)), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bg91(wrappedPlaylist, whb1Var, i);
        }
    }

    public static final float b(b0k b0kVar) {
        l6m1 l6m1Var = l6m1.PLAYLIST_SMALL;
        kiv kivVar = p4k.a;
        x340 x340Var = (x340) b0kVar;
        float fC = aq8.C(l6m1Var, 0.6f, 12.0f, ((s3v) x340Var.k(kivVar)).a);
        if (p3v.b(fC, 80.0f) >= 0) {
            x340Var.i0(996223930);
        } else {
            x340Var.i0(996252946);
            fC = s3v.b(((s3v) x340Var.k(kivVar)).a) * 0.6f;
        }
        x340Var.r(false);
        return fC;
    }
}
