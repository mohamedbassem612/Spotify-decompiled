package com.spotify.collection.offlinesyncnotification.offlinesyncworker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.d9n;
import p.eg;
import p.exp0;
import p.f0n0;
import p.gpc;
import p.gvg;
import p.hap1;
import p.hm5;
import p.i0n0;
import p.kxp0;
import p.l811;
import p.lnm;
import p.m94;
import p.mxp0;
import p.n57;
import p.nso0;
import p.nxp0;
import p.onm;
import p.oo70;
import p.pdp0;
import p.pew0;
import p.r2t;
import p.tgp1;
import p.y8d0;
import p.zle1;
import p.zn41;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016BY\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/spotify/collection/offlinesyncnotification/offlinesyncworker/OfflineSyncWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/r2t;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zn41;", "scopeWorkDispatcher", "Lp/mxp0;", "offlineSyncObserver", "Lp/kxp0;", "offlineSyncNotificationManager", "Lp/m94;", "properties", "Lp/zle1;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zn41;Lp/mxp0;Lp/kxp0;Lp/m94;Lp/zle1;)V", "p/zaq", "src_main_java_com_spotify_collection_offlinesyncnotification_offlinesyncworker-offlinesyncworker"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class OfflineSyncWorker extends MusicAppQuasarWorker<r2t> {
    public final oo70 n;
    public final zn41 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mxp0 f4p;
    public final kxp0 q;
    public final zle1 r;
    public final f0n0 s;
    public final String t;
    public final byte u;
    public final short v;
    public final exp0 w;
    public long x;

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineSyncWorker(Context context, WorkerParameters workerParameters, oo70 oo70Var, zn41 zn41Var, mxp0 mxp0Var, kxp0 kxp0Var, m94 m94Var, zle1 zle1Var) {
        super(context, workerParameters, (zvl1) null, 4, (DefaultConstructorMarker) null);
        this.n = oo70Var;
        this.o = zn41Var;
        this.f4p = mxp0Var;
        this.q = kxp0Var;
        this.r = zle1Var;
        f0n0 f0n0Var = f0n0.a;
        this.s = f0n0Var;
        this.t = f0n0Var.getName();
        this.u = (byte) 30;
        this.v = (short) 300;
        WorkerParameters workerParameters2 = this.b;
        this.w = new exp0("work-" + workerParameters2.a + "-attempt-" + workerParameters2.c, m94Var.a(), new pdp0(this, (byte) 16), 8);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getN() {
        return this.n;
    }

    public final i0n0 B() {
        return this.s;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getR() {
        return this.r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object D(lnm lnmVar) {
        nxp0 nxp0Var;
        l811 l811Var;
        if (lnmVar instanceof nxp0) {
            nxp0Var = (nxp0) lnmVar;
            int i = nxp0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxp0Var.d = i - Integer.MIN_VALUE;
            } else {
                nxp0Var = new nxp0(this, (onm) lnmVar);
            }
        } else {
            nxp0Var = new nxp0(this, (onm) lnmVar);
        }
        Object obj = nxp0Var.b;
        int i2 = nxp0Var.d;
        exp0 exp0Var = this.w;
        if (i2 == 0) {
            hm5.M(obj);
            exp0Var.b("scope_entered wait_ms=" + (this.r.a.a.e() - this.x));
            l811 l811Var2 = new l811();
            this.f4p.a(new nso0(this, (byte) 12), new gpc(l811Var2, (byte) 4), exp0Var);
            l811Var = l811Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l811Var = nxp0Var.a;
            hm5.M(obj);
        }
        while (!l811Var.a && !b()) {
            nxp0Var.a = l811Var;
            nxp0Var.d = 1;
            Object objI = hap1.i(125L, nxp0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        }
        exp0Var.b("return_success idle_observed=" + l811Var.a + " stopped=" + b());
        return y8d0.a();
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj, pew0 pew0Var) {
        return D(pew0Var);
    }

    public final long l() {
        return this.v;
    }

    public final long m() {
        return this.u;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getT() {
        return this.t;
    }

    public final void s(int i) {
        super.s(i);
        this.f4p.b();
        this.w.a("stop_reason_" + i);
    }

    public final void t(Exception exc) {
        super.t(exc);
        if ((exc instanceof ScopeEnterTimeoutException) || (exc instanceof NoProgressTimeoutException)) {
            return;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        n57.t(message, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        super.u();
        this.x = this.r.a.a.e();
        WorkerParameters workerParameters = this.b;
        String strC = workerParameters.b.c("offline_sync_origin_process");
        String str = exp0.l;
        String strO = tgp1.o();
        if (strC == null) {
            strC = "unknown";
        }
        long jB = workerParameters.b.b("offline_sync_enqueue_time_ms", -1L);
        StringBuilder sbN = gvg.n("started process=", strO, " origin_process=", strC, " enqueue_wall_ms=");
        sbN.append(jB);
        this.w.b(sbN.toString());
    }
}
