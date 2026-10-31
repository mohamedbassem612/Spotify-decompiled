package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qe0 extends hab0 implements vu30 {
    public final /* synthetic */ kee1 X;
    public final /* synthetic */ WidgetState.ActiveSession a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ kee1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(WidgetState.ActiveSession activeSession, float f, float f2, float f3, float f4, float f5, float f6, int i, boolean z, kee1 kee1Var, kee1 kee1Var2, int i2) {
        super(2);
        this.a = activeSession;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = i;
        this.i = z;
        this.t = kee1Var;
        this.X = kee1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ye0.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP);
        return rih1.a;
    }
}
