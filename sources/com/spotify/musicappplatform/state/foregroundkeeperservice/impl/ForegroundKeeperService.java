package com.spotify.musicappplatform.state.foregroundkeeperservice.impl;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import p.eg;
import p.gd30;
import p.hd30;
import p.hpq;
import p.i2x0;
import p.id30;
import p.j8q0;
import p.jd30;
import p.ji5;
import p.jna1;
import p.k4p1;
import p.kd30;
import p.l1d;
import p.ld30;
import p.n57;
import p.pd30;
import p.qac0;
import p.qd30;
import p.rd30;
import p.rp5;
import p.u890;
import p.vpb1;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/musicappplatform/state/foregroundkeeperservice/impl/ForegroundKeeperService;", "Lp/hpq;", "<init>", "()V", "src_main_java_com_spotify_musicappplatform_state_foregroundkeeperservice_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class ForegroundKeeperService extends hpq {
    public rd30 a;
    public j8q0 b;
    public ji5 c;
    public rp5 d;
    public Random e;
    public pd30 f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // p.hpq, android.app.Service
    public final void onCreate() {
        super.onCreate();
        rd30 rd30Var = this.a;
        if (rd30Var == null) {
            u890.C("foregroundNotifierFactory");
            throw null;
        }
        pd30 pd30VarA = rd30Var.a(qd30.a);
        this.f = pd30VarA;
        pd30VarA.h(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        pd30 pd30Var = this.f;
        if (pd30Var == null) {
            u890.C("foregroundNotifier");
            throw null;
        }
        pd30Var.i();
        pd30 pd30Var2 = this.f;
        if (pd30Var2 == null) {
            u890.C("foregroundNotifier");
            throw null;
        }
        synchronized (pd30Var2) {
            jna1 jna1VarY = vpb1.y(pd30Var2.g);
            while (jna1VarY.hasNext()) {
                int iNextInt = jna1VarY.nextInt();
                pd30Var2.a.cancel(iNextInt);
                pd30Var2.g.remove(iNextInt);
            }
        }
        stopForeground(1);
        rd30 rd30Var = this.a;
        if (rd30Var == null) {
            u890.C("foregroundNotifierFactory");
            throw null;
        }
        rd30Var.h.remove(qd30.a);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            intent.getIntExtra("intent-id", -1);
        }
        boolean z = true;
        boolean z2 = intent != null && i2x0.g(intent);
        if (z2 && Build.VERSION.SDK_INT < 31) {
            try {
                x74.t0(this);
            } catch (Exception e) {
                Logger.b(l1d.m("[ForegroundKeeperService] Failed early startForeground: ", e.getMessage()), new Object[0]);
            }
        }
        if (intent == null || !intent.hasExtra("notifier-action")) {
            z = false;
        } else {
            ld30 parcelableExtra = intent.getParcelableExtra("notifier-action");
            ld30 ld30Var = parcelableExtra instanceof ld30 ? parcelableExtra : null;
            if (ld30Var == null) {
                Logger.b("[ForegroundKeeperService] onStartCommand() action is null", new Object[0]);
            } else if (ld30Var instanceof jd30) {
                pd30 pd30Var = this.f;
                if (pd30Var == null) {
                    u890.C("foregroundNotifier");
                    throw null;
                }
                jd30 jd30Var = (jd30) ld30Var;
                synchronized (pd30Var) {
                    pd30Var.a(jd30Var);
                }
            } else if (ld30Var instanceof gd30) {
                pd30 pd30Var2 = this.f;
                if (pd30Var2 == null) {
                    u890.C("foregroundNotifier");
                    throw null;
                }
                Intent intentA = ((gd30) ld30Var).a();
                i2x0.m(intentA);
                synchronized (pd30Var2) {
                    pd30Var2.a(new gd30(intentA));
                }
            } else if (ld30Var instanceof hd30) {
                pd30 pd30Var3 = this.f;
                if (pd30Var3 == null) {
                    u890.C("foregroundNotifier");
                    throw null;
                }
                hd30 hd30Var = (hd30) ld30Var;
                synchronized (pd30Var3) {
                    pd30Var3.a(hd30Var);
                }
            } else if (ld30Var instanceof kd30) {
                pd30 pd30Var4 = this.f;
                if (pd30Var4 == null) {
                    u890.C("foregroundNotifier");
                    throw null;
                }
                List listX = k4p1.x("ForegroundKeeperService");
                synchronized (pd30Var4) {
                    pd30Var4.a(new kd30(listX));
                }
            } else if (!(ld30Var instanceof id30)) {
                eg.o();
                return 0;
            }
            z = false;
        }
        if (!z2 || z) {
            return 2;
        }
        Logger.b("[ForegroundKeeperService] Foreground start required but action didn't trigger it, showing placeholder", new Object[0]);
        pd30 pd30Var5 = this.f;
        if (pd30Var5 == null) {
            u890.C("foregroundNotifier");
            throw null;
        }
        i2x0.m(intent);
        synchronized (pd30Var5) {
            pd30Var5.a(new gd30(intent));
        }
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        Logger.b("[ForegroundKeeperService] onTaskRemoved() intent-id=" + (intent != null ? Integer.valueOf(intent.getIntExtra("intent-id", -1)) : null), new Object[0]);
        rp5 rp5Var = this.d;
        if (rp5Var == null) {
            u890.C("processShutdownPolicy");
            throw null;
        }
        if (!rp5Var.b()) {
            ji5 ji5Var = this.c;
            if (ji5Var == null) {
                u890.C("appActivitiesWatcher");
                throw null;
            }
            if (ji5Var.a > 0) {
                Random random = this.e;
                if (random == null) {
                    u890.C("random");
                    throw null;
                }
                if (random.nextDouble() <= 0.01d) {
                    n57.s("[ForegroundKeeperService] Received onTaskRemoved when UI is still in FG, ignoring it");
                    return;
                }
                return;
            }
        }
        j8q0 j8q0Var = this.b;
        if (j8q0Var == null) {
            u890.C("onTaskRemovedPluginPoint");
            throw null;
        }
        Iterator it = j8q0Var.a().iterator();
        while (it.hasNext()) {
            ((qac0) it.next()).a();
        }
        super.onTaskRemoved(intent);
    }
}
