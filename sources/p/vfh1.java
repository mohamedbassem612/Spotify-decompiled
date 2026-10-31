package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vfh1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.Unauthenticated a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfh1(WidgetState.Unauthenticated unauthenticated, float f, float f2) {
        super(2);
        this.a = unauthenticated;
        this.b = f;
        this.c = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            WidgetState.Unauthenticated unauthenticated = this.a;
            c380 c380VarA = mqo1.A(unauthenticated.getRecommendations());
            boolean isWorkProfile = unauthenticated.getIsWorkProfile();
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = hzg1.R0;
                x340Var2.s0(objT);
            }
            y3o1.g(c380VarA, vi90.f, this.b, this.c, iko1.x(et40.a, (iu30) objT), false, false, isWorkProfile, (fg50) null, x340Var2, 196656, 704);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
