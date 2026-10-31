package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z660 extends hab0 implements Function0 {
    public final /* synthetic */ nmo a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z660(nmo nmoVar, String str, String str2, boolean z, boolean z2) {
        super(0);
        this.a = nmoVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final Object invoke() {
        return new WidgetInteraction.ItemClick.HeroItemClick(this.a.e, this.b, this.c, this.d, this.e);
    }
}
