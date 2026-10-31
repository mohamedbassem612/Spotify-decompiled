package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xtb0 implements ct41 {
    public static final df41 y;
    public boolean b;
    public ptb0 c;
    public boolean d;
    public final i25 e;
    public float h;
    public boolean i;
    public hmb0 l;
    public final tsb0 q;
    public final hrr0 u;
    public final hrr0 v;
    public final ven0 w;
    public final x390 x;
    public final l5s a = kno1.j();
    public final hrr0 f = xto.s(aub0.a, f331.X0);
    public final jdn0 g = zr7.d();
    public final jns j = grn1.i(new gv20(this, (byte) 17));
    public final boolean k = true;
    public final spb0 m = new spb0(this, (byte) 1);
    public final qc9 n = new qc9();
    public final bsb0 o = new bsb0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final laz f145p = new laz();
    public final fey r = new fey(this, (byte) 28);
    public final qsb0 s = new qsb0();
    public final ven0 t = s8p1.j();

    static {
        byte b = 10;
        y = kyo1.t(new ia4(b), new llj(b));
    }

    public xtb0(int i, int i2) {
        this.e = new i25(i, i2);
        this.q = new tsb0(new bz20(this, i, (byte) 2));
        Boolean bool = Boolean.FALSE;
        this.u = xto.t(bool);
        this.v = xto.t(bool);
        this.w = s8p1.j();
        this.x = new x390();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.j.a(r7, r8, r0) == r5) goto L23;
     */
    @Override // p.ct41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.hfn0 r7, p.vu30 r8, p.lnm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.vtb0
            if (r0 == 0) goto L13
            r0 = r9
            p.vtb0 r0 = (p.vtb0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.vtb0 r0 = new p.vtb0
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
            goto L6a
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
            goto L5b
        L3c:
            p.hm5.M(r9)
            p.hrr0 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            p.ptb0 r1 = p.aub0.a
            if (r9 != r1) goto L5b
            r0.a = r7
            r9 = r8
            p.a8d1 r9 = (p.a8d1) r9
            r0.b = r9
            r0.e = r4
            p.qc9 r9 = r6.n
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.a = r2
            r0.b = r2
            r0.e = r3
            p.jns r6 = r6.j
            java.lang.Object r6 = r6.a(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xtb0.a(p.hfn0, p.vu30, p.lnm):java.lang.Object");
    }

    @Override // p.ct41
    public final boolean b() {
        return this.j.b();
    }

    @Override // p.ct41
    public final boolean c() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final boolean d() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i, int i2, lnm lnmVar) {
        ttb0 ttb0Var;
        if (lnmVar instanceof ttb0) {
            ttb0Var = (ttb0) lnmVar;
            int i3 = ttb0Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ttb0Var.c = i3 - Integer.MIN_VALUE;
            } else {
                ttb0Var = new ttb0(this, lnmVar);
            }
        } else {
            ttb0Var = new ttb0(this, lnmVar);
        }
        Object obj = ttb0Var.a;
        int i4 = ttb0Var.c;
        try {
            if (i4 == 0) {
                hm5.M(obj);
                this.i = true;
                utb0 utb0Var = new utb0(this, i, i2, (lnm) null);
                ttb0Var.c = 1;
                Object objA = a(hfn0.a, utb0Var, ttb0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i4 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            this.i = false;
            this = rih1.a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }

    public final void g(ptb0 ptb0Var, boolean z, boolean z2) {
        List list = ptb0Var.l;
        int i = ptb0Var.o;
        int i2 = ptb0Var.b;
        qtb0 qtb0Var = ptb0Var.a;
        this.q.e = list.size();
        x390 x390Var = this.x;
        i25 i25Var = this.e;
        if (!z && this.b) {
            this.c = ptb0Var;
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            try {
                if (x390Var.j() && qtb0Var != null && qtb0Var.a == ((err0) i25Var.b).s() && i2 == ((err0) i25Var.c).s()) {
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
        this.v.setValue(Boolean.valueOf(((qtb0Var != null ? qtb0Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(ptb0Var.c));
        this.h -= ptb0Var.d;
        this.f.setValue(ptb0Var);
        if (z2) {
            i25Var.getClass();
            if (i2 < 0.0f) {
                tf80.c("scrollOffset should be non-negative");
            }
            ((err0) i25Var.c).t(i2);
        } else {
            qtb0 qtb0Var2 = (qtb0) o7h.s0(list);
            qtb0 qtb0Var3 = (qtb0) o7h.C0(list);
            d55.k(qtb0Var2 != null ? qtb0Var2.a : -1L, "firstVisibleItem:index");
            d55.k(qtb0Var3 != null ? qtb0Var3.a : -1L, "lastVisibleItem:index");
            i25Var.getClass();
            i25Var.d = qtb0Var != null ? qtb0Var.l : null;
            if (i25Var.a || i > 0) {
                i25Var.a = true;
                if (i2 < 0.0f) {
                    tf80.c("scrollOffset should be non-negative");
                }
                i25Var.h(qtb0Var != null ? qtb0Var.a : 0, i2);
            }
            if (this.k) {
                l5s l5sVar = this.a;
                int i3 = l5sVar.a;
                boolean z3 = l5sVar.c;
                if (i3 != -1 && !list.isEmpty() && i3 != l5s.a(ptb0Var, z3)) {
                    l5sVar.a = -1;
                    ssb0 ssb0Var = l5sVar.b;
                    if (ssb0Var != null) {
                        ssb0Var.cancel();
                    }
                    l5sVar.b = null;
                }
                int i4 = l5sVar.d;
                if (i4 != -1 && l5sVar.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = l5s.a(ptb0Var, l5sVar.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        l5sVar.a = iA;
                        l5sVar.b = fey.f(this.r, iA);
                    }
                }
                l5sVar.d = i;
            }
        }
        if (z) {
            x390Var.B(ptb0Var.f, ptb0Var.i, ptb0Var.h);
        }
    }

    public final ptb0 h() {
        return (ptb0) this.f.getValue();
    }

    public final void i(float f, ptb0 ptb0Var) {
        ssb0 ssb0Var;
        ssb0 ssb0Var2;
        if (this.k) {
            l5s l5sVar = this.a;
            l5sVar.getClass();
            if (!ptb0Var.l.isEmpty()) {
                boolean z = f < 0.0f;
                int iA = l5s.a(ptb0Var, z);
                if (iA >= 0 && iA < ptb0Var.o) {
                    if (iA != l5sVar.a) {
                        if (l5sVar.c != z) {
                            l5sVar.a = -1;
                            ssb0 ssb0Var3 = l5sVar.b;
                            if (ssb0Var3 != null) {
                                ssb0Var3.cancel();
                            }
                            l5sVar.b = null;
                        }
                        l5sVar.c = z;
                        l5sVar.a = iA;
                        l5sVar.b = fey.f(this.r, iA);
                    }
                    List list = ptb0Var.l;
                    if (z) {
                        qtb0 qtb0Var = (qtb0) o7h.A0(list);
                        if (((qtb0Var.f102p + qtb0Var.q) + ptb0Var.s) - ptb0Var.n < (-f) && (ssb0Var2 = l5sVar.b) != null) {
                            ssb0Var2.a();
                        }
                    } else if (ptb0Var.m - ((qtb0) o7h.q0(list)).f102p < f && (ssb0Var = l5sVar.b) != null) {
                        ssb0Var.a();
                    }
                }
            }
            l5sVar.e = f;
        }
    }

    public final void j(int i, int i2) {
        if (this.j.b()) {
            c921.y(((ptb0) this.f.getValue()).h, (o8n) null, 0, new pw1(this, (lnm) null, (byte) 3), 3);
        }
        l(i, i2, false);
    }

    public final Object k(int i, int i2, lnm lnmVar) {
        Object objA = a(hfn0.a, new wtb0(this, i, i2, (lnm) null), lnmVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    public final void l(int i, int i2, boolean z) {
        i25 i25Var = this.e;
        if (((err0) i25Var.b).s() != i || ((err0) i25Var.c).s() != i2) {
            bsb0 bsb0Var = this.o;
            bsb0Var.e();
            bsb0Var.b = null;
            bsb0Var.c = -1;
        }
        i25Var.h(i, i2);
        i25Var.d = null;
        if (!z) {
            s8p1.r(this.t);
            return;
        }
        hmb0 hmb0Var = this.l;
        if (hmb0Var != null) {
            hmb0Var.l();
        }
    }
}
