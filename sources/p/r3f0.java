package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r3f0 extends hab0 implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3f0(String str, String str2) {
        super(0);
        this.a = str;
        this.b = str2;
    }

    public final Object invoke() {
        return new WidgetInteraction.SpotifyLogo(this.a, this.b, (String) null, 4, (DefaultConstructorMarker) null);
    }
}
