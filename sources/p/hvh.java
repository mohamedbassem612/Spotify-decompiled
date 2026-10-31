package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hvh extends hab0 implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvh(String str, String str2, String str3) {
        super(0);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final Object invoke() {
        return new WidgetInteraction.NpvMetadata(this.a, this.b, this.c);
    }
}
