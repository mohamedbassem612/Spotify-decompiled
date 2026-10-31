package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class veh1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.Unauthenticated a;
    public final /* synthetic */ gt40 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public veh1(WidgetState.Unauthenticated unauthenticated, gt40 gt40Var, int i) {
        super(2);
        this.a = unauthenticated;
        this.b = gt40Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.c | 1);
        afh1.a(this.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
