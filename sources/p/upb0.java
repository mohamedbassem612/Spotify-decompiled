package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class upb0 implements ct41 {
    public static final df41 w = kyo1.t(new pv40((byte) 15), new n75((byte) 27));
    public boolean b;
    public lpb0 c;
    public final fdc d;
    public float g;
    public hmb0 j;
    public final tsb0 o;
    public final hrr0 t;
    public final hrr0 u;
    public final x390 v;
    public final j5s a = nko1.j();
    public final hrr0 e = xto.s(wpb0.a(), f331.X0);
    public final jdn0 f = zr7.d();
    public final jns h = grn1.i(new gv20(this, (byte) 12));
    public final boolean i = true;
    public final spb0 k = new spb0(this, (byte) 0);
    public final qc9 l = new qc9();
    public final bsb0 m = new bsb0();
    public final laz n = new laz();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zc80 f121p = new zc80(this, (byte) 6);
    public final qsb0 q = new qsb0();
    public final ven0 r = s8p1.j();
    public final ven0 s = s8p1.j();

    public upb0(int i, int i2) {
        this.d = new fdc(i, i2);
        this.o = new tsb0(new bz20(this, i, (byte) 1));
        Boolean bool = Boolean.FALSE;
        this.t = xto.t(bool);
        this.u = xto.t(bool);
        this.v = new x390();
    }

    public static Object f(upb0 upb0Var, int i, a8d1 a8d1Var) {
        upb0Var.getClass();
        Object objA = upb0Var.a(hfn0.a, new zi3(upb0Var, i, (lnm) null, (byte) 8), a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }

    public static Object i(upb0 upb0Var, int i, a8d1 a8d1Var) {
        upb0Var.getClass();
        Object objA = upb0Var.a(hfn0.a, new nx5(upb0Var, i, (lnm) null, (byte) 7), a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6.h.a(r7, r8, r0) == r5) goto L23;
     */
    @Override // p.ct41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.hfn0 r7, p.vu30 r8, p.lnm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.tpb0
            if (r0 == 0) goto L13
            r0 = r9
            p.tpb0 r0 = (p.tpb0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.tpb0 r0 = new p.tpb0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            goto L6c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.a8d1 r7 = r0.b
            r8 = r7
            p.vu30 r8 = (p.vu30) r8
            p.hfn0 r7 = r0.a
            p.hm5.M(r9)
            goto L5d
        L3c:
            p.hm5.M(r9)
            p.hrr0 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            p.lpb0 r1 = p.wpb0.a()
            if (r9 != r1) goto L5d
            r0.a = r7
            r9 = r8
            p.a8d1 r9 = (p.a8d1) r9
            r0.b = r9
            r0.e = r4
            p.qc9 r9 = r6.l
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r5) goto L5d
            goto L6b
        L5d:
            r0.a = r2
            r0.b = r2
            r0.e = r3
            p.jns r6 = r6.h
            java.lang.Object r6 = r6.a(r7, r8, r0)
            if (r6 != r5) goto L6c
        L6b:
            return r5
        L6c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.upb0.a(p.hfn0, p.vu30, p.lnm):java.lang.Object");
    }

    @Override // p.ct41
    public final boolean b() {
        return this.h.b();
    }

    @Override // p.ct41
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final boolean d() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void g(lpb0 lpb0Var, boolean z, boolean z2) {
        npb0 npb0VarL;
        mpb0 mpb0Var;
        this.o.e = lpb0Var.q().size();
        fdc fdcVar = this.d;
        x390 x390Var = this.v;
        if (!z && this.b) {
            this.c = lpb0Var;
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            try {
                if (x390Var.j() && lpb0Var.m() == fdcVar.T() && (npb0VarL = lpb0Var.l()) != null && (mpb0Var = (mpb0) f46.k0(npb0VarL.a())) != null && mpb0Var.getIndex() == fdcVar.Q()) {
                    x390Var.z();
                }
                return;
            } finally {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= lpb0Var.i();
        this.e.setValue(lpb0Var);
        this.u.setValue(Boolean.valueOf(lpb0Var.g()));
        this.t.setValue(Boolean.valueOf(lpb0Var.h()));
        if (z2) {
            fdcVar.q0(lpb0Var.m());
        } else {
            fdcVar.p0(lpb0Var);
            if (this.i) {
                this.a.c(this.f121p, lpb0Var);
            }
        }
        if (z) {
            x390Var.B(lpb0Var.n(), lpb0Var.k(), lpb0Var.j());
        }
    }

    public final lpb0 h() {
        return (lpb0) this.e.getValue();
    }

    public final void j(int i, int i2, boolean z) {
        fdc fdcVar = this.d;
        if (fdcVar.Q() != i || fdcVar.T() != i2) {
            bsb0 bsb0Var = this.m;
            bsb0Var.e();
            bsb0Var.b = null;
            bsb0Var.c = -1;
        }
        fdcVar.h0(i, i2);
        if (!z) {
            s8p1.r(this.s);
            return;
        }
        hmb0 hmb0Var = this.j;
        if (hmb0Var != null) {
            hmb0Var.l();
        }
    }
}
