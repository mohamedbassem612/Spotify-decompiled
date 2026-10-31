package com.spotify.widget.widget.widgetimpl;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.ae5;
import p.f15;
import p.fmv;
import p.gd30;
import p.hw9;
import p.ilh1;
import p.j1e1;
import p.mxa1;
import p.oo70;
import p.szm0;
import p.t961;
import p.u890;
import p.u8g;
import p.v3b1;
import p.w961;
import p.wo70;
import p.xfa;
import p.zn41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/widget/widget/widgetimpl/SpotifyWidget;", "<init>", "()V", "src_main_java_com_spotify_widget_widget_widgetimpl-widgetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class SpotifyWidget extends AppWidgetProvider {
    public static final /* synthetic */ int j = 0;
    public final Handler a = fmv.Z.b();
    public zn41 b;
    public oo70 c;
    public t961 d;
    public f15 e;
    public u8g f;
    public mxa1 g;
    public ilh1 h;
    public ae5 i;

    public final mxa1 a() {
        mxa1 mxa1Var = this.g;
        if (mxa1Var != null) {
            return mxa1Var;
        }
        u890.C("widgetUiUpdater");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(Context context, Intent intent) {
        Logger.g("SpotifyWidget received intent: " + intent, new Object[0]);
        j1e1.s(this, context);
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1910135475:
                    if (action.equals("com.spotify.mobile.android.ui.widget.NEXT")) {
                        a().o(intent);
                        c("Spotify widget skip next", "com.spotify.music.feature.widget.SKIP_NEXT");
                        return;
                    }
                    return;
                case -1574785017:
                    if (action.equals("com.spotify.mobile.android.ui.widget.RESUME")) {
                        a().o(intent);
                        c("Spotify widget resume", "com.spotify.music.feature.widget.RESUME");
                        return;
                    }
                    return;
                case -1228835662:
                    if (action.equals("com.spotify.widget.widget.PROMO_ADD_NEW_WIDGET") && Build.VERSION.SDK_INT >= 26) {
                        ilh1 ilh1Var = this.h;
                        if (ilh1Var == null) {
                            u890.C("widgetPromoLogger");
                            throw null;
                        }
                        ilh1Var.j();
                        t961 t961Var = this.d;
                        if (t961Var == null) {
                            u890.C("serviceStarter");
                            throw null;
                        }
                        u8g u8gVar = this.f;
                        if (u8gVar == null) {
                            u890.C("widgetPromoIntentFactory");
                            throw null;
                        }
                        ((w961) t961Var).a(context, u8gVar.d());
                        return;
                    }
                    return;
                case 917067452:
                    if (action.equals("com.spotify.mobile.android.ui.widget.PAUSE")) {
                        a().o(intent);
                        c("Spotify widget pause", "com.spotify.music.feature.widget.PAUSE");
                        return;
                    }
                    return;
                case 1587081399:
                    if (action.equals("android.appwidget.action.APPWIDGET_ENABLED")) {
                        mxa1.q(a(), PlayerState.EMPTY);
                        return;
                    }
                    return;
                case 1619576947:
                    if (action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
                        if (this.e == null) {
                            u890.C("serviceManager");
                            throw null;
                        }
                        if (!f15.a(context)) {
                            mxa1.q(a(), PlayerState.EMPTY);
                            return;
                        }
                        oo70 oo70Var = this.c;
                        if (oo70Var == null) {
                            u890.C("idleManager");
                            throw null;
                        }
                        ((wo70) oo70Var).a(new szm0(new gd30(new Intent())));
                        zn41 zn41Var = this.b;
                        if (zn41Var != null) {
                            zn41Var.c("Widget update", v3b1.h);
                            return;
                        } else {
                            u890.C("scopeWorkDispatcher");
                            throw null;
                        }
                    }
                    return;
                case 1817055313:
                    if (action.equals("com.spotify.mobile.android.ui.widget.PREVIOUS")) {
                        a().o(intent);
                        c("Spotify widget skip prev", "com.spotify.music.feature.widget.SKIP_PREV");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void c(String str, String str2) {
        oo70 oo70Var = this.c;
        if (oo70Var == null) {
            u890.C("idleManager");
            throw null;
        }
        ((wo70) oo70Var).a(new szm0(new gd30(new Intent())));
        zn41 zn41Var = this.b;
        if (zn41Var != null) {
            zn41Var.c(str, new xfa(str2, (byte) 7));
        } else {
            u890.C("scopeWorkDispatcher");
            throw null;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        ae5 ae5Var = this.i;
        if (ae5Var != null) {
            ae5Var.k(iArr);
        } else {
            u890.C("widgetLifecycleEventLogger");
            throw null;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        super.onEnabled(context);
        ae5 ae5Var = this.i;
        if (ae5Var != null) {
            ae5Var.j();
        } else {
            u890.C("widgetLifecycleEventLogger");
            throw null;
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            super.onReceive(context, intent);
        } else {
            this.a.post(new hw9(this, context, intent, goAsync(), (byte) 0));
        }
    }
}
