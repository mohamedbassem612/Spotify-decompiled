package com.spotify.engagesdk.engagesigninrequest.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a0n0;
import p.i0n0;
import p.oo70;
import p.th61;
import p.vuk;
import p.w6y;
import p.zle1;
import p.zn41;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015BW\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/spotify/engagesdk/engagesigninrequest/workers/EngageOnBroadcastSignInHandler;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/vuk;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zle1;", "timeKeeper", "Lp/zn41;", "scopeWorkDispatcher", "Lio/reactivex/rxjava3/core/Flowable;", "Lp/th61;", "sessionState", "Lp/w6y;", "engageRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zle1;Lp/zn41;Lio/reactivex/rxjava3/core/Flowable;Lp/w6y;)V", "p/haq", "src_main_java_com_spotify_engagesdk_engagesigninrequest-engagesigninrequest"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EngageOnBroadcastSignInHandler extends MusicAppQuasarWorker<vuk> {
    public final oo70 n;
    public final zle1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zn41 f9p;
    public final Flowable q;
    public final w6y r;
    public final a0n0 s;
    public final String t;
    public final byte u;
    public final byte v;

    public EngageOnBroadcastSignInHandler(Context context, WorkerParameters workerParameters, oo70 oo70Var, zle1 zle1Var, zn41 zn41Var, Flowable<th61> flowable, w6y w6yVar) {
        super(context, workerParameters, (zvl1) null, 4, (DefaultConstructorMarker) null);
        this.n = oo70Var;
        this.o = zle1Var;
        this.f9p = zn41Var;
        this.q = flowable;
        this.r = w6yVar;
        this.s = a0n0.a;
        this.t = "EngageSignInRequester";
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
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (p.x8p1.u(r6, r7, r0) == r5) goto L23;
     */
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(p.vuk r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.r6y
            if (r0 == 0) goto L13
            r0 = r8
            p.r6y r0 = (p.r6y) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.r6y r0 = new p.r6y
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r8)
            goto L6e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.w6y r6 = r0.a
            p.hm5.M(r8)
            goto L5d
        L37:
            p.hm5.M(r8)
            p.le4 r8 = new p.le4
            p.xz11 r7 = r7.j()
            r1 = 0
            r8.<init>(r1, r7)
            boolean r7 = r8.a()
            if (r7 == 0) goto L6e
            io.reactivex.rxjava3.core.Flowable r7 = r6.q
            p.lt20 r7 = p.aqo1.v(r7)
            p.w6y r6 = r6.r
            r0.a = r6
            r0.d = r3
            java.lang.Object r8 = p.b5p1.i(r7, r0)
            if (r8 != r5) goto L5d
            goto L6d
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r0.a = r4
            r0.d = r2
            java.lang.Object r6 = p.x8p1.u(r6, r7, r0)
            if (r6 != r5) goto L6e
        L6d:
            return r5
        L6e:
            p.x8d0 r6 = p.y8d0.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.engagesdk.engagesigninrequest.workers.EngageOnBroadcastSignInHandler.j(p.vuk, p.onm):java.lang.Object");
    }

    public final long l() {
        return this.u;
    }

    public final long m() {
        return this.v;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getF9p() {
        return this.f9p;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getT() {
        return this.t;
    }
}
