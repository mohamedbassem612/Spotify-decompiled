package com.spotify.notifications.notifications.workers;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import kotlin.Metadata;
import p.e0n0;
import p.i0n0;
import p.n57;
import p.oo70;
import p.pew0;
import p.pvy0;
import p.r2t;
import p.rjo1;
import p.upn1;
import p.vno0;
import p.y8d0;
import p.zle1;
import p.zn41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BI\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/notifications/notifications/workers/NotificationLoggingQuasarWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/r2t;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/pvy0;", "pushMessagingLogger", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zn41;", "scopeWorkDispatcher", "Lp/zle1;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/pvy0;Lp/oo70;Lp/zn41;Lp/zle1;)V", "p/ebq", "src_main_java_com_spotify_notifications_notifications_workers-workers"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class NotificationLoggingQuasarWorker extends MusicAppQuasarWorker<r2t> {
    public final Context n;
    public final pvy0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oo70 f1p;
    public final zn41 q;
    public final zle1 r;
    public final e0n0 s;
    public final String t;
    public final byte u;
    public final short v;

    public NotificationLoggingQuasarWorker(Context context, WorkerParameters workerParameters, pvy0 pvy0Var, oo70 oo70Var, zn41 zn41Var, zle1 zle1Var) {
        super(context, workerParameters, null, 4, null);
        this.n = context;
        this.o = pvy0Var;
        this.f1p = oo70Var;
        this.q = zn41Var;
        this.r = zle1Var;
        e0n0 e0n0Var = e0n0.a;
        this.s = e0n0Var;
        this.t = e0n0Var.getName();
        this.u = (byte) 30;
        this.v = (short) 300;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getF1p() {
        return this.f1p;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    public final i0n0 B() {
        return this.s;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getR() {
        return this.r;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final Object j(Object obj, pew0 pew0Var) {
        Context context = this.n;
        boolean zN = rjo1.n(new vno0(context).b);
        boolean zIsTouchExplorationEnabled = ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
        this.o.b(upn1.q(), zIsTouchExplorationEnabled, zN);
        return y8d0.a();
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long l() {
        return this.v;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long m() {
        return this.u;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getQ() {
        return this.q;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getT() {
        return this.t;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker, com.spotify.serviceapi.android.quasarworker.QuasarWorker
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
}
