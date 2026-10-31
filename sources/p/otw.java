package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class otw {
    public static final tka0 a;
    public static final tka0 b;
    public static final xzu c;

    static {
        jd11 jd11Var = rc11.a;
        a = jd11Var.b(tsw.class);
        b = jd11Var.b(usw.class);
        c = xzu.V0;
    }

    /* JADX WARN: Code duplicated, block: B:294:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:295:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:298:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:299:0x05be  */
    /* JADX WARN: Code duplicated, block: B:303:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:308:0x0614  */
    /* JADX WARN: Code duplicated, block: B:309:0x0617  */
    /* JADX WARN: Code duplicated, block: B:312:0x061e  */
    /* JADX WARN: Code duplicated, block: B:313:0x0621  */
    /* JADX WARN: Code duplicated, block: B:317:0x062c  */
    public static final void a(Object obj, guj gujVar, jsw jswVar, tob1 tob1Var, ipb1 ipb1Var, String str, String str2, iu30 iu30Var, int i, ipb1 ipb1Var2, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var;
        auw auwVarI;
        nml nmlVarH;
        int i4;
        Object edcVar;
        int i5;
        ven0 ven0Var;
        q811 q811Var;
        String str3;
        String str4;
        int i6;
        Object ptwVar;
        boolean zBooleanValue;
        q811 q811Var2;
        q811 q811Var3;
        ven0 ven0Var2;
        Boolean boolA;
        ven0 ven0Var3;
        u601 u601Var;
        px20 px20Var;
        ven0 ven0Var4;
        q811 q811Var4;
        tob1 tob1Var2;
        q811 q811Var5;
        ven0 ven0Var5;
        Object obj2;
        boolean z;
        boolean z2;
        boolean z3;
        Object itwVar;
        int i7;
        boolean z4;
        boolean z5;
        q811 q811Var6;
        ven0 ven0Var6;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objT;
        guj gujVar2 = gujVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(525971568);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var2.g(obj) : x340Var2.i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? x340Var2.g(gujVar2) : x340Var2.i(gujVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 ? x340Var2.g(jswVar) : x340Var2.i(jswVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var2.g(tob1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var2.g(ipb1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var2.g(str) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var2.g(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= x340Var2.e(i) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= x340Var2.g(ipb1Var2) ? 536870912 : 268435456;
        }
        if (x340Var2.Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((x340Var2.g(qim0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            ven0 ven0VarV = xto.v(gujVar2, x340Var2);
            int i8 = i3 & 8;
            int i9 = i3 & 14;
            ven0 ven0VarV2 = xto.v(obj, x340Var2);
            ien0 ien0Var = qsw.a;
            u601 u601VarC = gfe0.c(x340Var2);
            Object objT2 = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT2 == m4cVar) {
                objT2 = new q811();
                x340Var2.s0(objT2);
            }
            q811 q811Var7 = (q811) objT2;
            q811Var7.a = u601VarC.getValue();
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = xto.t((Object) null);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var7 = (ven0) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = xto.t((Object) null);
                x340Var2.s0(objT4);
            }
            ven0 ven0Var8 = (ven0) objT4;
            int i10 = i3;
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar) {
                op80 op80Var = (op80) q811Var7.a;
                objT5 = xto.t(op80Var != null ? qon1.y(op80Var) : null);
                x340Var2.s0(objT5);
            }
            ven0 ven0Var9 = (ven0) objT5;
            op80 op80Var2 = (op80) q811Var7.a;
            if (op80Var2 == null || (auwVarI = sap1.i(op80Var2)) == null) {
                auwVarI = (auw) ven0Var7.getValue();
                if (auwVarI == null) {
                    hhg1.n("logger factory is not provided by the environment. You can provide it by calling ViewTreeInstrumentationEnvironment.set(view, InstrumentationLoggerFactory on the root view of the page");
                    return;
                }
            } else {
                ven0Var7.setValue(auwVarI);
            }
            op80 op80Var3 = (op80) q811Var7.a;
            if (op80Var3 == null || (nmlVarH = hap1.h(op80Var3)) == null) {
                nmlVarH = (nml) ven0Var8.getValue();
                if (nmlVarH == null) {
                    hhg1.n("Container provider for tracking visibility changes is not provided by the environment. You can provide it by calling ViewTreeInstrumentationEnvironment.set(view, InstrumentationContainerProvider on the root view of the page");
                    return;
                }
            } else {
                ven0Var8.setValue(nmlVarH);
            }
            Object objT6 = x340Var2.T();
            if (objT6 == m4cVar) {
                objT6 = new q811();
                x340Var2.s0(objT6);
            }
            q811 q811Var8 = (q811) objT6;
            Object objT7 = x340Var2.T();
            if (objT7 == m4cVar) {
                objT7 = new q811();
                x340Var2.s0(objT7);
            }
            q811 q811Var9 = (q811) objT7;
            Object objT8 = x340Var2.T();
            if (objT8 == m4cVar) {
                objT8 = new q811();
                x340Var2.s0(objT8);
            }
            q811 q811Var10 = (q811) objT8;
            if (!u890.j(q811Var8.a, auwVarI) || q811Var9.a != ipb1Var) {
                q811Var8.a = auwVarI;
                q811Var9.a = ipb1Var;
                q811Var10.a = auwVarI.create();
            }
            ven0 ven0VarV3 = xto.v(nmlVarH, x340Var2);
            Integer numValueOf = Integer.valueOf(i);
            int i11 = i10 & 3670016;
            int i12 = i10 & 458752;
            int i13 = i10 & 234881024;
            boolean zI = (i11 == 1048576) | x340Var2.i(q811Var7) | (i12 == 131072) | (i13 == 67108864) | x340Var2.g(ven0VarV2) | x340Var2.g(ven0VarV);
            Object objT9 = x340Var2.T();
            if (zI || objT9 == m4cVar) {
                i4 = i12;
                i5 = i9;
                ven0Var = ven0VarV;
                edcVar = new edc(q811Var7, str2, str, i, ven0VarV2, ven0Var, (lnm) null);
                q811Var = q811Var7;
                str3 = str;
                str4 = str2;
                i6 = i;
                x340Var2.s0(edcVar);
            } else {
                edcVar = objT9;
                i4 = i12;
                ven0Var = ven0VarV;
                i5 = i9;
                q811Var = q811Var7;
                str3 = str;
                i6 = i;
                str4 = str2;
            }
            qxd0.r(str4, str3, numValueOf, (vu30) edcVar, x340Var2);
            Integer numValueOf2 = Integer.valueOf(i6);
            boolean zI2 = x340Var2.i(q811Var) | (i11 == 1048576) | (i4 == 131072) | (i13 == 67108864);
            Object objT10 = x340Var2.T();
            if (zI2 || objT10 == m4cVar) {
                objT10 = new etw(q811Var, str4, str3, i6);
                x340Var2.s0(objT10);
            }
            qxd0.g(str4, str3, numValueOf2, (iu30) objT10, x340Var2);
            i6r0 i6r0Var = (i6r0) ven0Var9.getValue();
            int i14 = i10 & 112;
            q811 q811Var11 = q811Var;
            boolean z9 = i14 == 32 || ((i10 & 64) != 0 && x340Var2.g(gujVar2));
            Object objT11 = x340Var2.T();
            if (z9 || objT11 == m4cVar) {
                if (i6r0Var == null || (boolA = i6r0Var.a()) == null) {
                    zBooleanValue = i6r0Var == null;
                } else {
                    zBooleanValue = boolA.booleanValue();
                }
                q811Var2 = q811Var10;
                int i15 = i6;
                q811Var3 = q811Var11;
                k40 k40Var = new k40(q811Var2, q811Var3, str4, iu30Var, i15, ven0Var, ven0VarV2);
                ven0Var2 = ven0VarV2;
                ptwVar = new ptw(zBooleanValue, k40Var);
                x340Var2.s0(ptwVar);
            } else {
                ptwVar = objT11;
                q811Var3 = q811Var11;
                q811Var2 = q811Var10;
                ven0Var2 = ven0VarV2;
            }
            ptw ptwVar2 = (ptw) ptwVar;
            px20 px20VarE = ptwVar2.e();
            boolean zI3 = x340Var2.i(px20VarE) | x340Var2.i(i6r0Var);
            Object objT12 = x340Var2.T();
            if (zI3 || objT12 == m4cVar) {
                objT12 = new w3w(px20VarE, i6r0Var, (byte) 4);
                x340Var2.s0(objT12);
            }
            qxd0.h(i6r0Var, px20VarE, (iu30) objT12, x340Var2);
            int i16 = i10 & 29360128;
            boolean zI4 = (i16 == 8388608) | x340Var2.i(u601VarC) | x340Var2.i(q811Var3) | x340Var2.i(q811Var8) | x340Var2.i(q811Var2) | x340Var2.g(ven0Var) | x340Var2.g(ven0Var2) | x340Var2.i(px20VarE) | (i11 == 1048576);
            Object objT13 = x340Var2.T();
            if (zI4 || objT13 == m4cVar) {
                ven0 ven0Var10 = ven0Var;
                q811 q811Var12 = q811Var2;
                ven0Var3 = ven0Var2;
                u601Var = u601VarC;
                gtw gtwVar = new gtw(u601Var, q811Var3, px20VarE, q811Var12, str2, iu30Var, q811Var8, ven0Var7, ven0Var8, ven0Var9, ven0Var10, ven0Var3, null);
                px20Var = px20VarE;
                ven0Var4 = ven0Var10;
                q811Var4 = q811Var12;
                x340Var2.s0(gtwVar);
                objT13 = gtwVar;
            } else {
                px20Var = px20VarE;
                ven0Var4 = ven0Var;
                q811Var4 = q811Var2;
                ven0Var3 = ven0Var2;
                u601Var = u601VarC;
            }
            qxd0.t(u601Var, x340Var2, (vu30) objT13);
            qim0 qim0VarG = c921.G(qim0Var, (nml) ven0VarV3.getValue(), ptwVar2.c(), ptwVar2.d());
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var2));
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarG);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            boolean zG = x340Var2.g(ptwVar2) | ((i10 & 57344) == 16384) | (i4 == 131072);
            Object objT14 = x340Var2.T();
            if (zG || objT14 == m4cVar) {
                objT14 = new ksw(ptwVar2, new v7v(ipb1Var, (byte) 14), str, ipb1Var);
                x340Var2.s0(objT14);
            }
            ven0 ven0Var11 = ven0Var4;
            q811 q811Var13 = q811Var4;
            ven0 ven0Var12 = ven0Var3;
            q811 q811Var14 = q811Var3;
            j2i j2iVarR = apo.r(1263819767, new zx(jswVar, tob1Var, ven0Var12, ven0Var11, q811Var13, q811Var14, str2, iu30Var, (ksw) objT14), x340Var2);
            if (jswVar.b()) {
                x340Var2.i0(340772047);
                e(ipb1Var2, ipb1Var2 == null ? rih1.a : str, j2iVarR, x340Var2, ((i10 >> 27) & 14) | 384);
                x340Var2.r(false);
            } else {
                x340Var2.i0(340965146);
                mod.b(pd41.a.a(w6u.a), apo.r(1552550490, new bf6(i, j2iVarR), x340Var2), x340Var2, 56);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            boolean zI5 = ((i10 & 7168) == 2048) | x340Var2.i(q811Var14) | (i11 == 1048576) | (i4 == 131072) | x340Var2.g(ven0Var11) | x340Var2.g(ven0Var12) | x340Var2.i(px20Var) | x340Var2.i(q811Var13) | (i16 == 8388608) | (i13 == 67108864);
            Object objT15 = x340Var2.T();
            if (zI5 || objT15 == m4cVar) {
                tob1Var2 = tob1Var;
                htw htwVar = new htw(tob1Var2, q811Var14, str2, str, px20Var, q811Var13, iu30Var, i, ven0Var11, ven0Var12, (lnm) null);
                q811Var5 = q811Var13;
                ven0Var5 = ven0Var11;
                ven0Var12 = ven0Var12;
                x340Var2.s0(htwVar);
                objT15 = htwVar;
            } else {
                ven0Var5 = ven0Var11;
                q811Var5 = q811Var13;
                tob1Var2 = tob1Var;
            }
            qxd0.t(tob1Var2, x340Var2, (vu30) objT15);
            Object objT16 = x340Var2.T();
            if (objT16 == m4cVar) {
                objT16 = new q811();
                x340Var2.s0(objT16);
            }
            q811 q811Var15 = (q811) objT16;
            Object objT17 = x340Var2.T();
            if (objT17 == m4cVar) {
                objT17 = new q811();
                x340Var2.s0(objT17);
            }
            q811 q811Var16 = (q811) objT17;
            boolean zI6 = x340Var2.i(q811Var15);
            if (i5 != 4) {
                obj2 = obj;
                boolean z10 = i8 != 0 && x340Var2.i(obj2);
                boolean zI7 = z10 | zI6 | x340Var2.i(q811Var16) | x340Var2.i(q811Var14) | x340Var2.g(ven0Var5) | x340Var2.g(ven0Var12) | x340Var2.i(px20Var) | x340Var2.i(q811Var5);
                if (i11 == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z11 = zI7 | z;
                if (i16 == 8388608) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z11 | z2;
                Object objT18 = x340Var2.T();
                if (!z3 || objT18 == m4cVar) {
                    x340Var = x340Var2;
                    ven0 ven0Var13 = ven0Var12;
                    i7 = 1048576;
                    z4 = true;
                    q811 q811Var17 = q811Var5;
                    z5 = false;
                    itwVar = new itw(q811Var15, obj2, q811Var16, q811Var14, px20Var, q811Var17, str2, iu30Var, ven0Var5, ven0Var13);
                    q811Var6 = q811Var14;
                    q811Var5 = q811Var17;
                    ven0Var6 = ven0Var13;
                    x340Var.s0(itwVar);
                } else {
                    itwVar = objT18;
                    q811Var6 = q811Var14;
                    ven0Var6 = ven0Var12;
                    i7 = 1048576;
                    z5 = false;
                    z4 = true;
                    x340Var = x340Var2;
                }
                qxd0.D((Function0) itwVar, x340Var);
                boolean zG2 = x340Var.g(ven0Var6) | x340Var.g(ven0Var5) | x340Var.i(q811Var5) | x340Var.i(q811Var6);
                if (i11 == i7) {
                    z6 = z4;
                } else {
                    z6 = z5;
                }
                boolean z12 = zG2 | z6;
                if (i16 == 8388608) {
                    z7 = z4;
                } else {
                    z7 = z5;
                }
                z8 = z12 | z7;
                objT = x340Var.T();
                if (z8 || objT == m4cVar) {
                    jtw jtwVar = new jtw(q811Var5, q811Var6, str2, iu30Var, ven0Var6, ven0Var5);
                    x340Var.s0(jtwVar);
                    objT = jtwVar;
                }
                gujVar2 = gujVar;
                qxd0.i(gujVar2, (iu30) objT, x340Var);
            } else {
                obj2 = obj;
            }
            boolean zI8 = z10 | zI6 | x340Var2.i(q811Var16) | x340Var2.i(q811Var14) | x340Var2.g(ven0Var5) | x340Var2.g(ven0Var12) | x340Var2.i(px20Var) | x340Var2.i(q811Var5);
            if (i11 == 1048576) {
                z = true;
            } else {
                z = false;
            }
            boolean z13 = zI8 | z;
            if (i16 == 8388608) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z13 | z2;
            Object objT19 = x340Var2.T();
            if (z3) {
                x340Var = x340Var2;
                ven0 ven0Var14 = ven0Var12;
                i7 = 1048576;
                z4 = true;
                q811 q811Var18 = q811Var5;
                z5 = false;
                itwVar = new itw(q811Var15, obj2, q811Var16, q811Var14, px20Var, q811Var18, str2, iu30Var, ven0Var5, ven0Var14);
                q811Var6 = q811Var14;
                q811Var5 = q811Var18;
                ven0Var6 = ven0Var14;
                x340Var.s0(itwVar);
            } else {
                x340Var = x340Var2;
                ven0 ven0Var15 = ven0Var12;
                i7 = 1048576;
                z4 = true;
                q811 q811Var19 = q811Var5;
                z5 = false;
                itwVar = new itw(q811Var15, obj2, q811Var16, q811Var14, px20Var, q811Var19, str2, iu30Var, ven0Var5, ven0Var15);
                q811Var6 = q811Var14;
                q811Var5 = q811Var19;
                ven0Var6 = ven0Var15;
                x340Var.s0(itwVar);
            }
            qxd0.D((Function0) itwVar, x340Var);
            boolean zG3 = x340Var.g(ven0Var6) | x340Var.g(ven0Var5) | x340Var.i(q811Var5) | x340Var.i(q811Var6);
            if (i11 == i7) {
                z6 = z4;
            } else {
                z6 = z5;
            }
            boolean z14 = zG3 | z6;
            if (i16 == 8388608) {
                z7 = z4;
            } else {
                z7 = z5;
            }
            z8 = z14 | z7;
            objT = x340Var.T();
            if (z8) {
                jtw jtwVar2 = new jtw(q811Var5, q811Var6, str2, iu30Var, ven0Var6, ven0Var5);
                x340Var.s0(jtwVar2);
                objT = jtwVar2;
            } else {
                jtw jtwVar3 = new jtw(q811Var5, q811Var6, str2, iu30Var, ven0Var6, ven0Var5);
                x340Var.s0(jtwVar3);
                objT = jtwVar3;
            }
            gujVar2 = gujVar;
            qxd0.i(gujVar2, (iu30) objT, x340Var);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ktw(obj, gujVar2, jswVar, tob1Var, ipb1Var, str, str2, iu30Var, i, ipb1Var2, qim0Var, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void b(maa maaVar, Object obj, joa0 joa0Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(133760237);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(maaVar) : x340Var.i(maaVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(joa0Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                x340Var.i0(-877762200);
                int i5 = i3 << 3;
                ipb1 ipb1VarD = wpb1.D(joa0Var.a.toString(), maaVar, obj, x340Var, (i5 & 896) | (i5 & 112) | (((i3 >> 3) & 8) << 6));
                x340Var.r(false);
                int i6 = i3 >> 3;
                c(maaVar, obj, qim0Var4, ipb1VarD, x340Var, (i3 & 112) | (i3 & 14) | ((i6 & 8) << 3) | (i6 & 896), 0);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2(maaVar, obj, joa0Var, qim0Var3, i, i2, (byte) 9);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            x340Var.i0(-877762200);
            int i7 = i3 << 3;
            ipb1 ipb1VarD2 = wpb1.D(joa0Var.a.toString(), maaVar, obj, x340Var, (i7 & 896) | (i7 & 112) | (((i3 >> 3) & 8) << 6));
            x340Var.r(false);
            int i8 = i3 >> 3;
            c(maaVar, obj, qim0Var4, ipb1VarD2, x340Var, (i3 & 112) | (i3 & 14) | ((i8 & 8) << 3) | (i8 & 896), 0);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2(maaVar, obj, joa0Var, qim0Var3, i, i2, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x018a  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01de  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x020d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0225  */
    /* JADX WARN: Code duplicated, block: B:155:0x0233  */
    /* JADX WARN: Code duplicated, block: B:158:0x023d  */
    /* JADX WARN: Code duplicated, block: B:164:0x024b  */
    /* JADX WARN: Code duplicated, block: B:167:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x025f  */
    /* JADX WARN: Code duplicated, block: B:171:0x026e  */
    /* JADX WARN: Code duplicated, block: B:178:0x027e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0283  */
    /* JADX WARN: Code duplicated, block: B:186:0x0291  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:198:0x0304  */
    /* JADX WARN: Code duplicated, block: B:202:0x0318  */
    /* JADX WARN: Code duplicated, block: B:206:0x0322  */
    /* JADX WARN: Code duplicated, block: B:209:0x033a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x033c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0371  */
    /* JADX WARN: Code duplicated, block: B:222:0x037d  */
    /* JADX WARN: Code duplicated, block: B:226:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
    public static final void c(maa maaVar, Object obj, qim0 qim0Var, ipb1 ipb1Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        ipb1 ipb1Var2;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        qim0 qim0Var3;
        x340 x340Var;
        ipb1 ipb1Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        int i7;
        boolean z3;
        Object objT;
        iu30 iu30Var;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objT2;
        ipb1 ipb1Var4;
        boolean zG;
        Object objT3;
        ven0 ven0VarV;
        Object objT4;
        q811 q811Var;
        o7g1 o7g1Var;
        boolean z7;
        boolean zG2;
        Object objT5;
        o7g1 o7g1Var2;
        guj gujVar;
        boolean zG3;
        Object objT6;
        ven0 ven0Var;
        boolean zI;
        Object objT7;
        boolean zI2;
        Object objT8;
        int i8;
        boolean z8;
        Object objT9;
        boolean zG4;
        Object objT10;
        int iIntValue;
        Object value;
        boolean z9;
        int i9;
        boolean z10;
        boolean zG5;
        Object objT11;
        boolean z11;
        boolean z12;
        boolean zI3;
        Object gghVar;
        int i10;
        iu30 iu30Var2;
        x340 x340Var2;
        int i11;
        boolean zG6;
        Object objT12;
        m4c m4cVar;
        q811 q811Var2;
        boolean zI4;
        Object objT13;
        Object obj2 = obj;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-447702630);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var3.g(maaVar) : x340Var3.i(maaVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var3.g(obj2) : x340Var3.i(obj2) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var3.g(qim0Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    ipb1Var2 = ipb1Var;
                    if (x340Var3.g(ipb1Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                z = false;
                if ((i6 & 1171) != 1170) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var3.Y(i6 & 1, z2)) {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        ipb1Var2 = null;
                    }
                    i7 = i6 & 14;
                    if (i7 != 4 || ((i6 & 8) != 0 && x340Var3.g(maaVar))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objT = x340Var3.T();
                    if (z3 || objT == m4cVar2) {
                        objT = d(maaVar);
                        x340Var3.s0(objT);
                    }
                    iu30Var = (iu30) objT;
                    if (i7 != 4 || ((i6 & 8) != 0 && x340Var3.g(maaVar))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((i6 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z4 | z5;
                    objT2 = x340Var3.T();
                    if (z6 || objT2 == m4cVar2) {
                        if (ipb1Var2 == null) {
                            objT2 = maaVar.getBehavior().b(null, null, null);
                        } else {
                            objT2 = ipb1Var2;
                        }
                        x340Var3.s0(objT2);
                    }
                    ipb1Var4 = (ipb1) objT2;
                    zG = x340Var3.g(ipb1Var4);
                    objT3 = x340Var3.T();
                    if (zG || objT3 == m4cVar2) {
                        objT3 = ipb1Var4.h();
                        x340Var3.s0(objT3);
                    }
                    String str = (String) objT3;
                    ven0VarV = xto.v(obj2, x340Var3);
                    objT4 = x340Var3.T();
                    if (objT4 == m4cVar2) {
                        objT4 = new q811();
                        x340Var3.s0(objT4);
                    }
                    q811Var = (q811) objT4;
                    o7g1Var = (o7g1) x340Var3.k(i7g1.a());
                    if (i7 != 4 || ((i6 & 8) != 0 && x340Var3.g(maaVar))) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zG2 = z7 | x340Var3.g(str);
                    objT5 = x340Var3.T();
                    if (zG2 || objT5 == m4cVar2) {
                        o7g1Var2 = (o7g1) h7g1.b().get();
                        h7g1.b().set(o7g1Var);
                        try {
                            guj gujVarD = acq0.D(maaVar, obj2, ipb1Var4, new ggh(iu30Var, q811Var, maaVar, ven0VarV));
                            h7g1.b().set(o7g1Var2);
                            x340Var3.s0(gujVarD);
                            objT5 = gujVarD;
                        } catch (Throwable th) {
                            h7g1.b().set(o7g1Var2);
                            throw th;
                        }
                    }
                    gujVar = (guj) objT5;
                    zG3 = x340Var3.g(gujVar);
                    objT6 = x340Var3.T();
                    if (zG3 || objT6 == m4cVar2) {
                        objT6 = xto.t(gujVar.b.x());
                        x340Var3.s0(objT6);
                    }
                    ven0Var = (ven0) objT6;
                    zI = x340Var3.i(gujVar) | x340Var3.g(ven0Var) | x340Var3.i(q811Var);
                    objT7 = x340Var3.T();
                    if (zI || objT7 == m4cVar2) {
                        objT7 = new m3n(gujVar, ven0Var, q811Var, (byte) 24);
                        x340Var3.s0(objT7);
                    }
                    qxd0.i(gujVar, (iu30) objT7, x340Var3);
                    zI2 = x340Var3.i(gujVar);
                    objT8 = x340Var3.T();
                    if (!zI2 || objT8 == m4cVar2) {
                        i8 = 4;
                        objT8 = new i5w(gujVar, (byte) 4);
                        x340Var3.s0(objT8);
                    } else {
                        i8 = 4;
                    }
                    qxd0.i(gujVar, (iu30) objT8, x340Var3);
                    if (i7 != i8 || ((i6 & 8) != 0 && x340Var3.g(maaVar))) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objT9 = x340Var3.T();
                    if (z8 || objT9 == m4cVar2) {
                        try {
                            objT9 = maaVar.c();
                            x340Var3.s0(objT9);
                        } catch (Exception e) {
                            loo1.p(e, iu30Var.invoke(obj2), gujVar.b.x(), maaVar.b());
                            throw null;
                        }
                    }
                    jsw jswVar = (jsw) objT9;
                    zG4 = x340Var3.g(gujVar);
                    objT10 = x340Var3.T();
                    if (zG4 || objT10 == m4cVar2) {
                        objT10 = Integer.valueOf(System.identityHashCode(gujVar));
                        x340Var3.s0(objT10);
                    }
                    iIntValue = ((Number) objT10).intValue();
                    value = ven0Var.getValue();
                    if (i7 != 4 || ((i6 & 8) != 0 && x340Var3.g(maaVar))) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i9 = i6 & 112;
                    boolean z13 = z9;
                    if (i9 != 32 || ((i6 & 64) != 0 && x340Var3.g(obj2))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zG5 = z13 | z10 | x340Var3.g(value);
                    objT11 = x340Var3.T();
                    if (zG5 || objT11 == m4cVar2) {
                        objT11 = new yvg1(maaVar, obj2, value);
                        x340Var3.s0(objT11);
                    }
                    yvg1 yvg1Var = (yvg1) objT11;
                    if (i7 != 4 || ((i6 & 8) != 0 && x340Var3.i(maaVar))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i9 != 32 || ((i6 & 64) != 0 && x340Var3.i(obj2))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zI3 = z11 | z12 | x340Var3.i(value) | x340Var3.g(iu30Var);
                    Object objT14 = x340Var3.T();
                    if (!zI3 || objT14 == m4cVar2) {
                        i10 = i9;
                        iu30Var2 = iu30Var;
                        gghVar = new ggh(maaVar, obj2, value, iu30Var2, (byte) 26);
                        x340Var3.s0(gghVar);
                    } else {
                        gghVar = objT14;
                        iu30Var2 = iu30Var;
                        i10 = i9;
                    }
                    x340Var2 = x340Var3;
                    i11 = i10;
                    ipb1Var2 = ipb1Var2;
                    obj2 = obj;
                    dgo1.c(yvg1Var, (iu30) gghVar, apo.r(-667814186, new ktw(obj, gujVar, jswVar, ven0Var, ipb1Var4, str, maaVar, iu30Var2, iIntValue, ipb1Var2, qim0Var4, i6, (byte) 1), x340Var2), x340Var2, 384);
                    zG6 = x340Var2.g(gujVar);
                    objT12 = x340Var2.T();
                    if (zG6) {
                        m4cVar = m4cVar2;
                    } else {
                        m4cVar = m4cVar2;
                        if (objT12 == m4cVar) {
                        }
                        obj = objT12;
                        q811Var2 = (q811) obj;
                        if (i11 != 32 || ((i6 & 64) != 0 && x340Var2.i(obj2))) {
                            z = true;
                        }
                        zI4 = z | x340Var2.i(q811Var2) | x340Var2.i(gujVar) | x340Var2.e(iIntValue);
                        objT13 = x340Var2.T();
                        if (zI4 || objT13 == m4cVar) {
                            ltw ltwVar = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                            obj2 = obj2;
                            x340Var2.s0(ltwVar);
                            objT13 = ltwVar;
                        }
                        qxd0.s(obj2, gujVar, (vu30) objT13, x340Var2);
                        qim0Var3 = qim0Var4;
                        x340Var = x340Var2;
                    }
                    obj = objT12;
                    q811 q811Var3 = new q811();
                    q811Var3.a = obj2;
                    x340Var2.s0(q811Var3);
                    Object obj3 = q811Var3;
                    obj3 = objT12;
                    q811Var2 = (q811) obj3;
                    if (i11 != 32) {
                        z = true;
                    } else {
                        z = true;
                    }
                    zI4 = z | x340Var2.i(q811Var2) | x340Var2.i(gujVar) | x340Var2.e(iIntValue);
                    objT13 = x340Var2.T();
                    if (zI4) {
                        ltw ltwVar2 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                        obj2 = obj2;
                        x340Var2.s0(ltwVar2);
                        objT13 = ltwVar2;
                    } else {
                        ltw ltwVar3 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                        obj2 = obj2;
                        x340Var2.s0(ltwVar3);
                        objT13 = ltwVar3;
                    }
                    qxd0.s(obj2, gujVar, (vu30) objT13, x340Var2);
                    qim0Var3 = qim0Var4;
                    x340Var = x340Var2;
                } else {
                    x340 x340Var4 = x340Var3;
                    x340Var4.b0();
                    qim0Var3 = qim0Var2;
                    x340Var = x340Var4;
                }
                ipb1Var3 = ipb1Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new nj2(maaVar, obj2, qim0Var3, ipb1Var3, i, i2, (byte) 8);
                }
            }
            i3 |= 3072;
            ipb1Var2 = ipb1Var;
            i6 = i3;
            z = false;
            if ((i6 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var3.Y(i6 & 1, z2)) {
                if (i12 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    ipb1Var2 = null;
                }
                i7 = i6 & 14;
                if (i7 != 4) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                objT = x340Var3.T();
                if (z3) {
                    objT = d(maaVar);
                    x340Var3.s0(objT);
                } else {
                    objT = d(maaVar);
                    x340Var3.s0(objT);
                }
                iu30Var = (iu30) objT;
                if (i7 != 4) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if ((i6 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objT2 = x340Var3.T();
                if (z6) {
                    if (ipb1Var2 == null) {
                        objT2 = maaVar.getBehavior().b(null, null, null);
                    } else {
                        objT2 = ipb1Var2;
                    }
                    x340Var3.s0(objT2);
                } else {
                    if (ipb1Var2 == null) {
                        objT2 = maaVar.getBehavior().b(null, null, null);
                    } else {
                        objT2 = ipb1Var2;
                    }
                    x340Var3.s0(objT2);
                }
                ipb1Var4 = (ipb1) objT2;
                zG = x340Var3.g(ipb1Var4);
                objT3 = x340Var3.T();
                if (zG) {
                    objT3 = ipb1Var4.h();
                    x340Var3.s0(objT3);
                } else {
                    objT3 = ipb1Var4.h();
                    x340Var3.s0(objT3);
                }
                String str2 = (String) objT3;
                ven0VarV = xto.v(obj2, x340Var3);
                objT4 = x340Var3.T();
                if (objT4 == m4cVar2) {
                    objT4 = new q811();
                    x340Var3.s0(objT4);
                }
                q811Var = (q811) objT4;
                o7g1Var = (o7g1) x340Var3.k(i7g1.a());
                if (i7 != 4) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                zG2 = z7 | x340Var3.g(str2);
                objT5 = x340Var3.T();
                if (zG2) {
                    o7g1Var2 = (o7g1) h7g1.b().get();
                    h7g1.b().set(o7g1Var);
                    guj gujVarD2 = acq0.D(maaVar, obj2, ipb1Var4, new ggh(iu30Var, q811Var, maaVar, ven0VarV));
                    h7g1.b().set(o7g1Var2);
                    x340Var3.s0(gujVarD2);
                    objT5 = gujVarD2;
                } else {
                    o7g1Var2 = (o7g1) h7g1.b().get();
                    h7g1.b().set(o7g1Var);
                    guj gujVarD3 = acq0.D(maaVar, obj2, ipb1Var4, new ggh(iu30Var, q811Var, maaVar, ven0VarV));
                    h7g1.b().set(o7g1Var2);
                    x340Var3.s0(gujVarD3);
                    objT5 = gujVarD3;
                }
                gujVar = (guj) objT5;
                zG3 = x340Var3.g(gujVar);
                objT6 = x340Var3.T();
                if (zG3) {
                    objT6 = xto.t(gujVar.b.x());
                    x340Var3.s0(objT6);
                } else {
                    objT6 = xto.t(gujVar.b.x());
                    x340Var3.s0(objT6);
                }
                ven0Var = (ven0) objT6;
                zI = x340Var3.i(gujVar) | x340Var3.g(ven0Var) | x340Var3.i(q811Var);
                objT7 = x340Var3.T();
                if (zI) {
                    objT7 = new m3n(gujVar, ven0Var, q811Var, (byte) 24);
                    x340Var3.s0(objT7);
                } else {
                    objT7 = new m3n(gujVar, ven0Var, q811Var, (byte) 24);
                    x340Var3.s0(objT7);
                }
                qxd0.i(gujVar, (iu30) objT7, x340Var3);
                zI2 = x340Var3.i(gujVar);
                objT8 = x340Var3.T();
                if (zI2) {
                    i8 = 4;
                    objT8 = new i5w(gujVar, (byte) 4);
                    x340Var3.s0(objT8);
                } else {
                    i8 = 4;
                    objT8 = new i5w(gujVar, (byte) 4);
                    x340Var3.s0(objT8);
                }
                qxd0.i(gujVar, (iu30) objT8, x340Var3);
                if (i7 != i8) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                objT9 = x340Var3.T();
                if (z8) {
                    objT9 = maaVar.c();
                    x340Var3.s0(objT9);
                } else {
                    objT9 = maaVar.c();
                    x340Var3.s0(objT9);
                }
                jsw jswVar2 = (jsw) objT9;
                zG4 = x340Var3.g(gujVar);
                objT10 = x340Var3.T();
                if (zG4) {
                    objT10 = Integer.valueOf(System.identityHashCode(gujVar));
                    x340Var3.s0(objT10);
                } else {
                    objT10 = Integer.valueOf(System.identityHashCode(gujVar));
                    x340Var3.s0(objT10);
                }
                iIntValue = ((Number) objT10).intValue();
                value = ven0Var.getValue();
                if (i7 != 4) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                i9 = i6 & 112;
                boolean z14 = z9;
                if (i9 != 32) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                zG5 = z14 | z10 | x340Var3.g(value);
                objT11 = x340Var3.T();
                if (zG5) {
                    objT11 = new yvg1(maaVar, obj2, value);
                    x340Var3.s0(objT11);
                } else {
                    objT11 = new yvg1(maaVar, obj2, value);
                    x340Var3.s0(objT11);
                }
                yvg1 yvg1Var2 = (yvg1) objT11;
                if (i7 != 4) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (i9 != 32) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                zI3 = z11 | z12 | x340Var3.i(value) | x340Var3.g(iu30Var);
                Object objT15 = x340Var3.T();
                if (zI3) {
                    i10 = i9;
                    iu30Var2 = iu30Var;
                    gghVar = new ggh(maaVar, obj2, value, iu30Var2, (byte) 26);
                    x340Var3.s0(gghVar);
                } else {
                    i10 = i9;
                    iu30Var2 = iu30Var;
                    gghVar = new ggh(maaVar, obj2, value, iu30Var2, (byte) 26);
                    x340Var3.s0(gghVar);
                }
                x340Var2 = x340Var3;
                i11 = i10;
                ipb1Var2 = ipb1Var2;
                obj2 = obj;
                dgo1.c(yvg1Var2, (iu30) gghVar, apo.r(-667814186, new ktw(obj, gujVar, jswVar2, ven0Var, ipb1Var4, str2, maaVar, iu30Var2, iIntValue, ipb1Var2, qim0Var4, i6, (byte) 1), x340Var2), x340Var2, 384);
                zG6 = x340Var2.g(gujVar);
                objT12 = x340Var2.T();
                if (zG6) {
                    m4cVar = m4cVar2;
                    if (objT12 == m4cVar) {
                    }
                    obj3 = objT12;
                    q811Var2 = (q811) obj3;
                    if (i11 != 32) {
                        z = true;
                    } else {
                        z = true;
                    }
                    zI4 = z | x340Var2.i(q811Var2) | x340Var2.i(gujVar) | x340Var2.e(iIntValue);
                    objT13 = x340Var2.T();
                    if (zI4) {
                        ltw ltwVar4 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                        obj2 = obj2;
                        x340Var2.s0(ltwVar4);
                        objT13 = ltwVar4;
                    } else {
                        ltw ltwVar5 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                        obj2 = obj2;
                        x340Var2.s0(ltwVar5);
                        objT13 = ltwVar5;
                    }
                    qxd0.s(obj2, gujVar, (vu30) objT13, x340Var2);
                    qim0Var3 = qim0Var4;
                    x340Var = x340Var2;
                } else {
                    m4cVar = m4cVar2;
                }
                obj3 = objT12;
                q811 q811Var4 = new q811();
                q811Var4.a = obj2;
                x340Var2.s0(q811Var4);
                Object obj4 = q811Var4;
                obj4 = objT12;
                q811Var2 = (q811) obj4;
                if (i11 != 32) {
                    z = true;
                } else {
                    z = true;
                }
                zI4 = z | x340Var2.i(q811Var2) | x340Var2.i(gujVar) | x340Var2.e(iIntValue);
                objT13 = x340Var2.T();
                if (zI4) {
                    ltw ltwVar6 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                    obj2 = obj2;
                    x340Var2.s0(ltwVar6);
                    objT13 = ltwVar6;
                } else {
                    ltw ltwVar7 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                    obj2 = obj2;
                    x340Var2.s0(ltwVar7);
                    objT13 = ltwVar7;
                }
                qxd0.s(obj2, gujVar, (vu30) objT13, x340Var2);
                qim0Var3 = qim0Var4;
                x340Var = x340Var2;
            } else {
                x340 x340Var5 = x340Var3;
                x340Var5.b0();
                qim0Var3 = qim0Var2;
                x340Var = x340Var5;
            }
            ipb1Var3 = ipb1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2(maaVar, obj2, qim0Var3, ipb1Var3, i, i2, (byte) 8);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                ipb1Var2 = ipb1Var;
                if (x340Var3.g(ipb1Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3;
            z = false;
            if ((i6 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var3.Y(i6 & 1, z2)) {
                if (i12 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    ipb1Var2 = null;
                }
                i7 = i6 & 14;
                if (i7 != 4) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                objT = x340Var3.T();
                if (z3) {
                    objT = d(maaVar);
                    x340Var3.s0(objT);
                } else {
                    objT = d(maaVar);
                    x340Var3.s0(objT);
                }
                iu30Var = (iu30) objT;
                if (i7 != 4) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if ((i6 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objT2 = x340Var3.T();
                if (z6) {
                    if (ipb1Var2 == null) {
                        objT2 = maaVar.getBehavior().b(null, null, null);
                    } else {
                        objT2 = ipb1Var2;
                    }
                    x340Var3.s0(objT2);
                } else {
                    if (ipb1Var2 == null) {
                        objT2 = maaVar.getBehavior().b(null, null, null);
                    } else {
                        objT2 = ipb1Var2;
                    }
                    x340Var3.s0(objT2);
                }
                ipb1Var4 = (ipb1) objT2;
                zG = x340Var3.g(ipb1Var4);
                objT3 = x340Var3.T();
                if (zG) {
                    objT3 = ipb1Var4.h();
                    x340Var3.s0(objT3);
                } else {
                    objT3 = ipb1Var4.h();
                    x340Var3.s0(objT3);
                }
                String str3 = (String) objT3;
                ven0VarV = xto.v(obj2, x340Var3);
                objT4 = x340Var3.T();
                if (objT4 == m4cVar2) {
                    objT4 = new q811();
                    x340Var3.s0(objT4);
                }
                q811Var = (q811) objT4;
                o7g1Var = (o7g1) x340Var3.k(i7g1.a());
                if (i7 != 4) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                zG2 = z7 | x340Var3.g(str3);
                objT5 = x340Var3.T();
                if (zG2) {
                    o7g1Var2 = (o7g1) h7g1.b().get();
                    h7g1.b().set(o7g1Var);
                    guj gujVarD4 = acq0.D(maaVar, obj2, ipb1Var4, new ggh(iu30Var, q811Var, maaVar, ven0VarV));
                    h7g1.b().set(o7g1Var2);
                    x340Var3.s0(gujVarD4);
                    objT5 = gujVarD4;
                } else {
                    o7g1Var2 = (o7g1) h7g1.b().get();
                    h7g1.b().set(o7g1Var);
                    guj gujVarD5 = acq0.D(maaVar, obj2, ipb1Var4, new ggh(iu30Var, q811Var, maaVar, ven0VarV));
                    h7g1.b().set(o7g1Var2);
                    x340Var3.s0(gujVarD5);
                    objT5 = gujVarD5;
                }
                gujVar = (guj) objT5;
                zG3 = x340Var3.g(gujVar);
                objT6 = x340Var3.T();
                if (zG3) {
                    objT6 = xto.t(gujVar.b.x());
                    x340Var3.s0(objT6);
                } else {
                    objT6 = xto.t(gujVar.b.x());
                    x340Var3.s0(objT6);
                }
                ven0Var = (ven0) objT6;
                zI = x340Var3.i(gujVar) | x340Var3.g(ven0Var) | x340Var3.i(q811Var);
                objT7 = x340Var3.T();
                if (zI) {
                    objT7 = new m3n(gujVar, ven0Var, q811Var, (byte) 24);
                    x340Var3.s0(objT7);
                } else {
                    objT7 = new m3n(gujVar, ven0Var, q811Var, (byte) 24);
                    x340Var3.s0(objT7);
                }
                qxd0.i(gujVar, (iu30) objT7, x340Var3);
                zI2 = x340Var3.i(gujVar);
                objT8 = x340Var3.T();
                if (zI2) {
                    i8 = 4;
                    objT8 = new i5w(gujVar, (byte) 4);
                    x340Var3.s0(objT8);
                } else {
                    i8 = 4;
                    objT8 = new i5w(gujVar, (byte) 4);
                    x340Var3.s0(objT8);
                }
                qxd0.i(gujVar, (iu30) objT8, x340Var3);
                if (i7 != i8) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                objT9 = x340Var3.T();
                if (z8) {
                    objT9 = maaVar.c();
                    x340Var3.s0(objT9);
                } else {
                    objT9 = maaVar.c();
                    x340Var3.s0(objT9);
                }
                jsw jswVar3 = (jsw) objT9;
                zG4 = x340Var3.g(gujVar);
                objT10 = x340Var3.T();
                if (zG4) {
                    objT10 = Integer.valueOf(System.identityHashCode(gujVar));
                    x340Var3.s0(objT10);
                } else {
                    objT10 = Integer.valueOf(System.identityHashCode(gujVar));
                    x340Var3.s0(objT10);
                }
                iIntValue = ((Number) objT10).intValue();
                value = ven0Var.getValue();
                if (i7 != 4) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                i9 = i6 & 112;
                boolean z15 = z9;
                if (i9 != 32) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                zG5 = z15 | z10 | x340Var3.g(value);
                objT11 = x340Var3.T();
                if (zG5) {
                    objT11 = new yvg1(maaVar, obj2, value);
                    x340Var3.s0(objT11);
                } else {
                    objT11 = new yvg1(maaVar, obj2, value);
                    x340Var3.s0(objT11);
                }
                yvg1 yvg1Var3 = (yvg1) objT11;
                if (i7 != 4) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (i9 != 32) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                zI3 = z11 | z12 | x340Var3.i(value) | x340Var3.g(iu30Var);
                Object objT16 = x340Var3.T();
                if (zI3) {
                    i10 = i9;
                    iu30Var2 = iu30Var;
                    gghVar = new ggh(maaVar, obj2, value, iu30Var2, (byte) 26);
                    x340Var3.s0(gghVar);
                } else {
                    i10 = i9;
                    iu30Var2 = iu30Var;
                    gghVar = new ggh(maaVar, obj2, value, iu30Var2, (byte) 26);
                    x340Var3.s0(gghVar);
                }
                x340Var2 = x340Var3;
                i11 = i10;
                ipb1Var2 = ipb1Var2;
                obj2 = obj;
                dgo1.c(yvg1Var3, (iu30) gghVar, apo.r(-667814186, new ktw(obj, gujVar, jswVar3, ven0Var, ipb1Var4, str3, maaVar, iu30Var2, iIntValue, ipb1Var2, qim0Var4, i6, (byte) 1), x340Var2), x340Var2, 384);
                zG6 = x340Var2.g(gujVar);
                objT12 = x340Var2.T();
                if (zG6) {
                    m4cVar = m4cVar2;
                    if (objT12 == m4cVar) {
                    }
                    obj4 = objT12;
                    q811Var2 = (q811) obj4;
                    if (i11 != 32) {
                        z = true;
                    } else {
                        z = true;
                    }
                    zI4 = z | x340Var2.i(q811Var2) | x340Var2.i(gujVar) | x340Var2.e(iIntValue);
                    objT13 = x340Var2.T();
                    if (zI4) {
                        ltw ltwVar8 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                        obj2 = obj2;
                        x340Var2.s0(ltwVar8);
                        objT13 = ltwVar8;
                    } else {
                        ltw ltwVar9 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                        obj2 = obj2;
                        x340Var2.s0(ltwVar9);
                        objT13 = ltwVar9;
                    }
                    qxd0.s(obj2, gujVar, (vu30) objT13, x340Var2);
                    qim0Var3 = qim0Var4;
                    x340Var = x340Var2;
                } else {
                    m4cVar = m4cVar2;
                }
                obj4 = objT12;
                q811 q811Var5 = new q811();
                q811Var5.a = obj2;
                x340Var2.s0(q811Var5);
                Object obj5 = q811Var5;
                obj5 = objT12;
                q811Var2 = (q811) obj5;
                if (i11 != 32) {
                    z = true;
                } else {
                    z = true;
                }
                zI4 = z | x340Var2.i(q811Var2) | x340Var2.i(gujVar) | x340Var2.e(iIntValue);
                objT13 = x340Var2.T();
                if (zI4) {
                    ltw ltwVar10 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                    obj2 = obj2;
                    x340Var2.s0(ltwVar10);
                    objT13 = ltwVar10;
                } else {
                    ltw ltwVar11 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                    obj2 = obj2;
                    x340Var2.s0(ltwVar11);
                    objT13 = ltwVar11;
                }
                qxd0.s(obj2, gujVar, (vu30) objT13, x340Var2);
                qim0Var3 = qim0Var4;
                x340Var = x340Var2;
            } else {
                x340 x340Var6 = x340Var3;
                x340Var6.b0();
                qim0Var3 = qim0Var2;
                x340Var = x340Var6;
            }
            ipb1Var3 = ipb1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2(maaVar, obj2, qim0Var3, ipb1Var3, i, i2, (byte) 8);
            }
        }
        i3 |= 3072;
        ipb1Var2 = ipb1Var;
        i6 = i3;
        z = false;
        if ((i6 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var3.Y(i6 & 1, z2)) {
            if (i12 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i4 != 0) {
                ipb1Var2 = null;
            }
            i7 = i6 & 14;
            if (i7 != 4) {
                z3 = true;
            } else {
                z3 = true;
            }
            objT = x340Var3.T();
            if (z3) {
                objT = d(maaVar);
                x340Var3.s0(objT);
            } else {
                objT = d(maaVar);
                x340Var3.s0(objT);
            }
            iu30Var = (iu30) objT;
            if (i7 != 4) {
                z4 = true;
            } else {
                z4 = true;
            }
            if ((i6 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z4 | z5;
            objT2 = x340Var3.T();
            if (z6) {
                if (ipb1Var2 == null) {
                    objT2 = maaVar.getBehavior().b(null, null, null);
                } else {
                    objT2 = ipb1Var2;
                }
                x340Var3.s0(objT2);
            } else {
                if (ipb1Var2 == null) {
                    objT2 = maaVar.getBehavior().b(null, null, null);
                } else {
                    objT2 = ipb1Var2;
                }
                x340Var3.s0(objT2);
            }
            ipb1Var4 = (ipb1) objT2;
            zG = x340Var3.g(ipb1Var4);
            objT3 = x340Var3.T();
            if (zG) {
                objT3 = ipb1Var4.h();
                x340Var3.s0(objT3);
            } else {
                objT3 = ipb1Var4.h();
                x340Var3.s0(objT3);
            }
            String str4 = (String) objT3;
            ven0VarV = xto.v(obj2, x340Var3);
            objT4 = x340Var3.T();
            if (objT4 == m4cVar2) {
                objT4 = new q811();
                x340Var3.s0(objT4);
            }
            q811Var = (q811) objT4;
            o7g1Var = (o7g1) x340Var3.k(i7g1.a());
            if (i7 != 4) {
                z7 = true;
            } else {
                z7 = true;
            }
            zG2 = z7 | x340Var3.g(str4);
            objT5 = x340Var3.T();
            if (zG2) {
                o7g1Var2 = (o7g1) h7g1.b().get();
                h7g1.b().set(o7g1Var);
                guj gujVarD6 = acq0.D(maaVar, obj2, ipb1Var4, new ggh(iu30Var, q811Var, maaVar, ven0VarV));
                h7g1.b().set(o7g1Var2);
                x340Var3.s0(gujVarD6);
                objT5 = gujVarD6;
            } else {
                o7g1Var2 = (o7g1) h7g1.b().get();
                h7g1.b().set(o7g1Var);
                guj gujVarD7 = acq0.D(maaVar, obj2, ipb1Var4, new ggh(iu30Var, q811Var, maaVar, ven0VarV));
                h7g1.b().set(o7g1Var2);
                x340Var3.s0(gujVarD7);
                objT5 = gujVarD7;
            }
            gujVar = (guj) objT5;
            zG3 = x340Var3.g(gujVar);
            objT6 = x340Var3.T();
            if (zG3) {
                objT6 = xto.t(gujVar.b.x());
                x340Var3.s0(objT6);
            } else {
                objT6 = xto.t(gujVar.b.x());
                x340Var3.s0(objT6);
            }
            ven0Var = (ven0) objT6;
            zI = x340Var3.i(gujVar) | x340Var3.g(ven0Var) | x340Var3.i(q811Var);
            objT7 = x340Var3.T();
            if (zI) {
                objT7 = new m3n(gujVar, ven0Var, q811Var, (byte) 24);
                x340Var3.s0(objT7);
            } else {
                objT7 = new m3n(gujVar, ven0Var, q811Var, (byte) 24);
                x340Var3.s0(objT7);
            }
            qxd0.i(gujVar, (iu30) objT7, x340Var3);
            zI2 = x340Var3.i(gujVar);
            objT8 = x340Var3.T();
            if (zI2) {
                i8 = 4;
                objT8 = new i5w(gujVar, (byte) 4);
                x340Var3.s0(objT8);
            } else {
                i8 = 4;
                objT8 = new i5w(gujVar, (byte) 4);
                x340Var3.s0(objT8);
            }
            qxd0.i(gujVar, (iu30) objT8, x340Var3);
            if (i7 != i8) {
                z8 = true;
            } else {
                z8 = true;
            }
            objT9 = x340Var3.T();
            if (z8) {
                objT9 = maaVar.c();
                x340Var3.s0(objT9);
            } else {
                objT9 = maaVar.c();
                x340Var3.s0(objT9);
            }
            jsw jswVar4 = (jsw) objT9;
            zG4 = x340Var3.g(gujVar);
            objT10 = x340Var3.T();
            if (zG4) {
                objT10 = Integer.valueOf(System.identityHashCode(gujVar));
                x340Var3.s0(objT10);
            } else {
                objT10 = Integer.valueOf(System.identityHashCode(gujVar));
                x340Var3.s0(objT10);
            }
            iIntValue = ((Number) objT10).intValue();
            value = ven0Var.getValue();
            if (i7 != 4) {
                z9 = true;
            } else {
                z9 = true;
            }
            i9 = i6 & 112;
            boolean z16 = z9;
            if (i9 != 32) {
                z10 = true;
            } else {
                z10 = true;
            }
            zG5 = z16 | z10 | x340Var3.g(value);
            objT11 = x340Var3.T();
            if (zG5) {
                objT11 = new yvg1(maaVar, obj2, value);
                x340Var3.s0(objT11);
            } else {
                objT11 = new yvg1(maaVar, obj2, value);
                x340Var3.s0(objT11);
            }
            yvg1 yvg1Var4 = (yvg1) objT11;
            if (i7 != 4) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (i9 != 32) {
                z12 = true;
            } else {
                z12 = true;
            }
            zI3 = z11 | z12 | x340Var3.i(value) | x340Var3.g(iu30Var);
            Object objT17 = x340Var3.T();
            if (zI3) {
                i10 = i9;
                iu30Var2 = iu30Var;
                gghVar = new ggh(maaVar, obj2, value, iu30Var2, (byte) 26);
                x340Var3.s0(gghVar);
            } else {
                i10 = i9;
                iu30Var2 = iu30Var;
                gghVar = new ggh(maaVar, obj2, value, iu30Var2, (byte) 26);
                x340Var3.s0(gghVar);
            }
            x340Var2 = x340Var3;
            i11 = i10;
            ipb1Var2 = ipb1Var2;
            obj2 = obj;
            dgo1.c(yvg1Var4, (iu30) gghVar, apo.r(-667814186, new ktw(obj, gujVar, jswVar4, ven0Var, ipb1Var4, str4, maaVar, iu30Var2, iIntValue, ipb1Var2, qim0Var4, i6, (byte) 1), x340Var2), x340Var2, 384);
            zG6 = x340Var2.g(gujVar);
            objT12 = x340Var2.T();
            if (zG6) {
                m4cVar = m4cVar2;
                if (objT12 == m4cVar) {
                }
                obj5 = objT12;
                q811Var2 = (q811) obj5;
                if (i11 != 32) {
                    z = true;
                } else {
                    z = true;
                }
                zI4 = z | x340Var2.i(q811Var2) | x340Var2.i(gujVar) | x340Var2.e(iIntValue);
                objT13 = x340Var2.T();
                if (zI4) {
                    ltw ltwVar12 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                    obj2 = obj2;
                    x340Var2.s0(ltwVar12);
                    objT13 = ltwVar12;
                } else {
                    ltw ltwVar13 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                    obj2 = obj2;
                    x340Var2.s0(ltwVar13);
                    objT13 = ltwVar13;
                }
                qxd0.s(obj2, gujVar, (vu30) objT13, x340Var2);
                qim0Var3 = qim0Var4;
                x340Var = x340Var2;
            } else {
                m4cVar = m4cVar2;
            }
            obj5 = objT12;
            q811 q811Var6 = new q811();
            q811Var6.a = obj2;
            x340Var2.s0(q811Var6);
            Object obj6 = q811Var6;
            obj6 = objT12;
            q811Var2 = (q811) obj6;
            if (i11 != 32) {
                z = true;
            } else {
                z = true;
            }
            zI4 = z | x340Var2.i(q811Var2) | x340Var2.i(gujVar) | x340Var2.e(iIntValue);
            objT13 = x340Var2.T();
            if (zI4) {
                ltw ltwVar14 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                obj2 = obj2;
                x340Var2.s0(ltwVar14);
                objT13 = ltwVar14;
            } else {
                ltw ltwVar15 = new ltw(obj2, q811Var2, gujVar, iIntValue, null);
                obj2 = obj2;
                x340Var2.s0(ltwVar15);
                objT13 = ltwVar15;
            }
            qxd0.s(obj2, gujVar, (vu30) objT13, x340Var2);
            qim0Var3 = qim0Var4;
            x340Var = x340Var2;
        } else {
            x340 x340Var7 = x340Var3;
            x340Var7.b0();
            qim0Var3 = qim0Var2;
            x340Var = x340Var7;
        }
        ipb1Var3 = ipb1Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2(maaVar, obj2, qim0Var3, ipb1Var3, i, i2, (byte) 8);
        }
    }

    public static final iu30 d(maa maaVar) {
        boolean z = maaVar instanceof kpg0;
        if (!z) {
            return z ? d(((kpg0) maaVar).a) : a9o.t;
        }
        kpg0 kpg0Var = (kpg0) maaVar;
        iu30 iu30VarD = d(kpg0Var.a);
        iu30 iu30Var = kpg0Var.b;
        w0h1.o(1, iu30Var);
        return new jjv(iu30Var, iu30VarD, (byte) 1);
    }

    public static final void e(ipb1 ipb1Var, Object obj, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        ipb1 ipb1Var2;
        Object obj2;
        j2i j2iVar2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(158970453);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ipb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ipb1Var2 = ipb1Var;
            obj2 = obj;
            j2iVar2 = j2iVar;
            x340Var.b0();
        } else {
            if (ipb1Var == null) {
                x340Var.i0(-1460022353);
                j2iVar.invoke(x340Var, Integer.valueOf((i2 >> 6) & 14));
                x340Var.r(false);
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ntw(ipb1Var, obj, j2iVar, i, (byte) 0);
                    return;
                }
                return;
            }
            ipb1Var2 = ipb1Var;
            j2iVar2 = j2iVar;
            obj2 = obj;
            boolean z = false;
            x340Var.i0(-1459993523);
            x340Var.r(false);
            kiv kivVar = pd41.a;
            Object objK = x340Var.k(kivVar);
            if (objK == null) {
                eg.m("Element UI-state restoration requires a parent SaveableStateRegistry");
                return;
            }
            nd41 nd41Var = (nd41) objK;
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | x340Var.g(nd41Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = y4o1.u(ipb1Var2, new r1t(nd41Var));
                x340Var.s0(objT);
            }
            nd41 nd41Var2 = (nd41) objT;
            mod.b(kivVar.a(nd41Var2), apo.r(1994298773, new vvb(obj2, j2iVar2), x340Var), x340Var, 56);
            boolean zI = x340Var.i(nd41Var2) | (i3 == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new f2t(nd41Var2, ipb1Var2, (byte) 27);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (i3 == 4) {
                z = true;
            }
            boolean zG2 = x340Var.g(function0) | z;
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new w3w(ipb1Var2, function0, (byte) 6);
                x340Var.s0(objT3);
            }
            qxd0.h(nd41Var2, ipb1Var2, (iu30) objT3, x340Var);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new ntw(ipb1Var2, obj2, j2iVar2, i, (byte) 1);
        }
    }

    public static final void f(Object obj, guj gujVar, int i, ztw ztwVar, op80 op80Var, String str, iu30 iu30Var) {
        if (gujVar.b.w()) {
            eg.m("Can not dispatchVisibilityPercentageChanged because element runtime is already disposed");
        } else if (gujVar.a.a().c(obj, gujVar.b.x(), op80Var)) {
            ztwVar.c(i, op80Var, new vt1(gujVar, obj, op80Var, iu30Var, str, (byte) 16));
        } else {
            ztwVar.c(0, op80Var, c);
        }
    }
}
