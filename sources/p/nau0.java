package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nau0 extends hab0 implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CurrentTrackMetadata c;
    public final /* synthetic */ iko d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nau0(String str, String str2, CurrentTrackMetadata currentTrackMetadata, iko ikoVar) {
        super(0);
        this.a = str;
        this.b = str2;
        this.c = currentTrackMetadata;
        this.d = ikoVar;
    }

    public final Object invoke() {
        return new WidgetInteraction.CurateCommand(this.a, this.b, this.c, this.d);
    }
}
