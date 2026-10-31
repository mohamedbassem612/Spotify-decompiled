package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.xrprojected.ui.XrProjectedActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class omm1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ XrProjectedActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ omm1(XrProjectedActivity xrProjectedActivity, boolean z, byte b) {
        super(2);
        this.a = b;
        this.c = xrProjectedActivity;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        XrProjectedActivity xrProjectedActivity = this.c;
        boolean z2 = false;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (z) {
                    x340Var2.i0(-1982831057);
                    int i = XrProjectedActivity.p1;
                    xrProjectedActivity.p0(x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1982782387);
                    int i2 = XrProjectedActivity.p1;
                    xrProjectedActivity.o0(x340Var2, 0);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wu40.a(null, null, null, apo.r(-1913778616, new omm1(z, xrProjectedActivity, z2 ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3072);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    kiv kivVar = cde0.a;
                    yqg yqgVar = xrProjectedActivity.j1;
                    if (yqgVar == null) {
                        u890.C("clock");
                        throw null;
                    }
                    ely0 ely0VarA = kivVar.a(yqgVar);
                    kiv kivVar2 = oi7.a;
                    gw70 gw70Var = xrProjectedActivity.i1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.c(new ely0[]{ely0VarA, kivVar2.a(gw70Var)}, apo.r(-1016660496, new omm1(z, xrProjectedActivity, b3), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    View view = (View) x340Var8.k(AndroidCompositionLocals_androidKt.f);
                    l6h1 l6h1Var = xrProjectedActivity.o1;
                    if (l6h1Var == null) {
                        u890.C("ubiDwellTimeLogger");
                        throw null;
                    }
                    i8h1 i8h1Var = xrProjectedActivity.n1;
                    if (i8h1Var == null) {
                        u890.C("ubiLogger");
                        throw null;
                    }
                    op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
                    op80 jp80Var = new jp80(view);
                    op80 wchVar = q6x.b;
                    if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                        eq80Var = wchVar;
                    } else if (!jp80Var.equals(wchVar)) {
                        if (eq80Var.equals(wchVar)) {
                            eq80Var = jp80Var;
                        } else {
                            wchVar = new wch(jp80Var, eq80Var);
                            eq80Var = wchVar;
                        }
                    }
                    xhk1.c(view, eq80Var);
                    qsw.c(new obk1(view), apo.r(700959408, new omm1(xrProjectedActivity, z, b2), x340Var8), x340Var8, 48);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ omm1(boolean z, XrProjectedActivity xrProjectedActivity, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = xrProjectedActivity;
    }
}
