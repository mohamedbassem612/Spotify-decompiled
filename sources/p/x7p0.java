package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x7p0 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.ActiveSession a;
    public final /* synthetic */ gt40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ kee1 e;
    public final /* synthetic */ kee1 f;
    public final /* synthetic */ short g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x7p0(WidgetState.ActiveSession activeSession, gt40 gt40Var, float f, int i, kee1 kee1Var, kee1 kee1Var2, int i2, int i3) {
        super(2);
        this.a = activeSession;
        this.b = gt40Var;
        this.c = f;
        this.d = i;
        this.e = kee1Var;
        this.f = kee1Var2;
        this.g = i2;
        this.h = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        p8p0.a(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
