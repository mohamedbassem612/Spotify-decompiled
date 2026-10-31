package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pe0 extends hab0 implements xu30 {
    public final /* synthetic */ float X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ float a;
    public final /* synthetic */ WidgetState.ActiveSession b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ kee1 h;
    public final /* synthetic */ kee1 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe0(float f, WidgetState.ActiveSession activeSession, float f2, float f3, float f4, float f5, int i, kee1 kee1Var, kee1 kee1Var2, boolean z, float f6, float f7) {
        super(3);
        this.a = f;
        this.b = activeSession;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = i;
        this.h = kee1Var;
        this.i = kee1Var2;
        this.t = z;
        this.X = f6;
        this.Y = f7;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        float f2 = this.a;
        fc11.g(dm5.Q(et40Var, f2), x340Var, 0);
        gt40 gt40VarH0 = dm5.h0(et40Var, this.c);
        float f3 = this.d - f2;
        float f4 = this.e;
        gt40 gt40VarQ = dm5.Q(gt40VarH0, f3 - f4);
        WidgetState.ActiveSession activeSession = this.b;
        p8p0.a(activeSession, gt40VarQ, this.f, this.g, this.h, this.i, x340Var, 0, 0);
        fc11.g(dm5.Q(et40Var, f4), x340Var, 0);
        c380 c380VarA = mqo1.A(activeSession.getRecommendations());
        if (this.t) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(367480258);
            x340Var2.r(false);
            f = 3.0f;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(367482401);
            f = p3v.b(s3v.a(((s3v) x340Var3.k(p4k.a)).a), 300.0f) < 0 ? 4.0f : 12.0f;
            x340Var3.r(false);
        }
        j2h1.b(ila0.l(dm5.Q(dm5.J(et40Var), this.X), abh.c), ql3.d, apo.r(1734025130, new oe0(activeSession, this.X, f, this.Y, this.t, this.c, c380VarA), x340Var), x340Var, 384, 0);
        return rih1.a;
    }
}
