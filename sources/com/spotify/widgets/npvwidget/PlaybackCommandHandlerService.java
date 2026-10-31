package com.spotify.widgets.npvwidget;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.spotify.widgets.recommendationswidget.events.proto.NpvRecommendationsWidgetErrorEvent;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.ae5;
import p.f3t0;
import p.fn31;
import p.guo1;
import p.h9p0;
import p.j1e1;
import p.j2h1;
import p.llm;
import p.lnm;
import p.o8n;
import p.smo1;
import p.u890;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/widgets/npvwidget/PlaybackCommandHandlerService;", "Landroid/app/Service;", "<init>", "()V", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlaybackCommandHandlerService extends Service {
    public k a;
    public ae5 b;
    public String c;
    public final llm d = smo1.e(guo1.B());

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        smo1.p(this.d, (CancellationException) null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY")) == null) {
            stringExtra = "";
        }
        this.c = stringExtra;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            try {
                x74.s0(this, i2, 2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                j1e1.r(this);
                ae5 ae5Var = this.b;
                if (ae5Var == null) {
                    u890.C("errorLogger");
                    throw null;
                }
                String str = this.c;
                if (str == null) {
                    u890.C("widgetCategory");
                    throw null;
                }
                h9p0 h9p0VarN = NpvRecommendationsWidgetErrorEvent.n();
                h9p0VarN.n("FG_NOT_ALLOWED");
                h9p0VarN.s(str);
                h9p0VarN.r(j2h1.I(e));
                ae5Var.a.a(h9p0VarN.build());
                stopSelf(i2);
                return 2;
            }
        }
        j1e1.r(this);
        if (u890.j(intent != null ? intent.getAction() : null, "com.spotify.widgets.widgets.ACTION_PLAYBACK_COMMAND") && intent.hasExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION")) {
            fn31.T(this.d, (o8n) null, 0, new f3t0(this, intent, (lnm) null, (byte) 10), 3);
        }
        if (i3 >= 26) {
            stopForeground(1);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
