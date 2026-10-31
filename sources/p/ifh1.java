package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ifh1 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ WidgetState.Unauthenticated b;
    public final /* synthetic */ u011 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ String e;
    public final /* synthetic */ cz31 f;
    public final /* synthetic */ leh1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifh1(float f, WidgetState.Unauthenticated unauthenticated, u011 u011Var, float f2, String str, cz31 cz31Var, leh1 leh1Var) {
        super(3);
        this.a = f;
        this.b = unauthenticated;
        this.c = u011Var;
        this.d = f2;
        this.e = str;
        this.f = cz31Var;
        this.g = leh1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        j2h1.b(eqr0.H(dm5.J(et40Var), this.a, 0.0f, 0.0f, 0.0f, 14), ql3.f, apo.r(-359337430, new wcf1(this.g, (byte) 22), x340Var), x340Var, 384, 0);
        fc11.g(dm5.Q(et40Var, 8.0f), x340Var, 0);
        fc11.g(obh.a(et40Var), x340Var, 0);
        boolean isWorkProfile = this.b.getIsWorkProfile();
        String str = this.c.a;
        gt40 gt40VarE0 = dm5.e0(et40Var, this.d);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (objT == fkj0.X) {
            objT = hzg1.P0;
            x340Var2.s0(objT);
        }
        poo1.a(this.e, iko1.x(gt40VarE0, (iu30) objT), isWorkProfile, this.f, str, 0, x340Var2, 0, 32);
        fc11.g(obh.a(et40Var), x340Var2, 0);
        return rih1.a;
    }
}
