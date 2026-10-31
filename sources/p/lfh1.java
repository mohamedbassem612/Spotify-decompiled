package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lfh1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.Unauthenticated a;
    public final /* synthetic */ leh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfh1(WidgetState.Unauthenticated unauthenticated, leh1 leh1Var, int i) {
        super(2);
        this.a = unauthenticated;
        this.b = leh1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        mfh1.a(this.a, et40.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
