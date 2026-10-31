package p;

import com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xog1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TranssionCardWidgetProvider b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xog1(TranssionCardWidgetProvider transsionCardWidgetProvider, byte b) {
        super(0);
        this.a = b;
        this.b = transsionCardWidgetProvider;
    }

    public final Object invoke() {
        byte b = this.a;
        TranssionCardWidgetProvider transsionCardWidgetProvider = this.b;
        switch (b) {
            case 0:
                ynb0 ynb0Var = ((kaa) transsionCardWidgetProvider).d;
                if (ynb0Var != null) {
                    return sqg0.U(((rol1) ynb0Var.get()).a);
                }
                u890.C("bitmapCache");
                throw null;
            default:
                return transsionCardWidgetProvider.f.a(new xog1(transsionCardWidgetProvider, (byte) 0));
        }
    }
}
