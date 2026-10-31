package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class c9b1 {
    public static final float a = xpn1.c + 8.0f;
    public static final float b = 12.0f;
    public static final float c = 8.0f;
    public static final float d = 12.0f;
    public static final List e = p7h.M(new p3v[]{new p3v(32.0f), new p3v(24.0f), new p3v(16.0f)});

    public static final void a(WidgetState.WrappedPlaylist wrappedPlaylist, whb1 whb1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1731196366);
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
            j2h1.b(d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var), (ql3) null, apo.r(-1369906512, new v8b1(wrappedPlaylist), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z8b1(wrappedPlaylist, whb1Var, i);
        }
    }

    public static final p3v b(Context context, String str, long j) {
        Object obj;
        Object next;
        float fB = s3v.b(j);
        p3v p3vVarA = ngu0.a(l6m1.PLAYLIST_SQUARE, j);
        float f = fB - (p3vVarA != null ? p3vVarA.a : 0.0f);
        Iterator it = e.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            }
            return (p3v) obj;
        } while (p3v.b(y9g1.l(((p3v) next).a, 4, context, str, (kee1) null) + 16.0f, d + f) > 0);
        obj = next;
        return (p3v) obj;
    }
}
