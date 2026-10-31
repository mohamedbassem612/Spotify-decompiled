package p;

import android.content.Intent;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class afh1 {
    public static final void a(WidgetState.Unauthenticated unauthenticated, gt40 gt40Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-600878544);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(unauthenticated) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gt40Var) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (unauthenticated.getUseThemedColors()) {
            x340Var.i0(651123345);
            j2h1.e((ajv) null, apo.r(1912047348, new ueh1(unauthenticated, gt40Var), x340Var), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.i0(651193281);
            b(unauthenticated, gt40Var, x340Var, i2 & 126);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new veh1(unauthenticated, gt40Var, i);
        }
    }

    public static final void b(WidgetState.Unauthenticated unauthenticated, gt40 gt40Var, b0k b0kVar, int i) {
        int i2;
        leh1 leh1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-966509831);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(unauthenticated) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gt40Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (unauthenticated.getUseThemedColors()) {
                x340Var.i0(166552959);
                kiv kivVar = p4k.e;
                leh1Var = new leh1(((ajv) x340Var.k(kivVar)).c, ((ajv) x340Var.k(kivVar)).d, ((ajv) x340Var.k(kivVar)).d, ((ajv) x340Var.k(kivVar)).a, ((ajv) x340Var.k(kivVar)).b);
                x340Var.r(false);
            } else {
                x340Var.i0(166876599);
                x340Var.r(false);
                leh1Var = null;
            }
            kiv kivVar2 = wol1.a;
            String str = (String) x340Var.k(kivVar2);
            String str2 = (String) x340Var.k(wol1.b);
            String str3 = (String) x340Var.k(wol1.c);
            String str4 = (String) x340Var.k(kivVar2);
            boolean zG = x340Var.g(str2) | x340Var.g(str3);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new zeh1(str2, str3);
                x340Var.s0(objT);
            }
            Intent intentB = dro.B((String) null, str4, (WidgetInteraction) ((Function0) objT).invoke());
            intentB.setFlags(268435456);
            whb1 whb1Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            boolean zG2 = x340Var.g(str2) | x340Var.g(str3);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new yeh1(str2, str3);
                x340Var.s0(objT2);
            }
            Intent intentB2 = dro.B((String) null, str, (WidgetInteraction) ((Function0) objT2).invoke());
            intentB2.setFlags(268435456);
            j2h1.b(d9y0.l(dm5.I(gt40Var), new whb1(intentB2, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a())), (ql3) null, apo.r(907309915, new weh1(whb1Var, leh1Var, unauthenticated), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xeh1(unauthenticated, gt40Var, i);
        }
    }
}
