package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wok1 implements cx80 {
    public static final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f48p = 0;
    public final st60 a;
    public final jpu b;
    public final phi0 c;
    public final Flowable d;
    public final g0l e;
    public final b1y f;
    public final zeu g;
    public final wen0 h;
    public final ty60 i;
    public final c9n j;
    public xab1 k;
    public final ezc l;
    public final jge m;
    public final tf2 n;

    static {
        ytw0 ytw0Var = jfv.b;
        o = fdg1.k0(5, ngv.e);
    }

    public wok1(st60 st60Var, jpu jpuVar, phi0 phi0Var, Flowable flowable, g0l g0lVar, b1y b1yVar, zeu zeuVar, wen0 wen0Var, ty60 ty60Var, llm llmVar) {
        this.a = st60Var;
        this.b = jpuVar;
        this.c = phi0Var;
        this.d = flowable;
        this.e = g0lVar;
        this.f = b1yVar;
        this.g = zeuVar;
        this.h = wen0Var;
        this.i = ty60Var;
        this.j = llmVar;
        g38 g38Var = ty60Var.a;
        this.l = yoi1.g(g38Var.k);
        this.m = hu20.e(rqt0.u(yoi1.g(g38Var.k)), new qt((lnm) null, ty60Var, (byte) 16));
        this.n = new tf2(ty60Var.n, (byte) 11);
    }

    public final mr20 a() {
        return this.n;
    }

    public final mr20 c() {
        return this.l;
    }

    public final void cancel() {
        xab1 xab1Var = this.k;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i.b();
        fn31.S(this.j, geo0.b, 1, new qok1(this, null, (byte) 0));
    }

    public final void d() {
        if (this.k != null) {
            eg.m("This interaction is already in progress");
        } else {
            this.k = fn31.T(this.j, (o8n) null, 0, new w621(this, (lnm) null, (byte) 24), 3);
        }
    }

    public final mr20 e() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (h(r0) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.rok1
            if (r0 == 0) goto L13
            r0 = r8
            p.rok1 r0 = (p.rok1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.rok1 r0 = new p.rok1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L38
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            p.hm5.M(r8)
            goto L67
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L34:
            p.hm5.M(r8)
            goto L5e
        L38:
            p.hm5.M(r8)
            goto L4a
        L3c:
            p.hm5.M(r8)
            r0.c = r5
            p.st60 r8 = r7.a
            java.lang.Object r8 = p.st60.H(r8, r2, r2, r0, r3)
            if (r8 != r6) goto L4a
            goto L66
        L4a:
            p.zz80 r8 = p.zz80.a
            p.wen0 r1 = r7.h
            p.bpb1 r1 = (p.bpb1) r1
            r1.m(r2, r8)
            r0.c = r4
            p.ty60 r8 = r7.i
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r6) goto L5e
            goto L66
        L5e:
            r0.c = r3
            java.lang.Object r7 = r7.h(r0)
            if (r7 != r6) goto L67
        L66:
            return r6
        L67:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wok1.f(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        if (r12.c.y((java.lang.String) r13, r3, r4, r5, r0, p.vt81.c, r8) == r9) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(p.onm r13) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wok1.g(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r5.a(r0) == r6) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(p.onm r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p.uok1
            if (r0 == 0) goto L13
            r0 = r9
            p.uok1 r0 = (p.uok1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.uok1 r0 = new p.uok1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.ty60 r5 = r8.i
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r9)
            goto L65
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L33:
            p.hm5.M(r9)
            goto L53
        L37:
            p.hm5.M(r9)
            p.jge r9 = r5.n
            p.tf2 r1 = new p.tf2
            r7 = 11
            r1.<init>(r9, r7)
            p.xkb1 r9 = new p.xkb1
            r7 = 17
            r9.<init>(r1, r7)
            r0.c = r4
            java.lang.Object r9 = p.b5p1.i(r9, r0)
            if (r9 != r6) goto L53
            goto L64
        L53:
            p.jpa1 r9 = (p.jpa1) r9
            boolean r9 = r9 instanceof p.gpa1
            if (r9 != 0) goto L71
            r5.g()
            r0.c = r3
            java.lang.Object r9 = r5.a(r0)
            if (r9 != r6) goto L65
        L64:
            return r6
        L65:
            p.c090 r9 = p.c090.a
            p.wen0 r8 = r8.h
            p.bpb1 r8 = (p.bpb1) r8
            r8.m(r2, r9)
            p.rih1 r8 = p.rih1.a
            return r8
        L71:
            java.lang.String r8 = "Speech recognition failed"
            p.eg.m(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wok1.h(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(onm onmVar) {
        vok1 vok1Var;
        if (onmVar instanceof vok1) {
            vok1Var = (vok1) onmVar;
            int i = vok1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vok1Var.c = i - Integer.MIN_VALUE;
            } else {
                vok1Var = new vok1(this, onmVar);
            }
        } else {
            vok1Var = new vok1(this, onmVar);
        }
        Object objJ = vok1Var.a;
        int i2 = vok1Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            tf2 tf2Var = new tf2(this.i.n, (byte) 11);
            q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 29);
            vok1Var.c = 1;
            objJ = b5p1.j(tf2Var, q1c1Var, vok1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        jpa1 jpa1Var = (jpa1) objJ;
        if (jpa1Var instanceof hpa1) {
            return ((hpa1) jpa1Var).a;
        }
        eg.m("No transcript received from Hovercraft");
        return null;
    }
}
