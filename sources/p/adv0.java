package p;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class adv0 {
    public final int a;
    public final Function0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final mbl[] f;
    public final k261 g;
    public final n36 h;

    public adv0(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
        this.f = new mbl[i];
        this.g = l261.a(i);
        this.h = new n36(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(onm onmVar) {
        ycv0 ycv0Var;
        n36 n36Var = this.h;
        if (onmVar instanceof ycv0) {
            ycv0Var = (ycv0) onmVar;
            int i = ycv0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ycv0Var.c = i - Integer.MIN_VALUE;
            } else {
                ycv0Var = new ycv0(this, onmVar);
            }
        } else {
            ycv0Var = new ycv0(this, onmVar);
        }
        Object obj = ycv0Var.a;
        int i2 = ycv0Var.c;
        k261 k261Var = this.g;
        if (i2 == 0) {
            hm5.M(obj);
            ycv0Var.c = 1;
            Object objB = k261Var.b(ycv0Var);
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
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                if (this.e) {
                    vby0.y(21, "Connection pool is closed");
                    throw null;
                }
                if (n36Var.isEmpty() && this.d < this.a) {
                    mbl mblVar = new mbl((y341) this.b.invoke());
                    mbl[] mblVarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    mblVarArr[i3] = mblVar;
                    n36Var.addLast(mblVar);
                }
                mbl mblVar2 = (mbl) n36Var.removeLast();
                reentrantLock.unlock();
                return mblVar2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            k261Var.e();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:29:0x0064, B:31:0x0068, B:35:0x0070, B:39:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070 A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:29:0x0064, B:31:0x0068, B:35:0x0070, B:39:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0077 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #1 {all -> 0x006c, blocks: (B:29:0x0064, B:31:0x0068, B:35:0x0070, B:39:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0053 -> B:25:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0053
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r7, p.jea r9, p.onm r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p.zcv0
            if (r0 == 0) goto L13
            r0 = r10
            p.zcv0 r0 = (p.zcv0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.zcv0 r0 = new p.zcv0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r7 = r0.a
            p.p811 r9 = r0.c
            kotlin.jvm.functions.Function0 r1 = r0.b
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L2c
            goto L55
        L2c:
            r10 = move-exception
            goto L5f
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r3
        L34:
            p.hm5.M(r10)
        L37:
            p.p811 r10 = new p.p811
            r10.<init>()
            p.glu0 r1 = new p.glu0     // Catch: java.lang.Throwable -> L5a
            r4 = 4
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5a
            r0.b = r9     // Catch: java.lang.Throwable -> L5a
            r0.c = r10     // Catch: java.lang.Throwable -> L5a
            r0.a = r7     // Catch: java.lang.Throwable -> L5a
            r0.f = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r1 = p.rc2.N(r7, r1, r0)     // Catch: java.lang.Throwable -> L5a
            p.d9n r4 = p.d9n.a
            if (r1 != r4) goto L53
            return r4
        L53:
            r1 = r9
            r9 = r10
        L55:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L64
        L5a:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L5f:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L64:
            boolean r4 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L6e
            r9.invoke()     // Catch: java.lang.Throwable -> L6c
            goto L75
        L6c:
            r7 = move-exception
            goto L78
        L6e:
            if (r0 != 0) goto L77
            java.lang.Object r10 = r10.a     // Catch: java.lang.Throwable -> L6c
            if (r10 == 0) goto L75
            return r10
        L75:
            r0 = r1
            goto L37
        L77:
            throw r0     // Catch: java.lang.Throwable -> L6c
        L78:
            java.lang.Object r8 = r10.a
            p.mbl r8 = (p.mbl) r8
            if (r8 == 0) goto L81
            r6.e(r8)
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.adv0.b(long, p.jea, p.onm):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (mbl mblVar : this.f) {
                if (mblVar != null) {
                    mblVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        n36 n36Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            smc0 smc0VarN = k4p1.n();
            int i = n36Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                smc0VarN.add(n36Var.get(i2));
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(avg.a.getIntVolatile(this.g, j261.g), 0) + ", ");
            sb.append("queue=(size=" + smc0VarK.b() + ")[" + o7h.y0(smc0VarK, (CharSequence) null, (String) null, (String) null, (iu30) null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            mbl[] mblVarArr = this.f;
            int length = mblVarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                mbl mblVar = mblVarArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(mblVar != null ? mblVar.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (mblVar != null) {
                    mblVar.d(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(mbl mblVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(mblVar);
            reentrantLock.unlock();
            this.g.e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
