package com.spotify.engagesdk.engagerecommendationscluster.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a0n0;
import p.d9n;
import p.eg;
import p.f7y;
import p.hm5;
import p.i0n0;
import p.onm;
import p.oo70;
import p.p6y;
import p.u6y;
import p.vuk;
import p.w6y;
import p.y8d0;
import p.zle1;
import p.zn41;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014BQ\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/spotify/engagesdk/engagerecommendationscluster/workers/EngageRecommendationsClusterClearer;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/vuk;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zle1;", "timeKeeper", "Lp/zn41;", "scopeWorkDispatcher", "Lp/w6y;", "engageRepository", "Lp/p6y;", "cubesWorkerForegroundInfoFactory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zle1;Lp/zn41;Lp/w6y;Lp/p6y;)V", "p/eaq", "src_main_java_com_spotify_engagesdk_engagerecommendationscluster-engagerecommendationscluster"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EngageRecommendationsClusterClearer extends MusicAppQuasarWorker<vuk> {
    public final oo70 n;
    public final zle1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zn41 f7p;
    public final w6y q;
    public final p6y r;
    public final a0n0 s;
    public final String t;
    public final byte u;
    public final byte v;

    public EngageRecommendationsClusterClearer(Context context, WorkerParameters workerParameters, oo70 oo70Var, zle1 zle1Var, zn41 zn41Var, w6y w6yVar, p6y p6yVar) {
        super(context, workerParameters, (zvl1) null, 4, (DefaultConstructorMarker) null);
        this.n = oo70Var;
        this.o = zle1Var;
        this.f7p = zn41Var;
        this.q = w6yVar;
        this.r = p6yVar;
        this.s = a0n0.a;
        this.t = "EngageRecommendationsClusterClearer";
        this.u = (byte) 30;
        this.v = (byte) 30;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getN() {
        return this.n;
    }

    public final i0n0 B() {
        return this.s;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getO() {
        return this.o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Object j(vuk vukVar, onm onmVar) {
        u6y u6yVar;
        if (onmVar instanceof u6y) {
            u6yVar = (u6y) onmVar;
            int i = u6yVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u6yVar.c = i - Integer.MIN_VALUE;
            } else {
                u6yVar = new u6y(this, onmVar);
            }
        } else {
            u6yVar = new u6y(this, onmVar);
        }
        Object obj = u6yVar.a;
        int i2 = u6yVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            u6yVar.c = 1;
            Object objB = ((f7y) this.q).b(u6yVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
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
    }

    public final Object h() {
        return this.r.b();
    }

    public final long l() {
        return this.u;
    }

    public final long m() {
        return this.v;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getF7p() {
        return this.f7p;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getT() {
        return this.t;
    }
}
