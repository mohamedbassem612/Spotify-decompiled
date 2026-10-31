package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l6o0 extends pim0 implements dpg1, d6o0 {
    public d6o0 O0;
    public g6o0 P0;
    public l6o0 Q0;
    public final String R0;

    public l6o0(d6o0 d6o0Var, g6o0 g6o0Var) {
        this.O0 = d6o0Var;
        this.P0 = g6o0Var == null ? new g6o0() : g6o0Var;
        this.R0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // p.pim0
    public final void A1() {
        l6o0 l6o0Var = (l6o0) oqn1.h(this);
        this.Q0 = l6o0Var;
        g6o0 g6o0Var = this.P0;
        g6o0Var.b = l6o0Var;
        if (g6o0Var.a == this) {
            g6o0Var.a = null;
            g6o0Var.d = null;
            g6o0Var.c = oqn1.a;
        }
    }

    public final c9n H1() {
        l6o0 l6o0Var = this.N0 ? (l6o0) don1.r(this) : null;
        c9n c9nVarH1 = l6o0Var != null ? l6o0Var.H1() : null;
        if (c9nVarH1 != null && smo1.u(c9nVarH1)) {
            return c9nVarH1;
        }
        c9n c9nVar = this.P0.d;
        if (c9nVar != null) {
            return c9nVar;
        }
        eg.m("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // p.d6o0
    public final long M(int i, long j) {
        boolean z = this.N0;
        l6o0 l6o0Var = null;
        if (z && z) {
            l6o0Var = (l6o0) don1.r(this);
        }
        long jM = l6o0Var != null ? l6o0Var.M(i, j) : 0L;
        return Offset.g(jM, this.O0.M(i, Offset.f(j, jM)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p.d6o0
    public final Object Q0(long j, long j2, lnm lnmVar) {
        j6o0 j6o0Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (lnmVar instanceof j6o0) {
            j6o0Var = (j6o0) lnmVar;
            int i = j6o0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j6o0Var.e = i - Integer.MIN_VALUE;
            } else {
                j6o0Var = new j6o0(this, (onm) lnmVar);
            }
        } else {
            j6o0Var = new j6o0(this, (onm) lnmVar);
        }
        j6o0 j6o0Var2 = j6o0Var;
        Object objQ0 = j6o0Var2.c;
        int i2 = j6o0Var2.e;
        l6o0 l6o0Var = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objQ0);
            d6o0 d6o0Var = this.O0;
            j6o0Var2.a = j;
            j6o0Var2.b = j2;
            j6o0Var2.e = 1;
            objQ0 = d6o0Var.Q0(j, j2, j6o0Var2);
            if (objQ0 != d9nVar) {
                j3 = j;
                j4 = j2;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            j4 = j6o0Var2.b;
            j3 = j6o0Var2.a;
            hm5.M(objQ0);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = j6o0Var2.a;
            hm5.M(objQ0);
        }
        j6 = ((qui1) objQ0).j();
        j5 = j7;
        return qui1.a(qui1.g(j5, j6));
        j5 = ((qui1) objQ0).j();
        boolean z = this.N0;
        if (!z) {
            l6o0Var = this.Q0;
        } else if (z && z) {
            l6o0Var = (l6o0) don1.r(this);
        }
        if (l6o0Var != null) {
            long jG = qui1.g(j3, j5);
            long jF = qui1.f(j4, j5);
            j6o0Var2.a = j5;
            j6o0Var2.e = 2;
            objQ0 = l6o0Var.Q0(jG, jF, j6o0Var2);
            if (objQ0 != d9nVar) {
                j7 = j5;
                j6 = ((qui1) objQ0).j();
                j5 = j7;
            }
            return d9nVar;
        }
        j6 = 0;
        return qui1.a(qui1.g(j5, j6));
    }

    @Override // p.d6o0
    public final long h0(int i, long j, long j2) {
        long jH0 = this.O0.h0(i, j, j2);
        boolean z = this.N0;
        l6o0 l6o0Var = null;
        if (z && z) {
            l6o0Var = (l6o0) don1.r(this);
        }
        l6o0 l6o0Var2 = l6o0Var;
        return Offset.g(jH0, l6o0Var2 != null ? l6o0Var2.h0(i, Offset.g(j, jH0), Offset.f(j2, jH0)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r9 == r5) goto L28;
     */
    @Override // p.d6o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k0(long r7, p.lnm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.k6o0
            if (r0 == 0) goto L13
            r0 = r9
            p.k6o0 r0 = (p.k6o0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            p.k6o0 r0 = new p.k6o0
            p.onm r9 = (p.onm) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.a
            p.hm5.M(r9)
            goto L73
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L35:
            long r7 = r0.a
            p.hm5.M(r9)
            goto L58
        L3b:
            p.hm5.M(r9)
            boolean r9 = r6.N0
            if (r9 == 0) goto L4b
            if (r9 == 0) goto L4b
            p.dpg1 r9 = p.don1.r(r6)
            r2 = r9
            p.l6o0 r2 = (p.l6o0) r2
        L4b:
            if (r2 == 0) goto L5f
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r2.k0(r7, r0)
            if (r9 != r5) goto L58
            goto L71
        L58:
            p.qui1 r9 = (p.qui1) r9
            long r1 = r9.j()
            goto L61
        L5f:
            r1 = 0
        L61:
            p.d6o0 r6 = r6.O0
            long r7 = p.qui1.f(r7, r1)
            r0.a = r1
            r0.d = r3
            java.lang.Object r9 = r6.k0(r7, r0)
            if (r9 != r5) goto L72
        L71:
            return r5
        L72:
            r6 = r1
        L73:
            p.qui1 r9 = (p.qui1) r9
            long r8 = r9.j()
            long r6 = p.qui1.g(r6, r8)
            p.qui1 r6 = p.qui1.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l6o0.k0(long, p.lnm):java.lang.Object");
    }

    @Override // p.dpg1
    public final Object n() {
        return this.R0;
    }

    @Override // p.pim0
    public final void z1() {
        g6o0 g6o0Var = this.P0;
        g6o0Var.a = this;
        g6o0Var.b = null;
        this.Q0 = null;
        g6o0Var.c = new g030(this, (byte) 21);
        g6o0Var.d = v1();
    }
}
