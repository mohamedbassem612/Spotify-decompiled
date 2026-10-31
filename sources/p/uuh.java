package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uuh extends hab0 implements Function0 {
    public final /* synthetic */ WidgetState.InactiveSession a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuh(WidgetState.InactiveSession inactiveSession, String str, String str2) {
        super(0);
        this.a = inactiveSession;
        this.b = str;
        this.c = str2;
    }

    public final Object invoke() {
        WidgetState.InactiveSession inactiveSession = this.a;
        return new WidgetInteraction.ItemClick.HeroItemClick(inactiveSession.getMetadata().e, this.b, this.c, inactiveSession.getShouldPlayRecommendations(), inactiveSession.getShouldOpenEntityPage());
    }
}
