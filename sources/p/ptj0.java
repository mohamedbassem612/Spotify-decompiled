package p;

import com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ptj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MiuiDynamicNpvWidgetProvider b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptj0(MiuiDynamicNpvWidgetProvider miuiDynamicNpvWidgetProvider, byte b) {
        super(0);
        this.a = b;
        this.b = miuiDynamicNpvWidgetProvider;
    }

    public final Object invoke() {
        byte b = this.a;
        MiuiDynamicNpvWidgetProvider miuiDynamicNpvWidgetProvider = this.b;
        switch (b) {
            case 0:
                ynb0 ynb0Var = ((kaa) miuiDynamicNpvWidgetProvider).d;
                if (ynb0Var != null) {
                    return sqg0.U(((rol1) ynb0Var.get()).a);
                }
                u890.C("bitmapCache");
                throw null;
            default:
                return miuiDynamicNpvWidgetProvider.f.a(new ptj0(miuiDynamicNpvWidgetProvider, (byte) 0));
        }
    }
}
