package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kkz0 extends f311 {
    public final /* synthetic */ byte a = 3;
    public final Object b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kkz0(h9f1 h9f1Var, boolean z) {
        this.d = h9f1Var;
        this.c = z;
        List list = h9f1Var.b;
        this.f = new ok41((list.size() * 83) + 666);
        List<wi90> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (wi90 wi90Var : list2) {
            arrayList.add(new es70(wi90Var.b, new gsc1(wi90Var, (byte) 26)));
        }
        this.e = arrayList;
        List list3 = ((h9f1) this.d).b;
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wi90) it.next()).a);
        }
        this.b = mqo1.A(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:208:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:211:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:212:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:214:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:215:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:218:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:221:0x0602 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x0604  */
    /* JADX WARN: Code duplicated, block: B:223:0x0615  */
    /* JADX WARN: Code duplicated, block: B:226:0x063f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0643  */
    /* JADX WARN: Code duplicated, block: B:231:0x0667 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x0669  */
    /* JADX WARN: Code duplicated, block: B:235:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:237:0x0701  */
    /* JADX WARN: Code duplicated, block: B:238:0x0705  */
    /* JADX WARN: Code duplicated, block: B:241:0x0752  */
    /* JADX WARN: Code duplicated, block: B:242:0x0756  */
    /* JADX WARN: Code duplicated, block: B:245:0x077a  */
    /* JADX WARN: Code duplicated, block: B:246:0x077d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0780  */
    /* JADX WARN: Code duplicated, block: B:250:0x0794  */
    /* JADX WARN: Code duplicated, block: B:252:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:253:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:256:0x0812  */
    /* JADX WARN: Code duplicated, block: B:259:0x0817  */
    /* JADX WARN: Code duplicated, block: B:264:0x0882  */
    /* JADX WARN: Code duplicated, block: B:267:0x08a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:271:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:273:0x08fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0900  */
    /* JADX WARN: Code duplicated, block: B:278:0x0928  */
    /* JADX WARN: Code duplicated, block: B:281:0x093a  */
    /* JADX WARN: Code duplicated, block: B:282:0x0948  */
    /* JADX WARN: Code duplicated, block: B:284:0x0972 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x0974  */
    /* JADX WARN: Code duplicated, block: B:288:0x09c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:292:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:293:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:296:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:298:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:302:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:304:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:306:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:308:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:311:0x0ab7  */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, byte, int] */
    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        tob1 tob1Var;
        int i3;
        int i4;
        boolean z;
        kkz0 kkz0Var;
        Boolean bool;
        phz0 phz0Var;
        vu30 vu30Var;
        int i5;
        kkz0 kkz0Var2;
        int i6;
        err0 err0Var;
        ?? r15;
        jkr0 jkr0Var;
        Object obj;
        boolean z2;
        ven0 ven0VarS;
        ven0 ven0VarS2;
        ven0 ven0VarS3;
        x340 x340Var;
        Object objT;
        err0 err0Var2;
        err0 err0Var3;
        int iS;
        err0 err0Var4;
        err0 err0Var5;
        boolean z3;
        float f;
        boolean z4;
        zu91 pxg1Var;
        zu91 zu91VarO0;
        float fFloatValue;
        boolean z5;
        boolean zH;
        boolean z6;
        Object objT2;
        ven0 ven0VarS4;
        float fC;
        float fC2;
        jkr0 jkr0Var2;
        nim0 nim0Var;
        era eraVar;
        f36 f36Var;
        mbh mbhVarA;
        Object obj2;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z7;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        nxc1 nxc1Var;
        vu30 vu30Var2;
        boolean zI;
        Object objT3;
        Object obj3;
        boolean z8;
        err0 err0Var6;
        Object objT4;
        boolean zI2;
        Object objT5;
        rk41 rk41Var2;
        boolean z9;
        boolean z10;
        iu30 iu30Var;
        boolean zE;
        Object objT6;
        ven0 ven0VarS5;
        boolean zG;
        Object objT7;
        boolean z11;
        boolean z12;
        hyc1 hyc1Var;
        boolean zG2;
        Object objT8;
        boolean zI3;
        Object objT9;
        int i7;
        x340 x340Var2;
        float f2;
        pxg1 pxg1VarJ0;
        pxg1 pxg1VarJ1;
        ven0 ven0VarR;
        int i8;
        int i9;
        kkz0 kkz0Var3 = this;
        byte b = kkz0Var3.a;
        Object obj4 = kkz0Var3.d;
        switch (b) {
            case 0:
                rhz0 rhz0Var = (rhz0) obj4;
                Object obj5 = fkj0.X;
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(1091864496);
                if ((i & 6) == 0) {
                    i2 = i | (x340Var3.g(i2cVar) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= (i & 64) == 0 ? x340Var3.g(rk41Var) : x340Var3.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var3.i(kkz0Var3) ? 2048 : 1024;
                }
                int i10 = i2;
                if (x340Var3.Y(i10 & 1, (i10 & 1043) != 1042)) {
                    che0 che0VarV = hon1.v(x340Var3);
                    float fC3 = i2cVar.c() * che0VarV.a.d;
                    ven0 ven0VarH = rwq.h(((xgm1) rk41Var.c).getState(), x340Var3, 0);
                    Object obj6 = ((wgm1) ven0VarH.getValue()).b.get("quiz-answer-state-key");
                    w1c1 w1c1Var = obj6 instanceof w1c1 ? (w1c1) obj6 : null;
                    String str = w1c1Var != null ? w1c1Var.a : null;
                    boolean zG3 = x340Var3.g(rhz0Var.a);
                    Object objT10 = x340Var3.T();
                    if (zG3 || objT10 == obj5) {
                        objT10 = v8r.q(rhz0Var);
                        x340Var3.s0(objT10);
                    }
                    tob1 tob1Var2 = (ven0) objT10;
                    qam1 qam1Var = (qam1) x340Var3.k(sam1.a);
                    int i11 = i10 & 112;
                    boolean z13 = i11 == 32 || ((i10 & 64) != 0 && x340Var3.i(rk41Var));
                    Object objT11 = x340Var3.T();
                    if (z13 || objT11 == obj5) {
                        objT11 = new jkz0(rk41Var, null, (byte) 0);
                        x340Var3.s0(objT11);
                    }
                    qxd0.t(rih1.a, x340Var3, (vu30) objT11);
                    boolean zG4 = x340Var3.g(str) | x340Var3.i(kkz0Var3) | x340Var3.g(ven0VarH) | x340Var3.g(tob1Var2);
                    Object objT12 = x340Var3.T();
                    if (zG4 || objT12 == obj5) {
                        tob1Var = tob1Var2;
                        i3 = i11;
                        i4 = 32;
                        z = true;
                        kkz0Var = this;
                        c6h0 c6h0Var = new c6h0(str, kkz0Var, ven0VarH, tob1Var, (lnm) null, (byte) 20);
                        x340Var3.s0(c6h0Var);
                        objT12 = c6h0Var;
                    } else {
                        i3 = i11;
                        kkz0Var = kkz0Var3;
                        tob1Var = tob1Var2;
                        i4 = 32;
                        z = true;
                    }
                    qxd0.s(str, rk41Var, (vu30) objT12, x340Var3);
                    Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
                    boolean zG5 = x340Var3.g(str) | x340Var3.i(kkz0Var) | x340Var3.g(ven0VarH) | ((i3 == i4 || ((i10 & 64) != 0 && x340Var3.i(rk41Var))) ? z : false) | x340Var3.g(tob1Var);
                    Object objT13 = x340Var3.T();
                    if (zG5 || objT13 == obj5) {
                        tob1 tob1Var3 = tob1Var;
                        bool = boolValueOf;
                        dfw0 dfw0Var = new dfw0(str, kkz0Var, rk41Var, ven0VarH, tob1Var3, (lnm) null);
                        tob1Var = tob1Var3;
                        x340Var3.s0(dfw0Var);
                        objT13 = dfw0Var;
                    } else {
                        bool = boolValueOf;
                    }
                    qxd0.s(str, bool, (vu30) objT13, x340Var3);
                    boolean zG6 = x340Var3.g(rhz0Var);
                    Object objT14 = x340Var3.T();
                    if (zG6 || objT14 == obj5) {
                        Iterator it = rhz0Var.f.iterator();
                        do {
                            if (!it.hasNext()) {
                                bhn0.t("Collection contains no element matching the predicate.");
                                return;
                            }
                            phz0Var = (phz0) it.next();
                        } while (!phz0Var.g);
                        objT14 = phz0Var.a;
                        x340Var3.s0(objT14);
                    }
                    String str2 = (String) objT14;
                    boolean zG7 = x340Var3.g(((rhz0) tob1Var.getValue()).g);
                    Object objT15 = x340Var3.T();
                    if (zG7 || objT15 == obj5) {
                        String str3 = ((rhz0) tob1Var.getValue()).g;
                        objT15 = c13.l(!((str3 == null || str3.length() == 0) ? z : false), x340Var3);
                    }
                    ven0 ven0Var = (ven0) objT15;
                    boolean zH2 = x340Var3.h(((Boolean) ven0Var.getValue()).booleanValue());
                    Object objT16 = x340Var3.T();
                    if (zH2 || objT16 == obj5) {
                        rhz0 rhz0Var2 = (rhz0) tob1Var.getValue();
                        String str4 = rhz0Var2.g;
                        if (str4 == null || str4.length() == 0 || !str4.equals(str2)) {
                            vu30Var = (str4 == null || str4.length() == 0) ? rhz0Var2.c : rhz0Var2.e;
                        } else {
                            vu30Var = rhz0Var2.d;
                        }
                        objT16 = vu30Var;
                        x340Var3.s0(objT16);
                    }
                    mod.b(dhe0.a.a(che0VarV), apo.r(-68993936, new xz2(che0VarV, (vu30) objT16, rk41Var, this, fC3, tob1Var, qam1Var, ven0Var), x340Var3), x340Var3, 56);
                } else {
                    x340Var3.b0();
                }
                h311 h311VarV = x340Var3.v();
                if (h311VarV != null) {
                    h311VarV.d = new lzs0(i, this, i2cVar, rk41Var, function0, (byte) 16);
                    return;
                }
                return;
            case 1:
                mxc1 mxc1Var = (mxc1) obj4;
                Float fValueOf = Float.valueOf(1.0f);
                Float fValueOf2 = Float.valueOf(0.0f);
                x340 x340Var4 = (x340) b0kVar;
                x340Var4.k0(2124878947);
                j06 j06Var = x340Var4.a;
                if ((i & 6) == 0) {
                    i5 = (x340Var4.g(i2cVar) ? 4 : 2) | i;
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= (i & 64) == 0 ? x340Var4.g(rk41Var) : x340Var4.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i5 |= (i & 4096) == 0 ? x340Var4.g(kkz0Var3) : x340Var4.i(kkz0Var3) ? 2048 : 1024;
                }
                if (x340Var4.Y(i5 & 1, (i5 & 1043) != 1042)) {
                    Object objT17 = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT17 == m4cVar) {
                        i6 = 0;
                        objT17 = bb00.h(0, x340Var4);
                    } else {
                        i6 = 0;
                    }
                    err0 err0Var7 = (hdn0) objT17;
                    Object objT18 = x340Var4.T();
                    if (objT18 == m4cVar) {
                        objT18 = bb00.h(i6, x340Var4);
                    }
                    err0 err0Var8 = (hdn0) objT18;
                    boolean zI4 = x340Var4.i(kkz0Var3);
                    Object objT19 = x340Var4.T();
                    if (zI4 || objT19 == m4cVar) {
                        objT19 = new fyc1(kkz0Var3, (byte) 1);
                        x340Var4.s0(objT19);
                    }
                    jkr0 jkr0VarB = lkr0.b(0, (Function0) objT19, x340Var4, 0, 3);
                    Object objT20 = x340Var4.T();
                    if (objT20 == m4cVar) {
                        objT20 = bb00.h(jkr0VarB.o(), x340Var4);
                    }
                    hdn0 hdn0Var = (hdn0) objT20;
                    qam1 qam1Var2 = (qam1) x340Var4.k(sam1.a);
                    int iO = jkr0VarB.o();
                    kl1 kl1Var = jkr0VarB.d;
                    Integer numValueOf = Integer.valueOf(iO);
                    boolean zI5 = x340Var4.i(kkz0Var3) | x340Var4.g(jkr0VarB) | x340Var4.i(qam1Var2);
                    Object objT21 = x340Var4.T();
                    if (zI5 || objT21 == m4cVar) {
                        err0Var = err0Var8;
                        r15 = 0;
                        objT21 = new wba1(kkz0Var3, jkr0VarB, qam1Var2, hdn0Var, (lnm) null, (byte) 4);
                        kkz0Var3 = kkz0Var3;
                        jkr0Var = jkr0VarB;
                        x340Var4.s0(objT21);
                    } else {
                        err0Var = err0Var8;
                        jkr0Var = jkr0VarB;
                        r15 = 0;
                    }
                    qxd0.t(numValueOf, x340Var4, (vu30) objT21);
                    j2i j2iVar = (j2i) kkz0Var3.f;
                    x340Var4.i0(1899228161);
                    j2iVar.invoke(Integer.valueOf(jkr0Var.o()), x340Var4, 0);
                    x340Var4.r((boolean) r15);
                    float fD = (flb0.a == ((flb0) x340Var4.k(t4k.n)) ? i2cVar.d() : -i2cVar.d()) * 4.0f;
                    ilv.a.getClass();
                    ceo ceoVar = flv.g;
                    pxg1 pxg1VarO0 = irn1.o0(600, (int) r15, ceoVar, 2);
                    Float fValueOf3 = Float.valueOf(fD);
                    tzg1 tzg1Var = rno1.a;
                    hsi1 hsi1Var = new hsi1("carouselXOffset", fValueOf3, fValueOf2, pxg1VarO0, tzg1Var);
                    boolean z14 = rk41Var.a;
                    boolean zI6 = x340Var4.i(kkz0Var3);
                    Object objT22 = x340Var4.T();
                    if (zI6) {
                        obj = m4cVar;
                    } else {
                        obj = m4cVar;
                        if (objT22 == obj) {
                        }
                        Function0 function1 = (Function0) objT22;
                        z2 = kkz0Var3.c;
                        ven0VarS = zod.S(hsi1Var, z14, z2, function1, x340Var4, 8, 0);
                        ceo ceoVar2 = flv.d;
                        ven0VarS2 = zod.S(new hsi1("dotsAlphaIn", fValueOf2, fValueOf, irn1.o0(600, (int) r15, ceoVar2, 2), tzg1Var), rk41Var.a, z2, (Function0) null, x340Var4, 8, 8);
                        ven0VarS3 = zod.S(new hsi1("headerAlphaIn", fValueOf2, fValueOf, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 300, ceoVar2), tzg1Var), rk41Var.a, z2, (Function0) null, x340Var4, 8, 8);
                        x340Var = x340Var4;
                        objT = x340Var.T();
                        if (objT == obj) {
                            objT = bb00.h(((err0) kl1Var.c).s(), x340Var);
                        }
                        err0Var2 = (hdn0) objT;
                        err0Var3 = err0Var2;
                        iS = err0Var3.s();
                        err0Var4 = (err0) kl1Var.c;
                        err0Var5 = (err0) kl1Var.c;
                        if (iS != err0Var4.s()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            f = 0.0f;
                        } else {
                            f = 1.0f;
                        }
                        Float fValueOf4 = Float.valueOf(f);
                        z4 = rk41Var.a;
                        if (z2) {
                            if (z3) {
                                zu91VarO0 = irn1.o0(100, 0, flv.i, 2);
                            } else {
                                z4 = z4;
                                err0Var5 = err0Var5;
                                x340Var = x340Var;
                                pxg1Var = new pxg1(400, 100, flv.i);
                            }
                            x340Var4 = x340Var;
                            fFloatValue = ((Number) zod.G(fValueOf4, z4, tzg1Var, pxg1Var, x340Var, 0)).floatValue();
                            if (fFloatValue == 0.0f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            Boolean boolValueOf2 = Boolean.valueOf(z3);
                            Boolean boolValueOf3 = Boolean.valueOf(z5);
                            zH = x340Var4.h(z3) | x340Var4.h(z5) | x340Var4.g(jkr0Var);
                            z6 = z3;
                            objT2 = x340Var4.T();
                            if (zH || objT2 == obj) {
                                objT2 = new hl0(z6, z5, jkr0Var, err0Var2, (lnm) null);
                                x340Var4.s0(objT2);
                            }
                            qxd0.s(boolValueOf2, boolValueOf3, (vu30) objT2, x340Var4);
                            ven0VarS4 = zod.S(new hsi1("hintTextIn", fValueOf2, fValueOf, new pxg1(700, 100, ceoVar), tzg1Var), rk41Var.a, z2, (Function0) null, x340Var4, 8, 8);
                            fC = i2cVar.c() * 0.6f;
                            fC2 = i2cVar.c() * 0.125f;
                            jkr0Var2 = jkr0Var;
                            nim0Var = nim0.a;
                            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                            eraVar = een.Q0;
                            f36Var = h36.c;
                            mbhVarA = jbh.a(f36Var, eraVar, x340Var4, 54);
                            obj2 = obj;
                            iHashCode = Long.hashCode(x340Var4.T);
                            xos0VarM = x340Var4.m();
                            qim0VarE = zr7.E(x340Var4, qim0VarD);
                            hzj.A.getClass();
                            if (j06Var != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var4.m0();
                            z7 = x340Var4.S;
                            n4kVar = hmb0.t1;
                            if (z7) {
                                x340Var4.l(n4kVar);
                            } else {
                                x340Var4.v0();
                            }
                            lljVar = y580.O0;
                            nko1.H(mbhVarA, x340Var4, lljVar);
                            lljVar2 = y580.N0;
                            nko1.H(xos0VarM, x340Var4, lljVar2);
                            Integer numValueOf2 = Integer.valueOf(iHashCode);
                            lljVar3 = y580.R0;
                            nko1.H(numValueOf2, x340Var4, lljVar3);
                            nko1.F(x340Var4);
                            lljVar4 = y580.Y;
                            nko1.H(qim0VarE, x340Var4, lljVar4);
                            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                            pbh pbhVar = pbh.a;
                            qim0 qim0VarA = pbhVar.a(1.0f, qim0VarF, true);
                            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var4, 48);
                            int iHashCode2 = Long.hashCode(x340Var4.T);
                            xos0 xos0VarM2 = x340Var4.m();
                            qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarA);
                            x340Var4.m0();
                            if (x340Var4.S) {
                                x340Var4.l(n4kVar);
                            } else {
                                x340Var4.v0();
                            }
                            nko1.H(mbhVarA2, x340Var4, lljVar);
                            nko1.H(xos0VarM2, x340Var4, lljVar2);
                            x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                            nko1.H(qim0VarE2, x340Var4, lljVar4);
                            op71.g(x340Var4, u291.h(nim0Var, fC2));
                            nxc1Var = (nxc1) o7h.t0(err0Var3.s(), mxc1Var.a);
                            if (nxc1Var != null) {
                                vu30Var2 = nxc1Var.a;
                            } else {
                                vu30Var2 = null;
                            }
                            if (vu30Var2 == null) {
                                x340Var4.i0(-950709175);
                                x340Var4.r(false);
                                kkz0Var2 = this;
                                z8 = false;
                                obj3 = obj2;
                            } else {
                                x340Var4.i0(-950709174);
                                vnr0 vnr0Var = (vnr0) vu30Var2.invoke(x340Var4, 0);
                                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                                uwr uwrVar = cbx.a;
                                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var4).e.c, 0.0f, 2, qim0VarF2);
                                gfh0 gfh0VarC = t1c.c(een.h, false);
                                int iHashCode3 = Long.hashCode(x340Var4.T);
                                xos0 xos0VarM3 = x340Var4.m();
                                qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarZ);
                                x340Var4.m0();
                                if (x340Var4.S) {
                                    x340Var4.l(n4kVar);
                                } else {
                                    x340Var4.v0();
                                }
                                nko1.H(gfh0VarC, x340Var4, lljVar);
                                nko1.H(xos0VarM3, x340Var4, lljVar2);
                                x0d.q(iHashCode3, x340Var4, lljVar3, x340Var4);
                                nko1.H(qim0VarE3, x340Var4, lljVar4);
                                jto1.d(vnr0Var, u291.f(nim0Var, 1.0f), x340Var4, 56);
                                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                                kkz0Var2 = this;
                                zI = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS3) | x340Var4.d(fFloatValue);
                                objT3 = x340Var4.T();
                                if (zI) {
                                    obj3 = obj2;
                                } else {
                                    obj3 = obj2;
                                    if (objT3 == obj3) {
                                    }
                                    qgo1.f(vnr0Var, i541.C(qim0VarF3, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                                    x340Var4.r(true);
                                    cvx cvxVar = cbx.b(x340Var4).b;
                                    z8 = false;
                                    x0d.s(nim0Var, 16.0f, x340Var4, false);
                                }
                                objT3 = new na5(kkz0Var2, fFloatValue, ven0VarS3);
                                x340Var4.s0(objT3);
                                qgo1.f(vnr0Var, i541.C(qim0VarF3, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                                x340Var4.r(true);
                                cvx cvxVar2 = cbx.b(x340Var4).b;
                                z8 = false;
                                x0d.s(nim0Var, 16.0f, x340Var4, false);
                            }
                            int iS2 = err0Var7.s();
                            err0Var6 = err0Var;
                            int iS3 = err0Var6.s();
                            qim0 qim0VarC = u291.c(u291.j(0.0f, fC, 1, pbhVar.a(1.0f, u291.f(nim0Var, 1.0f), z8)), 1.0f);
                            objT4 = x340Var4.T();
                            if (objT4 == obj3) {
                                objT4 = new tih(err0Var7, err0Var6, (byte) 4);
                                x340Var4.s0(objT4);
                            }
                            qim0 qim0VarX = ern1.x(qim0VarC, (iu30) objT4);
                            zI2 = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS);
                            objT5 = x340Var4.T();
                            if (zI2 || objT5 == obj3) {
                                objT5 = new lws0(kkz0Var2, ven0VarS, (byte) 22);
                                x340Var4.s0(objT5);
                            }
                            lxc1.a(mxc1Var, jkr0Var2, iS2, iS3, i541.C(qim0VarX, (iu30) objT5), x340Var4, 0);
                            if (jkr0Var2.l() > 1) {
                                x340Var4.i0(-949051015);
                                int iL = jkr0Var2.l();
                                rk41Var2 = rk41Var;
                                boolean z15 = rk41Var2.a;
                                long j = mxc1Var.c;
                                long j2 = mxc1Var.d;
                                qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 18.0f);
                                zI3 = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS2);
                                objT9 = x340Var4.T();
                                if (zI3 || objT9 == obj3) {
                                    objT9 = new lws0(kkz0Var2, ven0VarS2, (byte) 23);
                                    x340Var4.s0(objT9);
                                }
                                qgo1.c(iL, jkr0Var2, i541.C(qim0VarY, (iu30) objT9), z2, z15, 10.0f, 8.0f, j, j2, x340Var4, 1769472);
                                z9 = z2;
                                z10 = false;
                                x340Var4.r(false);
                            } else {
                                rk41Var2 = rk41Var;
                                z9 = z2;
                                z10 = false;
                                x340Var4.i0(-948378005);
                                x340Var4.r(false);
                            }
                            iu30Var = mxc1Var.e;
                            if (iu30Var == null) {
                                x340Var4.i0(-948286153);
                                x340Var4.r(z10);
                                z12 = true;
                            } else {
                                x340Var4.i0(-948286152);
                                uwr uwrVar2 = cbx.a;
                                cvx cvxVar3 = cbx.b(x340Var4).b;
                                op71.g(x340Var4, u291.h(nim0Var, 8.0f));
                                zE = x340Var4.e(err0Var5.s()) | x340Var4.g(iu30Var);
                                objT6 = x340Var4.T();
                                if (zE || objT6 == obj3) {
                                    objT6 = (iec) iu30Var.invoke(Integer.valueOf(err0Var5.s()));
                                    x340Var4.s0(objT6);
                                }
                                iec iecVar = (iec) objT6;
                                ven0VarS5 = zod.S(new hsi1("ctaIn", fValueOf2, fValueOf, new pxg1(800, 100, flv.e), tzg1Var), rk41Var2.a, z9, (Function0) null, x340Var4, 8, 8);
                                qim0 qim0VarZ2 = uyn1.z(84.0f, 0.0f, 2, nim0Var);
                                zG = x340Var4.g(ven0VarS5);
                                objT7 = x340Var4.T();
                                if (zG || objT7 == obj3) {
                                    objT7 = new lws0(ven0VarS5, (byte) 24);
                                    x340Var4.s0(objT7);
                                }
                                qim0 qim0VarC2 = i541.C(qim0VarZ2, (iu30) objT7);
                                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                                int iHashCode4 = Long.hashCode(x340Var4.T);
                                xos0 xos0VarM4 = x340Var4.m();
                                qim0 qim0VarE4 = zr7.E(x340Var4, qim0VarC2);
                                x340Var4.m0();
                                if (x340Var4.S) {
                                    x340Var4.l(n4kVar);
                                } else {
                                    x340Var4.v0();
                                }
                                nko1.H(gfh0VarC2, x340Var4, lljVar);
                                nko1.H(xos0VarM4, x340Var4, lljVar2);
                                x0d.q(iHashCode4, x340Var4, lljVar3, x340Var4);
                                nko1.H(qim0VarE4, x340Var4, lljVar4);
                                if (((Number) ven0VarS5.getValue()).floatValue() > 0.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z10 = false;
                                e4p1.a(iecVar, z11, x340Var4, 0, 0);
                                z12 = true;
                                x340Var4.r(true);
                                x340Var4.r(false);
                            }
                            uwr uwrVar3 = cbx.a;
                            x0d.s(nim0Var, cbx.b(x340Var4).b.b, x340Var4, z12);
                            hyc1Var = mxc1Var.b;
                            if (hyc1Var == null) {
                                x340Var4.i0(-1219113350);
                                x340Var4.r(z10);
                            } else {
                                x340Var4.i0(-1219113349);
                                qim0 qim0VarZ3 = uyn1.z(88.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                                zG2 = x340Var4.g(ven0VarS4);
                                objT8 = x340Var4.T();
                                if (zG2 || objT8 == obj3) {
                                    objT8 = new lws0(ven0VarS4, (byte) 25);
                                    x340Var4.s0(objT8);
                                }
                                qgo1.f((vnr0) hyc1Var.invoke(x340Var4, 0), i541.C(qim0VarZ3, (iu30) objT8), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                                op71.g(x340Var4, u291.f(u291.h(nim0Var, cbx.b(x340Var4).b.c), 1.0f));
                                x340Var4.r(false);
                            }
                            x340Var4.r(true);
                        } else {
                            zu91VarO0 = irn1.j0();
                        }
                        pxg1Var = zu91VarO0;
                        x340Var4 = x340Var;
                        fFloatValue = ((Number) zod.G(fValueOf4, z4, tzg1Var, pxg1Var, x340Var, 0)).floatValue();
                        if (fFloatValue == 0.0f) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Boolean boolValueOf4 = Boolean.valueOf(z3);
                        Boolean boolValueOf5 = Boolean.valueOf(z5);
                        zH = x340Var4.h(z3) | x340Var4.h(z5) | x340Var4.g(jkr0Var);
                        z6 = z3;
                        objT2 = x340Var4.T();
                        if (zH) {
                            objT2 = new hl0(z6, z5, jkr0Var, err0Var2, (lnm) null);
                            x340Var4.s0(objT2);
                        } else {
                            objT2 = new hl0(z6, z5, jkr0Var, err0Var2, (lnm) null);
                            x340Var4.s0(objT2);
                        }
                        qxd0.s(boolValueOf4, boolValueOf5, (vu30) objT2, x340Var4);
                        ven0VarS4 = zod.S(new hsi1("hintTextIn", fValueOf2, fValueOf, new pxg1(700, 100, ceoVar), tzg1Var), rk41Var.a, z2, (Function0) null, x340Var4, 8, 8);
                        fC = i2cVar.c() * 0.6f;
                        fC2 = i2cVar.c() * 0.125f;
                        jkr0Var2 = jkr0Var;
                        nim0Var = nim0.a;
                        qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                        eraVar = een.Q0;
                        f36Var = h36.c;
                        mbhVarA = jbh.a(f36Var, eraVar, x340Var4, 54);
                        obj2 = obj;
                        iHashCode = Long.hashCode(x340Var4.T);
                        xos0VarM = x340Var4.m();
                        qim0VarE = zr7.E(x340Var4, qim0VarD2);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        z7 = x340Var4.S;
                        n4kVar = hmb0.t1;
                        if (z7) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        lljVar = y580.O0;
                        nko1.H(mbhVarA, x340Var4, lljVar);
                        lljVar2 = y580.N0;
                        nko1.H(xos0VarM, x340Var4, lljVar2);
                        Integer numValueOf3 = Integer.valueOf(iHashCode);
                        lljVar3 = y580.R0;
                        nko1.H(numValueOf3, x340Var4, lljVar3);
                        nko1.F(x340Var4);
                        lljVar4 = y580.Y;
                        nko1.H(qim0VarE, x340Var4, lljVar4);
                        qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                        pbh pbhVar2 = pbh.a;
                        qim0 qim0VarA2 = pbhVar2.a(1.0f, qim0VarF4, true);
                        mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var4, 48);
                        int iHashCode5 = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM5 = x340Var4.m();
                        qim0 qim0VarE5 = zr7.E(x340Var4, qim0VarA2);
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(mbhVarA3, x340Var4, lljVar);
                        nko1.H(xos0VarM5, x340Var4, lljVar2);
                        x0d.q(iHashCode5, x340Var4, lljVar3, x340Var4);
                        nko1.H(qim0VarE5, x340Var4, lljVar4);
                        op71.g(x340Var4, u291.h(nim0Var, fC2));
                        nxc1Var = (nxc1) o7h.t0(err0Var3.s(), mxc1Var.a);
                        if (nxc1Var != null) {
                            vu30Var2 = nxc1Var.a;
                        } else {
                            vu30Var2 = null;
                        }
                        if (vu30Var2 == null) {
                            x340Var4.i0(-950709175);
                            x340Var4.r(false);
                            kkz0Var2 = this;
                            z8 = false;
                            obj3 = obj2;
                        } else {
                            x340Var4.i0(-950709174);
                            vnr0 vnr0Var2 = (vnr0) vu30Var2.invoke(x340Var4, 0);
                            qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
                            uwr uwrVar4 = cbx.a;
                            qim0 qim0VarZ4 = uyn1.z(cbx.b(x340Var4).e.c, 0.0f, 2, qim0VarF5);
                            gfh0 gfh0VarC3 = t1c.c(een.h, false);
                            int iHashCode6 = Long.hashCode(x340Var4.T);
                            xos0 xos0VarM6 = x340Var4.m();
                            qim0 qim0VarE6 = zr7.E(x340Var4, qim0VarZ4);
                            x340Var4.m0();
                            if (x340Var4.S) {
                                x340Var4.l(n4kVar);
                            } else {
                                x340Var4.v0();
                            }
                            nko1.H(gfh0VarC3, x340Var4, lljVar);
                            nko1.H(xos0VarM6, x340Var4, lljVar2);
                            x0d.q(iHashCode6, x340Var4, lljVar3, x340Var4);
                            nko1.H(qim0VarE6, x340Var4, lljVar4);
                            jto1.d(vnr0Var2, u291.f(nim0Var, 1.0f), x340Var4, 56);
                            qim0 qim0VarF6 = u291.f(nim0Var, 1.0f);
                            kkz0Var2 = this;
                            zI = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS3) | x340Var4.d(fFloatValue);
                            objT3 = x340Var4.T();
                            if (zI) {
                                obj3 = obj2;
                                if (objT3 == obj3) {
                                }
                                qgo1.f(vnr0Var2, i541.C(qim0VarF6, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                                x340Var4.r(true);
                                cvx cvxVar4 = cbx.b(x340Var4).b;
                                z8 = false;
                                x0d.s(nim0Var, 16.0f, x340Var4, false);
                            } else {
                                obj3 = obj2;
                            }
                            objT3 = new na5(kkz0Var2, fFloatValue, ven0VarS3);
                            x340Var4.s0(objT3);
                            qgo1.f(vnr0Var2, i541.C(qim0VarF6, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                            x340Var4.r(true);
                            cvx cvxVar5 = cbx.b(x340Var4).b;
                            z8 = false;
                            x0d.s(nim0Var, 16.0f, x340Var4, false);
                        }
                        int iS4 = err0Var7.s();
                        err0Var6 = err0Var;
                        int iS5 = err0Var6.s();
                        qim0 qim0VarC3 = u291.c(u291.j(0.0f, fC, 1, pbhVar2.a(1.0f, u291.f(nim0Var, 1.0f), z8)), 1.0f);
                        objT4 = x340Var4.T();
                        if (objT4 == obj3) {
                            objT4 = new tih(err0Var7, err0Var6, (byte) 4);
                            x340Var4.s0(objT4);
                        }
                        qim0 qim0VarX2 = ern1.x(qim0VarC3, (iu30) objT4);
                        zI2 = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS);
                        objT5 = x340Var4.T();
                        if (zI2) {
                            objT5 = new lws0(kkz0Var2, ven0VarS, (byte) 22);
                            x340Var4.s0(objT5);
                        } else {
                            objT5 = new lws0(kkz0Var2, ven0VarS, (byte) 22);
                            x340Var4.s0(objT5);
                        }
                        lxc1.a(mxc1Var, jkr0Var2, iS4, iS5, i541.C(qim0VarX2, (iu30) objT5), x340Var4, 0);
                        if (jkr0Var2.l() > 1) {
                            x340Var4.i0(-949051015);
                            int iL2 = jkr0Var2.l();
                            rk41Var2 = rk41Var;
                            boolean z16 = rk41Var2.a;
                            long j3 = mxc1Var.c;
                            long j4 = mxc1Var.d;
                            qim0 qim0VarY2 = uyn1.y(nim0Var, 16.0f, 18.0f);
                            zI3 = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS2);
                            objT9 = x340Var4.T();
                            if (zI3) {
                                objT9 = new lws0(kkz0Var2, ven0VarS2, (byte) 23);
                                x340Var4.s0(objT9);
                            } else {
                                objT9 = new lws0(kkz0Var2, ven0VarS2, (byte) 23);
                                x340Var4.s0(objT9);
                            }
                            qgo1.c(iL2, jkr0Var2, i541.C(qim0VarY2, (iu30) objT9), z2, z16, 10.0f, 8.0f, j3, j4, x340Var4, 1769472);
                            z9 = z2;
                            z10 = false;
                            x340Var4.r(false);
                        } else {
                            rk41Var2 = rk41Var;
                            z9 = z2;
                            z10 = false;
                            x340Var4.i0(-948378005);
                            x340Var4.r(false);
                        }
                        iu30Var = mxc1Var.e;
                        if (iu30Var == null) {
                            x340Var4.i0(-948286153);
                            x340Var4.r(z10);
                            z12 = true;
                        } else {
                            x340Var4.i0(-948286152);
                            uwr uwrVar5 = cbx.a;
                            cvx cvxVar6 = cbx.b(x340Var4).b;
                            op71.g(x340Var4, u291.h(nim0Var, 8.0f));
                            zE = x340Var4.e(err0Var5.s()) | x340Var4.g(iu30Var);
                            objT6 = x340Var4.T();
                            if (zE) {
                                objT6 = (iec) iu30Var.invoke(Integer.valueOf(err0Var5.s()));
                                x340Var4.s0(objT6);
                            } else {
                                objT6 = (iec) iu30Var.invoke(Integer.valueOf(err0Var5.s()));
                                x340Var4.s0(objT6);
                            }
                            iec iecVar2 = (iec) objT6;
                            ven0VarS5 = zod.S(new hsi1("ctaIn", fValueOf2, fValueOf, new pxg1(800, 100, flv.e), tzg1Var), rk41Var2.a, z9, (Function0) null, x340Var4, 8, 8);
                            qim0 qim0VarZ5 = uyn1.z(84.0f, 0.0f, 2, nim0Var);
                            zG = x340Var4.g(ven0VarS5);
                            objT7 = x340Var4.T();
                            if (zG) {
                                objT7 = new lws0(ven0VarS5, (byte) 24);
                                x340Var4.s0(objT7);
                            } else {
                                objT7 = new lws0(ven0VarS5, (byte) 24);
                                x340Var4.s0(objT7);
                            }
                            qim0 qim0VarC4 = i541.C(qim0VarZ5, (iu30) objT7);
                            gfh0 gfh0VarC4 = t1c.c(een.d, false);
                            int iHashCode7 = Long.hashCode(x340Var4.T);
                            xos0 xos0VarM7 = x340Var4.m();
                            qim0 qim0VarE7 = zr7.E(x340Var4, qim0VarC4);
                            x340Var4.m0();
                            if (x340Var4.S) {
                                x340Var4.l(n4kVar);
                            } else {
                                x340Var4.v0();
                            }
                            nko1.H(gfh0VarC4, x340Var4, lljVar);
                            nko1.H(xos0VarM7, x340Var4, lljVar2);
                            x0d.q(iHashCode7, x340Var4, lljVar3, x340Var4);
                            nko1.H(qim0VarE7, x340Var4, lljVar4);
                            if (((Number) ven0VarS5.getValue()).floatValue() > 0.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z10 = false;
                            e4p1.a(iecVar2, z11, x340Var4, 0, 0);
                            z12 = true;
                            x340Var4.r(true);
                            x340Var4.r(false);
                        }
                        uwr uwrVar6 = cbx.a;
                        x0d.s(nim0Var, cbx.b(x340Var4).b.b, x340Var4, z12);
                        hyc1Var = mxc1Var.b;
                        if (hyc1Var == null) {
                            x340Var4.i0(-1219113350);
                            x340Var4.r(z10);
                        } else {
                            x340Var4.i0(-1219113349);
                            qim0 qim0VarZ6 = uyn1.z(88.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                            zG2 = x340Var4.g(ven0VarS4);
                            objT8 = x340Var4.T();
                            if (zG2) {
                                objT8 = new lws0(ven0VarS4, (byte) 25);
                                x340Var4.s0(objT8);
                            } else {
                                objT8 = new lws0(ven0VarS4, (byte) 25);
                                x340Var4.s0(objT8);
                            }
                            qgo1.f((vnr0) hyc1Var.invoke(x340Var4, 0), i541.C(qim0VarZ6, (iu30) objT8), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                            op71.g(x340Var4, u291.f(u291.h(nim0Var, cbx.b(x340Var4).b.c), 1.0f));
                            x340Var4.r(false);
                        }
                        x340Var4.r(true);
                    }
                    objT22 = new fyc1(kkz0Var3, r15);
                    x340Var4.s0(objT22);
                    Function0 function2 = (Function0) objT22;
                    z2 = kkz0Var3.c;
                    ven0VarS = zod.S(hsi1Var, z14, z2, function2, x340Var4, 8, 0);
                    ceo ceoVar3 = flv.d;
                    ven0VarS2 = zod.S(new hsi1("dotsAlphaIn", fValueOf2, fValueOf, irn1.o0(600, (int) r15, ceoVar3, 2), tzg1Var), rk41Var.a, z2, (Function0) null, x340Var4, 8, 8);
                    ven0VarS3 = zod.S(new hsi1("headerAlphaIn", fValueOf2, fValueOf, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 300, ceoVar3), tzg1Var), rk41Var.a, z2, (Function0) null, x340Var4, 8, 8);
                    x340Var = x340Var4;
                    objT = x340Var.T();
                    if (objT == obj) {
                        objT = bb00.h(((err0) kl1Var.c).s(), x340Var);
                    }
                    err0Var2 = (hdn0) objT;
                    err0Var3 = err0Var2;
                    iS = err0Var3.s();
                    err0Var4 = (err0) kl1Var.c;
                    err0Var5 = (err0) kl1Var.c;
                    if (iS != err0Var4.s()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    Float fValueOf5 = Float.valueOf(f);
                    z4 = rk41Var.a;
                    if (z2) {
                        zu91VarO0 = irn1.j0();
                    } else {
                        if (z3) {
                            zu91VarO0 = irn1.o0(100, 0, flv.i, 2);
                        } else {
                            z4 = z4;
                            err0Var5 = err0Var5;
                            x340Var = x340Var;
                            pxg1Var = new pxg1(400, 100, flv.i);
                        }
                        x340Var4 = x340Var;
                        fFloatValue = ((Number) zod.G(fValueOf5, z4, tzg1Var, pxg1Var, x340Var, 0)).floatValue();
                        if (fFloatValue == 0.0f) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Boolean boolValueOf6 = Boolean.valueOf(z3);
                        Boolean boolValueOf7 = Boolean.valueOf(z5);
                        zH = x340Var4.h(z3) | x340Var4.h(z5) | x340Var4.g(jkr0Var);
                        z6 = z3;
                        objT2 = x340Var4.T();
                        if (zH) {
                            objT2 = new hl0(z6, z5, jkr0Var, err0Var2, (lnm) null);
                            x340Var4.s0(objT2);
                        } else {
                            objT2 = new hl0(z6, z5, jkr0Var, err0Var2, (lnm) null);
                            x340Var4.s0(objT2);
                        }
                        qxd0.s(boolValueOf6, boolValueOf7, (vu30) objT2, x340Var4);
                        ven0VarS4 = zod.S(new hsi1("hintTextIn", fValueOf2, fValueOf, new pxg1(700, 100, ceoVar), tzg1Var), rk41Var.a, z2, (Function0) null, x340Var4, 8, 8);
                        fC = i2cVar.c() * 0.6f;
                        fC2 = i2cVar.c() * 0.125f;
                        jkr0Var2 = jkr0Var;
                        nim0Var = nim0.a;
                        qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                        eraVar = een.Q0;
                        f36Var = h36.c;
                        mbhVarA = jbh.a(f36Var, eraVar, x340Var4, 54);
                        obj2 = obj;
                        iHashCode = Long.hashCode(x340Var4.T);
                        xos0VarM = x340Var4.m();
                        qim0VarE = zr7.E(x340Var4, qim0VarD3);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        z7 = x340Var4.S;
                        n4kVar = hmb0.t1;
                        if (z7) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        lljVar = y580.O0;
                        nko1.H(mbhVarA, x340Var4, lljVar);
                        lljVar2 = y580.N0;
                        nko1.H(xos0VarM, x340Var4, lljVar2);
                        Integer numValueOf4 = Integer.valueOf(iHashCode);
                        lljVar3 = y580.R0;
                        nko1.H(numValueOf4, x340Var4, lljVar3);
                        nko1.F(x340Var4);
                        lljVar4 = y580.Y;
                        nko1.H(qim0VarE, x340Var4, lljVar4);
                        qim0 qim0VarF7 = u291.f(nim0Var, 1.0f);
                        pbh pbhVar3 = pbh.a;
                        qim0 qim0VarA3 = pbhVar3.a(1.0f, qim0VarF7, true);
                        mbh mbhVarA4 = jbh.a(f36Var, eraVar, x340Var4, 48);
                        int iHashCode8 = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM8 = x340Var4.m();
                        qim0 qim0VarE8 = zr7.E(x340Var4, qim0VarA3);
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(mbhVarA4, x340Var4, lljVar);
                        nko1.H(xos0VarM8, x340Var4, lljVar2);
                        x0d.q(iHashCode8, x340Var4, lljVar3, x340Var4);
                        nko1.H(qim0VarE8, x340Var4, lljVar4);
                        op71.g(x340Var4, u291.h(nim0Var, fC2));
                        nxc1Var = (nxc1) o7h.t0(err0Var3.s(), mxc1Var.a);
                        if (nxc1Var != null) {
                            vu30Var2 = nxc1Var.a;
                        } else {
                            vu30Var2 = null;
                        }
                        if (vu30Var2 == null) {
                            x340Var4.i0(-950709175);
                            x340Var4.r(false);
                            kkz0Var2 = this;
                            z8 = false;
                            obj3 = obj2;
                        } else {
                            x340Var4.i0(-950709174);
                            vnr0 vnr0Var3 = (vnr0) vu30Var2.invoke(x340Var4, 0);
                            qim0 qim0VarF8 = u291.f(nim0Var, 1.0f);
                            uwr uwrVar7 = cbx.a;
                            qim0 qim0VarZ7 = uyn1.z(cbx.b(x340Var4).e.c, 0.0f, 2, qim0VarF8);
                            gfh0 gfh0VarC5 = t1c.c(een.h, false);
                            int iHashCode9 = Long.hashCode(x340Var4.T);
                            xos0 xos0VarM9 = x340Var4.m();
                            qim0 qim0VarE9 = zr7.E(x340Var4, qim0VarZ7);
                            x340Var4.m0();
                            if (x340Var4.S) {
                                x340Var4.l(n4kVar);
                            } else {
                                x340Var4.v0();
                            }
                            nko1.H(gfh0VarC5, x340Var4, lljVar);
                            nko1.H(xos0VarM9, x340Var4, lljVar2);
                            x0d.q(iHashCode9, x340Var4, lljVar3, x340Var4);
                            nko1.H(qim0VarE9, x340Var4, lljVar4);
                            jto1.d(vnr0Var3, u291.f(nim0Var, 1.0f), x340Var4, 56);
                            qim0 qim0VarF9 = u291.f(nim0Var, 1.0f);
                            kkz0Var2 = this;
                            zI = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS3) | x340Var4.d(fFloatValue);
                            objT3 = x340Var4.T();
                            if (zI) {
                                obj3 = obj2;
                                if (objT3 == obj3) {
                                }
                                qgo1.f(vnr0Var3, i541.C(qim0VarF9, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                                x340Var4.r(true);
                                cvx cvxVar7 = cbx.b(x340Var4).b;
                                z8 = false;
                                x0d.s(nim0Var, 16.0f, x340Var4, false);
                            } else {
                                obj3 = obj2;
                            }
                            objT3 = new na5(kkz0Var2, fFloatValue, ven0VarS3);
                            x340Var4.s0(objT3);
                            qgo1.f(vnr0Var3, i541.C(qim0VarF9, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                            x340Var4.r(true);
                            cvx cvxVar8 = cbx.b(x340Var4).b;
                            z8 = false;
                            x0d.s(nim0Var, 16.0f, x340Var4, false);
                        }
                        int iS6 = err0Var7.s();
                        err0Var6 = err0Var;
                        int iS7 = err0Var6.s();
                        qim0 qim0VarC5 = u291.c(u291.j(0.0f, fC, 1, pbhVar3.a(1.0f, u291.f(nim0Var, 1.0f), z8)), 1.0f);
                        objT4 = x340Var4.T();
                        if (objT4 == obj3) {
                            objT4 = new tih(err0Var7, err0Var6, (byte) 4);
                            x340Var4.s0(objT4);
                        }
                        qim0 qim0VarX3 = ern1.x(qim0VarC5, (iu30) objT4);
                        zI2 = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS);
                        objT5 = x340Var4.T();
                        if (zI2) {
                            objT5 = new lws0(kkz0Var2, ven0VarS, (byte) 22);
                            x340Var4.s0(objT5);
                        } else {
                            objT5 = new lws0(kkz0Var2, ven0VarS, (byte) 22);
                            x340Var4.s0(objT5);
                        }
                        lxc1.a(mxc1Var, jkr0Var2, iS6, iS7, i541.C(qim0VarX3, (iu30) objT5), x340Var4, 0);
                        if (jkr0Var2.l() > 1) {
                            x340Var4.i0(-949051015);
                            int iL3 = jkr0Var2.l();
                            rk41Var2 = rk41Var;
                            boolean z17 = rk41Var2.a;
                            long j5 = mxc1Var.c;
                            long j6 = mxc1Var.d;
                            qim0 qim0VarY3 = uyn1.y(nim0Var, 16.0f, 18.0f);
                            zI3 = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS2);
                            objT9 = x340Var4.T();
                            if (zI3) {
                                objT9 = new lws0(kkz0Var2, ven0VarS2, (byte) 23);
                                x340Var4.s0(objT9);
                            } else {
                                objT9 = new lws0(kkz0Var2, ven0VarS2, (byte) 23);
                                x340Var4.s0(objT9);
                            }
                            qgo1.c(iL3, jkr0Var2, i541.C(qim0VarY3, (iu30) objT9), z2, z17, 10.0f, 8.0f, j5, j6, x340Var4, 1769472);
                            z9 = z2;
                            z10 = false;
                            x340Var4.r(false);
                        } else {
                            rk41Var2 = rk41Var;
                            z9 = z2;
                            z10 = false;
                            x340Var4.i0(-948378005);
                            x340Var4.r(false);
                        }
                        iu30Var = mxc1Var.e;
                        if (iu30Var == null) {
                            x340Var4.i0(-948286153);
                            x340Var4.r(z10);
                            z12 = true;
                        } else {
                            x340Var4.i0(-948286152);
                            uwr uwrVar8 = cbx.a;
                            cvx cvxVar9 = cbx.b(x340Var4).b;
                            op71.g(x340Var4, u291.h(nim0Var, 8.0f));
                            zE = x340Var4.e(err0Var5.s()) | x340Var4.g(iu30Var);
                            objT6 = x340Var4.T();
                            if (zE) {
                                objT6 = (iec) iu30Var.invoke(Integer.valueOf(err0Var5.s()));
                                x340Var4.s0(objT6);
                            } else {
                                objT6 = (iec) iu30Var.invoke(Integer.valueOf(err0Var5.s()));
                                x340Var4.s0(objT6);
                            }
                            iec iecVar3 = (iec) objT6;
                            ven0VarS5 = zod.S(new hsi1("ctaIn", fValueOf2, fValueOf, new pxg1(800, 100, flv.e), tzg1Var), rk41Var2.a, z9, (Function0) null, x340Var4, 8, 8);
                            qim0 qim0VarZ8 = uyn1.z(84.0f, 0.0f, 2, nim0Var);
                            zG = x340Var4.g(ven0VarS5);
                            objT7 = x340Var4.T();
                            if (zG) {
                                objT7 = new lws0(ven0VarS5, (byte) 24);
                                x340Var4.s0(objT7);
                            } else {
                                objT7 = new lws0(ven0VarS5, (byte) 24);
                                x340Var4.s0(objT7);
                            }
                            qim0 qim0VarC6 = i541.C(qim0VarZ8, (iu30) objT7);
                            gfh0 gfh0VarC6 = t1c.c(een.d, false);
                            int iHashCode10 = Long.hashCode(x340Var4.T);
                            xos0 xos0VarM10 = x340Var4.m();
                            qim0 qim0VarE10 = zr7.E(x340Var4, qim0VarC6);
                            x340Var4.m0();
                            if (x340Var4.S) {
                                x340Var4.l(n4kVar);
                            } else {
                                x340Var4.v0();
                            }
                            nko1.H(gfh0VarC6, x340Var4, lljVar);
                            nko1.H(xos0VarM10, x340Var4, lljVar2);
                            x0d.q(iHashCode10, x340Var4, lljVar3, x340Var4);
                            nko1.H(qim0VarE10, x340Var4, lljVar4);
                            if (((Number) ven0VarS5.getValue()).floatValue() > 0.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z10 = false;
                            e4p1.a(iecVar3, z11, x340Var4, 0, 0);
                            z12 = true;
                            x340Var4.r(true);
                            x340Var4.r(false);
                        }
                        uwr uwrVar9 = cbx.a;
                        x0d.s(nim0Var, cbx.b(x340Var4).b.b, x340Var4, z12);
                        hyc1Var = mxc1Var.b;
                        if (hyc1Var == null) {
                            x340Var4.i0(-1219113350);
                            x340Var4.r(z10);
                        } else {
                            x340Var4.i0(-1219113349);
                            qim0 qim0VarZ9 = uyn1.z(88.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                            zG2 = x340Var4.g(ven0VarS4);
                            objT8 = x340Var4.T();
                            if (zG2) {
                                objT8 = new lws0(ven0VarS4, (byte) 25);
                                x340Var4.s0(objT8);
                            } else {
                                objT8 = new lws0(ven0VarS4, (byte) 25);
                                x340Var4.s0(objT8);
                            }
                            qgo1.f((vnr0) hyc1Var.invoke(x340Var4, 0), i541.C(qim0VarZ9, (iu30) objT8), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                            op71.g(x340Var4, u291.f(u291.h(nim0Var, cbx.b(x340Var4).b.c), 1.0f));
                            x340Var4.r(false);
                        }
                        x340Var4.r(true);
                    }
                    pxg1Var = zu91VarO0;
                    x340Var4 = x340Var;
                    fFloatValue = ((Number) zod.G(fValueOf5, z4, tzg1Var, pxg1Var, x340Var, 0)).floatValue();
                    if (fFloatValue == 0.0f) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Boolean boolValueOf8 = Boolean.valueOf(z3);
                    Boolean boolValueOf9 = Boolean.valueOf(z5);
                    zH = x340Var4.h(z3) | x340Var4.h(z5) | x340Var4.g(jkr0Var);
                    z6 = z3;
                    objT2 = x340Var4.T();
                    if (zH) {
                        objT2 = new hl0(z6, z5, jkr0Var, err0Var2, (lnm) null);
                        x340Var4.s0(objT2);
                    } else {
                        objT2 = new hl0(z6, z5, jkr0Var, err0Var2, (lnm) null);
                        x340Var4.s0(objT2);
                    }
                    qxd0.s(boolValueOf8, boolValueOf9, (vu30) objT2, x340Var4);
                    ven0VarS4 = zod.S(new hsi1("hintTextIn", fValueOf2, fValueOf, new pxg1(700, 100, ceoVar), tzg1Var), rk41Var.a, z2, (Function0) null, x340Var4, 8, 8);
                    fC = i2cVar.c() * 0.6f;
                    fC2 = i2cVar.c() * 0.125f;
                    jkr0Var2 = jkr0Var;
                    nim0Var = nim0.a;
                    qim0 qim0VarD4 = u291.d(nim0Var, 1.0f);
                    eraVar = een.Q0;
                    f36Var = h36.c;
                    mbhVarA = jbh.a(f36Var, eraVar, x340Var4, 54);
                    obj2 = obj;
                    iHashCode = Long.hashCode(x340Var4.T);
                    xos0VarM = x340Var4.m();
                    qim0VarE = zr7.E(x340Var4, qim0VarD4);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    z7 = x340Var4.S;
                    n4kVar = hmb0.t1;
                    if (z7) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var4, lljVar);
                    lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var4, lljVar2);
                    Integer numValueOf5 = Integer.valueOf(iHashCode);
                    lljVar3 = y580.R0;
                    nko1.H(numValueOf5, x340Var4, lljVar3);
                    nko1.F(x340Var4);
                    lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var4, lljVar4);
                    qim0 qim0VarF10 = u291.f(nim0Var, 1.0f);
                    pbh pbhVar4 = pbh.a;
                    qim0 qim0VarA4 = pbhVar4.a(1.0f, qim0VarF10, true);
                    mbh mbhVarA5 = jbh.a(f36Var, eraVar, x340Var4, 48);
                    int iHashCode11 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM11 = x340Var4.m();
                    qim0 qim0VarE11 = zr7.E(x340Var4, qim0VarA4);
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA5, x340Var4, lljVar);
                    nko1.H(xos0VarM11, x340Var4, lljVar2);
                    x0d.q(iHashCode11, x340Var4, lljVar3, x340Var4);
                    nko1.H(qim0VarE11, x340Var4, lljVar4);
                    op71.g(x340Var4, u291.h(nim0Var, fC2));
                    nxc1Var = (nxc1) o7h.t0(err0Var3.s(), mxc1Var.a);
                    if (nxc1Var != null) {
                        vu30Var2 = nxc1Var.a;
                    } else {
                        vu30Var2 = null;
                    }
                    if (vu30Var2 == null) {
                        x340Var4.i0(-950709175);
                        x340Var4.r(false);
                        kkz0Var2 = this;
                        z8 = false;
                        obj3 = obj2;
                    } else {
                        x340Var4.i0(-950709174);
                        vnr0 vnr0Var4 = (vnr0) vu30Var2.invoke(x340Var4, 0);
                        qim0 qim0VarF11 = u291.f(nim0Var, 1.0f);
                        uwr uwrVar10 = cbx.a;
                        qim0 qim0VarZ10 = uyn1.z(cbx.b(x340Var4).e.c, 0.0f, 2, qim0VarF11);
                        gfh0 gfh0VarC7 = t1c.c(een.h, false);
                        int iHashCode12 = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM12 = x340Var4.m();
                        qim0 qim0VarE12 = zr7.E(x340Var4, qim0VarZ10);
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC7, x340Var4, lljVar);
                        nko1.H(xos0VarM12, x340Var4, lljVar2);
                        x0d.q(iHashCode12, x340Var4, lljVar3, x340Var4);
                        nko1.H(qim0VarE12, x340Var4, lljVar4);
                        jto1.d(vnr0Var4, u291.f(nim0Var, 1.0f), x340Var4, 56);
                        qim0 qim0VarF12 = u291.f(nim0Var, 1.0f);
                        kkz0Var2 = this;
                        zI = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS3) | x340Var4.d(fFloatValue);
                        objT3 = x340Var4.T();
                        if (zI) {
                            obj3 = obj2;
                            if (objT3 == obj3) {
                            }
                            qgo1.f(vnr0Var4, i541.C(qim0VarF12, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                            x340Var4.r(true);
                            cvx cvxVar10 = cbx.b(x340Var4).b;
                            z8 = false;
                            x0d.s(nim0Var, 16.0f, x340Var4, false);
                        } else {
                            obj3 = obj2;
                        }
                        objT3 = new na5(kkz0Var2, fFloatValue, ven0VarS3);
                        x340Var4.s0(objT3);
                        qgo1.f(vnr0Var4, i541.C(qim0VarF12, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                        x340Var4.r(true);
                        cvx cvxVar11 = cbx.b(x340Var4).b;
                        z8 = false;
                        x0d.s(nim0Var, 16.0f, x340Var4, false);
                    }
                    int iS8 = err0Var7.s();
                    err0Var6 = err0Var;
                    int iS9 = err0Var6.s();
                    qim0 qim0VarC7 = u291.c(u291.j(0.0f, fC, 1, pbhVar4.a(1.0f, u291.f(nim0Var, 1.0f), z8)), 1.0f);
                    objT4 = x340Var4.T();
                    if (objT4 == obj3) {
                        objT4 = new tih(err0Var7, err0Var6, (byte) 4);
                        x340Var4.s0(objT4);
                    }
                    qim0 qim0VarX4 = ern1.x(qim0VarC7, (iu30) objT4);
                    zI2 = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS);
                    objT5 = x340Var4.T();
                    if (zI2) {
                        objT5 = new lws0(kkz0Var2, ven0VarS, (byte) 22);
                        x340Var4.s0(objT5);
                    } else {
                        objT5 = new lws0(kkz0Var2, ven0VarS, (byte) 22);
                        x340Var4.s0(objT5);
                    }
                    lxc1.a(mxc1Var, jkr0Var2, iS8, iS9, i541.C(qim0VarX4, (iu30) objT5), x340Var4, 0);
                    if (jkr0Var2.l() > 1) {
                        x340Var4.i0(-949051015);
                        int iL4 = jkr0Var2.l();
                        rk41Var2 = rk41Var;
                        boolean z18 = rk41Var2.a;
                        long j7 = mxc1Var.c;
                        long j8 = mxc1Var.d;
                        qim0 qim0VarY4 = uyn1.y(nim0Var, 16.0f, 18.0f);
                        zI3 = x340Var4.i(kkz0Var2) | x340Var4.g(ven0VarS2);
                        objT9 = x340Var4.T();
                        if (zI3) {
                            objT9 = new lws0(kkz0Var2, ven0VarS2, (byte) 23);
                            x340Var4.s0(objT9);
                        } else {
                            objT9 = new lws0(kkz0Var2, ven0VarS2, (byte) 23);
                            x340Var4.s0(objT9);
                        }
                        qgo1.c(iL4, jkr0Var2, i541.C(qim0VarY4, (iu30) objT9), z2, z18, 10.0f, 8.0f, j7, j8, x340Var4, 1769472);
                        z9 = z2;
                        z10 = false;
                        x340Var4.r(false);
                    } else {
                        rk41Var2 = rk41Var;
                        z9 = z2;
                        z10 = false;
                        x340Var4.i0(-948378005);
                        x340Var4.r(false);
                    }
                    iu30Var = mxc1Var.e;
                    if (iu30Var == null) {
                        x340Var4.i0(-948286153);
                        x340Var4.r(z10);
                        z12 = true;
                    } else {
                        x340Var4.i0(-948286152);
                        uwr uwrVar11 = cbx.a;
                        cvx cvxVar12 = cbx.b(x340Var4).b;
                        op71.g(x340Var4, u291.h(nim0Var, 8.0f));
                        zE = x340Var4.e(err0Var5.s()) | x340Var4.g(iu30Var);
                        objT6 = x340Var4.T();
                        if (zE) {
                            objT6 = (iec) iu30Var.invoke(Integer.valueOf(err0Var5.s()));
                            x340Var4.s0(objT6);
                        } else {
                            objT6 = (iec) iu30Var.invoke(Integer.valueOf(err0Var5.s()));
                            x340Var4.s0(objT6);
                        }
                        iec iecVar4 = (iec) objT6;
                        ven0VarS5 = zod.S(new hsi1("ctaIn", fValueOf2, fValueOf, new pxg1(800, 100, flv.e), tzg1Var), rk41Var2.a, z9, (Function0) null, x340Var4, 8, 8);
                        qim0 qim0VarZ11 = uyn1.z(84.0f, 0.0f, 2, nim0Var);
                        zG = x340Var4.g(ven0VarS5);
                        objT7 = x340Var4.T();
                        if (zG) {
                            objT7 = new lws0(ven0VarS5, (byte) 24);
                            x340Var4.s0(objT7);
                        } else {
                            objT7 = new lws0(ven0VarS5, (byte) 24);
                            x340Var4.s0(objT7);
                        }
                        qim0 qim0VarC8 = i541.C(qim0VarZ11, (iu30) objT7);
                        gfh0 gfh0VarC8 = t1c.c(een.d, false);
                        int iHashCode13 = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM13 = x340Var4.m();
                        qim0 qim0VarE13 = zr7.E(x340Var4, qim0VarC8);
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC8, x340Var4, lljVar);
                        nko1.H(xos0VarM13, x340Var4, lljVar2);
                        x0d.q(iHashCode13, x340Var4, lljVar3, x340Var4);
                        nko1.H(qim0VarE13, x340Var4, lljVar4);
                        if (((Number) ven0VarS5.getValue()).floatValue() > 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 = false;
                        e4p1.a(iecVar4, z11, x340Var4, 0, 0);
                        z12 = true;
                        x340Var4.r(true);
                        x340Var4.r(false);
                    }
                    uwr uwrVar12 = cbx.a;
                    x0d.s(nim0Var, cbx.b(x340Var4).b.b, x340Var4, z12);
                    hyc1Var = mxc1Var.b;
                    if (hyc1Var == null) {
                        x340Var4.i0(-1219113350);
                        x340Var4.r(z10);
                    } else {
                        x340Var4.i0(-1219113349);
                        qim0 qim0VarZ12 = uyn1.z(88.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                        zG2 = x340Var4.g(ven0VarS4);
                        objT8 = x340Var4.T();
                        if (zG2) {
                            objT8 = new lws0(ven0VarS4, (byte) 25);
                            x340Var4.s0(objT8);
                        } else {
                            objT8 = new lws0(ven0VarS4, (byte) 25);
                            x340Var4.s0(objT8);
                        }
                        qgo1.f((vnr0) hyc1Var.invoke(x340Var4, 0), i541.C(qim0VarZ12, (iu30) objT8), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                        op71.g(x340Var4, u291.f(u291.h(nim0Var, cbx.b(x340Var4).b.c), 1.0f));
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                } else {
                    kkz0Var2 = kkz0Var3;
                    x340Var4.b0();
                }
                h311 h311VarV2 = x340Var4.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new uoc1(i, kkz0Var2, i2cVar, rk41Var, function0, (byte) 4);
                    return;
                }
                return;
            case 2:
                vu30 vu30Var3 = (vu30) obj4;
                Float fValueOf6 = Float.valueOf(0.0f);
                x340 x340Var5 = (x340) b0kVar;
                x340Var5.k0(1316341293);
                j06 j06Var2 = x340Var5.a;
                if ((i & 6) == 0) {
                    i7 = i | (x340Var5.g(i2cVar) ? 4 : 2);
                } else {
                    i7 = i;
                }
                if ((i & 48) == 0) {
                    i7 |= (i & 64) == 0 ? x340Var5.g(rk41Var) : x340Var5.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i7 |= x340Var5.i(kkz0Var3) ? 2048 : 1024;
                }
                int i12 = i7;
                if (x340Var5.Y(i12 & 1, (i12 & 1043) != 1042)) {
                    Object objT23 = x340Var5.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT23 == m4cVar2) {
                        objT23 = bb00.h(0, x340Var5);
                    }
                    hdn0 hdn0Var2 = (hdn0) objT23;
                    Object objT24 = x340Var5.T();
                    if (objT24 == m4cVar2) {
                        objT24 = bb00.h(0, x340Var5);
                    }
                    hdn0 hdn0Var3 = (hdn0) objT24;
                    boolean z19 = kkz0Var3.c;
                    if (z19) {
                        ilv.a.getClass();
                        f2 = 1.0f;
                        pxg1VarJ0 = new pxg1(700, 100, flv.g);
                    } else {
                        f2 = 1.0f;
                        pxg1VarJ0 = irn1.j0();
                    }
                    if (z19) {
                        ilv.a.getClass();
                        pxg1VarJ1 = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 800, flv.d);
                    } else {
                        pxg1VarJ1 = irn1.j0();
                    }
                    tzg1 tzg1Var2 = rno1.a;
                    if (z19) {
                        x340Var5.i0(2073035286);
                        ven0VarR = zod.R(new hsi1("titleIn", Float.valueOf(f2), fValueOf6, pxg1VarJ0, tzg1Var2), rk41Var.a, (Function0) null, x340Var5, 8, 4);
                        x340Var2 = x340Var5;
                        x340Var2.r(false);
                    } else {
                        x340Var5.i0(2072914727);
                        ven0 ven0VarY = zod.y("titleIn", rk41Var, pxg1VarJ0, x340Var5);
                        x340Var5.r(false);
                        ven0VarR = ven0VarY;
                        x340Var2 = x340Var5;
                    }
                    hsi1 hsi1Var2 = new hsi1("subtitleIn", Float.valueOf(!z19 ? 0.0f : f2), fValueOf6, pxg1VarJ1, tzg1Var2);
                    boolean z20 = rk41Var.a;
                    boolean zI7 = x340Var2.i(kkz0Var3);
                    Object objT25 = x340Var2.T();
                    if (zI7 || objT25 == m4cVar2) {
                        objT25 = new fjc1(kkz0Var3, (byte) 28);
                        x340Var2.s0(objT25);
                    }
                    ven0 ven0VarR2 = zod.R(hsi1Var2, z20, (Function0) objT25, x340Var2, 8, 0);
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarD5 = u291.d(nim0Var2, f2);
                    gfh0 gfh0VarC9 = t1c.c(een.h, false);
                    int iHashCode14 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM14 = x340Var2.m();
                    qim0 qim0VarE14 = zr7.E(x340Var2, qim0VarD5);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z21 = x340Var2.S;
                    n4k n4kVar2 = hmb0.t1;
                    if (z21) {
                        x340Var2.l(n4kVar2);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(gfh0VarC9, x340Var2, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM14, x340Var2, lljVar6);
                    Integer numValueOf6 = Integer.valueOf(iHashCode14);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf6, x340Var2, lljVar7);
                    nko1.F(x340Var2);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE14, x340Var2, lljVar8);
                    qim0 qim0VarU = qxy0.u(u291.j(0.0f, i2cVar.c() * 0.75f, 1, u291.f(nim0Var2, 1.0f)), (idn0) null, 3);
                    Object objT26 = x340Var2.T();
                    if (objT26 == m4cVar2) {
                        objT26 = nhe1.T0;
                        x340Var2.s0(objT26);
                    }
                    qim0 qim0VarB = s161.b(qim0VarU, true, (iu30) objT26);
                    mbh mbhVarA6 = jbh.a(h36.e, een.Q0, x340Var2, 54);
                    ven0 ven0Var2 = ven0VarR;
                    int iHashCode15 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM15 = x340Var2.m();
                    qim0 qim0VarE15 = zr7.E(x340Var2, qim0VarB);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar2);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA6, x340Var2, lljVar5);
                    nko1.H(xos0VarM15, x340Var2, lljVar6);
                    x0d.q(iHashCode15, x340Var2, lljVar7, x340Var2);
                    nko1.H(qim0VarE15, x340Var2, lljVar8);
                    vnr0 vnr0Var5 = (vnr0) vu30Var3.invoke(x340Var2, 0);
                    qim0 qim0VarZ13 = uyn1.z(u890.j(((vnr0) vu30Var3.invoke(x340Var2, 0)).c, new jor0((eor0) null, (djc0) null, (tnr0) null, (bor0) null, 0.0f, 63)) ? 0.0f : 24.0f, 0.0f, 2, u291.f(nim0Var2, 1.0f));
                    boolean zG8 = x340Var2.g(ven0Var2);
                    Object objT27 = x340Var2.T();
                    if (zG8 || objT27 == m4cVar2) {
                        objT27 = new ctd1(ven0Var2, (byte) 5);
                        x340Var2.s0(objT27);
                    }
                    qim0 qim0VarC9 = i541.C(qim0VarZ13, (iu30) objT27);
                    Object objT28 = x340Var2.T();
                    if (objT28 == m4cVar2) {
                        i8 = 3;
                        objT28 = new qsc1(hdn0Var2, (byte) 3);
                        x340Var2.s0(objT28);
                    } else {
                        i8 = 3;
                    }
                    qgo1.f(vnr0Var5, lrn1.u(qim0VarC9, (iu30) objT28), new a0e1(i8), 0, false, (iu30) null, x340Var2, 8, 56);
                    op71.g(x340Var2, u291.h(nim0Var2, 16.0f));
                    kkz0Var3 = this;
                    vnr0 vnr0Var6 = (vnr0) ((vu30) kkz0Var3.e).invoke(x340Var2, 0);
                    qim0 qim0VarZ14 = uyn1.z(24.0f, 0.0f, 2, u291.f(nim0Var2, 1.0f));
                    Object objT29 = x340Var2.T();
                    if (objT29 == m4cVar2) {
                        objT29 = new qsc1(hdn0Var3, (byte) 4);
                        x340Var2.s0(objT29);
                    }
                    qim0 qim0VarU2 = lrn1.u(qim0VarZ14, (iu30) objT29);
                    boolean zG9 = x340Var2.g(ven0VarR2);
                    Object objT30 = x340Var2.T();
                    if (zG9 || objT30 == m4cVar2) {
                        objT30 = new ctd1(ven0VarR2, (byte) 6);
                        x340Var2.s0(objT30);
                    }
                    qgo1.f(vnr0Var6, i541.C(qim0VarU2, (iu30) objT30), new a0e1(3), 0, false, (iu30) null, x340Var2, 8, 56);
                    x340Var2.r(true);
                    x340Var2.r(true);
                } else {
                    x340Var2 = x340Var5;
                    x340Var2.b0();
                }
                h311 h311VarV3 = x340Var2.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new uoc1(i, kkz0Var3, i2cVar, rk41Var, function0, (byte) 21);
                    return;
                }
                return;
            default:
                x340 x340Var6 = (x340) b0kVar;
                x340Var6.k0(-207331162);
                if ((i & 6) == 0) {
                    i9 = i | (x340Var6.g(i2cVar) ? 4 : 2);
                } else {
                    i9 = i;
                }
                if ((i & 48) == 0) {
                    i9 |= (i & 64) == 0 ? x340Var6.g(rk41Var) : x340Var6.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i9 |= x340Var6.i(kkz0Var3) ? 2048 : 1024;
                }
                if (x340Var6.Y(i9 & 1, (i9 & 1043) != 1042)) {
                    float fC4 = i2cVar.c();
                    Object objT31 = x340Var6.T();
                    if (objT31 == fkj0.X) {
                        objT31 = v8r.q(new rfv0(0, 0));
                        x340Var6.s0(objT31);
                    }
                    che0 che0VarV2 = hon1.v(x340Var6);
                    mod.b(dhe0.a.a(che0VarV2), apo.r(1590646118, new ys(this, che0VarV2, (ven0) objT31, rk41Var, fC4, (byte) 12), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                h311 h311VarV4 = x340Var6.v();
                if (h311VarV4 != null) {
                    h311VarV4.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 25);
                    return;
                }
                return;
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return (ok41) obj;
            case 1:
                return pk41.a;
            case 2:
                return (qk41) obj;
            default:
                return (ok41) obj;
        }
    }

    public kkz0(rhz0 rhz0Var, boolean z, j3y0 j3y0Var, Function0 function0) {
        this.d = rhz0Var;
        this.c = z;
        this.e = j3y0Var;
        this.b = function0;
        this.f = new ok41((rhz0Var.f.size() * 83) + 666);
    }

    public kkz0(mxc1 mxc1Var, iu30 iu30Var, Function0 function0, boolean z, j2i j2iVar) {
        this.d = mxc1Var;
        this.e = iu30Var;
        this.b = function0;
        this.c = z;
        this.f = j2iVar;
    }

    public kkz0(vu30 vu30Var, vu30 vu30Var2, boolean z, Integer num, Function0 function0, int i) {
        function0 = (i & 32) != 0 ? null : function0;
        this.d = vu30Var;
        this.e = vu30Var2;
        this.c = z;
        this.b = function0;
        this.f = new ok41(num.intValue() + 1800);
    }
}
