package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bvh extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.ActiveSession a;
    public final /* synthetic */ gt40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvh(WidgetState.ActiveSession activeSession, gt40 gt40Var, int i) {
        super(2);
        this.a = activeSession;
        this.b = gt40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ivh.a(this.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
