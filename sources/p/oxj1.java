package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oxj1 extends f311 {
    public final ejj1 a;
    public final qxj1 b;
    public final rxj1 c;
    public final long d;
    public final iec e;
    public final boolean f;
    public final String g;
    public final String h;
    public final qk41 i;

    public oxj1(int i, ejj1 ejj1Var, qxj1 qxj1Var, rxj1 rxj1Var, long j, iec iecVar, boolean z, String str, String str2) {
        this.a = ejj1Var;
        this.b = qxj1Var;
        this.c = rxj1Var;
        this.d = j;
        this.e = iecVar;
        this.f = z;
        this.g = str;
        this.h = str2;
        this.i = i > 0 ? new ok41(i) : nk41.a;
    }

    @Override // p.qj41
    public final Object b(ak41 ak41Var) {
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a.f, new lxj1(this, null, (byte) 2), ak41Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    @Override // p.qj41
    public final Object c(zj41 zj41Var) {
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a.f, new lxj1(this, null, (byte) 1), zj41Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        i2c i2cVar2;
        Object zg6Var;
        tob1 tob1Var;
        int i3;
        char c;
        tob1 tob1Var2;
        Object df6Var;
        lnm lnmVar;
        int i4;
        int i5;
        boolean z;
        oxj1 oxj1Var;
        tob1 tob1Var3;
        Object mxj1Var;
        lnm lnmVar2;
        tob1 tob1Var4;
        boolean z2;
        boolean z3;
        boolean z4;
        rk41 rk41Var2;
        oxj1 oxj1Var2;
        String str;
        rk41 rk41Var3 = rk41Var;
        Object obj = rk41Var3.c;
        boolean z5 = rk41Var3.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1468521960);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(rk41Var3) : b0kVar3.i(rk41Var3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mr20 mr20Var = this.a.h;
            if (mr20Var == null) {
                eg.m("VideoController is not initialized");
                return;
            }
            b0kVar2 = b0kVar3;
            tob1 tob1VarG = rwq.g(mr20Var, zij1.a, (o8n) null, b0kVar2, 48, 2);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p3d1.m(0L, b0kVar2);
            }
            frr0 frr0Var = (frr0) objT;
            cjj1 cjj1Var = (cjj1) tob1VarG.getValue();
            boolean z6 = !(cjj1Var instanceof yij1) && (!u890.j(cjj1Var, xij1.a) ? !(!(cjj1Var instanceof bjj1) || ((bjj1) cjj1Var).a > 0) : frr0Var.s() == 0);
            boolean zBooleanValue = ((Boolean) h7w.y(b0kVar2).getValue()).booleanValue();
            boolean z7 = z6 && zBooleanValue && (str = this.h) != null && str.length() != 0;
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT2);
            }
            tob1 tob1Var5 = (ven0) objT2;
            Object objT3 = b0kVar2.T();
            if (objT3 == m4cVar) {
                objT3 = pzm.i(b0kVar2);
            }
            lz20 lz20Var = (lz20) objT3;
            boolean zI = b0kVar2.i(this);
            Object objT4 = b0kVar2.T();
            lnm lnmVar3 = null;
            if (zI || objT4 == m4cVar) {
                objT4 = new lxj1(this, lnmVar3, (byte) 0);
                b0kVar2.s0(objT4);
            }
            qxd0.t(rih1.a, b0kVar2, (vu30) objT4);
            Boolean boolValueOf = Boolean.valueOf(rk41Var3.b);
            int i6 = i2 & 112;
            boolean zI2 = (i6 == 32 || ((i2 & 64) != 0 && b0kVar2.i(rk41Var3))) | b0kVar2.i(this);
            int i7 = i2;
            Object objT5 = b0kVar2.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new t6j1(rk41Var3, this, (lnm) null, (byte) 5);
                b0kVar2.s0(objT5);
            }
            qxd0.t(boolValueOf, b0kVar2, (vu30) objT5);
            Object objT6 = b0kVar2.T();
            boolean z8 = this.f;
            if (objT6 == m4cVar) {
                objT6 = c13.l(!z8, b0kVar2);
            }
            tob1 tob1Var6 = (ven0) objT6;
            boolean zH = b0kVar2.h(z7) | (i6 == 32 || ((i7 & 64) != 0 && b0kVar2.i(rk41Var3)));
            Object objT7 = b0kVar2.T();
            if (zH || objT7 == m4cVar) {
                tob1Var = tob1Var6;
                i3 = i6;
                c = 256;
                zg6Var = new zg6(z7, rk41Var3, tob1Var, tob1Var5, (byte) 11);
                tob1Var2 = tob1Var5;
                b0kVar2.s0(zg6Var);
            } else {
                tob1Var2 = tob1Var5;
                tob1Var = tob1Var6;
                zg6Var = objT7;
                c = 256;
                i3 = i6;
            }
            Function0 function1 = (Function0) zg6Var;
            cjj1 cjj1Var2 = (cjj1) tob1VarG.getValue();
            boolean zI3 = (i3 == 32 || ((i7 & 64) != 0 && b0kVar2.i(rk41Var3))) | b0kVar2.i(this) | b0kVar2.g(tob1VarG) | ((i7 & 896) == c);
            Object objT8 = b0kVar2.T();
            if (zI3 || objT8 == m4cVar) {
                lnmVar = null;
                i4 = i3;
                i5 = 32;
                tob1 tob1Var7 = tob1Var;
                z = z7;
                df6Var = new df6(this, function0, rk41Var3, (ven0) tob1VarG, (ven0) tob1Var7, frr0Var, (lnm) null);
                oxj1Var = this;
                tob1Var3 = tob1VarG;
                tob1Var = tob1Var7;
                b0kVar2.s0(df6Var);
            } else {
                boolean z9 = z7;
                oxj1Var = this;
                df6Var = objT8;
                tob1Var3 = tob1VarG;
                z = z9;
                lnmVar = null;
                i4 = i3;
                i5 = 32;
            }
            qxd0.t(cjj1Var2, b0kVar2, (vu30) df6Var);
            Boolean boolValueOf2 = Boolean.valueOf(z5);
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.booleanValue();
            boolean zI4 = (i4 == i5 || ((i7 & 64) != 0 && b0kVar2.i(rk41Var3))) | b0kVar2.i(oxj1Var);
            Object objT9 = b0kVar2.T();
            if (zI4 || objT9 == m4cVar) {
                tob1 tob1Var8 = tob1Var;
                lnmVar2 = lnmVar;
                mxj1Var = new mxj1(rk41Var3, oxj1Var, tob1Var8, lnmVar2, (byte) 0);
                rk41Var3 = rk41Var3;
                tob1Var4 = tob1Var8;
                b0kVar2.s0(mxj1Var);
            } else {
                mxj1Var = objT9;
                tob1Var4 = tob1Var;
                lnmVar2 = lnmVar;
            }
            qxd0.s(boolValueOf2, bool, (vu30) mxj1Var, b0kVar2);
            Boolean bool2 = (Boolean) tob1Var4.getValue();
            bool2.getClass();
            boolean z10 = i4 == i5 || ((i7 & 64) != 0 && b0kVar2.i(rk41Var3));
            Object objT10 = b0kVar2.T();
            if (z10 || objT10 == m4cVar) {
                z2 = true;
                objT10 = new hbf1(rk41Var3, tob1Var4, lnmVar2, (byte) 1);
                b0kVar2.s0(objT10);
            } else {
                z2 = true;
            }
            qxd0.t(bool2, b0kVar2, (vu30) objT10);
            if (z) {
                b0kVar2.i0(-196934339);
                Object objT11 = b0kVar2.T();
                if (objT11 == m4cVar) {
                    objT11 = v8r.q(Boolean.FALSE);
                    b0kVar2.s0(objT11);
                }
                ven0 ven0Var = (ven0) objT11;
                qim0 qim0VarP = vby0.p(u291.d(nim0.a, 1.0f), lz20Var);
                Object objT12 = b0kVar2.T();
                if (objT12 == m4cVar) {
                    objT12 = new i2g1(ven0Var, (byte) 13);
                    b0kVar2.s0(objT12);
                }
                qim0 qim0VarThen = cev0.G(qim0VarP, (iu30) objT12).then(c030.a);
                boolean zI5 = b0kVar2.i(oxj1Var);
                Object objT13 = b0kVar2.T();
                if (zI5 || objT13 == m4cVar) {
                    objT13 = new hij1(oxj1Var, ven0Var, (byte) 6);
                    b0kVar2.s0(objT13);
                }
                z3 = false;
                t1c.a(s161.b(qim0VarThen, false, (iu30) objT13), b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                z3 = false;
                b0kVar2.i0(-196552822);
                b0kVar2.r(false);
            }
            Boolean bool3 = (Boolean) tob1Var2.getValue();
            bool3.booleanValue();
            boolean zH2 = b0kVar2.h(z) | ((i4 == i5 || ((i7 & 64) != 0 && b0kVar2.i(rk41Var3))) ? z2 : z3);
            Object objT14 = b0kVar2.T();
            if (zH2 || objT14 == m4cVar) {
                rk41 rk41Var4 = rk41Var3;
                z4 = z3;
                vxg1 vxg1Var = new vxg1(z, rk41Var4, (lz20) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0367: CONSTRUCTOR (r0v17 'vxg1Var' p.vxg1) = 
                      (r12v5 'z' boolean)
                      (r2v11 'rk41Var4' p.rk41)
                      (wrap p.lz20:?: CAST (p.lz20) (r21v0 ?? I:p.lz20))
                      (wrap p.ven0:?: CAST (p.ven0) (r20v1 'tob1Var2' p.tob1))
                      (wrap p.lnm:?: CAST (p.lnm) (null p.lnm))
                     A[DECLARE_VAR, MD:(boolean, p.rk41, p.lz20, p.ven0, p.lnm):void (m)] (LINE:872) call: p.vxg1.<init>(boolean, p.rk41, p.lz20, p.ven0, p.lnm):void type: CONSTRUCTOR in method: p.oxj1.d(p.i2c, p.rk41, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1213
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.oxj1.d(p.i2c, p.rk41, kotlin.jvm.functions.Function0, p.b0k, int):void");
            }

            public final void e(boolean z, boolean z2, b0k b0kVar, int i) {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-88609589);
                if ((i & 6) == 0) {
                    i2 = (x340Var.h(z) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.h(z2) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(this) ? 256 : 128;
                }
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    w2g0.c(dug.f(u291.d(nim0.a, 1.0f), this.d, d4o1.a), (tl3) null, apo.r(-359579231, new mk6(this, z, z2, (byte) 1), x340Var), x340Var, 3072, 6);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new au2(this, z, z2, i);
                }
            }

            public final void f(i2c i2cVar, ycl1 ycl1Var, b0k b0kVar, int i) {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-250988317);
                if ((i & 6) == 0) {
                    i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= (i & 64) == 0 ? x340Var.g(ycl1Var) : x340Var.i(ycl1Var) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(this) ? 256 : 128;
                }
                boolean z = false;
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    wrx wrxVar = wrx.c;
                    jsl jslVar = new jsl("Retry");
                    qim0 qim0VarR = u291.r(i2cVar.a(nim0.a, een.h), 64.0f);
                    boolean zI = x340Var.i(this);
                    if ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(ycl1Var))) {
                        z = true;
                    }
                    boolean z2 = zI | z;
                    Object objT = x340Var.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new mah1(this, ycl1Var, (byte) 29);
                        x340Var.s0(objT);
                    }
                    w0h1.a(wrxVar, jslVar, bin.x(qim0VarR, false, "Retry", (pm31) null, (idn0) null, (Function0) objT, 13), 0L, 0L, false, x340Var, wrx.d, 56);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ixi1(this, i2cVar, ycl1Var, i, (byte) 10);
                }
            }

            public final void g(boolean z, Function0 function0, boolean z2, boolean z3, b0k b0kVar, int i) {
                int i2;
                boolean z4;
                Object oy3Var;
                Throwable th;
                m4c m4cVar;
                lz20 lz20Var;
                qim0 qim0VarD;
                boolean z5;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(940790920);
                if ((i & 6) == 0) {
                    i2 = (x340Var.h(z) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(function0) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.h(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    z4 = z3;
                    i2 |= x340Var.h(z4) ? 2048 : 1024;
                } else {
                    z4 = z3;
                }
                if ((i & 24576) == 0) {
                    i2 |= x340Var.i(this) ? 16384 : 8192;
                }
                int i3 = i2;
                if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                    Object objT = x340Var.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT == m4cVar2) {
                        objT = pzm.i(x340Var);
                    }
                    lz20 lz20Var2 = (lz20) objT;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                    boolean z6 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
                    Object objT2 = x340Var.T();
                    if (z6 || objT2 == m4cVar2) {
                        th = null;
                        m4cVar = m4cVar2;
                        boolean z7 = z4;
                        lz20Var = lz20Var2;
                        oy3Var = new oy3(z, z7, lz20Var, (lnm) null, (byte) 21);
                        x340Var.s0(oy3Var);
                    } else {
                        lz20Var = lz20Var2;
                        oy3Var = objT2;
                        th = null;
                        m4cVar = m4cVar2;
                    }
                    qxd0.s(boolValueOf, boolValueOf2, (vu30) oy3Var, x340Var);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
                        tgp1.p();
                        throw th;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    if (z2) {
                        x340Var.i0(-1478070375);
                        qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                        Object objT3 = x340Var.T();
                        if (objT3 == m4cVar) {
                            objT3 = fsj1.d1;
                            x340Var.s0(objT3);
                        }
                        qim0VarD = s161.a(qim0VarD2, (iu30) objT3);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1478068849);
                        x340Var.r(false);
                        qim0VarD = u291.d(nim0Var, 1.0f);
                    }
                    qim0 qim0Var = qim0VarD;
                    boolean zI = x340Var.i(this);
                    Object objT4 = x340Var.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new nxj1(this, (byte) 0);
                        x340Var.s0(objT4);
                    }
                    iu30 iu30Var = (iu30) objT4;
                    boolean zI2 = x340Var.i(this);
                    Object objT5 = x340Var.T();
                    if (zI2 || objT5 == m4cVar) {
                        z5 = true;
                        objT5 = new nxj1(this, (byte) 1);
                        x340Var.s0(objT5);
                    } else {
                        z5 = true;
                    }
                    iu30 iu30Var2 = (iu30) objT5;
                    boolean z8 = (i3 & 896) == 256 ? z5 : false;
                    Object objT6 = x340Var.T();
                    if (z8 || objT6 == m4cVar) {
                        objT6 = new aag1((byte) 2, z2);
                        x340Var.s0(objT6);
                    }
                    boolean z9 = z5;
                    dm5.b(iu30Var, qim0Var, (iu30) null, iu30Var2, (iu30) objT6, x340Var, 0, 4);
                    if (z) {
                        x340Var.i0(1424934762);
                        gfx.b(18, apo.r(2049581938, new pej1(lz20Var, function0, this, (byte) 5), x340Var), x340Var, 54);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1425663200);
                        x340Var.r(false);
                    }
                    x340Var.r(z9);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vre(this, z, function0, z2, z3, i);
                }
            }

            @Override // p.qj41
            public final qk41 getDuration() {
                return this.i;
            }
        }
