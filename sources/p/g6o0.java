package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g6o0 {
    public l6o0 a;
    public l6o0 b;
    public Function0 c = new g030(this, (byte) 20);
    public c9n d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, p.onm r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof p.e6o0
            if (r0 == 0) goto L14
            r0 = r12
            p.e6o0 r0 = (p.e6o0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            p.e6o0 r0 = new p.e6o0
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.a
            int r1 = r12.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r0)
            goto L7d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L31:
            p.hm5.M(r0)
            goto L5b
        L35:
            p.hm5.M(r0)
            p.l6o0 r0 = r7.a
            if (r0 == 0) goto L47
            boolean r1 = r0.N0
            if (r1 == 0) goto L47
            p.dpg1 r0 = p.don1.r(r0)
            p.l6o0 r0 = (p.l6o0) r0
            goto L48
        L47:
            r0 = r2
        L48:
            r5 = 0
            p.d9n r1 = p.d9n.a
            if (r0 != 0) goto L62
            p.l6o0 r7 = r7.b
            if (r7 == 0) goto L83
            r12.c = r4
            java.lang.Object r0 = r7.Q0(r8, r10, r12)
            if (r0 != r1) goto L5b
            goto L7c
        L5b:
            p.qui1 r0 = (p.qui1) r0
            long r5 = r0.j()
            goto L83
        L62:
            p.l6o0 r7 = r7.a
            if (r7 == 0) goto L71
            boolean r0 = r7.N0
            if (r0 == 0) goto L71
            p.dpg1 r7 = p.don1.r(r7)
            r2 = r7
            p.l6o0 r2 = (p.l6o0) r2
        L71:
            r7 = r2
            if (r7 == 0) goto L83
            r12.c = r3
            java.lang.Object r0 = r7.Q0(r8, r10, r12)
            if (r0 != r1) goto L7d
        L7c:
            return r1
        L7d:
            p.qui1 r0 = (p.qui1) r0
            long r5 = r0.j()
        L83:
            p.qui1 r7 = p.qui1.a(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g6o0.a(long, long, p.onm):java.lang.Object");
    }

    public final long b(int i, long j, long j2) {
        l6o0 l6o0Var = this.a;
        l6o0 l6o0Var2 = null;
        if (l6o0Var != null && l6o0Var.N0) {
            l6o0Var2 = (l6o0) don1.r(l6o0Var);
        }
        l6o0 l6o0Var3 = l6o0Var2;
        if (l6o0Var3 != null) {
            return l6o0Var3.h0(i, j, j2);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, onm onmVar) {
        f6o0 f6o0Var;
        long j2;
        if (onmVar instanceof f6o0) {
            f6o0Var = (f6o0) onmVar;
            int i = f6o0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6o0Var.c = i - Integer.MIN_VALUE;
            } else {
                f6o0Var = new f6o0(this, onmVar);
            }
        } else {
            f6o0Var = new f6o0(this, onmVar);
        }
        Object objK0 = f6o0Var.a;
        int i2 = f6o0Var.c;
        l6o0 l6o0Var = null;
        if (i2 == 0) {
            hm5.M(objK0);
            l6o0 l6o0Var2 = this.a;
            if (l6o0Var2 != null && l6o0Var2.N0) {
                l6o0Var = (l6o0) don1.r(l6o0Var2);
            }
            if (l6o0Var != null) {
                f6o0Var.c = 1;
                objK0 = l6o0Var.k0(j, f6o0Var);
                d9n d9nVar = d9n.a;
                if (objK0 == d9nVar) {
                    return d9nVar;
                }
            } else {
                j2 = 0;
            }
            return qui1.a(j2);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objK0);
        j2 = ((qui1) objK0).j();
        return qui1.a(j2);
    }

    public final c9n d() {
        c9n c9nVar = (c9n) this.c.invoke();
        if (c9nVar != null) {
            return c9nVar;
        }
        eg.m("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
