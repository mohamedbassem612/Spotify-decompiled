package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class dg91 {
    public static final void a(WidgetState.WrappedStory wrappedStory, whb1 whb1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1077732660);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wrappedStory) ? 4 : 2) | i;
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
            float fB = s3v.b(((s3v) x340Var.k(p4k.a)).a) * 0.45f;
            gt40 gt40VarL = d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = wf91.a;
                x340Var.s0(objT);
            }
            j2h1.b(iko1.x(gt40VarL, (iu30) objT), (ql3) null, apo.r(1338627094, new ag91(wrappedStory, fB), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg91(wrappedStory, whb1Var, i);
        }
    }
}
