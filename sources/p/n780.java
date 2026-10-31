package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n780 extends hab0 implements xu30 {
    public final /* synthetic */ WidgetState.InactiveSession a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n780(WidgetState.InactiveSession inactiveSession, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
        super(3);
        this.a = inactiveSession;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = z;
        this.f = z2;
        this.g = f4;
        this.h = f5;
        this.i = f6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        fc11.g(dm5.Q(et40Var, 16.0f), b0kVar, 0);
        WidgetState.InactiveSession inactiveSession = this.a;
        c760.a(inactiveSession.getMetadata(), inactiveSession.getShouldPlayRecommendations(), inactiveSession.getShouldOpenEntityPage(), dm5.Q(dm5.h0(et40Var, this.b), this.c - 28.0f), this.d, this.e, inactiveSession.getIsWorkProfile(), b0kVar, 0);
        fc11.g(dm5.Q(et40Var, 12.0f), b0kVar, 0);
        c380 c380VarA = mqo1.A(inactiveSession.getRecommendations());
        if (this.f) {
            f = 3.0f;
        } else {
            f = p3v.b(this.g, 300.0f) < 0 ? 4.0f : 12.0f;
        }
        j2h1.b(ila0.l(dm5.Q(dm5.J(et40Var), this.h), abh.c), ql3.d, apo.r(-651118648, new m780(inactiveSession, this.h, f, this.i, this.f, this.b, c380VarA), b0kVar), b0kVar, 384, 0);
        return rih1.a;
    }
}
