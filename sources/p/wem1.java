package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wem1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedPlaylist a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wem1(WidgetState.WrappedPlaylist wrappedPlaylist, int i) {
        super(2);
        j2i j2iVar = nki.a;
        this.a = wrappedPlaylist;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j2i j2iVar = nki.a;
        int iP = czo1.p(385);
        zem1.a(this.a, et40.a, (b0k) obj, iP);
        return rih1.a;
    }
}
