package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dau0 extends hab0 implements vu30 {
    public final /* synthetic */ short X;
    public final /* synthetic */ WidgetState.ActiveSession a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ gt40 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dau0(WidgetState.ActiveSession activeSession, boolean z, float f, gt40 gt40Var, float f2, float f3, float f4, float f5, float f6, int i, int i2) {
        super(2);
        this.a = activeSession;
        this.b = z;
        this.c = f;
        this.d = gt40Var;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.t = i;
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rau0.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, czo1.p(this.t | 1), this.X);
        return rih1.a;
    }
}
