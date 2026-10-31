package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ey00 {
    public static final cr31 a = er31.b(16.0f);
    public static final cr31 b = er31.b(4.0f);

    public static final void a(String str, boolean z, String str2, boolean z2, idh1 idh1Var, jx00 jx00Var, int i, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, j2i j2iVar, qim0 qim0Var, String str3, String str4, String str5, String str6, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        idh1 idh1Var2;
        b0k b0kVar3;
        byte b2;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(407444821);
        int i3 = i2 | (b0kVar4.g(str) ? 4 : 2) | (b0kVar4.h(z) ? 32 : 16) | (b0kVar4.g(str2) ? 256 : 128) | (b0kVar4.h(z2) ? 2048 : 1024) | (b0kVar4.e(idh1Var.ordinal()) ? 16384 : 8192) | (b0kVar4.e(jx00Var.ordinal()) ? 131072 : 65536) | (b0kVar4.e(i == 0 ? -1 : l1d.C(i)) ? 1048576 : 524288) | (b0kVar4.i(function0) ? 8388608 : 4194304) | (b0kVar4.i(function1) ? 67108864 : 33554432) | (b0kVar4.i(function2) ? 536870912 : 268435456);
        int i4 = 384 | (b0kVar4.i(function3) ? 4 : 2) | (b0kVar4.i(function4) ? 32 : 16) | 3072 | (b0kVar4.g(str3) ? 16384 : 8192) | (b0kVar4.g(str4) ? 131072 : 65536) | (b0kVar4.g(str5) ? 1048576 : 524288) | (b0kVar4.g(str6) ? 8388608 : 4194304);
        if (b0kVar4.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            boolean z3 = ef.c(b0kVar4).a().compareTo(af.e) >= 0;
            String strK = zko1.k(z, str, str2, str6, str3, b0kVar4, 0);
            int i5 = i3 >> 12;
            int i6 = (i5 & 458752) | (i5 & 126) | ((i3 >> 3) & 896) | ((i4 << 6) & 7168) | ((i4 << 12) & 57344);
            m4c m4cVar = fkj0.X;
            String strO0 = cwl1.o0(b0kVar4, idh1Var == idh1.c ? 2131955856 : 2131955855);
            String strO1 = cwl1.o0(b0kVar4, jx00Var == jx00.c ? 2131955853 : 2131955854);
            String strO2 = cwl1.o0(b0kVar4, z2 ? 2131955852 : 2131955861);
            b0kVar4.i0(1896085190);
            smc0 smc0VarN = k4p1.n();
            if (idh1Var != idh1.a) {
                b0kVar4.i0(-315935652);
                boolean z4 = (((i6 & 7168) ^ 3072) > 2048 && b0kVar4.g(function4)) || (i6 & 3072) == 2048;
                Object objT = b0kVar4.T();
                if (z4 || objT == m4cVar) {
                    objT = new in00(function4, (byte) 10);
                    b0kVar4.s0(objT);
                }
                smc0VarN.add(new epo(strO0, (Function0) objT));
                b0kVar4.r(false);
            } else {
                b0kVar4.i0(-315799190);
                b0kVar4.r(false);
            }
            boolean z5 = (((i6 & 458752) ^ 196608) > 131072 && b0kVar4.g(function2)) || (i6 & 196608) == 131072;
            Object objT2 = b0kVar4.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new in00(function2, (byte) 11);
                b0kVar4.s0(objT2);
            }
            smc0VarN.add(new epo(strO2, (Function0) objT2));
            boolean z6 = (((i6 & 57344) ^ 24576) > 16384 && b0kVar4.g(function3)) || (i6 & 24576) == 16384;
            Object objT3 = b0kVar4.T();
            if (z6 || objT3 == m4cVar) {
                objT3 = new in00(function3, (byte) 12);
                b0kVar4.s0(objT3);
            }
            smc0VarN.add(new epo(strO1, (Function0) objT3));
            smc0 smc0VarK = k4p1.k(smc0VarN);
            b0kVar4.r(false);
            View view = (View) b0kVar4.k(AndroidCompositionLocals_androidKt.f);
            String strO3 = cwl1.o0(b0kVar4, 2131955858);
            String strO4 = cwl1.o0(b0kVar4, 2131955857);
            Object objT4 = b0kVar4.T();
            xu30 xu30VarR = null;
            if (objT4 == m4cVar) {
                objT4 = v8r.q((Object) null);
                b0kVar4.s0(objT4);
            }
            ven0 ven0Var = (ven0) objT4;
            boolean zI = ((i3 & 57344) == 16384) | b0kVar4.i(ven0Var) | b0kVar4.i(view) | b0kVar4.g(strO3) | b0kVar4.g(strO4);
            Object objT5 = b0kVar4.T();
            if (zI || objT5 == m4cVar) {
                idh1Var2 = idh1Var;
                b0kVar3 = b0kVar4;
                ur1 ur1Var = new ur1(idh1Var2, view, strO3, strO4, ven0Var, (lnm) null);
                b0kVar3.s0(ur1Var);
                objT5 = ur1Var;
            } else {
                b0kVar3 = b0kVar4;
                idh1Var2 = idh1Var;
            }
            qxd0.t(idh1Var2, b0kVar3, (vu30) objT5);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarZ);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            qim0 qim0VarN = anm1.N("extended-user-activity-row-test-tag", u291.f(qim0Var3, 1.0f));
            boolean zG = b0kVar3.g((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0351: ARITH (r2v35 'zG' boolean) = (wrap boolean:0x0349: INVOKE (r13v5 'b0kVar3' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r17v23 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED]) | (wrap boolean:0x034d: INVOKE (r13v5 'b0kVar3' p.b0k), (r7v5 'smc0VarK' p.smc0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DECLARE_VAR] in method: p.ey00.a(java.lang.String, boolean, java.lang.String, boolean, p.idh1, p.jx00, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.j2i, p.qim0, java.lang.String, java.lang.String, java.lang.String, java.lang.String, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes8.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v23 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.ey00.a(java.lang.String, boolean, java.lang.String, boolean, p.idh1, p.jx00, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.j2i, p.qim0, java.lang.String, java.lang.String, java.lang.String, java.lang.String, p.b0k, int):void");
        }

        /* JADX WARN: Code duplicated, block: B:102:0x019f  */
        /* JADX WARN: Code duplicated, block: B:105:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:108:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:110:0x01df  */
        /* JADX WARN: Code duplicated, block: B:112:0x0216  */
        /* JADX WARN: Code duplicated, block: B:114:0x021b  */
        /* JADX WARN: Code duplicated, block: B:117:0x0229  */
        /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:71:0x00d8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:72:0x00da  */
        /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:83:0x011d  */
        /* JADX WARN: Code duplicated, block: B:85:0x0128  */
        /* JADX WARN: Code duplicated, block: B:86:0x012c  */
        /* JADX WARN: Code duplicated, block: B:90:0x0158  */
        /* JADX WARN: Code duplicated, block: B:93:0x0164  */
        /* JADX WARN: Code duplicated, block: B:95:0x016a  */
        /* JADX WARN: Code duplicated, block: B:98:0x018a  */
        /* JADX WARN: Code duplicated, block: B:99:0x018e  */
        /* JADX WARN: Instruction removed from duplicated block: B:102:0x019f, please report this as an issue */
        public static final void b(boolean z, idh1 idh1Var, j2i j2iVar, Function0 function0, Function0 function1, Function0 function2, jx00 jx00Var, max maxVar, b0k b0kVar, int i, int i2) {
            int i3;
            int i4;
            max maxVar2;
            int i5;
            boolean z2;
            j2i j2iVar2;
            Function0 function3;
            Function0 function4;
            jx00 jx00Var2;
            h311 h311VarV;
            max maxVar3;
            boolean z3;
            nim0 nim0Var;
            fra fraVar;
            gex0 gex0Var;
            int i6;
            jw31 jw31VarA;
            int iHashCode;
            xos0 xos0VarM;
            qim0 qim0VarE;
            boolean z4;
            n4k n4kVar;
            boolean z5;
            float f;
            boolean z6;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-775572095);
            j06 j06Var = x340Var.a;
            if ((i & 6) == 0) {
                i3 = i | (x340Var.h(z) ? 4 : 2);
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= x340Var.e(idh1Var.ordinal()) ? 32 : 16;
            }
            int i7 = i3 | (x340Var.i(j2iVar) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192);
            if ((i & 196608) == 0) {
                i7 |= x340Var.i(function2) ? 131072 : 65536;
            }
            int i8 = i2 & 64;
            if (i8 != 0) {
                i4 = 1572864;
            } else {
                i4 = x340Var.e(jx00Var == null ? -1 : jx00Var.ordinal()) ? 1048576 : 524288;
            }
            int i9 = i7 | i4;
            if ((i2 & 128) == 0) {
                maxVar2 = maxVar;
                int i10 = x340Var.i(maxVar2) ? 8388608 : 4194304;
                i5 = i9 | i10;
                if ((4793491 & i5) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i5 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i8 != 0) {
                            jx00Var2 = jx00.a;
                        } else {
                            jx00Var2 = jx00Var;
                        }
                        if ((i2 & 128) != 0) {
                            i5 &= -29360129;
                            maxVar2 = jax.a;
                        }
                    } else {
                        x340Var.b0();
                        if ((i2 & 128) != 0) {
                            i5 &= -29360129;
                        }
                        jx00Var2 = jx00Var;
                    }
                    maxVar3 = maxVar2;
                    x340Var.s();
                    if (idh1Var != idh1.a) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    fraVar = een.N0;
                    gex0Var = h36.a;
                    i6 = i5;
                    jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarF);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z4 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z4) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z5 = z3;
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    wnb0 wnb0Var = new wnb0(f, true);
                    jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA2, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    if (z5) {
                        x340Var.i0(-656684923);
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        int i11 = i6 >> 12;
                        z6 = true;
                        g(idh1Var, function2, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), maxVar3, x340Var, ((i6 >> 3) & 14) | (i11 & 112) | (i11 & 7168));
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        ab80.p(nim0Var, 12.0f, x340Var, false);
                    } else {
                        z6 = true;
                        x340Var.i0(-656419687);
                        x340Var.r(false);
                    }
                    int i12 = i6 >> 6;
                    int i13 = (i6 >> 15) & 896;
                    function4 = function0;
                    h(z, function4, maxVar3, x340Var, (i6 & 14) | (i12 & 112) | i13);
                    int i14 = i12 & 14;
                    j2iVar2 = j2iVar;
                    dv20.l(i14, j2iVar2, x340Var, z6);
                    int i15 = ((i6 >> 18) & 14) | ((i6 >> 9) & 112) | i13;
                    function3 = function1;
                    e(jx00Var2, function3, maxVar3, x340Var, i15);
                    x340Var.r(z6);
                    maxVar2 = maxVar3;
                } else {
                    j2iVar2 = j2iVar;
                    function3 = function1;
                    function4 = function0;
                    x340Var.b0();
                    jx00Var2 = jx00Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new s2g(z, idh1Var, j2iVar2, function4, function3, function2, jx00Var2, maxVar2, i, i2);
                }
            }
            maxVar2 = maxVar;
            i5 = i9 | i10;
            if ((4793491 & i5) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i5 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        jx00Var2 = jx00.a;
                    } else {
                        jx00Var2 = jx00Var;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                        maxVar2 = jax.a;
                    }
                } else {
                    if (i8 != 0) {
                        jx00Var2 = jx00.a;
                    } else {
                        jx00Var2 = jx00Var;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                        maxVar2 = jax.a;
                    }
                }
                maxVar3 = maxVar2;
                x340Var.s();
                if (idh1Var != idh1.a) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                nim0Var = nim0.a;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                fraVar = een.N0;
                gex0Var = h36.a;
                i6 = i5;
                jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF2);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z4 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z4) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                z5 = z3;
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar7);
                nko1.F(x340Var);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar8);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                wnb0 wnb0Var2 = new wnb0(f, true);
                jw31 jw31VarA3 = ew31.a(gex0Var, fraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA3, x340Var, lljVar5);
                nko1.H(xos0VarM3, x340Var, lljVar6);
                x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar8);
                if (z5) {
                    x340Var.i0(-656684923);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    int i16 = i6 >> 12;
                    z6 = true;
                    g(idh1Var, function2, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), maxVar3, x340Var, ((i6 >> 3) & 14) | (i16 & 112) | (i16 & 7168));
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    ab80.p(nim0Var, 12.0f, x340Var, false);
                } else {
                    z6 = true;
                    x340Var.i0(-656419687);
                    x340Var.r(false);
                }
                int i17 = i6 >> 6;
                int i18 = (i6 >> 15) & 896;
                function4 = function0;
                h(z, function4, maxVar3, x340Var, (i6 & 14) | (i17 & 112) | i18);
                int i19 = i17 & 14;
                j2iVar2 = j2iVar;
                dv20.l(i19, j2iVar2, x340Var, z6);
                int i110 = ((i6 >> 18) & 14) | ((i6 >> 9) & 112) | i18;
                function3 = function1;
                e(jx00Var2, function3, maxVar3, x340Var, i110);
                x340Var.r(z6);
                maxVar2 = maxVar3;
            } else {
                j2iVar2 = j2iVar;
                function3 = function1;
                function4 = function0;
                x340Var.b0();
                jx00Var2 = jx00Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s2g(z, idh1Var, j2iVar2, function4, function3, function2, jx00Var2, maxVar2, i, i2);
            }
        }

        public static final void c(j2i j2iVar, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
            b0k b0kVar2;
            qim0 qim0Var2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(1490042304);
            int i2 = i | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128) | (b0kVar3.i(function2) ? 2048 : 1024) | 24576;
            byte b2 = 0;
            if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
                uwr uwrVar = cbx.a;
                long jA = cbx.a(b0kVar3).a.b.a();
                zov0 zov0Var = cbx.b(b0kVar3).g;
                cvx cvxVar = cbx.b(b0kVar3).b;
                qim0 qim0Var3 = nim0.a;
                b0kVar2 = b0kVar3;
                jto1.b(u291.f(uyn1.z(16.0f, 0.0f, 2, qim0Var3), 1.0f), new uvx(0, mgx.e, 4, null, null, null, a, 0, null, 441), (max) null, true, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-1780281225, new rvh((byte) 6, jA), b0kVar3), apo.r(1024026871, new rvh((byte) 7, jA), b0kVar3), apo.r(-1455452936, new rvh((byte) 8, jA), b0kVar3), apo.r(360034553, new oa5(function0, (byte) 7), b0kVar3), (xu30) null, apo.r(-303957765, new cy00(j2iVar, function1, function2, b2), b0kVar3), apo.r(1511529724, new rvh((byte) 9, jA), b0kVar3), b0kVar2, 805309504, 221622, 8692);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new sxj((byte) 25, i, j2iVar, function0, function1, function2, qim0Var2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0042  */
        /* JADX WARN: Code duplicated, block: B:24:0x0044  */
        /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x004f  */
        /* JADX WARN: Code duplicated, block: B:31:0x0056  */
        /* JADX WARN: Code duplicated, block: B:36:0x0061  */
        /* JADX WARN: Code duplicated, block: B:39:0x008a  */
        /* JADX WARN: Code duplicated, block: B:42:0x0094  */
        /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
        public static final void d(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
            int i3;
            qim0 qim0Var2;
            boolean z;
            qim0 qim0Var3;
            h311 h311VarV;
            boolean z2;
            Object objT;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-48737874);
            if ((i & 6) == 0) {
                i3 = i | (x340Var.i(function0) ? 4 : 2);
            } else {
                i3 = i;
            }
            int i4 = i2 & 2;
            if (i4 == 0) {
                if ((i & 48) == 0) {
                    qim0Var2 = qim0Var;
                    i3 |= x340Var.i(qim0Var2) ? 32 : 16;
                }
                if ((i3 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    if (i4 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    z2 = (i3 & 14) == 4;
                    objT = x340Var.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new in00(function0, (byte) 6);
                        x340Var.s0(objT);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, qim0Var2, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, rni.a, x340Var, (i3 << 3) & 896, 6, 1016);
                } else {
                    x340Var.b0();
                }
                qim0Var3 = qim0Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ux1(function0, qim0Var3, i, i2, (byte) 4);
                }
            }
            i3 |= 48;
            qim0Var2 = qim0Var;
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i3 & 14) == 4) {
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new in00(function0, (byte) 6);
                    x340Var.s0(objT);
                } else {
                    objT = new in00(function0, (byte) 6);
                    x340Var.s0(objT);
                }
                wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, qim0Var2, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, rni.a, x340Var, (i3 << 3) & 896, 6, 1016);
            } else {
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ux1(function0, qim0Var3, i, i2, (byte) 4);
            }
        }

        public static final void e(jx00 jx00Var, Function0 function0, max maxVar, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-661661626);
            if ((i & 6) == 0) {
                i2 = (x340Var.e(jx00Var.ordinal()) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(function0) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(maxVar) ? 256 : 128;
            }
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                boolean z = jx00Var == jx00.c;
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new in00(function0, (byte) 7);
                    x340Var.s0(objT);
                }
                wro1.h(new gbx(z50.c, (Function0) objT), new idx(6), (qim0) null, maxVar, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, apo.r(956309839, new dr0((byte) 21, z), x340Var), x340Var, (i2 << 6) & 57344, 6, 972);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new x8t(jx00Var, function0, maxVar, i, (byte) 28);
            }
        }

        public static final void f(String str, String str2, b0k b0kVar, int i) {
            String str3;
            boolean z;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(655382125);
            int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                boolean z2 = str == null || str.length() == 0;
                boolean z3 = str2 == null || str2.length() == 0;
                if (z2 && z3) {
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new b4((byte) 10, i, str, str2);
                        return;
                    }
                    return;
                }
                fra fraVar = een.N0;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = fa00.d1;
                    x340Var.s0(objT);
                }
                wnb0 wnb0Var = nim0.a;
                qim0 qim0VarB = s161.b(wnb0Var, false, (iu30) objT);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z2) {
                    z = false;
                    x340Var.i0(-99386287);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-99655553);
                    zic0 zic0Var = new zic0(1);
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var).j;
                    long j = cbx.a(x340Var).b.b;
                    if (!z3) {
                        wnb0Var = new wnb0(1.0f, false);
                    }
                    uwo1.e(str, wnb0Var, lee1Var, j, (a0e1) null, (iu30) null, 2, false, zic0Var, 0, (qx8) null, x340Var, i2 & 14, 0, 1712);
                    z = false;
                    x340Var.r(false);
                }
                if (z2 || z3) {
                    x340Var.i0(-99200783);
                    x340Var.r(z);
                } else {
                    x340Var.i0(-99340128);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(" • ", (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 6, 0, 2034);
                    z = false;
                    x340Var.r(false);
                }
                if (z3) {
                    boolean z4 = z;
                    str3 = str2;
                    x340Var.i0(-98974607);
                    x340Var.r(z4);
                } else {
                    x340Var.i0(-99163149);
                    zic0 zic0Var2 = new zic0(1);
                    uwr uwrVar3 = cbx.a;
                    str3 = str2;
                    uwo1.e(str3, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, zic0Var2, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 1714);
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                str3 = str2;
                x340Var.b0();
            }
            h311 h311VarV2 = x340Var.v();
            if (h311VarV2 != null) {
                h311VarV2.d = new b4((byte) 11, i, str, str3);
            }
        }

        public static final void g(idh1 idh1Var, Function0 function0, qim0 qim0Var, max maxVar, b0k b0kVar, int i) {
            int i2;
            qim0 qim0Var2;
            idh1 idh1Var2;
            h311 h311VarV;
            dy00 dy00Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(294972950);
            if ((i & 6) == 0) {
                i2 = (x340Var.e(idh1Var.ordinal()) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(function0) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i2 |= x340Var.i(qim0Var2) ? 256 : 128;
            } else {
                qim0Var2 = qim0Var;
            }
            if ((i & 3072) == 0) {
                i2 |= x340Var.i(maxVar) ? 2048 : 1024;
            }
            if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                x340Var.d0();
                if ((i & 1) != 0 && !x340Var.E()) {
                    x340Var.b0();
                }
                x340Var.s();
                if (idh1Var == idh1.a) {
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        dy00Var = new dy00(idh1Var, function0, qim0Var2, maxVar, i, (byte) 0);
                    }
                } else {
                    idh1Var2 = idh1Var;
                    boolean z = idh1Var2 == idh1.c;
                    boolean z2 = (i2 & 112) == 32;
                    Object objT = x340Var.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new in00(function0, (byte) 8);
                        x340Var.s0(objT);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, qim0Var, maxVar, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, apo.r(1788143750, new dr0((byte) 22, z), x340Var), (vu30) null, apo.r(735783189, new dr0((byte) 23, z), x340Var), x340Var, (i2 & 896) | 805306368 | ((i2 << 3) & 57344), 48, 1480);
                }
                h311VarV.d = dy00Var;
            }
            idh1Var2 = idh1Var;
            x340Var.b0();
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                dy00Var = new dy00(idh1Var2, function0, qim0Var, maxVar, i, (byte) 1);
                h311VarV.d = dy00Var;
            }
        }

        public static final void h(boolean z, Function0 function0, max maxVar, b0k b0kVar, int i) {
            int i2;
            max maxVar2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(424647289);
            if ((i & 6) == 0) {
                i2 = (x340Var.h(z) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(function0) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                maxVar2 = maxVar;
                i2 |= x340Var.i(maxVar2) ? 256 : 128;
            } else {
                maxVar2 = maxVar;
            }
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new in00(function0, (byte) 9);
                    x340Var.s0(objT);
                }
                wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, (qim0) null, maxVar2, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1075187664, new dr0((byte) 24, z), x340Var), x340Var, (i2 << 6) & 57344, 6, 1004);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new e30(z, function0, maxVar, i, (byte) 15);
            }
        }
    }
