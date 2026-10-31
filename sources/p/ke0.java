package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ke0 extends hab0 implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ WidgetState.ActiveSession c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(String str, String str2, WidgetState.ActiveSession activeSession) {
        super(0);
        this.a = str;
        this.b = str2;
        this.c = activeSession;
    }

    public final Object invoke() {
        return new WidgetInteraction.Background(this.a, this.b, WidgetInteraction.BackgroundSessionState.ACTIVE, this.c.getMetadata().getUri());
    }
}
