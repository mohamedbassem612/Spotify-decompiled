package p;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService;
import com.spotify.widget.widget.widgetimpl.SpotifyWidget;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q0q implements dl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ q0q(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 1:
                ((DynamicUpsellLoggerService) obj).a = (w5b1) daqVar.W3.get();
                break;
            case 6:
                ((lm21) obj).V1 = (g341) daqVar.Fh.get();
                break;
            default:
                SpotifyWidget spotifyWidget = (SpotifyWidget) obj;
                spotifyWidget.c = (oo70) daqVar.M2.get();
                spotifyWidget.b = (zn41) daqVar.am.get();
                spotifyWidget.e = daqVar.R1();
                spotifyWidget.d = (t961) daqVar.J2.get();
                spotifyWidget.i = new ae5((t2j0) daqVar.f2.get());
                spotifyWidget.f = new u8g((Context) daqVar.x1.a);
                spotifyWidget.h = new ilh1((i8h1) daqVar.A5.get(), (byte) 29);
                Context context = (Context) daqVar.x1.a;
                xs80 xs80Var = (xs80) daqVar.b3.get();
                e26 e26Var = new e26(false, false, (luk) daqVar.L1.get());
                e26 e26Var2 = new e26(false, false, (luk) daqVar.L1.get());
                Context context2 = (Context) daqVar.x1.a;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance((Context) daqVar.x1.a);
                Scheduler scheduler = (Scheduler) daqVar.r3.get();
                qpj1 qpj1Var = new qpj1((i8h1) daqVar.A5.get());
                Object obj2 = daqVar.x1.a;
                spotifyWidget.g = new mxa1(context, xs80Var, e26Var, new zrj1(e26Var2, new rx5(context2, appWidgetManager, scheduler, qpj1Var, new wpt((Context) obj2), new uxy0(daqVar.x1.a, (Object) AppWidgetManager.getInstance((Context) obj2), (byte) 11)), new em3((Context) daqVar.x1.a, AppWidgetManager.getInstance((Context) daqVar.x1.a), (byte) 12), (byte) 15), new r2a1(new u8g((Context) daqVar.x1.a), new wpt((Context) daqVar.x1.a), (byte) 12), (Scheduler) daqVar.A2.get());
                break;
        }
    }

    public /* synthetic */ q0q(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}
