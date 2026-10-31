package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jkr0 implements ct41 {
    public final qsb0 A;
    public final ven0 B;
    public final ven0 C;
    public final hrr0 D;
    public final hrr0 E;
    public final hrr0 F;
    public final hrr0 G;
    public boolean a;
    public xjr0 b;
    public final hrr0 c;
    public final kl1 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final jns k;
    public final boolean l;
    public final hrr0 m;
    public wat n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jdn0 f55p;
    public final err0 q;
    public final err0 r;
    public final mdt s;
    public final mdt t;
    public final tsb0 u;
    public final ijr0 v;
    public final laz w;
    public final qc9 x;
    public final hrr0 y;
    public final hkr0 z;

    public jkr0(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            tf80.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = xto.t(new Offset(0L));
        this.d = new kl1(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = grn1.i(new ekr0(this, (byte) 0));
        this.l = true;
        this.m = xto.s(lkr0.b, f331.X0);
        this.n = lkr0.a;
        this.f55p = zr7.d();
        this.q = apo.q(-1);
        this.r = apo.q(i);
        this.s = xto.m(new lsb0(this, (byte) 2));
        this.t = xto.m(new lsb0(this, (byte) 3));
        tsb0 tsb0Var = new tsb0(new ekr0(this, (byte) 1));
        this.u = tsb0Var;
        this.v = new ijr0(new l1p0(this, (byte) 10), tsb0Var, new lsb0(this, (byte) 4));
        this.w = new laz();
        this.x = new qc9();
        this.y = xto.t((Object) null);
        this.z = new hkr0(this);
        jjl.b(0, 0, 0, 0, 15);
        this.A = new qsb0();
        this.B = s8p1.j();
        this.C = s8p1.j();
        Boolean bool = Boolean.FALSE;
        this.D = xto.t(bool);
        this.E = xto.t(bool);
        this.F = xto.t(bool);
        this.G = xto.t(bool);
    }

    public static /* synthetic */ Object g(jkr0 jkr0Var, int i, n8b1 n8b1Var, lnm lnmVar, int i2) {
        if ((i2 & 4) != 0) {
            n8b1Var = irn1.l0(0.0f, 0.0f, (Object) null, 7);
        }
        return jkr0Var.f(i, n8b1Var, lnmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r9.a(r7, r8, r0) == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object r(p.jkr0 r6, p.hfn0 r7, p.vu30 r8, p.lnm r9) {
        /*
            boolean r0 = r9 instanceof p.ikr0
            if (r0 == 0) goto L13
            r0 = r9
            p.ikr0 r0 = (p.ikr0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.ikr0 r0 = new p.ikr0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.jkr0 r6 = r0.a
            p.hm5.M(r9)
            goto L79
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L33:
            p.a8d1 r6 = r0.c
            r8 = r6
            p.vu30 r8 = (p.vu30) r8
            p.hfn0 r7 = r0.b
            p.jkr0 r6 = r0.a
            p.hm5.M(r9)
            goto L55
        L40:
            p.hm5.M(r9)
            r0.a = r6
            r0.b = r7
            r9 = r8
            p.a8d1 r9 = (p.a8d1) r9
            r0.c = r9
            r0.f = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L55
            goto L78
        L55:
            p.jns r9 = r6.k
            boolean r9 = r9.b()
            if (r9 != 0) goto L68
            p.kl1 r9 = r6.d
            int r9 = r9.p()
            p.err0 r1 = r6.r
            r1.t(r9)
        L68:
            p.jns r9 = r6.k
            r0.a = r6
            r0.b = r2
            r0.c = r2
            r0.f = r3
            java.lang.Object r7 = r9.a(r7, r8, r0)
            if (r7 != r5) goto L79
        L78:
            return r5
        L79:
            r7 = -1
            p.err0 r6 = r6.q
            r6.t(r7)
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jkr0.r(p.jkr0, p.hfn0, p.vu30, p.lnm):java.lang.Object");
    }

    public static Object s(jkr0 jkr0Var, int i, a8d1 a8d1Var) {
        jkr0Var.getClass();
        Object objA = jkr0Var.a(hfn0.a, new i27(jkr0Var, i, (lnm) null, (byte) 1), a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }

    @Override // p.ct41
    public final Object a(hfn0 hfn0Var, vu30 vu30Var, lnm lnmVar) {
        return r(this, hfn0Var, vu30Var, lnmVar);
    }

    @Override // p.ct41
    public final boolean b() {
        return this.k.b();
    }

    @Override // p.ct41
    public final boolean c() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final boolean d() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(int i, fe5 fe5Var, lnm lnmVar) {
        fkr0 fkr0Var;
        int i2;
        fe5 fe5Var2;
        if (lnmVar instanceof fkr0) {
            fkr0Var = (fkr0) lnmVar;
            int i3 = fkr0Var.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fkr0Var.e = i3 - Integer.MIN_VALUE;
            } else {
                fkr0Var = new fkr0(this, lnmVar);
            }
        } else {
            fkr0Var = new fkr0(this, lnmVar);
        }
        fkr0 fkr0Var2 = fkr0Var;
        Object obj = fkr0Var2.c;
        int i4 = fkr0Var2.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i4 == 0) {
            hm5.M(obj);
            kl1 kl1Var = this.d;
            if ((i != kl1Var.p() || kl1Var.q() != 0.0f) && l() != 0) {
                fkr0Var2.b = fe5Var;
                fkr0Var2.a = i;
                fkr0Var2.e = 1;
                if (i(fkr0Var2) != d9nVar) {
                    i2 = i;
                    fe5Var2 = fe5Var;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = fkr0Var2.a;
        fe5 fe5Var3 = fkr0Var2.b;
        hm5.M(obj);
        fe5Var2 = fe5Var3;
        gkr0 gkr0Var = new gkr0(this, j(i2), n() * 0.0f, fe5Var2, (lnm) null);
        fkr0Var2.b = null;
        fkr0Var2.e = 2;
        return a(hfn0.a, gkr0Var, fkr0Var2) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0281  */
    /* JADX WARN: Code duplicated, block: B:112:0x0284  */
    /* JADX WARN: Code duplicated, block: B:119:0x0297  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:135:0x02dd A[Catch: all -> 0x0324, TryCatch #0 {all -> 0x0324, blocks: (B:127:0x02bb, B:130:0x02c4, B:133:0x02d1, B:135:0x02dd, B:143:0x0313, B:141:0x030d, B:138:0x02f5), top: B:159:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02f5 A[Catch: all -> 0x0324, TryCatch #0 {all -> 0x0324, blocks: (B:127:0x02bb, B:130:0x02c4, B:133:0x02d1, B:135:0x02dd, B:143:0x0313, B:141:0x030d, B:138:0x02f5), top: B:159:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:140:0x030c  */
    /* JADX WARN: Code duplicated, block: B:141:0x030d A[Catch: all -> 0x0324, TryCatch #0 {all -> 0x0324, blocks: (B:127:0x02bb, B:130:0x02c4, B:133:0x02d1, B:135:0x02dd, B:143:0x0313, B:141:0x030d, B:138:0x02f5), top: B:159:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0339  */
    /* JADX WARN: Code duplicated, block: B:151:0x0340  */
    /* JADX WARN: Code duplicated, block: B:154:0x035d  */
    /* JADX WARN: Code duplicated, block: B:159:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0 A[LOOP:1: B:85:0x01ee->B:86:0x01f0, LOOP_END] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(xjr0 xjr0Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        rzo0 rzo0Var;
        int i;
        Object obj;
        rzo0 rzo0Var2;
        boolean z5;
        gtc gtcVar;
        List list;
        int size;
        int i2;
        int i3;
        jv91 jv91VarO;
        iu30 iu30VarE;
        float f;
        long jG;
        long jP;
        long j;
        List list2 = xjr0Var.a;
        int i4 = xjr0Var.l;
        mfh0 mfh0Var = xjr0Var.i;
        this.u.e = list2.size();
        int i5 = xjr0Var.b;
        this.o = xjr0Var.c + i5;
        if (!z && this.a) {
            this.b = xjr0Var;
            return;
        }
        boolean z6 = true;
        if (z) {
            this.a = true;
        }
        ijr0 ijr0Var = this.v;
        boolean z7 = this.l;
        kl1 kl1Var = this.d;
        if (!z2) {
            kl1Var.G(xjr0Var);
            if (z7) {
                z3 = z7;
                rzo0 rzo0Var3 = ijr0Var.o;
                rzo0Var3.H(xjr0Var);
                rzo0Var3.I(ijr0Var.n);
                fdn0 fdn0Var = ijr0Var.e;
                l1p0 l1p0Var = ijr0Var.a;
                int i6 = ijr0Var.g;
                float f2 = 0.0f;
                int i7 = -1;
                if (i6 != -1 && i6 != rzo0Var3.z()) {
                    ijr0Var.l = true;
                    if (rzo0Var3.r()) {
                        int i8 = ijr0Var.h;
                        if (i8 < 0) {
                            i8 = 0;
                        }
                        ijr0Var.h = i8;
                        int iZ = rzo0Var3.u().a.isEmpty() ? -1 : rzo0Var3.z() - 1;
                        if (iZ != -1) {
                            int i9 = ijr0Var.i;
                            if (i9 <= iZ) {
                                iZ = i9;
                            }
                            ijr0Var.i = iZ;
                        }
                        if (ijr0Var.f <= 0.0f) {
                            ijr0Var.f(rzo0Var3.s(), ijr0Var.m - 1);
                        } else {
                            ijr0Var.f(0, rzo0Var3.q());
                        }
                    }
                }
                ijr0Var.m = rzo0Var3.z();
                if (rzo0Var3.r()) {
                    int size2 = rzo0Var3.u().r.size() + rzo0Var3.u().a.size() + rzo0Var3.u().q.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        float f3 = f2;
                        int size3 = rzo0Var3.u().q.size();
                        int size4 = rzo0Var3.u().a.size();
                        if (i10 < size3) {
                            i = ((mfh0) rzo0Var3.u().q.get(i10)).a;
                        } else if (i10 < size3 || i10 >= size3 + size4) {
                            i = i10 >= size3 + size4 ? ((mfh0) rzo0Var3.u().r.get((i10 - size3) - size4)).a : i7;
                        } else {
                            i = ((mfh0) rzo0Var3.u().a.get(i10 - size3)).a;
                        }
                        int size5 = rzo0Var3.u().q.size();
                        int size6 = rzo0Var3.u().a.size();
                        if (i10 < size5) {
                            obj = ((mfh0) rzo0Var3.u().q.get(i10)).d;
                        } else if (i10 < size5 || i10 >= size5 + size6) {
                            obj = i10 >= size5 + size6 ? ((mfh0) rzo0Var3.u().r.get((i10 - size5) - size6)).d : gtc.c;
                        } else {
                            obj = ((mfh0) rzo0Var3.u().a.get(i10 - size5)).d;
                        }
                        int i11 = rzo0Var3.u().b;
                        if (i != -1) {
                            if (fdn0Var.a(i)) {
                                Object objB = fdn0Var.b(i);
                                objB.getClass();
                                int i12 = ((gtc) objB).b;
                                Object objB2 = fdn0Var.b(i);
                                objB2.getClass();
                                rzo0Var2 = rzo0Var3;
                                Object obj2 = ((gtc) objB2).a;
                                if (i12 != i11 || !u890.j(obj2, obj)) {
                                    z5 = true;
                                    ijr0Var.l = true;
                                }
                                gtcVar = (gtc) fdn0Var.b(i);
                                if (gtcVar != null) {
                                    gtcVar.b = i11;
                                    gtcVar.a = obj;
                                } else {
                                    gtcVar = new gtc();
                                    gtcVar.a = obj;
                                    gtcVar.b = i11;
                                }
                                fdn0Var.i(i, gtcVar);
                                ijr0Var.h = Math.min(ijr0Var.h, i);
                                ijr0Var.i = Math.max(ijr0Var.i, i);
                                list = (List) ijr0Var.b.g(i);
                                if (list != null) {
                                    size = list.size();
                                    for (i2 = 0; i2 < size; i2++) {
                                        ((ssb0) list.get(i2)).cancel();
                                    }
                                }
                            } else {
                                rzo0Var2 = rzo0Var3;
                            }
                            z5 = true;
                            gtcVar = (gtc) fdn0Var.b(i);
                            if (gtcVar != null) {
                                gtcVar.b = i11;
                                gtcVar.a = obj;
                            } else {
                                gtcVar = new gtc();
                                gtcVar.a = obj;
                                gtcVar.b = i11;
                            }
                            fdn0Var.i(i, gtcVar);
                            ijr0Var.h = Math.min(ijr0Var.h, i);
                            ijr0Var.i = Math.max(ijr0Var.i, i);
                            list = (List) ijr0Var.b.g(i);
                            if (list != null) {
                                size = list.size();
                                while (i2 < size) {
                                    ((ssb0) list.get(i2)).cancel();
                                }
                            }
                        } else {
                            rzo0Var2 = rzo0Var3;
                            z5 = true;
                        }
                        i10++;
                        f2 = f3;
                        z6 = z5;
                        rzo0Var3 = rzo0Var2;
                        i7 = -1;
                    }
                    rzo0Var = rzo0Var3;
                    float f4 = f2;
                    z4 = z6;
                    if (ijr0Var.l) {
                        boolean z8 = ijr0Var.f <= f4 ? z4 : false;
                        if (rzo0Var.r()) {
                            d1o1.j(rzo0Var.u());
                            ijr0Var.d(rzo0Var, rzo0Var.q(), rzo0Var.s(), rzo0Var.u().t != null ? ((jkr0) l1p0Var.b).o : 0, rzo0Var.v(), rzo0Var.w(), 0.0f, z8);
                        }
                        ijr0Var.l = false;
                    } else {
                        z4 = z4;
                        z3 = z3;
                    }
                } else {
                    z4 = true;
                    rzo0Var = rzo0Var3;
                    z3 = z3;
                    ijr0Var.g();
                }
                ijr0Var.g = rzo0Var.z();
            }
            this.m.setValue(xjr0Var);
            this.D.setValue(Boolean.valueOf(xjr0Var.m));
            if (mfh0Var != null) {
                i3 = mfh0Var.a;
            } else {
                i3 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                z4 = false;
            }
            this.E.setValue(Boolean.valueOf(z4));
            if (mfh0Var != null) {
                this.e = mfh0Var.a;
            }
            this.f = i4;
            jv91VarO = ekb.o();
            if (jv91VarO != null) {
                iu30VarE = jv91VarO.e();
            } else {
                iu30VarE = null;
            }
            jv91 jv91VarU = ekb.u(jv91VarO);
            if (z3) {
                try {
                    if (xjr0Var.h < l() && Math.abs(this.j) > 0.5f) {
                        f = this.j;
                        if (k().e == qqq0.a) {
                            if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (p() & 4294967295L)))) {
                                if (q()) {
                                }
                            }
                        } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (p() >> 32)))) {
                            if (q()) {
                            }
                        }
                        float f5 = this.j;
                        rzo0 rzo0Var4 = ijr0Var.o;
                        rzo0Var4.H(xjr0Var);
                        rzo0Var4.I(ijr0Var.n);
                        ijr0Var.e(rzo0Var4, -f5);
                    }
                } catch (Throwable th) {
                    ekb.C(jv91VarO, jv91VarU, iu30VarE);
                    throw th;
                }
            }
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            this.g = lkr0.a(xjr0Var, l());
            l();
            if (xjr0Var.e == qqq0.b) {
                jG = xjr0Var.g() >> 32;
            } else {
                jG = xjr0Var.g() & 4294967295L;
            }
            int i13 = (int) jG;
            jP = yoi1.p(xjr0Var.n.a(i13, i5, -xjr0Var.f, xjr0Var.d), 0, i13);
            j = this.g;
            if (jP > j) {
                jP = j;
            }
            this.h = jP;
        }
        kl1Var.E(xjr0Var.k);
        z4 = true;
        z3 = z7;
        this.m.setValue(xjr0Var);
        this.D.setValue(Boolean.valueOf(xjr0Var.m));
        if (mfh0Var != null) {
            i3 = mfh0Var.a;
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            z4 = false;
        }
        this.E.setValue(Boolean.valueOf(z4));
        if (mfh0Var != null) {
            this.e = mfh0Var.a;
        }
        this.f = i4;
        jv91VarO = ekb.o();
        if (jv91VarO != null) {
            iu30VarE = jv91VarO.e();
        } else {
            iu30VarE = null;
        }
        jv91 jv91VarU2 = ekb.u(jv91VarO);
        if (z3) {
            if (xjr0Var.h < l()) {
                f = this.j;
                if (k().e == qqq0.a) {
                    if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (p() & 4294967295L)))) {
                        if (q()) {
                        }
                    }
                } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (p() >> 32)))) {
                    if (q()) {
                    }
                }
                float f6 = this.j;
                rzo0 rzo0Var5 = ijr0Var.o;
                rzo0Var5.H(xjr0Var);
                rzo0Var5.I(ijr0Var.n);
                ijr0Var.e(rzo0Var5, -f6);
            }
        }
        ekb.C(jv91VarO, jv91VarU2, iu30VarE);
        this.g = lkr0.a(xjr0Var, l());
        l();
        if (xjr0Var.e == qqq0.b) {
            jG = xjr0Var.g() >> 32;
        } else {
            jG = xjr0Var.g() & 4294967295L;
        }
        int i14 = (int) jG;
        jP = yoi1.p(xjr0Var.n.a(i14, i5, -xjr0Var.f, xjr0Var.d), 0, i14);
        j = this.g;
        if (jP > j) {
            jP = j;
        }
        this.h = jP;
    }

    public final Object i(onm onmVar) {
        Object objC;
        return (this.m.getValue() == lkr0.b && (objC = this.x.c(onmVar)) == d9n.a) ? objC : rih1.a;
    }

    public final int j(int i) {
        if (l() > 0) {
            return yoi1.p(i, 0, l() - 1);
        }
        return 0;
    }

    public final xjr0 k() {
        return (xjr0) this.m.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((xjr0) this.m.getValue()).b;
    }

    public final int n() {
        return ((xjr0) this.m.getValue()).c + m();
    }

    public final int o() {
        return ((Number) this.s.getValue()).intValue();
    }

    public final long p() {
        return ((Offset) this.c.getValue()).a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final void t(float f, int i, boolean z) {
        kl1 kl1Var = this.d;
        if (kl1Var.p() != i || kl1Var.q() != f) {
            this.v.g();
        }
        kl1Var.y(f, i);
        if (!z) {
            s8p1.r(this.C);
            return;
        }
        hmb0 hmb0Var = (hmb0) this.y.getValue();
        if (hmb0Var != null) {
            hmb0Var.l();
        }
    }
}
