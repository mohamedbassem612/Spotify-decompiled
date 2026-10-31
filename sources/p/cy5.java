package p;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cy5 {
    public final String a;
    public final AtomicBoolean b;
    public final bbc c;
    public final ws40 d;
    public final kx5 e;
    public final v291 f;
    public final hrr0 g;
    public final hrr0 h;
    public Map i;
    public final gaa0 j;
    public final bpb1 k;

    public cy5(ws40 ws40Var, kx5 kx5Var, Bundle bundle, int i) {
        bundle = (i & 4) != 0 ? null : bundle;
        nt40 nt40Var = nt40.a;
        v291 v291VarB = ws40Var.b();
        this.a = u2o1.t(kx5Var);
        this.b = new AtomicBoolean(true);
        this.c = mno1.a(Integer.MAX_VALUE, 0, 6);
        this.d = ws40Var;
        this.e = kx5Var;
        this.f = v291VarB;
        if (u2o1.o(kx5Var)) {
            hhg1.n("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        f331 f331Var = f331.X0;
        this.g = xto.s((Object) null, f331Var);
        this.h = xto.s(bundle, f331Var);
        this.i = b7x.a;
        this.j = op71.f();
        this.k = gio1.b((Object) null);
    }

    public final void a() {
        this.c.H((Throwable) null);
        this.b.set(false);
        this.j.d((CancellationException) null);
    }

    public final String b() {
        return this.a;
    }

    public final void c(Context context, Throwable th) {
        int i = this.e.a;
        this.d.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), 2131624769));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (r3.b(r5) == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0109, code lost:
    
        if (r3.b(r5) == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
    
        if (r3.b(r5) == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012c, code lost:
    
        if (r3.b(r5) == r13) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r21, p.s3x r22, p.onm r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cy5.d(android.content.Context, p.s3x, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Context context, Object obj, onm onmVar) {
        zx5 zx5Var;
        ten0 ten0VarF;
        jv91 jv91VarJ;
        if (onmVar instanceof zx5) {
            zx5Var = (zx5) onmVar;
            int i = zx5Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zx5Var.d = i - Integer.MIN_VALUE;
            } else {
                zx5Var = new zx5(this, onmVar);
            }
        } else {
            zx5Var = new zx5(this, onmVar);
        }
        Object objC = zx5Var.b;
        int i2 = zx5Var.d;
        rih1 rih1Var = rih1.a;
        Object obj2 = null;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objC);
                    if (obj instanceof wx5) {
                        v441 v441VarC = this.d.c();
                        if (v441VarC != null) {
                            nt40 nt40Var = nt40.a;
                            String strB = b();
                            zx5Var.a = this;
                            zx5Var.d = 1;
                            objC = nt40Var.c(context, v441VarC, strB, zx5Var);
                            d9n d9nVar = d9n.a;
                            if (objC == d9nVar) {
                                return d9nVar;
                            }
                        }
                        ten0VarF = ekb.F();
                        jv91VarJ = ten0VarF.j();
                        this.g.setValue(obj2);
                        jv91.q(jv91VarJ);
                        ten0VarF.w().q();
                        ten0VarF.c();
                        return rih1Var;
                    }
                    if (obj instanceof vx5) {
                        ten0 ten0VarF2 = ekb.F();
                        try {
                            jv91 jv91VarJ2 = ten0VarF2.j();
                            try {
                                this.h.setValue(((vx5) obj).a());
                                jv91.q(jv91VarJ2);
                                ten0VarF2.w().q();
                                ten0VarF2.c();
                                return rih1Var;
                            } catch (Throwable th) {
                                jv91.q(jv91VarJ2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            ten0VarF2.c();
                            throw th2;
                        }
                    }
                    if (obj instanceof ux5) {
                        ten0 ten0VarF3 = ekb.F();
                        try {
                            jv91 jv91VarJ3 = ten0VarF3.j();
                            try {
                                List list = (List) this.i.get(((ux5) obj).a());
                                if (list != null) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ((iab0) it.next()).a().invoke();
                                    }
                                    obj2 = rih1Var;
                                }
                                jv91.q(jv91VarJ3);
                                ten0VarF3.w().q();
                                ten0VarF3.c();
                                if (obj2 == null) {
                                    yah0.p(Log.w("AppWidgetSession", "Triggering Action(" + ((ux5) obj).a() + ") for session(" + b() + ") failed"));
                                    return rih1Var;
                                }
                            } catch (Throwable th3) {
                                jv91.q(jv91VarJ3);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            ten0VarF3.c();
                            throw th4;
                        }
                    } else {
                        if (!(obj instanceof xx5)) {
                            mna0.e("Sent unrecognized event type ", obj.getClass(), " to AppWidgetSession");
                            return null;
                        }
                        gaa0 gaa0VarA = ((xx5) obj).a();
                        if (gaa0VarA.isActive()) {
                            gaa0VarA.m0(rih1Var);
                        }
                    }
                    return rih1Var;
                }
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = zx5Var.a;
                hm5.M(objC);
                this.g.setValue(obj2);
                jv91.q(jv91VarJ);
                ten0VarF.w().q();
                ten0VarF.c();
                return rih1Var;
            } catch (Throwable th5) {
                jv91.q(jv91VarJ);
                throw th5;
            }
            jv91VarJ = ten0VarF.j();
        } catch (Throwable th6) {
            ten0VarF.c();
            throw th6;
        }
        obj2 = objC;
        ten0VarF = ekb.F();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074 A[Catch: ClosedReceiveChannelException -> 0x008c, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x008c, blocks: (B:13:0x002e, B:22:0x0055, B:26:0x006c, B:28:0x0074, B:18:0x0047, B:21:0x004e), top: B:34:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r1.e(r8, r9, r0) == r4) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.content.Context r7, p.ny51 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.ba61
            if (r0 == 0) goto L13
            r0 = r9
            p.ba61 r0 = (p.ba61) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.ba61 r0 = new p.ba61
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L38
            p.uac r6 = r0.d
            p.iu30 r7 = r0.c
            android.content.Context r8 = r0.b
            p.cy5 r1 = r0.a
            p.hm5.M(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
        L31:
            r5 = r1
            r1 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r5
            goto L55
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L3f:
            p.uac r6 = r0.d
            p.iu30 r7 = r0.c
            android.content.Context r8 = r0.b
            p.cy5 r1 = r0.a
            p.hm5.M(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            goto L6c
        L4b:
            p.hm5.M(r9)
            p.bbc r9 = r6.c     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            p.uac r1 = new p.uac     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r1.<init>(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
        L55:
            r0.a = r6     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.b = r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.c = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.d = r1     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.g = r3     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            java.lang.Object r9 = r1.a(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            if (r9 != r4) goto L66
            goto L8b
        L66:
            r5 = r1
            r1 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r5
        L6c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            boolean r9 = r9.booleanValue()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            if (r9 == 0) goto L8c
            java.lang.Object r9 = r6.c()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r7.invoke(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.a = r1     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.b = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.c = r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.d = r6     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            r0.g = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            java.lang.Object r9 = r1.e(r8, r9, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8c
            if (r9 != r4) goto L31
        L8b:
            return r4
        L8c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cy5.f(android.content.Context, p.ny51, p.onm):java.lang.Object");
    }

    public final Object g(Object obj, onm onmVar) {
        Object objB = this.c.b(obj, onmVar);
        return objB == d9n.a ? objB : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(onm onmVar) {
        onm by5Var;
        xx5 xx5Var;
        if (onmVar instanceof by5) {
            by5Var = (by5) onmVar;
            int i = ((by5) by5Var).d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ((by5) by5Var).d = i - Integer.MIN_VALUE;
            } else {
                by5Var = new by5(this, onmVar);
            }
        } else {
            by5Var = new by5(this, onmVar);
        }
        Object obj = ((by5) by5Var).b;
        int i2 = ((by5) by5Var).d;
        if (i2 == 0) {
            hm5.M(obj);
            xx5 xx5Var2 = new xx5(op71.e(this.j));
            ((by5) by5Var).a = xx5Var2;
            ((by5) by5Var).d = 1;
            Object objG = g(xx5Var2, by5Var);
            Object obj2 = d9n.a;
            if (objG == obj2) {
                return obj2;
            }
            xx5Var = xx5Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xx5Var = ((by5) by5Var).a;
            hm5.M(obj);
        }
        return xx5Var.a();
    }
}
