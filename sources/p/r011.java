package p;

import android.net.Uri;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r011 extends hab0 implements Function0 {
    public final /* synthetic */ u011 a;
    public final /* synthetic */ mp10 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r011(u011 u011Var, mp10 mp10Var, int i, String str, String str2) {
        super(0);
        this.a = u011Var;
        this.b = mp10Var;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public final Object invoke() {
        Uri uri = this.a.e;
        ui90 ui90Var = (ui90) this.b;
        return new WidgetInteraction.ItemClick.GridItemClick(uri, this.c, null, this.d, this.e, ui90Var.f, ui90Var.g, 4, null);
    }
}
