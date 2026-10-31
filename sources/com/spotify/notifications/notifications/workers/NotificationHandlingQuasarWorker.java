package com.spotify.notifications.notifications.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.c921;
import p.d0n0;
import p.d9n;
import p.eg;
import p.geo0;
import p.hm5;
import p.i0n0;
import p.iu30;
import p.jmo0;
import p.l1d;
import p.llm;
import p.lnm;
import p.n57;
import p.nr81;
import p.onm;
import p.oo70;
import p.oxy0;
import p.p811;
import p.pew0;
import p.q8n;
import p.r2t;
import p.rih1;
import p.t45;
import p.txy0;
import p.ur1;
import p.w73;
import p.zg4;
import p.zle1;
import p.zn41;
import p.zto0;
import p.zvy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBs\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/spotify/notifications/notifications/workers/NotificationHandlingQuasarWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/r2t;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zn41;", "scopeWorkDispatcher", "Lp/zle1;", "timeKeeper", "Lp/zto0;", "notificationTypeParser", "Lp/zvy0;", "handler", "Lp/nr81;", "silentPushHandler", "Lp/zg4;", "properties", "Lp/txy0;", "timingSampler", "Lp/q8n;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zn41;Lp/zle1;Lp/zto0;Lp/zvy0;Lp/nr81;Lp/zg4;Lp/txy0;Lp/q8n;)V", "p/dbq", "src_main_java_com_spotify_notifications_notifications_workers-workers"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class NotificationHandlingQuasarWorker extends MusicAppQuasarWorker<r2t> {
    public final oo70 n;
    public final zn41 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zle1 f0p;
    public final zto0 q;
    public final zvy0 r;
    public final nr81 s;
    public final zg4 t;
    public final txy0 u;
    public final d0n0 v;
    public final String w;
    public final byte x;
    public final short y;
    public final llm z;

    public NotificationHandlingQuasarWorker(Context context, WorkerParameters workerParameters, oo70 oo70Var, zn41 zn41Var, zle1 zle1Var, zto0 zto0Var, zvy0 zvy0Var, nr81 nr81Var, zg4 zg4Var, txy0 txy0Var, q8n q8nVar) {
        super(context, workerParameters, null, 4, null);
        this.n = oo70Var;
        this.o = zn41Var;
        this.f0p = zle1Var;
        this.q = zto0Var;
        this.r = zvy0Var;
        this.s = nr81Var;
        this.t = zg4Var;
        this.u = txy0Var;
        d0n0 d0n0Var = d0n0.a;
        this.v = d0n0Var;
        this.w = d0n0Var.getName();
        this.x = (byte) 30;
        this.y = (short) 300;
        this.z = l1d.x(q8nVar);
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getN() {
        return this.n;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    public final i0n0 B() {
        return this.v;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getF0p() {
        return this.f0p;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (E(r1, r3, r10, p.cmo0.e, r5) == r8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (E(r2, r2, r10, r4, r5) == r8) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(p.lnm r17) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker.D(p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.lang.Object] */
    public final Object E(t45 t45Var, Long l, iu30 iu30Var, iu30 iu30Var2, onm onmVar) throws Throwable {
        jmo0 jmo0Var;
        NotificationHandlingQuasarWorker notificationHandlingQuasarWorker;
        p811 p811Var;
        p811 p811Var2;
        iu30 iu30Var3;
        Long l2;
        Object obj;
        t45 t45Var2;
        p811 p811Var3;
        String str;
        geo0 geo0Var;
        ur1 ur1Var;
        Object obj2;
        if (onmVar instanceof jmo0) {
            jmo0Var = (jmo0) onmVar;
            int i = jmo0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                jmo0Var.i = i - Integer.MIN_VALUE;
                notificationHandlingQuasarWorker = this;
            } else {
                notificationHandlingQuasarWorker = this;
                jmo0Var = new jmo0(notificationHandlingQuasarWorker, onmVar);
            }
        } else {
            notificationHandlingQuasarWorker = this;
            jmo0Var = new jmo0(notificationHandlingQuasarWorker, onmVar);
        }
        Object obj3 = jmo0Var.g;
        ?? r5 = jmo0Var.i;
        rih1 rih1Var = rih1.a;
        Object obj4 = d9n.a;
        try {
            if (r5 == 0) {
                hm5.M(obj3);
                if (t45Var == null || l == null) {
                    jmo0Var.a = null;
                    jmo0Var.b = null;
                    jmo0Var.c = null;
                    jmo0Var.i = 1;
                    if (iu30Var.invoke(jmo0Var) == obj4) {
                        return obj4;
                    }
                } else {
                    p811Var = new p811();
                    p811Var.a = "success";
                    p811Var2 = new p811();
                    try {
                        oxy0 oxy0Var = new oxy0(t45Var);
                        w73 w73Var = new w73(iu30Var, (lnm) null, (byte) 10);
                        jmo0Var.a = t45Var;
                        jmo0Var.b = l;
                        iu30Var3 = iu30Var2;
                        jmo0Var.c = iu30Var3;
                        jmo0Var.d = p811Var;
                        jmo0Var.e = p811Var2;
                        jmo0Var.i = 2;
                        Object objH = c921.H(oxy0Var, w73Var, jmo0Var);
                        if (objH == obj4) {
                            return obj4;
                        }
                        l2 = l;
                        obj = obj4;
                        p811Var = p811Var;
                        obj3 = objH;
                        t45Var2 = t45Var;
                        p811Var3 = p811Var2;
                        str = (String) iu30Var3.invoke(obj3);
                        if (str != null) {
                            p811Var.a = "error";
                            p811Var3.a = str;
                        }
                        geo0Var = geo0.b;
                        p811 p811Var4 = p811Var3;
                        obj2 = obj;
                        ur1Var = new ur1((byte) 25, notificationHandlingQuasarWorker, t45Var2, p811Var, p811Var4, l2, (lnm) null);
                        jmo0Var.a = null;
                        jmo0Var.b = null;
                        jmo0Var.c = null;
                        jmo0Var.d = null;
                        jmo0Var.e = null;
                        jmo0Var.i = 3;
                        if (c921.H(geo0Var, ur1Var, jmo0Var) == obj2) {
                            return obj2;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        p811Var.a = "cancelled";
                        p811Var2.a = "worker_cancelled";
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        p811Var.a = "error";
                        p811Var2.a = "unknown";
                        throw th;
                    }
                }
                return rih1Var;
            }
            if (r5 == 1) {
                hm5.M(obj3);
                return rih1Var;
            }
            if (r5 != 2) {
                if (r5 == 3) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                if (r5 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = jmo0Var.f;
                hm5.M(obj3);
                throw th2;
            }
            p811Var3 = jmo0Var.e;
            p811 p811Var5 = jmo0Var.d;
            iu30Var3 = jmo0Var.c;
            Long l3 = jmo0Var.b;
            t45Var2 = jmo0Var.a;
            try {
                hm5.M(obj3);
                p811Var = p811Var5;
                obj = obj4;
                l2 = l3;
                try {
                    str = (String) iu30Var3.invoke(obj3);
                    if (str != null) {
                        try {
                            p811Var.a = "error";
                            p811Var3.a = str;
                        } catch (CancellationException e2) {
                            e = e2;
                            p811Var2 = p811Var3;
                            p811Var.a = "cancelled";
                            p811Var2.a = "worker_cancelled";
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            p811Var2 = p811Var3;
                            p811Var.a = "error";
                            p811Var2.a = "unknown";
                            throw th;
                        }
                    }
                    geo0Var = geo0.b;
                    p811 p811Var6 = p811Var3;
                    obj2 = obj;
                    ur1Var = new ur1((byte) 25, notificationHandlingQuasarWorker, t45Var2, p811Var, p811Var6, l2, (lnm) null);
                    jmo0Var.a = null;
                    jmo0Var.b = null;
                    jmo0Var.c = null;
                    jmo0Var.d = null;
                    jmo0Var.e = null;
                    jmo0Var.i = 3;
                    if (c921.H(geo0Var, ur1Var, jmo0Var) == obj2) {
                        return obj2;
                    }
                    return rih1Var;
                } catch (CancellationException e3) {
                    e = e3;
                    p811Var2 = p811Var3;
                } catch (Throwable th4) {
                    th = th4;
                    p811Var2 = p811Var3;
                }
            } catch (CancellationException e4) {
                e = e4;
                p811Var = p811Var5;
                p811Var2 = p811Var3;
                p811Var.a = "cancelled";
                p811Var2.a = "worker_cancelled";
                throw e;
            } catch (Throwable th5) {
                th = th5;
                p811Var = p811Var5;
                p811Var2 = p811Var3;
                p811Var.a = "error";
                p811Var2.a = "unknown";
                throw th;
            }
        } catch (Throwable th6) {
            geo0 geo0Var2 = geo0.b;
            ur1 ur1Var2 = new ur1((byte) 25, this, t45Var, obj3, (Object) r5, l, (lnm) null);
            jmo0Var.a = 4;
            jmo0Var.b = 4;
            jmo0Var.c = 4;
            jmo0Var.d = 4;
            jmo0Var.e = 4;
            jmo0Var.f = th6;
            jmo0Var.i = 4;
            if (c921.H(geo0Var2, ur1Var2, jmo0Var) == 3) {
                return 3;
            }
            throw th6;
        }
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final /* bridge */ /* synthetic */ Object j(Object obj, pew0 pew0Var) {
        return D(pew0Var);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long l() {
        return this.y;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long m() {
        return this.x;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getO() {
        return this.o;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getW() {
        return this.w;
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
