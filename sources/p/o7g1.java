package p;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o7g1 {
    public static final gaa0 k;
    public static final l7g1 l;
    public final kxl1 a;
    public final iu30 b;
    public final long c;
    public final o8n d;
    public final gaa0 e;
    public final llm f;
    public final AtomicReference g;
    public final ArrayList h;
    public final xab1 i;
    public volatile long j;

    static {
        gaa0 gaa0VarF = op71.f();
        gaa0VarF.m0(rih1.a);
        k = gaa0VarF;
        l = new l7g1();
    }

    public o7g1(o8n o8nVar, long j, o8n o8nVar2) {
        kxl1 kxl1Var = new kxl1();
        h5g1 h5g1Var = h5g1.Y;
        this.a = kxl1Var;
        this.b = h5g1Var;
        this.c = j;
        this.d = o8nVar2;
        d();
        gaa0 gaa0Var = new gaa0(o8nVar.A(fkj0.W0));
        this.e = gaa0Var;
        llm llmVarE = smo1.e(o8nVar.y(gaa0Var));
        this.f = llmVarE;
        this.g = new AtomicReference(null);
        this.h = new ArrayList();
        xab1 xab1VarT = fn31.T(llmVarE, (o8n) null, 2, new b0f1(this, (lnm) null, (byte) 8), 1);
        this.i = xab1VarT;
        xab1VarT.L(new ibf1(this, (byte) 21));
    }

    public final long a(long j) {
        if (jfv.f(j, 0L)) {
            return 0L;
        }
        d();
        d();
        return (jfv.h(j) + 15) / 16;
    }

    public final void b(m7g1 m7g1Var) {
        while (true) {
            m7g1 m7g1Var2 = (m7g1) this.g.get();
            if (m7g1Var2 == l || !this.e.isActive()) {
                break;
            }
            m7g1Var.a = m7g1Var2;
            AtomicReference atomicReference = this.g;
            do {
                if (atomicReference.compareAndSet(m7g1Var2, m7g1Var)) {
                    this.i.start();
                    return;
                }
            } while (atomicReference.get() == m7g1Var2);
        }
        eg.m("TrampolineScope is cancelled");
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        if (this.a instanceof kxl1) {
            return 16L;
        }
        eg.o();
        return 0L;
    }

    public final k7g1 e(long j, c7m0 c7m0Var) {
        k7g1 k7g1Var = new k7g1(a(j) + this.j, c7m0Var);
        b(k7g1Var);
        return k7g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x007f -> B:42:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0081 -> B:42:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o7g1.f():void");
    }

    public final void g() {
        AtomicReference atomicReference = this.g;
        l7g1 l7g1Var = l;
        m7g1 m7g1Var = (m7g1) atomicReference.getAndSet(l7g1Var);
        if (m7g1Var == l7g1Var) {
            return;
        }
        while (m7g1Var != null) {
            m7g1 m7g1Var2 = m7g1Var.a;
            m7g1Var.a = null;
            m7g1Var.c = true;
            faa0 faa0Var = m7g1Var.b;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            m7g1Var = m7g1Var2;
        }
        this.e.d((CancellationException) null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:21:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void h(p.onm r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p.n7g1
            if (r0 == 0) goto L13
            r0 = r9
            p.n7g1 r0 = (p.n7g1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.n7g1 r0 = new p.n7g1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            p.d9n r1 = p.d9n.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L29
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r9 = move-exception
            goto L4b
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return
        L2f:
            p.hm5.M(r9)
        L32:
            r8.d()     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            r4 = 16
            java.lang.Object r9 = p.hap1.i(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r9 != r1) goto L40
            return
        L40:
            long r4 = r8.j     // Catch: java.lang.Throwable -> L27
            r6 = 1
            long r4 = r4 + r6
            r8.j = r4     // Catch: java.lang.Throwable -> L27
            r8.f()     // Catch: java.lang.Throwable -> L27
            goto L32
        L4b:
            r8.g()
            java.util.ArrayList r0 = r8.h
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r0.next()
            p.m7g1 r1 = (p.m7g1) r1
            r1.c = r3
            goto L54
        L63:
            java.util.ArrayList r8 = r8.h
            r8.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o7g1.h(p.onm):void");
    }
}
