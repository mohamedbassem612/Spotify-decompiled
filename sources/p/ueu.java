package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ueu {
    public static final void a(WidgetInteraction.WrappedVariant wrappedVariant, String str, gt40 gt40Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1034052264);
        int i2 = (x340Var.g(str) ? 32 : 16) | i | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str2 = (String) x340Var.k(wol1.a);
            String str3 = (String) x340Var.k(wol1.b);
            String str4 = (String) x340Var.k(wol1.c);
            boolean zG = x340Var.g(str3) | x340Var.g(str4);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new teu(str3, str4, wrappedVariant);
                x340Var.s0(objT);
            }
            cz31 cz31Var = new cz31(w0h1.A(new y60[]{new y60(apl1.b, (WidgetInteraction) ((Function0) objT).invoke()), new y60(apl1.a, str2)}));
            gt40Var = et40.a;
            j2h1.b(dm5.I(gt40Var), ql3.e, apo.r(1067534650, new reu(cz31Var, str), x340Var), x340Var, 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new seu(wrappedVariant, str, gt40Var, i);
        }
    }
}
