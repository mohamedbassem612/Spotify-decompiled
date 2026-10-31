package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xfh1 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ leh1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ whb1 f;
    public final /* synthetic */ WidgetState.Unauthenticated g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfh1(float f, float f2, float f3, Context context, WidgetState.Unauthenticated unauthenticated, whb1 whb1Var, leh1 leh1Var) {
        super(2);
        this.a = f;
        this.b = leh1Var;
        this.c = f2;
        this.d = f3;
        this.e = context;
        this.f = whb1Var;
        this.g = unauthenticated;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            gt40 gt40VarH0 = dm5.h0(et40.a, this.a);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = hzg1.Q0;
                x340Var2.s0(objT);
            }
            eqr0.a(iko1.x(gt40VarH0, (iu30) objT), 0, 0, apo.r(-1905979446, new wfh1(this.c, this.d, this.a, this.e, this.g, this.f, this.b), x340Var2), x340Var2, 3072, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
