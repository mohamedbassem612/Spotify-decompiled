package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y7p0 extends hab0 implements Function0 {
    public final /* synthetic */ CurrentTrackMetadata a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7p0(CurrentTrackMetadata currentTrackMetadata, String str, String str2) {
        super(0);
        this.a = currentTrackMetadata;
        this.b = str;
        this.c = str2;
    }

    public final Object invoke() {
        return new WidgetInteraction.NpvMetadata(this.b, this.c, this.a.getUri());
    }
}
