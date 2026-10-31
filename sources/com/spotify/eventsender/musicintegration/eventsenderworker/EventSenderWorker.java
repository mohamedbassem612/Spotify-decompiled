package com.spotify.eventsender.musicintegration.eventsenderworker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azm0;
import p.b0n0;
import p.bzm0;
import p.d9n;
import p.eg;
import p.ett;
import p.gx5;
import p.hm5;
import p.i0n0;
import p.id00;
import p.kb00;
import p.lc00;
import p.lnm;
import p.n57;
import p.onm;
import p.oo70;
import p.rc2;
import p.v8d0;
import p.vuk;
import p.w8d0;
import p.xb00;
import p.y8d0;
import p.zle1;
import p.zn41;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018Ba\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/spotify/eventsender/musicintegration/eventsenderworker/EventSenderWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/vuk;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zn41;", "scopeWorkDispatcher", "Lp/zle1;", "timeKeeper", "Lp/xb00;", "eventSender", "Lp/bzm0;", "transportBinder", "Lp/gx5;", "appUiForegroundChecker", "Lp/kb00;", "eventOwnerProvider", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zn41;Lp/zle1;Lp/xb00;Lp/bzm0;Lp/gx5;Lp/kb00;)V", "p/cbq", "src_main_java_com_spotify_eventsender_musicintegration_eventsenderworker-eventsenderworker"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EventSenderWorker extends MusicAppQuasarWorker<vuk> {
    public final oo70 n;
    public final zn41 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zle1 f10p;
    public final xb00 q;
    public final bzm0 r;
    public final gx5 s;
    public final kb00 t;
    public final b0n0 u;
    public final String v;

    public EventSenderWorker(Context context, WorkerParameters workerParameters, oo70 oo70Var, zn41 zn41Var, zle1 zle1Var, xb00 xb00Var, bzm0 bzm0Var, gx5 gx5Var, kb00 kb00Var) {
        super(context, workerParameters, (zvl1) null, 4, (DefaultConstructorMarker) null);
        this.n = oo70Var;
        this.o = zn41Var;
        this.f10p = zle1Var;
        this.q = xb00Var;
        this.r = bzm0Var;
        this.s = gx5Var;
        this.t = kb00Var;
        b0n0 b0n0Var = b0n0.a;
        this.u = b0n0Var;
        this.v = b0n0Var.getName();
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getN() {
        return this.n;
    }

    public final i0n0 B() {
        return this.u;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getF10p() {
        return this.f10p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Object j(vuk vukVar, onm onmVar) {
        id00 id00Var;
        if (onmVar instanceof id00) {
            id00Var = (id00) onmVar;
            int i = id00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                id00Var.c = i - Integer.MIN_VALUE;
            } else {
                id00Var = new id00(this, onmVar);
            }
        } else {
            id00Var = new id00(this, onmVar);
        }
        Object objO = id00Var.a;
        int i2 = id00Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            w(0.0d);
            if (this.t.a() == null) {
                return new v8d0();
            }
            if (this.s.a()) {
                return new w8d0();
            }
            ett ettVar = new ett(this, (lnm) null, (byte) 25);
            id00Var.c = 1;
            objO = rc2.O(10000L, ettVar, id00Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        azm0 azm0Var = (azm0) objO;
        w(50.0d);
        if (azm0Var == null || b()) {
            return new v8d0();
        }
        ((lc00) this.q).K.run();
        return y8d0.a();
    }

    public final long l() {
        return 300L;
    }

    public final long m() {
        return 30L;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getV() {
        return this.v;
    }

    public final void t(Exception exc) {
        super.t(exc);
        if ((exc instanceof ScopeEnterTimeoutException) || (exc instanceof NoProgressTimeoutException)) {
            return;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "Unexpected exception";
        }
        n57.t(message, exc);
    }
}
