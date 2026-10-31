package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class nol1 {
    public static final void a(WidgetState.WrappedStory wrappedStory, whb1 whb1Var, b0k b0kVar, int i) {
        int i2;
        WidgetState.WrappedStory wrappedStory2;
        whb1 whb1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(852079048);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wrappedStory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(whb1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(et40.a) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            wrappedStory2 = wrappedStory;
            whb1Var2 = whb1Var;
            eim1.a(wrappedStory2, whb1Var2, fim1.a, 2, 16.0f, l6m1.STORY_WIDE, "wrapped_story_wide", x340Var, (i2 & 14) | 14376960 | (i2 & 112) | (i2 & 896), 0);
        } else {
            wrappedStory2 = wrappedStory;
            whb1Var2 = whb1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kol1(wrappedStory2, whb1Var2, i);
        }
    }
}
