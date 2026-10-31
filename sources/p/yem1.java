package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yem1 extends hab0 implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ WidgetState.WrappedPlaylist c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yem1(String str, String str2, WidgetState.WrappedPlaylist wrappedPlaylist) {
        super(0);
        this.a = str;
        this.b = str2;
        this.c = wrappedPlaylist;
    }

    public final Object invoke() {
        return new WidgetInteraction.WrappedClick(this.a, this.b, this.c.getDeeplink(), WidgetInteraction.WrappedVariant.PLAYLIST);
    }
}
