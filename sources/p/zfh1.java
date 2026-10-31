package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class zfh1 {
    public static final void a(WidgetState.Unauthenticated unauthenticated, whb1 whb1Var, gt40 gt40Var, leh1 leh1Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1675312014);
        int i2 = i | (b0kVar3.i(unauthenticated) ? 4 : 2) | (b0kVar3.i(whb1Var) ? 32 : 16) | 384 | (b0kVar3.i(leh1Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            long j = ((s3v) b0kVar3.k(p4k.a)).a;
            Context context = (Context) b0kVar3.k(p4k.b);
            float f = ((p3v) b0kVar3.k(r4k.a)).a;
            float f2 = p3v.b(s3v.a(j), 138.0f) >= 0 ? 16.0f : 8.0f;
            float fA = ((((s3v.a(j) - 32.0f) - f) - 20.0f) - (2.0f * f2)) - Math.max(w6p1.k(nee1.c, b0kVar3) * 2.0f, 48.0f);
            float fB = s3v.b(j) - 32.0f;
            gt40 gt40Var2 = et40.a;
            gt40 gt40VarK = leh1Var != null ? ila0.k(dm5.I(gt40Var2), leh1Var.a) : ila0.m(dm5.I(gt40Var2), new p05(2131231026));
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = ufh1.a;
                b0kVar3.s0(objT);
            }
            gt40 gt40VarX = iko1.x(gt40VarK, (iu30) objT);
            j2i j2iVarR = apo.r(-496172, new xfh1(fB, f2, fA, context, unauthenticated, whb1Var, leh1Var), b0kVar3);
            b0kVar2 = b0kVar3;
            j2h1.b(gt40VarX, ql3.d, j2iVarR, b0kVar2, 384, 0);
            gt40Var = gt40Var2;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yfh1(unauthenticated, whb1Var, gt40Var, leh1Var, i);
        }
    }
}
