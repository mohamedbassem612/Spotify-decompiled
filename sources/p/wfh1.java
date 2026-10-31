package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wfh1 extends hab0 implements xu30 {
    public final /* synthetic */ leh1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ whb1 e;
    public final /* synthetic */ WidgetState.Unauthenticated f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfh1(float f, float f2, float f3, Context context, WidgetState.Unauthenticated unauthenticated, whb1 whb1Var, leh1 leh1Var) {
        super(3);
        this.a = leh1Var;
        this.b = f;
        this.c = f2;
        this.d = context;
        this.e = whb1Var;
        this.f = unauthenticated;
        this.g = f3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        fc11.g(dm5.Q(et40Var, 16.0f), b0kVar, 0);
        leh1 leh1Var = this.a;
        aym.e((gt40) null, new u8h(new oxe1(leh1Var != null ? leh1Var.b : new hn20(abh.h))), b0kVar, 64);
        float f = this.b;
        fc11.g(dm5.Q(et40Var, f), b0kVar, 0);
        jch0.f(dm5.J(et40Var), 1, apo.r(1917794606, new p8e1(this.d, leh1Var, this.e, (byte) 3), b0kVar), b0kVar, 3072, 2);
        fc11.g(dm5.Q(et40Var, f), b0kVar, 0);
        float f2 = this.c;
        j2h1.b(dm5.J(dm5.Q(et40Var, f2)), (ql3) null, apo.r(-1865586520, new vfh1(this.f, this.g, f2), b0kVar), b0kVar, 384, 2);
        return rih1.a;
    }
}
