package com.spotify.widget.widgetpromo;

import android.content.Intent;
import android.os.IBinder;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.widget.widgetpromo.events.proto.NpvRecommendationsWidgetPromoSuccessEvent;
import kotlin.Metadata;
import p.hpq;
import p.l9p0;
import p.lvc;
import p.t2j0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/widget/widgetpromo/PromoSuccessHandlerService;", "Lp/hpq;", "<init>", "()V", "p/t4n1", "src_main_java_com_spotify_widget_widgetpromo-widgetpromo"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class PromoSuccessHandlerService extends hpq {
    public static final /* synthetic */ int b = 0;
    public lvc a;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        String str = "";
        if (intent != null && intent.hasExtra("com.spotify.widget.widgetpromo.EXTRA_SOURCE") && (stringExtra = intent.getStringExtra("com.spotify.widget.widgetpromo.EXTRA_SOURCE")) != null) {
            str = stringExtra;
        }
        if (str.length() > 0) {
            lvc lvcVar = this.a;
            if (lvcVar == null) {
                u890.C("logger");
                throw null;
            }
            l9p0 l9p0VarN = NpvRecommendationsWidgetPromoSuccessEvent.n();
            l9p0VarN.n(str);
            NpvRecommendationsWidgetPromoSuccessEvent npvRecommendationsWidgetPromoSuccessEvent = (NpvRecommendationsWidgetPromoSuccessEvent) l9p0VarN.build();
            t2j0 t2j0Var = lvcVar.a;
            npvRecommendationsWidgetPromoSuccessEvent.getClass();
            t2j0Var.a(npvRecommendationsWidgetPromoSuccessEvent);
        }
        stopSelf();
        return super/*android.app.Service*/.onStartCommand(intent, i, i2);
    }
}
