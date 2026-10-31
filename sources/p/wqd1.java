package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wqd1 extends hab0 implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqd1(String str, String str2) {
        super(0);
        this.a = str;
        this.b = str2;
    }

    public final Object invoke() {
        return new WidgetInteraction.RefreshWidget(this.a, this.b);
    }
}
