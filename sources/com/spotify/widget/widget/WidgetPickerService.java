package com.spotify.widget.widget;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.widget.RemoteViews;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.bs50;
import p.fc3;
import p.flo1;
import p.fn31;
import p.fns;
import p.gaa0;
import p.ghk1;
import p.hpq;
import p.igu;
import p.k3i0;
import p.llm;
import p.lnm;
import p.o8n;
import p.op71;
import p.p2o1;
import p.pyf0;
import p.smo1;
import p.u890;
import p.vse0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/widget/widget/WidgetPickerService;", "Lp/hpq;", "<init>", "()V", "src_main_java_com_spotify_widget_widget-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WidgetPickerService extends hpq {
    public k3i0 a;
    public ghk1 b;
    public final gaa0 c;
    public final llm d;

    public WidgetPickerService() {
        gaa0 gaa0VarF = op71.f();
        this.c = gaa0VarF;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        bs50Var.getClass();
        this.d = smo1.e(flo1.l(bs50Var, gaa0VarF));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(WidgetPickerService widgetPickerService) {
        widgetPickerService.stopForeground(1);
        widgetPickerService.stopSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(WidgetPickerService widgetPickerService) {
        RemoteViews remoteViews = new RemoteViews(widgetPickerService.getPackageName(), 2131625465);
        remoteViews.setTextViewText(2131430546, widgetPickerService.getString(2131963874));
        remoteViews.setTextViewText(2131430545, widgetPickerService.getString(2131963873));
        remoteViews.setViewVisibility(2131430542, 8);
        p2o1.L(widgetPickerService, new fc3(remoteViews, (byte) 26));
    }

    public final ghk1 c() {
        ghk1 ghk1Var = this.b;
        if (ghk1Var != null) {
            return ghk1Var;
        }
        u890.C("widgetPinRetryHandler");
        throw null;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        this.c.d((CancellationException) null);
        super/*android.app.Service*/.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        k3i0 k3i0Var = this.a;
        if (i3 >= 34) {
            if (k3i0Var == null) {
                u890.C("widgetNotificationFactory");
                throw null;
            }
            startForeground(i2, k3i0Var.c(), 2048);
        } else {
            if (k3i0Var == null) {
                u890.C("widgetNotificationFactory");
                throw null;
            }
            startForeground(i2, k3i0Var.c());
        }
        if (u890.j(intent != null ? intent.getAction() : null, "com.spotify.widget.widget.PROMO_ADD_NEW_WIDGET")) {
            fn31.T(this.d, (o8n) null, 0, new vse0(this, (lnm) null, (byte) 22), 3);
            return 2;
        }
        stopForeground(1);
        stopSelf();
        return 2;
    }
}
