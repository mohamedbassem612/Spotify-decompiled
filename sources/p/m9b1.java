package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class m9b1 {
    public static final float a = xpn1.c + 12.0f;
    public static final float b = 16.0f;
    public static final float c = 8.0f;

    public static final void a(WidgetState.WrappedPlaylist wrappedPlaylist, whb1 whb1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1525400430);
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
            j2h1.b(d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var), (ql3) null, apo.r(-187519408, new g9b1(wrappedPlaylist), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j9b1(wrappedPlaylist, whb1Var, i);
        }
    }

    public static final boolean b(long j) {
        return p3v.b(s3v.b(j), 120.0f) <= 0;
    }
}
