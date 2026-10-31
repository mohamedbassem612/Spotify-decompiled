package p;

import android.net.Uri;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class mfh1 {
    public static final void a(WidgetState.Unauthenticated unauthenticated, gt40 gt40Var, leh1 leh1Var, b0k b0kVar, int i) {
        WidgetState.Unauthenticated unauthenticated2;
        b0k b0kVar2;
        gt40 gt40Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-386142634);
        int i2 = (b0kVar3.i(unauthenticated) ? 4 : 2) | i | 48 | (b0kVar3.i(leh1Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            u011 u011Var = (u011) o7h.s0(unauthenticated.getRecommendations());
            if (u011Var == null) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new lfh1(unauthenticated, leh1Var, i);
                    return;
                }
                return;
            }
            Uri uri = u011Var.e;
            long j = ((s3v) b0kVar3.k(p4k.a)).a;
            String string = hno1.q(Uri.parse(u011Var.c), uri).toString();
            gt40Var2 = et40.a;
            gt40 gt40VarK = leh1Var != null ? ila0.k(dm5.I(gt40Var2), leh1Var.a) : ila0.m(dm5.I(gt40Var2), new p05(2131231026));
            String str = (String) b0kVar3.k(wol1.b);
            String str2 = (String) b0kVar3.k(wol1.c);
            String string2 = uri.toString();
            String str3 = (String) b0kVar3.k(wol1.a);
            boolean zG = b0kVar3.g(str) | b0kVar3.g(str2);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new kfh1(str, str2);
                b0kVar3.s0(objT);
            }
            scn0 scn0VarA = w0h1.A(new y60[]{new y60(apl1.b, (WidgetInteraction) ((Function0) objT).invoke()), new y60(apl1.a, str3)});
            if (string2 != null) {
                scn0VarA.a(apl1.c, string2);
            }
            cz31 cz31Var = new cz31(scn0VarA);
            float fB = s3v.b(j) - 32.0f;
            float f = zjy.p(0.0f, new p3v(Math.min(fB, ((s3v.a(j) - 32.0f) - 20.0f) - 8.0f))).a;
            float f2 = zjy.p(0.0f, new p3v((fB - f) / 2.0f)).a;
            gt40 gt40VarE = eqr0.E(gt40VarK, 16.0f);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = hfh1.a;
                b0kVar3.s0(objT2);
            }
            unauthenticated2 = unauthenticated;
            b0kVar2 = b0kVar3;
            eqr0.a(iko1.x(gt40VarE, (iu30) objT2), 0, 1, apo.r(1582941132, new ifh1(f2, unauthenticated, u011Var, f, string, cz31Var, leh1Var), b0kVar3), b0kVar2, 3072, 2);
        } else {
            unauthenticated2 = unauthenticated;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            gt40Var2 = gt40Var;
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new jfh1(unauthenticated2, gt40Var2, leh1Var, i);
        }
    }
}
