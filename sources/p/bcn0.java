package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class bcn0 {
    public static final AtomicLong a = new AtomicLong();

    /* JADX WARN: Code duplicated, block: B:213:0x052a  */
    /* JADX WARN: Code duplicated, block: B:218:0x053f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0542  */
    /* JADX WARN: Code duplicated, block: B:222:0x0545  */
    /* JADX WARN: Code duplicated, block: B:223:0x0553  */
    /* JADX WARN: Code duplicated, block: B:225:0x0571  */
    /* JADX WARN: Code duplicated, block: B:228:0x0579  */
    /* JADX WARN: Code duplicated, block: B:230:0x0583  */
    /* JADX WARN: Code duplicated, block: B:231:0x0588  */
    /* JADX WARN: Code duplicated, block: B:234:0x0592  */
    /* JADX WARN: Code duplicated, block: B:235:0x0595  */
    /* JADX WARN: Code duplicated, block: B:237:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:243:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:247:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:249:0x0609  */
    /* JADX WARN: Code duplicated, block: B:250:0x060b  */
    public static final void a(ksw kswVar, klw0 klw0Var, String str, yqg yqgVar, n1k n1kVar, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        klw0 klw0Var2;
        ttm0 ttm0Var;
        zau0 zau0Var;
        byte b;
        lnm lnmVar;
        ven0 ven0Var;
        ven0 ven0Var2;
        tob1 tob1Var;
        tob1 tob1Var2;
        x340 x340Var2;
        lnm lnmVar2;
        lsm0 lsm0Var;
        tob1 tob1Var3;
        tob1 tob1Var4;
        tob1 tob1Var5;
        long jLongValue;
        i091 i091Var;
        i091 i091Var2;
        boolean z2;
        cbn0 cbn0Var;
        Long lValueOf;
        long j;
        cbn0 cbn0Var2;
        cbn0 cbn0VarR;
        boolean zG;
        Object objT;
        boolean zG2;
        Object objT2;
        cbn0 cbn0Var3;
        i091 i091Var3;
        boolean z3;
        boolean z4;
        long jLongValue2;
        Object obj = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(271690842);
        if ((i & 6) == 0) {
            i2 = (x340Var3.g(kswVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var3.g(klw0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var3.g(yqgVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var3.i(n1kVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var3.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var3.i(j2iVar) ? 1048576 : 524288;
        }
        if (x340Var3.Y(i2 & 1, (599187 & i2) != 599186)) {
            cir0 cir0Var = (cir0) x340Var3.k(k2r0.a);
            ttm0 ttm0VarE = cwl1.E(cir0Var.g());
            boolean zG3 = x340Var3.g(ttm0VarE);
            Object objT3 = x340Var3.T();
            if (zG3 || objT3 == obj) {
                objT3 = ttm0VarE.c(false);
                x340Var3.s0(objT3);
            }
            zau0 zau0Var2 = (zau0) objT3;
            boolean z5 = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((458752 & i2) == 131072);
            Object objT4 = x340Var3.T();
            if (z5 || objT4 == obj) {
                if (klw0Var != null) {
                    long j2 = klw0Var.b;
                    Long lValueOf2 = j2 > 0 ? Long.valueOf(j2) : null;
                    long j3 = klw0Var.c;
                    Long lValueOf3 = j3 > j2 ? Long.valueOf(j3) : null;
                    ttm0Var = ttm0VarE;
                    lnmVar = null;
                    Long l = lValueOf2;
                    b = 1;
                    zau0Var = zau0Var2;
                    objT4 = new lsm0(klw0Var.a, new ksm0(fec1.c, (String) null, (String) null, "music-video-sticker-share-card", str, (String) null, 486), z, false, (l == null && lValueOf3 == null) ? null : new jsm0(l, lValueOf3), 0L, (ism0) null, (String) null, false, 0, 2016);
                } else {
                    ttm0Var = ttm0VarE;
                    zau0Var = zau0Var2;
                    b = 1;
                    lnmVar = null;
                    objT4 = null;
                }
                x340Var3.s0(objT4);
            } else {
                cir0Var = cir0Var;
                ttm0Var = ttm0VarE;
                zau0Var = zau0Var2;
                b = 1;
                lnmVar = null;
            }
            lsm0 lsm0Var2 = (lsm0) objT4;
            byte b2 = lsm0Var2 != null ? b : (byte) 0;
            tob1 tob1VarB = qxy0.B(zau0Var, x340Var3);
            boolean zG4 = x340Var3.g(zau0Var);
            Object objT5 = x340Var3.T();
            if (zG4 || objT5 == obj) {
                objT5 = v8r.q(lnmVar);
                x340Var3.s0(objT5);
            }
            ven0 ven0Var3 = (ven0) objT5;
            boolean zG5 = x340Var3.g(tob1VarB) | x340Var3.g(ven0Var3);
            Object objT6 = x340Var3.T();
            if (zG5 || objT6 == obj) {
                objT6 = new yka(tob1VarB, ven0Var3, b);
                x340Var3.s0(objT6);
            }
            qxd0.S((Function0) objT6, x340Var3);
            boolean zI = x340Var3.i(ttm0Var) | x340Var3.i(zau0Var) | x340Var3.g(ven0Var3);
            Object objT7 = x340Var3.T();
            if (zI || objT7 == obj) {
                objT7 = new gnf0(ttm0Var, zau0Var, ven0Var3, (byte) 29);
                x340Var3.s0(objT7);
            }
            qxd0.h(ttm0Var, zau0Var, (iu30) objT7, x340Var3);
            boolean zG6 = x340Var3.g(lsm0Var2);
            Object objT8 = x340Var3.T();
            if (zG6 || objT8 == obj) {
                objT8 = v8r.q(Boolean.FALSE);
                x340Var3.s0(objT8);
            }
            ven0 ven0Var4 = (ven0) objT8;
            boolean zG7 = x340Var3.g(lsm0Var2);
            Object objT9 = x340Var3.T();
            if (zG7 || objT9 == obj) {
                objT9 = v8r.q(Boolean.FALSE);
                x340Var3.s0(objT9);
            }
            tob1 tob1Var6 = (ven0) objT9;
            boolean zG8 = x340Var3.g(lsm0Var2);
            Object objT10 = x340Var3.T();
            if (zG8 || objT10 == obj) {
                objT10 = v8r.q(Boolean.FALSE);
                x340Var3.s0(objT10);
            }
            tob1 tob1Var7 = (ven0) objT10;
            boolean zG9 = x340Var3.g(lsm0Var2);
            Object objT11 = x340Var3.T();
            if (zG9 || objT11 == obj) {
                objT11 = bb00.h(0, x340Var3);
            }
            err0 err0Var = (hdn0) objT11;
            boolean zG10 = x340Var3.g(ven0Var3) | x340Var3.i(ttm0Var) | x340Var3.i(zau0Var) | x340Var3.g(ven0Var4) | x340Var3.g(tob1Var6) | x340Var3.g(tob1Var7);
            Object objT12 = x340Var3.T();
            if (zG10 || objT12 == obj) {
                ven0Var = ven0Var3;
                ven0Var2 = ven0Var4;
                tob1Var = tob1Var7;
                tob1Var2 = tob1Var6;
                objT12 = new dy7(ttm0Var, zau0Var, ven0Var, ven0Var2, tob1Var2, tob1Var, (byte) 13);
                x340Var3.s0(objT12);
            } else {
                ven0Var = ven0Var3;
                ven0Var2 = ven0Var4;
                tob1Var = tob1Var7;
                tob1Var2 = tob1Var6;
            }
            Function0 function0 = (Function0) objT12;
            ven0 ven0VarH = rwq.h(n1kVar.b, x340Var3, 0);
            Object objT13 = x340Var3.T();
            if (objT13 == obj) {
                objT13 = v8r.q(Boolean.FALSE);
                x340Var3.s0(objT13);
            }
            ven0 ven0Var5 = (ven0) objT13;
            if (b2 != 0 && z) {
                x340Var3.i0(-2069524386);
                boolean zI2 = x340Var3.i(n1kVar);
                Object objT14 = x340Var3.T();
                if (zI2 || objT14 == obj) {
                    objT14 = new xkm0(n1kVar, (byte) 17);
                    x340Var3.s0(objT14);
                }
                qxd0.i(n1kVar, (iu30) objT14, x340Var3);
                x340Var3.r(false);
                x340Var2 = x340Var3;
                i2 = i2;
            } else if (b2 != 0) {
                x340Var3.i0(-2069361729);
                Object objT15 = x340Var3.T();
                if (objT15 == obj) {
                    objT15 = "music-video-sticker-share-card:" + a.incrementAndGet();
                    x340Var3.s0(objT15);
                }
                String str2 = (String) objT15;
                tl7 tl7Var = (tl7) x340Var3.k(rce0.a);
                Object objT16 = x340Var3.T();
                if (objT16 == obj) {
                    objT16 = new q2j0(ven0Var5, (byte) 8);
                    x340Var3.s0(objT16);
                }
                Function0 function1 = (Function0) objT16;
                Object objT17 = x340Var3.T();
                if (objT17 == obj) {
                    objT17 = new q2j0(ven0Var5, (byte) 9);
                    x340Var3.s0(objT17);
                }
                x340Var2 = x340Var3;
                i1o1.b(kswVar, tl7Var, str2, function1, (Function0) objT17, x340Var2, (i2 & 14) | 28032, 0);
                x340Var2.r(false);
            } else {
                x340Var2 = x340Var3;
                i2 = i2;
                x340Var2.i0(-2069045560);
                x340Var2.r(false);
            }
            boolean z6 = b2 != 0 && (z || (((Boolean) ven0Var5.getValue()).booleanValue() && !((Boolean) ven0VarH.getValue()).booleanValue()));
            x340 x340Var4 = x340Var2;
            ven0 ven0VarG = rwq.g(cir0Var.i(), Boolean.FALSE, (o8n) null, x340Var4, 48, 2);
            boolean zA = ((w8c0) rwq.h(((iac0) x340Var4.k(jfe0.a)).getLifecycle().c(), x340Var4, 0).getValue()).a(w8c0.d);
            Boolean boolValueOf = Boolean.valueOf(z6);
            Boolean bool = (Boolean) ven0VarG.getValue();
            bool.getClass();
            Object[] objArr = {ttm0Var, zau0Var, boolValueOf, bool, Boolean.valueOf(zA)};
            boolean zH = x340Var4.h(z6) | x340Var4.i(ttm0Var) | x340Var4.i(zau0Var) | x340Var4.g(function0);
            Object objT18 = x340Var4.T();
            if (zH || objT18 == obj) {
                objT18 = new wkk0(z6, ttm0Var, zau0Var, function0, (lnm) null, (byte) 15);
                x340Var4.s0(objT18);
            }
            qxd0.u(objArr, (vu30) objT18, x340Var4);
            Object objT19 = x340Var4.T();
            if (objT19 == obj) {
                objT19 = v8r.q(lnmVar);
                x340Var4.s0(objT19);
            }
            ven0 ven0Var6 = (ven0) objT19;
            r091 r091Var = (r091) ven0Var.getValue();
            ven0 ven0Var7 = ven0Var;
            boolean zG11 = x340Var4.g(ven0Var7);
            Object objT20 = x340Var4.T();
            if (zG11 || objT20 == obj) {
                lnmVar2 = lnmVar;
                objT20 = new m3n0(ven0Var7, lnmVar2, (byte) 4);
                x340Var4.s0(objT20);
            } else {
                lnmVar2 = lnmVar;
            }
            ven0 ven0VarP = yto.p(lnmVar2, r091Var, (vu30) objT20, x340Var4, 6);
            err0 err0Var2 = err0Var;
            Object[] objArr2 = {(r091) tob1VarB.getValue(), (VideoSurfaceView) ven0Var6.getValue(), lsm0Var2, Integer.valueOf(err0Var2.s())};
            boolean zI3 = x340Var4.i(lsm0Var2) | x340Var4.g(tob1VarB) | x340Var4.g(tob1Var2);
            Object objT21 = x340Var4.T();
            if (zI3 || objT21 == obj) {
                lsm0Var = lsm0Var2;
                tob1Var3 = tob1VarB;
                objT21 = new c6h0(lsm0Var, tob1Var3, ven0Var6, tob1Var2, (lnm) null, (byte) 5);
                x340Var4.s0(objT21);
            } else {
                lsm0Var = lsm0Var2;
                tob1Var3 = tob1VarB;
            }
            qxd0.u(objArr2, (vu30) objT21, x340Var4);
            r091 r091Var2 = (r091) tob1Var3.getValue();
            Integer numValueOf = Integer.valueOf(err0Var2.s());
            tob1 tob1Var8 = tob1Var;
            boolean zG12 = x340Var4.g(tob1Var3) | x340Var4.i(lsm0Var) | x340Var4.g(tob1Var2) | x340Var4.g(tob1Var8);
            Object objT22 = x340Var4.T();
            if (zG12 || objT22 == obj) {
                tob1 tob1Var9 = tob1Var3;
                lsm0 lsm0Var3 = lsm0Var;
                tob1 tob1Var10 = tob1Var2;
                objT22 = new ofk0(tob1Var9, lsm0Var3, tob1Var10, tob1Var8, (lnm) null, (byte) 5, false);
                tob1Var3 = tob1Var9;
                lsm0Var = lsm0Var3;
                tob1Var4 = tob1Var10;
                tob1Var5 = tob1Var8;
                x340Var4.s0(objT22);
            } else {
                tob1Var4 = tob1Var2;
                tob1Var5 = tob1Var8;
            }
            qxd0.r(r091Var2, lsm0Var, numValueOf, (vu30) objT22, x340Var4);
            klw0Var2 = klw0Var;
            if (klw0Var != null) {
                long j4 = klw0Var2.c;
                long j5 = klw0Var2.b;
                Long lValueOf4 = Long.valueOf(j4 - j5);
                if (j4 <= j5) {
                    lValueOf4 = null;
                }
                jLongValue2 = lValueOf4 != null ? lValueOf4.longValue() : 0L;
                i091Var = (i091) ven0VarP.getValue();
                if (i091Var != null) {
                    if (((Boolean) ven0Var2.getValue()).booleanValue() || !u890.j(i091Var.a, lsm0Var)) {
                        i091Var = null;
                    }
                    i091Var2 = i091Var;
                } else {
                    i091Var2 = null;
                }
                if (i091Var2 == null) {
                    x340Var4.i0(-2066160639);
                    z2 = false;
                    x340Var4.r(false);
                    lValueOf = null;
                    cbn0Var = null;
                } else {
                    z2 = false;
                    x340Var4.i0(-2066160638);
                    cbn0Var = null;
                    long jC = z1p1.C(i091Var2, jLongValue, yqgVar, x340Var4, (i2 >> 3) & 896);
                    x340Var4.r(false);
                    lValueOf = Long.valueOf(jC);
                }
                if (lValueOf != null) {
                    x340Var4 = x340Var4;
                    jLongValue = lValueOf.longValue();
                }
                x340Var4 = x340Var4;
                j = jLongValue;
                if (b2 != 0) {
                    i091Var3 = (i091) ven0VarP.getValue();
                    if (i091Var3 != null) {
                        z3 = i091Var3.g;
                    } else {
                        z3 = true;
                    }
                    if (((r091) tob1Var3.getValue()) != null) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    cbn0Var2 = new cbn0(z3, z4, j, ((Boolean) tob1Var4.getValue()).booleanValue(), ((Boolean) tob1Var5.getValue()).booleanValue(), ((Boolean) ven0Var2.getValue()).booleanValue());
                } else {
                    cbn0Var2 = cbn0Var;
                }
                cbn0VarR = apo.r(783665710, new p6k(ven0Var2, ven0Var6, (byte) 1), x340Var4);
                zG = x340Var4.g(tob1Var3) | x340Var4.g(cbn0Var2);
                objT = x340Var4.T();
                if (zG || objT == obj) {
                    objT = new s2n0(cbn0Var2, tob1Var3, (byte) 8);
                    x340Var4.s0(objT);
                }
                Object obj2 = objT;
                zG2 = x340Var4.g(tob1Var5) | x340Var4.g(err0Var);
                objT2 = x340Var4.T();
                if (zG2 || objT2 == obj) {
                    objT2 = new s2n0(tob1Var5, err0Var, (byte) 7);
                    x340Var4.s0(objT2);
                }
                if (b2 != 0) {
                    cbn0Var3 = cbn0VarR;
                } else {
                    cbn0Var3 = cbn0Var;
                }
                x340 x340Var5 = x340Var4;
                j2iVar.Y(cbn0Var2, obj2, objT2, cbn0Var3, x340Var5, Integer.valueOf(57344 & (i2 >> 6)));
                x340Var = x340Var5;
            }
            i091 i091Var4 = (i091) ven0VarP.getValue();
            jLongValue = i091Var4 != null ? i091Var4.e : jLongValue2;
            i091Var = (i091) ven0VarP.getValue();
            if (i091Var != null) {
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    i091Var = null;
                } else {
                    i091Var = null;
                }
                i091Var2 = i091Var;
            } else {
                i091Var2 = null;
            }
            if (i091Var2 == null) {
                x340Var4.i0(-2066160639);
                z2 = false;
                x340Var4.r(false);
                lValueOf = null;
                cbn0Var = null;
            } else {
                z2 = false;
                x340Var4.i0(-2066160638);
                cbn0Var = null;
                long jC2 = z1p1.C(i091Var2, jLongValue, yqgVar, x340Var4, (i2 >> 3) & 896);
                x340Var4.r(false);
                lValueOf = Long.valueOf(jC2);
            }
            if (lValueOf != null) {
                x340Var4 = x340Var4;
                jLongValue = lValueOf.longValue();
            }
            x340Var4 = x340Var4;
            j = jLongValue;
            if (b2 != 0) {
                i091Var3 = (i091) ven0VarP.getValue();
                if (i091Var3 != null) {
                    z3 = i091Var3.g;
                } else {
                    z3 = true;
                }
                if (((r091) tob1Var3.getValue()) != null) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                cbn0Var2 = new cbn0(z3, z4, j, ((Boolean) tob1Var4.getValue()).booleanValue(), ((Boolean) tob1Var5.getValue()).booleanValue(), ((Boolean) ven0Var2.getValue()).booleanValue());
            } else {
                cbn0Var2 = cbn0Var;
            }
            cbn0VarR = apo.r(783665710, new p6k(ven0Var2, ven0Var6, (byte) 1), x340Var4);
            zG = x340Var4.g(tob1Var3) | x340Var4.g(cbn0Var2);
            objT = x340Var4.T();
            if (zG) {
                objT = new s2n0(cbn0Var2, tob1Var3, (byte) 8);
                x340Var4.s0(objT);
            } else {
                objT = new s2n0(cbn0Var2, tob1Var3, (byte) 8);
                x340Var4.s0(objT);
            }
            Object obj3 = objT;
            zG2 = x340Var4.g(tob1Var5) | x340Var4.g(err0Var);
            objT2 = x340Var4.T();
            if (zG2) {
                objT2 = new s2n0(tob1Var5, err0Var, (byte) 7);
                x340Var4.s0(objT2);
            } else {
                objT2 = new s2n0(tob1Var5, err0Var, (byte) 7);
                x340Var4.s0(objT2);
            }
            if (b2 != 0) {
                cbn0Var3 = cbn0VarR;
            } else {
                cbn0Var3 = cbn0Var;
            }
            x340 x340Var6 = x340Var4;
            j2iVar.Y(cbn0Var2, obj3, objT2, cbn0Var3, x340Var6, Integer.valueOf(57344 & (i2 >> 6)));
            x340Var = x340Var6;
        } else {
            x340Var = x340Var3;
            klw0Var2 = klw0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1((byte) 6, i, kswVar, klw0Var2, str, yqgVar, n1kVar, j2iVar, z);
        }
    }
}
