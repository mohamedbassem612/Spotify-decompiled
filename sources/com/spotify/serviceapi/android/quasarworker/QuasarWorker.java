package com.spotify.serviceapi.android.quasarworker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import p.aym;
import p.b3s;
import p.c3u0;
import p.c921;
import p.c9n;
import p.d9n;
import p.eg;
import p.faa0;
import p.fns;
import p.geo0;
import p.hap1;
import p.hm5;
import p.ian0;
import p.igu;
import p.l2t;
import p.l4f0;
import p.l811;
import p.lnm;
import p.m0z0;
import p.m231;
import p.n0z0;
import p.o0z0;
import p.o8n;
import p.ohd;
import p.onm;
import p.op71;
import p.ozu0;
import p.p0z0;
import p.pew0;
import p.q8n;
import p.rih1;
import p.s2t;
import p.u890;
import p.wex0;
import p.y8d0;
import p.zn41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/serviceapi/android/quasarworker/QuasarWorker;", "", "ScopeContext", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_serviceapi_android_quasarworker-quasarworker"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public abstract class QuasarWorker<ScopeContext> extends CoroutineWorker {
    public final AtomicBoolean g;
    public final AtomicReference h;
    public final AtomicReference i;
    public final q8n j;

    public QuasarWorker(Context context, WorkerParameters workerParameters) {
        super(context.getApplicationContext(), workerParameters);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicReference(null);
        this.i = new AtomicReference(null);
        fns fnsVar = igu.a;
        this.j = b3s.c.M(10);
    }

    public final Object f(lnm lnmVar) {
        l811 l811Var = new l811();
        return z(new m0z0(this, l811Var, (lnm) null, (byte) 0), new m0z0(this, l811Var, (lnm) null, (byte) 1), (onm) lnmVar);
    }

    public abstract long i();

    public abstract Object j(Object obj, pew0 pew0Var);

    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object k(c9n c9nVar, onm onmVar) throws Throwable {
        n0z0 n0z0Var;
        QuasarWorker<ScopeContext> quasarWorker;
        y8d0 y8d0Var;
        if (onmVar instanceof n0z0) {
            n0z0Var = (n0z0) onmVar;
            int i = n0z0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n0z0Var.e = i - Integer.MIN_VALUE;
            } else {
                n0z0Var = new n0z0(this, onmVar);
            }
        } else {
            n0z0Var = new n0z0(this, onmVar);
        }
        n0z0 n0z0Var2 = n0z0Var;
        Object objQ = n0z0Var2.c;
        int i2 = n0z0Var2.e;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                s2t s2tVarQ = c921.q(c9nVar, (o8n) null, 0, new ian0(this, (lnm) null, (byte) 20), 3);
                quasarWorker = this;
                faa0 faa0VarY = c921.y(c9nVar, (o8n) null, 0, new pew0(quasarWorker, s2tVarQ, false, (lnm) null, (byte) 22), 3);
                n0z0Var2.a = faa0VarY;
                n0z0Var2.e = 1;
                objQ = s2tVarQ.Q(n0z0Var2);
                c9nVar = faa0VarY;
                if (objQ == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                faa0 faa0Var = n0z0Var2.a;
                hm5.M(objQ);
                quasarWorker = this;
                c9nVar = faa0Var;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) n0z0Var2.b;
                    faa0 faa0Var2 = n0z0Var2.a;
                    hm5.M(objQ);
                    throw th;
                }
                y8d0Var = (y8d0) n0z0Var2.b;
                faa0 faa0Var3 = n0z0Var2.a;
                hm5.M(objQ);
                quasarWorker = this;
            }
            if (quasarWorker.b()) {
                quasarWorker.q();
                return y8d0Var;
            }
            quasarWorker.r(y8d0Var);
            return y8d0Var;
            y8d0 y8d0Var2 = (y8d0) objQ;
            geo0 geo0Var = geo0.b;
            c3u0 c3u0Var = new c3u0(c9nVar, (lnm) null, (byte) 25);
            n0z0Var2.a = null;
            n0z0Var2.b = y8d0Var2;
            n0z0Var2.e = 2;
            if (c921.H(geo0Var, c3u0Var, n0z0Var2) != d9nVar) {
                y8d0Var = y8d0Var2;
                if (quasarWorker.b()) {
                    quasarWorker.q();
                    return y8d0Var;
                }
                quasarWorker.r(y8d0Var);
                return y8d0Var;
            }
        } catch (Throwable th2) {
            geo0 geo0Var2 = geo0.b;
            c3u0 c3u0Var2 = new c3u0(c9nVar, (lnm) null, (byte) 25);
            n0z0Var2.a = null;
            n0z0Var2.b = th2;
            n0z0Var2.e = 3;
            if (c921.H(geo0Var2, c3u0Var2, n0z0Var2) != d9nVar) {
                throw th2;
            }
        }
        return d9nVar;
    }

    public abstract long l();

    public abstract long m();

    /* JADX INFO: renamed from: n */
    public abstract zn41 getQ();

    /* JADX INFO: renamed from: o */
    public abstract String getT();

    /* JADX WARN: Code duplicated, block: B:36:0x00b6 A[PHI: r3 r11 r18
      0x00b6: PHI (r3v8 p.wex0) = (r3v7 p.wex0), (r3v11 p.wex0) binds: [B:34:0x00b3, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r11v3 p.l2t) = (r11v2 p.l2t), (r11v4 p.l2t) binds: [B:34:0x00b3, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r18v3 long) = (r18v2 long), (r18v5 long) binds: [B:34:0x00b3, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b3 -> B:36:0x00b6). Please report as a decompilation issue!!! */
    public final Object p(s2t s2tVar, onm onmVar) {
        o0z0 o0z0Var;
        long j;
        l2t l2tVar;
        l2t l2tVar2;
        wex0 wex0Var;
        long jL;
        wex0 wex0Var2;
        if (onmVar instanceof o0z0) {
            o0z0Var = (o0z0) onmVar;
            int i = o0z0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0z0Var.e = i - Integer.MIN_VALUE;
            } else {
                o0z0Var = new o0z0(this, onmVar);
            }
        } else {
            o0z0Var = new o0z0(this, onmVar);
        }
        Object obj = o0z0Var.c;
        int i2 = o0z0Var.e;
        AtomicReference atomicReference = this.h;
        AtomicReference atomicReference2 = this.i;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            j = 1000;
            long jM = m() * 1000;
            l2tVar = s2tVar;
            o0z0Var.a = l2tVar;
            o0z0Var.e = 1;
            if (hap1.i(jM, o0z0Var) != d9nVar) {
            }
        }
        if (i2 == 1) {
            l2t l2tVar3 = o0z0Var.a;
            hm5.M(obj);
            l2tVar = l2tVar3;
            j = 1000;
        } else {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wex0Var = o0z0Var.b;
            l2tVar2 = o0z0Var.a;
            hm5.M(obj);
            j = 1000;
        }
        wex0Var2 = (wex0) atomicReference.get();
        if (!u890.j(wex0Var, wex0Var2) || wex0Var2 == null || !l2tVar2.isActive()) {
            if (wex0Var != null && l2tVar2.isActive()) {
                atomicReference2.set(new NoProgressTimeoutException(l()));
                e(-512);
                o0z0Var.a = null;
                o0z0Var.b = null;
                o0z0Var.e = 4;
                if (op71.p(l2tVar2, o0z0Var) == d9nVar) {
                }
            }
        }
        wex0Var = (wex0) atomicReference.get();
        jL = l() * j;
        o0z0Var.a = l2tVar2;
        o0z0Var.b = wex0Var;
        o0z0Var.e = 3;
        if (hap1.i(jL, o0z0Var) != d9nVar) {
            wex0Var2 = (wex0) atomicReference.get();
            if (!u890.j(wex0Var, wex0Var2)) {
            }
            if (wex0Var != null) {
                atomicReference2.set(new NoProgressTimeoutException(l()));
                e(-512);
                o0z0Var.a = null;
                o0z0Var.b = null;
                o0z0Var.e = 4;
                if (op71.p(l2tVar2, o0z0Var) == d9nVar) {
                }
            }
        }
        if (!this.g.get() && l2tVar.isActive()) {
            atomicReference2.set(new ScopeEnterTimeoutException(m()));
            e(-512);
            o0z0Var.a = null;
            o0z0Var.e = 2;
            return op71.p(l2tVar, o0z0Var) == d9nVar ? d9nVar : rih1Var;
        }
        l2tVar2 = l2tVar;
        wex0Var = (wex0) atomicReference.get();
        jL = l() * j;
        o0z0Var.a = l2tVar2;
        o0z0Var.b = wex0Var;
        o0z0Var.e = 3;
        if (hap1.i(jL, o0z0Var) != d9nVar) {
            wex0Var2 = (wex0) atomicReference.get();
            if (!u890.j(wex0Var, wex0Var2)) {
            }
            if (wex0Var != null) {
                atomicReference2.set(new NoProgressTimeoutException(l()));
                e(-512);
                o0z0Var.a = null;
                o0z0Var.b = null;
                o0z0Var.e = 4;
                if (op71.p(l2tVar2, o0z0Var) == d9nVar) {
                }
            }
        }
    }

    public void q() {
    }

    public void s(int i) {
    }

    public void t(Exception exc) {
    }

    public void u() {
    }

    public abstract Object v(pew0 pew0Var);

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v3 double) = (r0v0 double), (r0v1 double) binds: [B:3:0x0004, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void w(double d) {
        double d2 = 0.0d;
        if (d < 0.0d) {
            d = d2;
        } else {
            d2 = 100.0d;
            if (d > 100.0d) {
                d = d2;
            }
        }
        this.h.set(new wex0(d, i()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(c9n c9nVar, onm onmVar) {
        p0z0 p0z0Var;
        if (onmVar instanceof p0z0) {
            p0z0Var = (p0z0) onmVar;
            int i = p0z0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0z0Var.c = i - Integer.MIN_VALUE;
            } else {
                p0z0Var = new p0z0(this, onmVar);
            }
        } else {
            p0z0Var = new p0z0(this, onmVar);
        }
        Object objR = p0z0Var.a;
        int i2 = p0z0Var.c;
        if (i2 == 0) {
            hm5.M(objR);
            p0z0Var.c = 1;
            ohd ohdVar = new ohd(1, aym.t(p0z0Var));
            ohdVar.t();
            try {
                getQ().a(getT(), new ozu0(c9nVar, ohdVar, this, (byte) 14));
            } catch (Exception e) {
                ohdVar.resumeWith(new m231(e));
            }
            objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objR);
        }
        return (l2t) objR;
    }

    public abstract Object y(l4f0 l4f0Var);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r5 == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (p.c921.H(r5, r8, r0) == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(p.m0z0 r6, p.m0z0 r7, p.onm r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p.q0z0
            if (r0 == 0) goto L13
            r0 = r8
            p.q0z0 r0 = (p.q0z0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.q0z0 r0 = new p.q0z0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.c
            int r8 = r0.e
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r8 == 0) goto L3e
            if (r8 == r2) goto L36
            if (r8 != r1) goto L30
            java.lang.Object r6 = r0.b
            p.hm5.M(r5)     // Catch: java.lang.Throwable -> L2d
            goto L69
        L2d:
            r5 = move-exception
            r3 = r5
            goto L69
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r3
        L36:
            p.m0z0 r7 = r0.a
            p.hm5.M(r5)     // Catch: java.lang.Throwable -> L3c
            goto L4c
        L3c:
            r5 = move-exception
            goto L4e
        L3e:
            p.hm5.M(r5)
            r0.a = r7     // Catch: java.lang.Throwable -> L3c
            r0.e = r2     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L3c
            if (r5 != r4) goto L4c
            goto L68
        L4c:
            r6 = r5
            goto L53
        L4e:
            p.m231 r6 = new p.m231
            r6.<init>(r5)
        L53:
            p.geo0 r5 = p.geo0.b     // Catch: java.lang.Throwable -> L2d
            p.w73 r8 = new p.w73     // Catch: java.lang.Throwable -> L2d
            r2 = 11
            r8.<init>(r7, r3, r2)     // Catch: java.lang.Throwable -> L2d
            r0.a = r3     // Catch: java.lang.Throwable -> L2d
            r0.b = r6     // Catch: java.lang.Throwable -> L2d
            r0.e = r1     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = p.c921.H(r5, r8, r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r4) goto L69
        L68:
            return r4
        L69:
            java.lang.Throwable r5 = p.e331.a(r6)
            if (r5 == 0) goto L77
            if (r3 == 0) goto L76
            if (r3 == r5) goto L76
            p.j2h1.h(r5, r3)
        L76:
            throw r5
        L77:
            if (r3 != 0) goto L7d
            p.hm5.M(r6)
            return r6
        L7d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.serviceapi.android.quasarworker.QuasarWorker.z(p.m0z0, p.m0z0, p.onm):java.lang.Object");
    }

    public void r(y8d0 y8d0Var) {
    }
}
