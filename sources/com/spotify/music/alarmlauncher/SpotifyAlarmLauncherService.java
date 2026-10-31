package com.spotify.music.alarmlauncher;

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.AlarmClockWarmupStartNonAuth;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.UUID;
import kotlin.Metadata;
import p.gga1;
import p.gid;
import p.hd30;
import p.hpq;
import p.hr0;
import p.jd30;
import p.l1d;
import p.mo80;
import p.nx2;
import p.p4t;
import p.pd30;
import p.t2j0;
import p.toj0;
import p.u43;
import p.u890;
import p.z43;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/music/alarmlauncher/SpotifyAlarmLauncherService;", "Lp/hpq;", "<init>", "()V", "src_main_java_com_spotify_music_alarmlauncher-alarmlauncher"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class SpotifyAlarmLauncherService extends hpq {
    public toj0 a;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        Logger.b("SpotifyAlarmLauncherService onCreate", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        Logger.b("SpotifyAlarmLauncherService onDestroy", new Object[0]);
        toj0 toj0Var = this.a;
        if (toj0Var == null) {
            u890.C("delegate");
            throw null;
        }
        Logger.b("Hiding notification for SpotifyAlarmLauncherService", new Object[0]);
        pd30 pd30Var = (pd30) toj0Var.g;
        synchronized (pd30Var) {
            pd30Var.a(new hd30(2131430476));
        }
        pd30Var.i();
        super/*android.app.Service*/.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Logger.b(l1d.m("SpotifyAlarmLauncherService onStartCommand for action ", intent.getAction()), new Object[0]);
        toj0 toj0Var = this.a;
        if (toj0Var == null) {
            u890.C("delegate");
            throw null;
        }
        gga1 gga1Var = new gga1(this, (byte) 7);
        z43 z43Var = u890.j(intent.getAction(), "com.spotify.music.ACTION_ALARM_WARMUP") ? (mo80) toj0Var.c : (p4t) toj0Var.d;
        String string = UUID.randomUUID().toString();
        hr0 hr0Var = (hr0) toj0Var.e;
        String action = intent.getAction();
        String str = action != null ? action : "";
        t2j0 t2j0Var = hr0Var.a;
        u43 u43VarN = AlarmClockWarmupStartNonAuth.n();
        u43VarN.r(string);
        u43VarN.q();
        u43VarN.n(str);
        t2j0Var.a(u43VarN.build());
        pd30 pd30Var = (pd30) toj0Var.g;
        pd30Var.h(this);
        Notification notificationC = ((gid) toj0Var.b).c();
        Integer num = Build.VERSION.SDK_INT >= 31 ? 2 : null;
        synchronized (pd30Var) {
            pd30Var.a(new jd30(2131430476, notificationC, true, num));
        }
        Logger.b("SpotifyAlarmLauncherService notification is requested to be shown", new Object[0]);
        nx2 nx2Var = new nx2(toj0Var, gga1Var, (byte) 2);
        if (z43Var.c()) {
            Logger.b("SpotifyAlarmLauncherService has already scheduled optimisations", new Object[0]);
            return 2;
        }
        z43Var.b(intent, string, nx2Var);
        return 2;
    }
}
