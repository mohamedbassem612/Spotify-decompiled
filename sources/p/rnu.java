package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rnu {
    public final mr20 a;

    public /* synthetic */ rnu(mr20 mr20Var) {
        this.a = mr20Var;
    }

    public void a(String str, xb10 xb10Var, qim0 qim0Var, yqi1 yqi1Var, b0k b0kVar, int i) {
        int i2;
        yqi1 yqi1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1777073928);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(xb10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            yqi1Var2 = yqi1Var;
            i2 |= x340Var.i(yqi1Var2) ? 2048 : 1024;
        } else {
            yqi1Var2 = yqi1Var;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            ven0 ven0VarJ = f4p1.j(new any(this.a, (byte) 18), new tbb1(), (iac0) null, x340Var, 0, 14);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = yv91.a(new gp30(watVar, ven0VarJ, (byte) 0));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            gra graVar = een.e;
            eso1.h(oi7.a(Uri.parse(str), (gw70) null, xb10Var, yqi1Var2, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, ((i2 << 6) & 7168) | ((i2 << 3) & 57344), 0, 131046), isl.a, anm1.N("standard_artwork_full_bleed_image", d9y0.k(eqr0.D(0.0f, ((hp30) tob1Var.getValue()).a, 1, qim0Var), ((hp30) tob1Var.getValue()).b)), (p3v) null, (zvx) null, (ecx) null, mif1.P0, graVar, (ColorFilter) null, x340Var, 14380080, 256);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 11, i, (Object) this, (Object) str, (Object) xb10Var, (Object) qim0Var, (Object) yqi1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x03d8  */
    public void b(String str, Boolean bool, boolean z, nbb1 nbb1Var, boolean z2, iu30 iu30Var, xb10 xb10Var, qim0 qim0Var, yqi1 yqi1Var, rbb1 rbb1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        String str2;
        jsl jslVar;
        jmr0 jmr0Var;
        boolean z3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2013548584);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(bool) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var2.g(nbb1Var) : x340Var2.i(nbb1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.g(xb10Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= x340Var2.i(yqi1Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= (i & 1073741824) == 0 ? x340Var2.g(rbb1Var) : x340Var2.i(rbb1Var) ? 536870912 : 268435456;
        }
        int i3 = x340Var2.i(this) ? 4 : 2;
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            pe peVarA = ef.a(x340Var2);
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            wat watVar = (wat) x340Var2.k(t4k.h);
            int i4 = i2;
            ven0 ven0VarJ = f4p1.j(new any(this.a, (byte) 18), new tbb1(), (iac0) null, x340Var2, 0, 14);
            x340 x340Var3 = x340Var2;
            Object objT = x340Var3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = ktd.k(watVar.M0(context.getResources().getDimensionPixelSize(2131166120)), x340Var3);
            }
            float f = ((p3v) objT).a;
            Object objT2 = x340Var3.T();
            if (objT2 == obj) {
                objT2 = yv91.a(new gp30(watVar, ven0VarJ, (byte) 1));
                x340Var3.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == obj) {
                objT3 = yv91.a(new b0e0(tob1Var, f));
                x340Var3.s0(objT3);
            }
            tob1 tob1Var2 = (tob1) objT3;
            Object objT4 = x340Var3.T();
            if (objT4 == obj) {
                objT4 = yv91.a(new lfo0(tob1Var, f, qim0Var));
                x340Var3.s0(objT4);
            }
            tob1 tob1Var3 = (tob1) objT4;
            int i5 = i4 & 14;
            boolean z4 = (i5 == 4) | ((i4 & 7168) == 2048 || ((i4 & 4096) != 0 && x340Var3.g(nbb1Var))) | ((((1879048192 & i4) ^ 805306368) > 536870912 && x340Var3.g(rbb1Var)) || (i4 & 805306368) == 536870912);
            Object objT5 = x340Var3.T();
            if (z4 || objT5 == obj) {
                if (nbb1Var instanceof mbb1) {
                    str2 = "standard_artwork_uploading_image";
                } else if (nbb1Var instanceof lbb1) {
                    str2 = "standard_artwork_uploaded_with_placeholder";
                } else if (!(nbb1Var instanceof kbb1)) {
                    eg.o();
                    return;
                } else if (str.length() > 0) {
                    str2 = "standard_artwork_normal_image";
                } else {
                    str2 = ((rbb1Var instanceof obb1) && u890.j(((obb1) rbb1Var).a, xmx.c)) ? "standard_artwork_normal_image_empty_with_edit_icon_placeholder" : "standard_artwork_normal_image_empty_with_playlist_icon_placeholder";
                }
                objT5 = str2;
                x340Var3.s0(objT5);
            }
            qim0 qim0VarN = anm1.N((String) objT5, (qim0) tob1Var3.getValue());
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarN);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            String strO0 = cwl1.o0(x340Var3, 2131962899);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var3).f;
            boolean z5 = ((i4 & 896) == 256) | (i5 == 4);
            Object objT6 = x340Var3.T();
            nim0 nim0Var = nim0.a;
            if (z5 || objT6 == obj) {
                qim0 qim0VarR = exd0.r(h2c.a.a(nim0Var, een.h), new nrj0(1, (byte) 18));
                objT6 = z ? bin.x(qim0VarR, false, strO0, (pm31) null, (idn0) null, new nfk0(iu30Var, (byte) 28), 13) : qim0VarR;
                x340Var3.s0(objT6);
            }
            qim0 qim0VarThen = (qim0) objT6;
            boolean zG = x340Var3.g(peVarA);
            Object objT7 = x340Var3.T();
            if (zG || objT7 == obj) {
                objT7 = Boolean.valueOf(peVarA.b(5));
                x340Var3.s0(objT7);
            }
            boolean zBooleanValue = ((Boolean) objT7).booleanValue();
            boolean zG2 = x340Var3.g(peVarA);
            Object objT8 = x340Var3.T();
            if (zG2 || objT8 == obj) {
                objT8 = Boolean.valueOf(peVarA.b(3));
                x340Var3.s0(objT8);
            }
            boolean zBooleanValue2 = ((Boolean) objT8).booleanValue();
            Object objT9 = x340Var3.T();
            Object obj2 = objT9;
            if (objT9 == obj) {
                q811 q811Var = new q811();
                q811Var.a = bool;
                x340Var3.s0(q811Var);
                obj2 = q811Var;
            }
            q811 q811Var2 = (q811) obj2;
            Boolean bool2 = bool == null ? (Boolean) q811Var2.a : bool;
            if (bool == null) {
                x340Var3.i0(-1131962244);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-1131962243);
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zI = x340Var3.i(q811Var2) | x340Var3.h(zBooleanValue3);
                Object objT10 = x340Var3.T();
                if (zI || objT10 == obj) {
                    objT10 = new vtj0(q811Var2, zBooleanValue3, null, (byte) 1);
                    x340Var3.s0(objT10);
                }
                qxd0.t(bool, x340Var3, (vu30) objT10);
                x340Var3.r(false);
            }
            boolean z6 = rbb1Var instanceof obb1;
            x340Var3.f0(102049753, Boolean.valueOf(z6 && u890.j(((obb1) rbb1Var).a, xmx.c)));
            p3v p3vVar = (p3v) tob1Var2.getValue();
            if (z2 && (zBooleanValue || bool2 != null)) {
                if (u890.j(bool2, Boolean.TRUE)) {
                    if (zBooleanValue) {
                        mfo0 mfo0Var = (mfo0) tob1Var.getValue();
                        if (p3v.b(mfo0Var.a, 0.0f) < 0 && !p3v.c(mfo0Var.b, 0.0f)) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                qim0VarThen = qim0VarThen.then(zr7.i(nim0Var, new qpf(zBooleanValue2, z3, (byte) 2)));
            }
            if (z) {
                x340Var3.i0(-1130874825);
                jslVar = new jsl(cwl1.o0(x340Var3, 2131962898));
                x340Var3.r(false);
            } else {
                x340Var3.i0(-1130716136);
                x340Var3.r(false);
                jslVar = isl.a;
            }
            int i6 = ((
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0421: ARITH (r5v14 'i6' int) = (wrap int:0x041a: ARITH (wrap int:0x0415: ARITH (wrap int:0x0410: ARITH (wrap int:0x040e: ARITH (wrap int:0x040c: ARITH (r0v3 int) >> (24 int) A[WRAPPED] (LINE:1037)) & (112 int) A[WRAPPED] (LINE:1039)) | (r13v15 'i5' int) A[DONT_WRAP, WRAPPED] (LINE:1041)) | (wrap int:0x0413: ARITH (wrap int:0x0411: ARITH (r0v3 int) >> (12 int) A[WRAPPED] (LINE:1042)) & (896 int) A[WRAPPED] (LINE:1044)) A[DONT_WRAP, WRAPPED] (LINE:1046)) | (wrap int:0x0418: ARITH (wrap int:0x0416: ARITH (r16v7 'i4' int) >> (15 int) A[WRAPPED] (LINE:1047)) & (7168 int) A[WRAPPED] (LINE:1049)) A[DONT_WRAP, WRAPPED] (LINE:1051)) | (wrap int:0x0420: ARITH (wrap int:0x041b: ARITH (r20v1 'i3' int) << (12 int) A[WRAPPED] (LINE:1052)) & (57344 int) A[WRAPPED] (LINE:1057)) A[DECLARE_VAR] (LINE:1058) in method: p.rnu.b(java.lang.String, java.lang.Boolean, boolean, p.nbb1, boolean, p.iu30, p.xb10, p.qim0, p.yqi1, p.rbb1, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v3 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1345
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.rnu.b(java.lang.String, java.lang.Boolean, boolean, p.nbb1, boolean, p.iu30, p.xb10, p.qim0, p.yqi1, p.rbb1, p.b0k, int):void");
        }
    }
