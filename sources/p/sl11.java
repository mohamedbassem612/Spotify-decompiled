package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sl11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl11(int i, byte b) {
        super(1);
        this.a = b;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new k3h1(i);
            case 1:
                b261.l((e261) obj, new f4h(i, 0));
                return rih1Var;
            case 2:
                b261.k((e261) obj, new d4h(1, i));
                return rih1Var;
            case 3:
                b261.l((e261) obj, new f4h(0, i));
                return rih1Var;
            case 4:
                b261.l((e261) obj, new f4h(0, i));
                return rih1Var;
            case 5:
                kd31 kd31Var = (kd31) obj;
                float f = i;
                kd31Var.p(2.5f * f);
                kd31Var.C(kd31Var.T0.h() * 3.0f * f);
                kd31Var.E(kd31Var.T0.h() * 0.5f * f);
                kd31Var.A(sgc1.u(0.0f, 1.0f));
                kd31Var.w(er31.b(4.0f));
                kd31Var.f(true);
                return rih1Var;
            case 6:
                b261.G((e261) obj, i);
                return rih1Var;
            case 7:
                return new owl0(new opl0(i, (r6h1) obj, (byte) 6));
            case 8:
                pxg1 pxg1VarO0 = irn1.o0(i, 0, (dlv) null, 6);
                return ((xa5) obj).a(hm5.P(xay.e(2, pxg1VarO0), xay.f(2, pxg1VarO0)), hm5.h(1, new p4g0(i, (byte) 23)));
            case 9:
                qhl qhlVar = (qhl) obj;
                qhlVar.setMargins(i, ((ViewGroup.MarginLayoutParams) qhlVar).topMargin, ((ViewGroup.MarginLayoutParams) qhlVar).rightMargin, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin);
                return rih1Var;
            case 10:
                qhl qhlVar2 = (qhl) obj;
                qhlVar2.setMargins(((ViewGroup.MarginLayoutParams) qhlVar2).leftMargin, ((ViewGroup.MarginLayoutParams) qhlVar2).topMargin, i, ((ViewGroup.MarginLayoutParams) qhlVar2).bottomMargin);
                return rih1Var;
            case 11:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, i);
                return rih1Var;
            case 12:
                return new k3h1(i);
            case 13:
                return new k3h1(i);
            case 14:
                return new k3h1(i);
            case 15:
                return new k3h1(i);
            case 16:
                return hm5.P(xay.e(2, irn1.o0(i, 0, (dlv) null, 6)), xay.f(2, irn1.o0(i, 0, (dlv) null, 6)));
            case 17:
                return new k3h1(i);
            case 18:
                return new k3h1(i);
            case 19:
                e3l0 e3l0Var = (e3l0) obj;
                int iC = l1d.C(i);
                if (iC == 0) {
                    return e3l0Var.h();
                }
                if (iC == 1) {
                    return e3l0Var.h();
                }
                if (iC == 2) {
                    return e3l0Var.e(1, 2);
                }
                if (iC == 3) {
                    return e3l0Var.e(2, 1);
                }
                if (iC == 4) {
                    return e3l0Var.h();
                }
                eg.o();
                return null;
            case 20:
                return new c7v0(i, true);
            case 21:
                return new k3h1(i);
            case 22:
                return d4m1.a((d4m1) obj, (ws61) null, (String) null, false, 0, 0, 0, 0, 0, false, (puc) null, 0, 0, 0, false, (String) null, (List) null, (Set) null, Integer.valueOf(yoi1.p(i, 0, 100)), false, (gzl1) null, false, false, false, false, false, false, false, (qu61) null, -1048577);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return d4m1.a((d4m1) obj, (ws61) null, (String) null, false, this.b, 0, 0, 0, 0, false, (puc) null, 0, 0, 0, false, (String) null, (List) null, (Set) null, (Integer) null, false, (gzl1) null, false, false, false, false, false, false, false, (qu61) null, -65);
            case 24:
                return d4m1.a((d4m1) obj, (ws61) null, (String) null, false, 0, 0, 0, 0, this.b, true, nuc.a, 0, 0, 0, false, (String) null, (List) null, (Set) null, (Integer) null, false, (gzl1) null, false, false, false, false, false, false, false, (qu61) null, -7169);
            default:
                return ((Context) obj).getResources().getQuantityString(2131820951, i, Integer.valueOf(i));
        }
    }
}
