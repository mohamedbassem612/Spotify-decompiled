package p;

import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dx40 {
    public final bx40 a;
    public cx40 b;
    public GlueToolbar c;
    public final g160 d;

    public dx40(bx40 bx40Var, g160 g160Var) {
        this.a = bx40Var;
        this.d = g160Var;
    }

    public static void a(float f, nx40 nx40Var) {
        ax40 ax40Var;
        hk0 hk0Var;
        if (nx40Var == null || (ax40Var = (ax40) nx40Var.getView().getLayoutParams()) == null || (hk0Var = ax40Var.c) == null) {
            return;
        }
        float fMax = Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f;
        if (Math.abs(hk0Var.a - fMax) < 0.01f) {
            return;
        }
        hk0Var.a = fMax;
        ((GlueToolbar) hk0Var.b).setTitleAlpha(fMax);
    }
}
