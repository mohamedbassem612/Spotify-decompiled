package com.spotify.notifications.notifications.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;
import p.ayy0;
import p.d9n;
import p.eg;
import p.fc11;
import p.g0n0;
import p.hm5;
import p.i0n0;
import p.lnm;
import p.n57;
import p.onm;
import p.oo70;
import p.pew0;
import p.r2t;
import p.v8d0;
import p.w8d0;
import p.xxy0;
import p.y8d0;
import p.z8d0;
import p.zle1;
import p.zn41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BI\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/notifications/notifications/workers/PushTokenSyncQuasarWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/r2t;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/xxy0;", "pushTokenManager", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zn41;", "scopeWorkDispatcher", "Lp/zle1;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/xxy0;Lp/oo70;Lp/zn41;Lp/zle1;)V", "p/fbq", "src_main_java_com_spotify_notifications_notifications_workers-workers"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class PushTokenSyncQuasarWorker extends MusicAppQuasarWorker<r2t> {
    public final xxy0 n;
    public final oo70 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zn41 f2p;
    public final zle1 q;
    public final g0n0 r;
    public final String s;
    public final byte t;
    public final short u;

    public PushTokenSyncQuasarWorker(Context context, WorkerParameters workerParameters, xxy0 xxy0Var, oo70 oo70Var, zn41 zn41Var, zle1 zle1Var) {
        super(context, workerParameters, null, 4, null);
        this.n = xxy0Var;
        this.o = oo70Var;
        this.f2p = zn41Var;
        this.q = zle1Var;
        g0n0 g0n0Var = g0n0.a;
        this.r = g0n0Var;
        this.s = g0n0Var.getName();
        this.t = (byte) 30;
        this.u = (short) 300;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getO() {
        return this.o;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    public final i0n0 B() {
        return this.r;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getQ() {
        return this.q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(lnm lnmVar) {
        ayy0 ayy0Var;
        if (lnmVar instanceof ayy0) {
            ayy0Var = (ayy0) lnmVar;
            int i = ayy0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ayy0Var.c = i - Integer.MIN_VALUE;
            } else {
                ayy0Var = new ayy0(this, (onm) lnmVar);
            }
        } else {
            ayy0Var = new ayy0(this, (onm) lnmVar);
        }
        Object obj = ayy0Var.a;
        int i2 = ayy0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableD = this.n.d();
                ayy0Var.c = 1;
                Object objI = fc11.i(completableD, ayy0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return y8d0.a();
        } catch (Exception e) {
            if (((z8d0) this).b.c < 3) {
                return new w8d0();
            }
            n57.t("Push token sync failed after 3 attempts", e);
            return new v8d0();
        }
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final /* bridge */ /* synthetic */ Object j(Object obj, pew0 pew0Var) {
        return D(pew0Var);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long l() {
        return this.u;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long m() {
        return this.t;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getF2p() {
        return this.f2p;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getS() {
        return this.s;
    }
}
