package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ool1 {
    public static final float a = xpn1.c + 12.0f;
    public static final float b = 24.0f;
    public static final float c = 16.0f;
    public static final float d = 16.0f;

    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    public static final void a(WidgetState.WrappedPlaylist wrappedPlaylist, whb1 whb1Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2049772658);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(wrappedPlaylist) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(whb1Var) ? 32 : 16;
        }
        int i3 = i & 384;
        et40 et40Var = et40.a;
        if (i3 == 0) {
            i2 |= b0kVar3.i(et40Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            long j = ((s3v) b0kVar3.k(p4k.a)).a;
            float fC = aq8.C(l6m1.PLAYLIST_WIDE, 0.7f, 16.0f, j);
            float f = ((p3v) b0kVar3.k(s4k.a)).a;
            long jC = jhc1.c(s3v.b(j), s3v.a(j) - f);
            p3v p3vVarF = aq8.F(fC, 3, (Context) b0kVar3.k(p4k.b), wrappedPlaylist.getTitle(), fim1.k);
            if (p3vVarF != null) {
                z = p3v.b(s3v.a(jC), (((a + p3vVarF.a) + c) + 48.0f) + b) >= 0;
            }
            gt40 gt40VarL = d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var);
            j2i j2iVarR = apo.r(363438448, new lol1(f, fC, j, wrappedPlaylist, z), b0kVar3);
            b0kVar2 = b0kVar3;
            j2h1.b(gt40VarL, (ql3) null, j2iVarR, b0kVar2, 384, 2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mol1(wrappedPlaylist, whb1Var, i);
        }
    }
}
