package com.spotify.engagesdk.engagerecommendationscluster.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a0n0;
import p.i0n0;
import p.kb61;
import p.ke4;
import p.l01;
import p.oo70;
import p.r0z0;
import p.t6y;
import p.w6y;
import p.zle1;
import p.zn41;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aBk\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/spotify/engagesdk/engagerecommendationscluster/workers/EngageRecommendationsClusterPublisher;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/kb61;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zle1;", "timeKeeper", "Lp/zn41;", "scopeWorkDispatcher", "Lp/l01;", "homeLoader", "Lp/w6y;", "repository", "Lp/ke4;", "properties", "Lp/r0z0;", "scheduler", "Lp/t6y;", "publishStatusCoordinator", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zle1;Lp/zn41;Lp/l01;Lp/w6y;Lp/ke4;Lp/r0z0;Lp/t6y;)V", "p/gbq", "src_main_java_com_spotify_engagesdk_engagerecommendationscluster-engagerecommendationscluster"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EngageRecommendationsClusterPublisher extends MusicAppQuasarWorker<kb61> {
    public final oo70 n;
    public final zle1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zn41 f8p;
    public final l01 q;
    public final w6y r;
    public final ke4 s;
    public final r0z0 t;
    public final t6y u;
    public final a0n0 v;
    public final String w;
    public final byte x;
    public final byte y;

    public EngageRecommendationsClusterPublisher(Context context, WorkerParameters workerParameters, oo70 oo70Var, zle1 zle1Var, zn41 zn41Var, l01 l01Var, w6y w6yVar, ke4 ke4Var, r0z0 r0z0Var, t6y t6yVar) {
        super(context, workerParameters, (zvl1) null, 4, (DefaultConstructorMarker) null);
        this.n = oo70Var;
        this.o = zle1Var;
        this.f8p = zn41Var;
        this.q = l01Var;
        this.r = w6yVar;
        this.s = ke4Var;
        this.t = r0z0Var;
        this.u = t6yVar;
        this.v = a0n0.a;
        this.w = "EngageRecommendationsPublisher";
        this.x = (byte) 30;
        this.y = (byte) 30;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getN() {
        return this.n;
    }

    public final i0n0 B() {
        return this.v;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getO() {
        return this.o;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:18:0x0044, B:40:0x00a1, B:21:0x004a, B:34:0x0085, B:36:0x008b, B:37:0x0090, B:31:0x006f), top: B:46:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r7.a(r6, 9, r1, r12) == r9) goto L44;
     */
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(p.kb61 r12, p.onm r13) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r12 = r13 instanceof p.v6y
            if (r12 == 0) goto L13
            r12 = r13
            p.v6y r12 = (p.v6y) r12
            int r0 = r12.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r12.d = r0
            goto L18
        L13:
            p.v6y r12 = new p.v6y
            r12.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r12.b
            int r0 = r12.d
            p.s6y r1 = p.s6y.b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            p.msg r6 = p.msg.a
            p.t6y r7 = r11.u
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L52
            if (r0 == r5) goto L4e
            if (r0 == r4) goto L4a
            if (r0 == r3) goto L40
            if (r0 == r2) goto L39
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r8
        L39:
            java.lang.Exception r11 = r12.a
            p.hm5.M(r13)
            goto Lb4
        L40:
            java.lang.Exception r11 = r12.a
            p.i331 r11 = (p.i331) r11
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L48
            goto La1
        L48:
            r11 = move-exception
            goto La6
        L4a:
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L48
            goto L85
        L4e:
            p.hm5.M(r13)
            goto L6a
        L52:
            p.hm5.M(r13)
            p.ke4 r13 = r11.s
            boolean r13 = r13.a()
            if (r13 != 0) goto L6f
            r12.d = r5
            p.eqa0 r7 = (p.eqa0) r7
            r11 = 9
            java.lang.Object r11 = r7.a(r6, r11, r1, r12)
            if (r11 != r9) goto L6a
            goto Lb3
        L6a:
            p.x8d0 r11 = p.y8d0.a()
            return r11
        L6f:
            p.w6y r13 = r11.r     // Catch: java.lang.Exception -> L48
            p.r1t r0 = new p.r1t     // Catch: java.lang.Exception -> L48
            p.l01 r5 = r11.q     // Catch: java.lang.Exception -> L48
            r10 = 28
            r0.<init>(r5, r10)     // Catch: java.lang.Exception -> L48
            r12.d = r4     // Catch: java.lang.Exception -> L48
            p.f7y r13 = (p.f7y) r13     // Catch: java.lang.Exception -> L48
            java.lang.Object r13 = r13.g(r0, r12)     // Catch: java.lang.Exception -> L48
            if (r13 != r9) goto L85
            goto Lb3
        L85:
            p.i331 r13 = (p.i331) r13     // Catch: java.lang.Exception -> L48
            boolean r13 = r13 instanceof p.q231     // Catch: java.lang.Exception -> L48
            if (r13 == 0) goto L90
            p.r0z0 r11 = r11.t     // Catch: java.lang.Exception -> L48
            r11.cancel()     // Catch: java.lang.Exception -> L48
        L90:
            p.s6y r11 = p.s6y.a     // Catch: java.lang.Exception -> L48
            r12.a = r8     // Catch: java.lang.Exception -> L48
            r12.d = r3     // Catch: java.lang.Exception -> L48
            r13 = r7
            p.eqa0 r13 = (p.eqa0) r13     // Catch: java.lang.Exception -> L48
            r0 = 0
            java.lang.Object r11 = r13.a(r6, r0, r11, r12)     // Catch: java.lang.Exception -> L48
            if (r11 != r9) goto La1
            goto Lb3
        La1:
            p.x8d0 r11 = p.y8d0.a()     // Catch: java.lang.Exception -> L48
            return r11
        La6:
            r12.a = r11
            r12.d = r2
            p.eqa0 r7 = (p.eqa0) r7
            r13 = 7
            java.lang.Object r12 = r7.a(r6, r13, r1, r12)
            if (r12 != r9) goto Lb4
        Lb3:
            return r9
        Lb4:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterPublisher.j(p.kb61, p.onm):java.lang.Object");
    }

    public final long l() {
        return this.x;
    }

    public final long m() {
        return this.y;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getF8p() {
        return this.f8p;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getW() {
        return this.w;
    }
}
