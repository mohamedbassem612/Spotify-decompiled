package p;

import android.content.Intent;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ivh {
    public static final void a(WidgetState.ActiveSession activeSession, gt40 gt40Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1649739118);
        int i2 = (x340Var.i(activeSession) ? 4 : 2) | i | (x340Var.i(gt40Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (activeSession.getHideSkipButtonsInCompactFormat()) {
            x340Var.i0(67442067);
            avh.a(activeSession, gt40Var, x340Var, i2 & 126);
            x340Var.r(false);
        } else {
            x340Var.i0(67512592);
            b(activeSession, gt40Var, x340Var, i2 & 126);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvh(activeSession, gt40Var, i);
        }
    }

    public static final void b(WidgetState.ActiveSession activeSession, gt40 gt40Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1864713806);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(activeSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gt40Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jch0.f(eqr0.E(dm5.I(gt40Var), 8.0f), 1, apo.r(-1403148010, new fvh(activeSession.getMetadata(), s3v.a(((s3v) x340Var.k(p4k.a)).a) - 16.0f, activeSession, activeSession.getContentType() == WidgetState.ContentType.TALK), x340Var), x340Var, 3072, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gvh(activeSession, gt40Var, i);
        }
    }

    public static final whb1 c(String str, String str2, String str3, String str4) {
        Intent intentB = dro.B((String) null, str3, (WidgetInteraction) new hvh(str, str2, str4).invoke());
        intentB.setFlags(268435456);
        return new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
    }
}
