package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class teu extends hab0 implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ WidgetInteraction.WrappedVariant c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teu(String str, String str2, WidgetInteraction.WrappedVariant wrappedVariant) {
        super(0);
        this.a = str;
        this.b = str2;
        this.c = wrappedVariant;
    }

    public final Object invoke() {
        return new WidgetInteraction.WrappedDismiss(this.a, this.b, this.c);
    }
}
