package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n6m1 extends hab0 implements vu30 {
    public final /* synthetic */ l6m1 a;
    public final /* synthetic */ WidgetState.WrappedPlaylist b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6m1(l6m1 l6m1Var, WidgetState.WrappedPlaylist wrappedPlaylist, int i) {
        super(2);
        this.a = l6m1Var;
        this.b = wrappedPlaylist;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(7);
        q6m1.a(this.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
