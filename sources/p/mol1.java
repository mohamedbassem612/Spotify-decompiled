package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mol1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedPlaylist a;
    public final /* synthetic */ whb1 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mol1(WidgetState.WrappedPlaylist wrappedPlaylist, whb1 whb1Var, int i) {
        super(2);
        this.a = wrappedPlaylist;
        this.b = whb1Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.c | 1);
        ool1.a(this.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
