package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mda1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pda1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mda1(pda1 pda1Var, byte b) {
        super(2);
        this.a = b;
        this.b = pda1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:111:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:115:0x0301  */
    /* JADX WARN: Code duplicated, block: B:121:0x0319  */
    /* JADX WARN: Code duplicated, block: B:123:0x0329  */
    /* JADX WARN: Code duplicated, block: B:125:0x032e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0331  */
    /* JADX WARN: Code duplicated, block: B:129:0x0335 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0337  */
    /* JADX WARN: Code duplicated, block: B:131:0x0339  */
    /* JADX WARN: Code duplicated, block: B:133:0x033f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0347 A[PHI: r7 r33
      0x0347: PHI (r7v19 java.util.HashSet) = (r7v14 java.util.HashSet), (r7v25 java.util.HashSet) binds: [B:145:0x0368, B:133:0x033f] A[DONT_GENERATE, DONT_INLINE]
      0x0347: PHI (r33v3 p.yda1) = (r33v0 p.yda1), (r33v4 p.yda1) binds: [B:145:0x0368, B:133:0x033f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x0349 A[PHI: r33
      0x0349: PHI (r33v1 p.yda1) = (r33v0 p.yda1), (r33v4 p.yda1), (r33v4 p.yda1), (r33v4 p.yda1) binds: [B:145:0x0368, B:124:0x032c, B:128:0x0333, B:132:0x033d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x034c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0352  */
    /* JADX WARN: Code duplicated, block: B:140:0x0358  */
    /* JADX WARN: Code duplicated, block: B:141:0x035b  */
    /* JADX WARN: Code duplicated, block: B:143:0x035e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0367  */
    /* JADX WARN: Code duplicated, block: B:150:0x0373  */
    /* JADX WARN: Code duplicated, block: B:151:0x037d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0384  */
    /* JADX WARN: Code duplicated, block: B:157:0x0397  */
    /* JADX WARN: Code duplicated, block: B:160:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0418  */
    /* JADX WARN: Code duplicated, block: B:170:0x0429  */
    /* JADX WARN: Code duplicated, block: B:171:0x042b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0436 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0438  */
    /* JADX WARN: Code duplicated, block: B:178:0x0475  */
    /* JADX WARN: Code duplicated, block: B:180:0x0478  */
    /* JADX WARN: Code duplicated, block: B:182:0x047b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0491  */
    /* JADX WARN: Code duplicated, block: B:186:0x0499  */
    /* JADX WARN: Code duplicated, block: B:187:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:189:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:192:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:194:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:203:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:205:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:207:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:211:0x0516  */
    /* JADX WARN: Code duplicated, block: B:217:0x052b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0545  */
    /* JADX WARN: Code duplicated, block: B:220:0x054c  */
    /* JADX WARN: Code duplicated, block: B:221:0x054e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0553  */
    /* JADX WARN: Code duplicated, block: B:225:0x055c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0568  */
    /* JADX WARN: Code duplicated, block: B:229:0x0582 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x0584  */
    /* JADX WARN: Code duplicated, block: B:232:0x0592  */
    /* JADX WARN: Code duplicated, block: B:233:0x0594  */
    /* JADX WARN: Code duplicated, block: B:235:0x059c  */
    /* JADX WARN: Code duplicated, block: B:236:0x059e  */
    /* JADX WARN: Code duplicated, block: B:239:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:241:0x05af  */
    /* JADX WARN: Code duplicated, block: B:242:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:244:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:245:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:249:0x05dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:252:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:254:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:256:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:257:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:260:0x0608  */
    /* JADX WARN: Code duplicated, block: B:262:0x0614  */
    /* JADX WARN: Code duplicated, block: B:264:0x061e  */
    /* JADX WARN: Code duplicated, block: B:265:0x062b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0633  */
    /* JADX WARN: Code duplicated, block: B:268:0x0642  */
    /* JADX WARN: Code duplicated, block: B:270:0x064c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0656 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:288:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:290:0x06c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x0763  */
    /* JADX WARN: Code duplicated, block: B:307:0x076a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0770  */
    /* JADX WARN: Code duplicated, block: B:311:0x0794  */
    /* JADX WARN: Code duplicated, block: B:313:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:315:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:323:0x0526 A[SYNTHETIC] */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object obj3;
        pda1 pda1Var;
        Object obj4;
        Object obj5;
        vba1 vba1Var;
        String str;
        zda1 zda1Var;
        yda1 yda1Var;
        eda1 eda1Var;
        boolean zG;
        Object objT;
        xca1 xca1Var;
        int iC;
        w7x w7xVar;
        yda1 yda1Var2;
        vda1 vda1Var;
        HashSet hashSetJ1;
        boolean zEquals;
        Set set;
        le81 le81Var;
        Object objT2;
        Object obj6;
        ven0 ven0Var;
        Object objT3;
        Object obj7;
        ven0 ven0Var2;
        boolean zG2;
        String str2;
        Object pwm0Var;
        boolean zH;
        Object obj8;
        boolean z;
        boolean zI;
        Object obj9;
        u85 u85Var;
        wat watVar;
        String strI;
        int iC2;
        int i;
        boolean zG3;
        Object objT4;
        brl0 brl0Var;
        String strD;
        e1m0 e1m0Var;
        e1m0 e1m0Var2;
        boolean zG4;
        Object objT5;
        zda1 zda1Var2;
        r6h1 r6h1VarB;
        xtb0 xtb0Var;
        u85 u85Var2;
        List list;
        aca1 aca1Var;
        bca1 bca1Var;
        List list2;
        Object aca1Var2;
        zba1 zba1VarC;
        sda1 sda1Var;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Object objT6;
        Object obj10;
        xca1 xca1Var2;
        uaa1 uaa1Var;
        String str3;
        int i2;
        Iterator it;
        Object next;
        kba1 kba1Var;
        boolean z2;
        String strU;
        uca1 uca1Var;
        int size;
        lsm0 lsm0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 4;
        boolean z3 = false;
        byte b3 = 3;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pda1 pda1Var2 = this.b;
                    y7e1 y7e1Var = pda1Var2.s;
                    njm njmVar = pda1Var2.d;
                    d0r d0rVar = pda1Var2.f;
                    rwq0.l(y7e1Var, x340Var2, 0);
                    rba1 rba1Var = sba1.a;
                    boolean zI2 = x340Var2.i(pda1Var2);
                    Object objT7 = x340Var2.T();
                    if (zI2 || objT7 == m4cVar) {
                        obj3 = objT7;
                        gda1 gda1Var = new gda1(pda1Var2, (byte) 1);
                        x340Var2.s0(gda1Var);
                        obj3 = gda1Var;
                    }
                    Function0 function0 = (Function0) obj3;
                    boolean zI3 = x340Var2.i(pda1Var2);
                    Object objT8 = x340Var2.T();
                    Object obj11 = objT8;
                    if (zI3 || objT8 == m4cVar) {
                        ida1 ida1Var = new ida1(pda1Var2, z3 ? 1 : 0);
                        x340Var2.s0(ida1Var);
                        obj11 = ida1Var;
                    }
                    rwq0.m(rba1Var, function0, (iu30) obj11, x340Var2, 54);
                    ven0 ven0VarK = f4p1.k(pda1Var2.b.d, null, x340Var2, 7);
                    ven0 ven0VarK2 = f4p1.k(pda1Var2.c.d, null, x340Var2, 7);
                    Object objT9 = x340Var2.T();
                    Object obj12 = objT9;
                    if (objT9 == m4cVar) {
                        c9n c9nVarM = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(c9nVarM);
                        obj12 = c9nVarM;
                    }
                    c9n c9nVar = (c9n) obj12;
                    Object objT10 = x340Var2.T();
                    Object obj13 = objT10;
                    if (objT10 == m4cVar) {
                        kkw0 kkw0Var = new kkw0(cwl1.E(pda1Var2.e.b), c9nVar);
                        x340Var2.s0(kkw0Var);
                        obj13 = kkw0Var;
                    }
                    kkw0 kkw0Var2 = (kkw0) obj13;
                    boolean zG5 = x340Var2.g(kkw0Var2);
                    Object objT11 = x340Var2.T();
                    Object obj14 = objT11;
                    if (zG5 || objT11 == m4cVar) {
                        xe01 xe01VarT = d5p1.t(hu20.e(kkw0Var2.c, new i64(3, (lnm) null, (byte) 24)), kkw0Var2.b, ey71.a, (Object) null);
                        x340Var2.s0(xe01VarT);
                        obj14 = xe01VarT;
                    }
                    ven0 ven0VarJ = f4p1.j((zob1) obj14, null, null, x340Var2, 48, 14);
                    boolean zG6 = x340Var2.g(kkw0Var2);
                    Object objT12 = x340Var2.T();
                    Object obj15 = objT12;
                    if (zG6 || objT12 == m4cVar) {
                        iea1 iea1Var = new iea1(d0rVar, pda1Var2.g.a(d0rVar, pda1Var2.k, kkw0Var2, r6h1.c), njmVar);
                        x340Var2.s0(iea1Var);
                        obj15 = iea1Var;
                    }
                    iea1 iea1Var2 = (iea1) obj15;
                    Object objT13 = x340Var2.T();
                    Object obj16 = objT13;
                    if (objT13 == m4cVar) {
                        cba1 cba1Var = new cba1(d0rVar, njmVar);
                        x340Var2.s0(cba1Var);
                        obj16 = cba1Var;
                    }
                    cba1 cba1Var2 = (cba1) obj16;
                    Object objT14 = x340Var2.T();
                    if (objT14 == m4cVar) {
                        pda1Var = pda1Var2;
                        qba1 qba1Var = new qba1((d061) null, new lda1(2, pda1Var, pda1.class, "selectLandingChip", "selectLandingChip(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0, (byte) 0));
                        x340Var2.s0(qba1Var);
                        obj4 = qba1Var;
                    } else {
                        pda1Var = pda1Var2;
                        obj4 = objT14;
                    }
                    qba1 qba1Var2 = (qba1) obj4;
                    Object objT15 = x340Var2.T();
                    if (objT15 == m4cVar) {
                        qba1 qba1Var3 = new qba1(new d061(1, pda1Var, pda1.class, "clearResultsChip", "clearResultsChip(Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0, (byte) 22), new lda1(2, pda1Var, pda1.class, "selectResultsChip", "selectResultsChip(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0, (byte) 1));
                        x340Var2.s0(qba1Var3);
                        objT15 = qba1Var3;
                    }
                    qba1 qba1Var4 = (qba1) objT15;
                    Object objT16 = x340Var2.T();
                    if (objT16 == m4cVar) {
                        vba1 vba1Var2 = new vba1(new d061(1, pda1Var, pda1.class, "leaveFindThroughBackButton", "leaveFindThroughBackButton(Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0, (byte) 21));
                        x340Var2.s0(vba1Var2);
                        obj5 = vba1Var2;
                    } else {
                        obj5 = objT16;
                    }
                    vba1 vba1Var3 = (vba1) obj5;
                    boolean zG7 = x340Var2.g(pda1Var.d());
                    Object objT17 = x340Var2.T();
                    Object obj17 = objT17;
                    if (zG7 || objT17 == m4cVar) {
                        aea1 aea1Var = new aea1(pda1Var.d());
                        x340Var2.s0(aea1Var);
                        obj17 = aea1Var;
                    }
                    aea1 aea1Var2 = (aea1) obj17;
                    String str4 = aea1Var2.a;
                    boolean zG8 = x340Var2.g(pda1Var.e());
                    Object objT18 = x340Var2.T();
                    if (zG8 || objT18 == m4cVar) {
                        String strE = pda1Var.e();
                        if (strE == null) {
                            strE = null;
                        }
                        objT18 = strE != null ? new eda1(strE) : null;
                        x340Var2.s0(objT18);
                    }
                    eda1 eda1Var2 = (eda1) objT18;
                    String str5 = eda1Var2 != null ? eda1Var2.a : null;
                    xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
                    xtb0 xtb0VarA2 = aub0.a(0, x340Var2, 3);
                    boolean z4 = ((xca1) ven0VarK2.getValue()) instanceof wca1;
                    boolean z5 = !z4;
                    int i3 = z4 ? ((Boolean) ((hrr0) pda1Var.n.d).getValue()).booleanValue() ? 2 : 1 : 3;
                    boolean z6 = i3 != 1;
                    i091 i091Var = (i091) ven0VarJ.getValue();
                    if (i091Var == null || (lsm0Var = i091Var.a) == null) {
                        vba1Var = vba1Var3;
                    } else {
                        vba1Var = vba1Var3;
                        if (!i091Var.g) {
                            o091 o091Var = i091Var.h;
                            str = (u890.j(o091Var, n091.a) || u890.j(o091Var, j091.a)) ? lsm0Var.b.e : null;
                        }
                        zda1Var = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                        yda1Var = yda1.a;
                        if (zda1Var == null) {
                            zda1Var = yda1Var;
                        }
                        boolean zG9 = x340Var2.g((xca1) ven0VarK2.getValue()) | x340Var2.e(l1d.C(i3)) | x340Var2.g(zda1Var);
                        if (str5 != null) {
                            eda1Var = new eda1(str5);
                        } else {
                            eda1Var = null;
                        }
                        zG = zG9 | x340Var2.g(eda1Var);
                        objT = x340Var2.T();
                        if (!zG || objT == m4cVar) {
                            xca1Var = (xca1) ven0VarK2.getValue();
                            iC = l1d.C(i3);
                            w7xVar = w7x.a;
                            if (iC != 0) {
                                yda1Var2 = yda1Var;
                                if (iC != 1) {
                                    if (iC != 2) {
                                        eg.o();
                                    } else if (xca1Var instanceof uca1) {
                                        if (str5 == null) {
                                            zEquals = false;
                                        } else {
                                            zEquals = str5.equals("artists");
                                        }
                                        if (!zEquals) {
                                            hashSetJ1 = o7h.j1(((uca1) xca1Var).f);
                                            objT = hashSetJ1;
                                        }
                                        x340Var2.s0(objT);
                                    }
                                }
                                objT = w7xVar;
                                x340Var2.s0(objT);
                            } else {
                                yda1Var2 = yda1Var;
                                if (zda1Var instanceof vda1) {
                                    vda1Var = (vda1) zda1Var;
                                } else {
                                    vda1Var = null;
                                }
                                if (vda1Var != null) {
                                    hashSetJ1 = o7h.j1(vda1Var.a);
                                } else {
                                    hashSetJ1 = null;
                                }
                                if (hashSetJ1 == null) {
                                    objT = w7xVar;
                                } else {
                                    objT = hashSetJ1;
                                }
                                x340Var2.s0(objT);
                            }
                            return null;
                        }
                        yda1Var2 = yda1Var;
                        set = (Set) objT;
                        if (i3 == 3) {
                            le81Var = new le81(pda1Var.e());
                        } else {
                            le81Var = null;
                        }
                        objT2 = x340Var2.T();
                        obj6 = objT2;
                        if (objT2 == m4cVar) {
                            hrr0 hrr0VarQ = v8r.q(pda1Var.d());
                            x340Var2.s0(hrr0VarQ);
                            obj6 = hrr0VarQ;
                        }
                        ven0Var = (ven0) obj6;
                        objT3 = x340Var2.T();
                        obj7 = objT3;
                        if (objT3 == m4cVar) {
                            hrr0 hrr0VarQ2 = v8r.q(le81Var);
                            x340Var2.s0(hrr0VarQ2);
                            obj7 = hrr0VarQ2;
                        }
                        ven0Var2 = (ven0) obj7;
                        Object[] objArr = {str, set, pda1Var.d(), le81Var};
                        zG2 = x340Var2.g(le81Var) | x340Var2.i(ven0Var2) | x340Var2.i(pda1Var) | x340Var2.i(ven0Var) | x340Var2.g(str) | x340Var2.g(set) | x340Var2.i(kkw0Var2);
                        str2 = str;
                        Object objT19 = x340Var2.T();
                        if (!zG2 || objT19 == m4cVar) {
                            pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                            x340Var2.s0(pwm0Var);
                        } else {
                            pwm0Var = objT19;
                        }
                        qxd0.u(objArr, (vu30) pwm0Var, x340Var2);
                        Boolean boolValueOf = Boolean.valueOf(z5);
                        zH = x340Var2.h(z6) | x340Var2.h(z5) | x340Var2.i(xtb0VarA2);
                        Object objT20 = x340Var2.T();
                        obj8 = objT20;
                        if (zH || objT20 == m4cVar) {
                            jda1 jda1Var = new jda1(z6, z5, xtb0VarA2, null);
                            x340Var2.s0(jda1Var);
                            obj8 = jda1Var;
                        }
                        qxd0.t(boolValueOf, x340Var2, (vu30) obj8);
                        if (i3 != 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zI = x340Var2.i(pda1Var);
                        Object objT21 = x340Var2.T();
                        obj9 = objT21;
                        if (zI || objT21 == m4cVar) {
                            gda1 gda1Var2 = new gda1(pda1Var, (byte) 2);
                            x340Var2.s0(gda1Var2);
                            obj9 = gda1Var2;
                        }
                        q3p1.b(0, 0, (Function0) obj9, x340Var2, z);
                        WeakHashMap weakHashMap = osl1.x;
                        u85Var = lhc.g(x340Var2).c;
                        watVar = (wat) x340Var2.k(t4k.h);
                        strI = xcg1.i(cwl1.o0(x340Var2, 2131962749), ". ", cwl1.o0(x340Var2, 2131962748));
                        iC2 = l1d.C(i3);
                        if (iC2 == 0) {
                            i = 2;
                            x340Var2.i0(-668393222);
                            x340Var2.r(false);
                            strI = "";
                        } else if (iC2 != 1) {
                            i = 2;
                            if (iC2 != 2) {
                                throw p3d1.k(x340Var2, 1779552611, false);
                            }
                            x340Var2.i0(1779559917);
                            xca1Var2 = (xca1) ven0VarK2.getValue();
                            x340Var2.i0(1378548153);
                            if (xca1Var2 instanceof uca1) {
                                uca1Var = (uca1) xca1Var2;
                                String str6 = uca1Var.a;
                                if (str5 == null) {
                                    size = uca1Var.b.size();
                                } else if (str5.equals("artists")) {
                                    size = uca1Var.e.size();
                                } else {
                                    size = uca1Var.f.size();
                                }
                                uaa1Var = new uaa1(str6, size);
                            } else {
                                if (xca1Var2.equals(wca1.a) && !xca1Var2.equals(vca1.a) && !(xca1Var2 instanceof tca1)) {
                                    eg.o();
                                    return null;
                                }
                                uaa1Var = null;
                            }
                            if (uaa1Var == null) {
                                x340Var2.r(false);
                                z2 = false;
                            } else {
                                str3 = uaa1Var.a;
                                i2 = uaa1Var.b;
                                if (str5 == null) {
                                    x340Var2.i0(-149039560);
                                    strU = cwl1.U(2131820922, i2, new Object[]{str3, Integer.valueOf(i2)}, x340Var2);
                                    x340Var2.r(false);
                                    x340Var2.r(false);
                                    z2 = false;
                                } else {
                                    x340Var2.i0(-148869463);
                                    x340Var2.r(false);
                                    it = sba1.b.a.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        kba1Var = (kba1) next;
                                        if (kba1Var != null) {
                                            strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                            z2 = false;
                                            x340Var2.r(false);
                                        } else {
                                            z2 = false;
                                            x340Var2.r(false);
                                        }
                                    } while (!((kba1) next).a.equals(str5));
                                    kba1Var = (kba1) next;
                                    if (kba1Var != null) {
                                        strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                        z2 = false;
                                        x340Var2.r(false);
                                    } else {
                                        z2 = false;
                                        x340Var2.r(false);
                                    }
                                }
                                if (strU == null) {
                                    strI = "";
                                } else {
                                    strI = strU;
                                }
                                x340Var2.r(z2);
                            }
                            strU = null;
                            if (strU == null) {
                                strI = "";
                            } else {
                                strI = strU;
                            }
                            x340Var2.r(z2);
                        } else {
                            i = 2;
                            x340Var2.i0(1779555736);
                            x340Var2.r(false);
                        }
                        zG3 = x340Var2.g(pda1Var.d());
                        objT4 = x340Var2.T();
                        if (zG3 || objT4 == m4cVar) {
                            brl0Var = pda1Var.m;
                            strD = pda1Var.d();
                            if (strD.equals("recently_played")) {
                                i = 4;
                            } else if (strD.equals("followed_artists")) {
                                i = 1;
                            } else if (!strD.equals("liked_songs")) {
                                if (strD.equals("most_played")) {
                                    i = 3;
                                } else {
                                    i = 0;
                                }
                            }
                            if (i != 0) {
                                e1m0Var = new e1m0(brl0Var, i);
                            } else {
                                e1m0Var = null;
                            }
                            x340Var2.s0(e1m0Var);
                            objT4 = e1m0Var;
                        }
                        e1m0Var2 = (e1m0) objT4;
                        zG4 = x340Var2.g((Map) ven0VarK.getValue()) | x340Var2.g(str4) | x340Var2.g(e1m0Var2);
                        objT5 = x340Var2.T();
                        if (!zG4 || objT5 == m4cVar) {
                            zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                            if (zda1Var2 == null) {
                                zda1Var2 = yda1Var2;
                            }
                            if (e1m0Var2 != null) {
                                r6h1VarB = e1m0Var2.b();
                            } else {
                                r6h1VarB = null;
                            }
                            if (zda1Var2.equals(xda1.a)) {
                                aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                            } else if (zda1Var2.equals(yda1Var2)) {
                                aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                            } else {
                                if (zda1Var2.equals(uda1.a)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                } else {
                                    xtb0Var = xtb0VarA2;
                                    if (zda1Var2 instanceof vda1) {
                                        list2 = ((vda1) zda1Var2).a;
                                        if (!list2.isEmpty() || r6h1VarB == null) {
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            List list3 = list2;
                                            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                                            Iterator it2 = list3.iterator();
                                            int i4 = 0;
                                            while (it2.hasNext()) {
                                                Object next2 = it2.next();
                                                int i5 = i4 + 1;
                                                if (i4 < 0) {
                                                    p7h.T();
                                                    throw null;
                                                }
                                                String str7 = (String) next2;
                                                arrayList.add(new fca1(i4, f4i1.f(str4, ":", str7), str7));
                                                i4 = i5;
                                                it2 = it2;
                                                u85Var = u85Var;
                                            }
                                            u85Var2 = u85Var;
                                            bca1Var = new bca1(arrayList);
                                            objT5 = bca1Var;
                                        }
                                    } else {
                                        u85Var2 = u85Var;
                                        if (!(zda1Var2 instanceof wda1)) {
                                            eg.o();
                                            return null;
                                        }
                                        list = ((wda1) zda1Var2).a;
                                        if (!list.isEmpty() || r6h1VarB == null) {
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                                            int i6 = 0;
                                            for (Iterator it3 = r1.iterator(); it3.hasNext(); it3 = it3) {
                                                Object next3 = it3.next();
                                                int i7 = i6 + 1;
                                                if (i6 < 0) {
                                                    p7h.T();
                                                    throw null;
                                                }
                                                String str8 = (String) next3;
                                                arrayList2.add(new eca1(i6, f4i1.f(str4, ":", str8), str8));
                                                i6 = i7;
                                            }
                                            bca1Var = new bca1(arrayList2);
                                            objT5 = bca1Var;
                                        }
                                    }
                                }
                                x340Var2.s0(objT5);
                            }
                            xtb0Var = xtb0VarA2;
                            objT5 = aca1Var2;
                            u85Var2 = u85Var;
                            x340Var2.s0(objT5);
                        } else {
                            xtb0Var = xtb0VarA2;
                            u85Var2 = u85Var;
                        }
                        zba1VarC = u7n0.C(xtb0VarA, (dca1) objT5, pda1Var.f, iea1Var2, cba1Var2, new cca1("song_dna_search_tab_skeleton"), pda1Var.j, pda1Var.d(), x340Var2);
                        sda1Var = new sda1(z6, (xca1) ven0VarK2.getValue(), str5);
                        gfh0VarC = t1c.c(een.d, false);
                        iHashCode = Long.hashCode(x340Var2.T);
                        xos0VarM = x340Var2.m();
                        qim0VarE = zr7.E(x340Var2, nim0.a);
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
                        objT6 = x340Var2.T();
                        obj10 = objT6;
                        if (objT6 == m4cVar) {
                            bba1 bba1Var = bba1.P0;
                            x340Var2.s0(bba1Var);
                            obj10 = bba1Var;
                        }
                        cev0.n(sda1Var, (iu30) obj10, (qim0) null, apo.r(-1038265344, new ssk(pda1Var, xtb0Var, iea1Var2, cba1Var2, e1m0Var2, u85Var2, watVar, vba1Var, qba1Var4, xtb0VarA, zba1VarC, qba1Var2), x340Var2), x340Var2, 3120);
                        bwp0.c(0, strI, x340Var2, (qim0) null);
                        x340Var2.r(true);
                    }
                    zda1Var = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                    yda1Var = yda1.a;
                    if (zda1Var == null) {
                        zda1Var = yda1Var;
                    }
                    boolean zG10 = x340Var2.g((xca1) ven0VarK2.getValue()) | x340Var2.e(l1d.C(i3)) | x340Var2.g(zda1Var);
                    if (str5 != null) {
                        eda1Var = new eda1(str5);
                    } else {
                        eda1Var = null;
                    }
                    zG = zG10 | x340Var2.g(eda1Var);
                    objT = x340Var2.T();
                    if (zG) {
                        xca1Var = (xca1) ven0VarK2.getValue();
                        iC = l1d.C(i3);
                        w7xVar = w7x.a;
                        if (iC != 0) {
                            yda1Var2 = yda1Var;
                            if (iC != 1) {
                                if (iC != 2) {
                                    eg.o();
                                } else if (xca1Var instanceof uca1) {
                                    if (str5 == null) {
                                        zEquals = false;
                                    } else {
                                        zEquals = str5.equals("artists");
                                    }
                                    if (!zEquals) {
                                        hashSetJ1 = o7h.j1(((uca1) xca1Var).f);
                                        objT = hashSetJ1;
                                    }
                                    x340Var2.s0(objT);
                                    set = (Set) objT;
                                    if (i3 == 3) {
                                        le81Var = new le81(pda1Var.e());
                                    } else {
                                        le81Var = null;
                                    }
                                    objT2 = x340Var2.T();
                                    obj6 = objT2;
                                    if (objT2 == m4cVar) {
                                        hrr0 hrr0VarQ3 = v8r.q(pda1Var.d());
                                        x340Var2.s0(hrr0VarQ3);
                                        obj6 = hrr0VarQ3;
                                    }
                                    ven0Var = (ven0) obj6;
                                    objT3 = x340Var2.T();
                                    obj7 = objT3;
                                    if (objT3 == m4cVar) {
                                        hrr0 hrr0VarQ4 = v8r.q(le81Var);
                                        x340Var2.s0(hrr0VarQ4);
                                        obj7 = hrr0VarQ4;
                                    }
                                    ven0Var2 = (ven0) obj7;
                                    Object[] objArr2 = {str, set, pda1Var.d(), le81Var};
                                    zG2 = x340Var2.g(le81Var) | x340Var2.i(ven0Var2) | x340Var2.i(pda1Var) | x340Var2.i(ven0Var) | x340Var2.g(str) | x340Var2.g(set) | x340Var2.i(kkw0Var2);
                                    str2 = str;
                                    Object objT110 = x340Var2.T();
                                    if (zG2) {
                                        pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                        x340Var2.s0(pwm0Var);
                                    } else {
                                        pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                        x340Var2.s0(pwm0Var);
                                    }
                                    qxd0.u(objArr2, (vu30) pwm0Var, x340Var2);
                                    Boolean boolValueOf2 = Boolean.valueOf(z5);
                                    zH = x340Var2.h(z6) | x340Var2.h(z5) | x340Var2.i(xtb0VarA2);
                                    Object objT22 = x340Var2.T();
                                    obj8 = objT22;
                                    if (zH) {
                                        jda1 jda1Var2 = new jda1(z6, z5, xtb0VarA2, null);
                                        x340Var2.s0(jda1Var2);
                                        obj8 = jda1Var2;
                                    } else {
                                        jda1 jda1Var3 = new jda1(z6, z5, xtb0VarA2, null);
                                        x340Var2.s0(jda1Var3);
                                        obj8 = jda1Var3;
                                    }
                                    qxd0.t(boolValueOf2, x340Var2, (vu30) obj8);
                                    if (i3 != 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zI = x340Var2.i(pda1Var);
                                    Object objT23 = x340Var2.T();
                                    obj9 = objT23;
                                    if (zI) {
                                        gda1 gda1Var3 = new gda1(pda1Var, (byte) 2);
                                        x340Var2.s0(gda1Var3);
                                        obj9 = gda1Var3;
                                    } else {
                                        gda1 gda1Var4 = new gda1(pda1Var, (byte) 2);
                                        x340Var2.s0(gda1Var4);
                                        obj9 = gda1Var4;
                                    }
                                    q3p1.b(0, 0, (Function0) obj9, x340Var2, z);
                                    WeakHashMap weakHashMap2 = osl1.x;
                                    u85Var = lhc.g(x340Var2).c;
                                    watVar = (wat) x340Var2.k(t4k.h);
                                    strI = xcg1.i(cwl1.o0(x340Var2, 2131962749), ". ", cwl1.o0(x340Var2, 2131962748));
                                    iC2 = l1d.C(i3);
                                    if (iC2 == 0) {
                                        i = 2;
                                        x340Var2.i0(-668393222);
                                        x340Var2.r(false);
                                        strI = "";
                                    } else if (iC2 != 1) {
                                        i = 2;
                                        if (iC2 != 2) {
                                            throw p3d1.k(x340Var2, 1779552611, false);
                                        }
                                        x340Var2.i0(1779559917);
                                        xca1Var2 = (xca1) ven0VarK2.getValue();
                                        x340Var2.i0(1378548153);
                                        if (xca1Var2 instanceof uca1) {
                                            uca1Var = (uca1) xca1Var2;
                                            String str9 = uca1Var.a;
                                            if (str5 == null) {
                                                size = uca1Var.b.size();
                                            } else if (str5.equals("artists")) {
                                                size = uca1Var.e.size();
                                            } else {
                                                size = uca1Var.f.size();
                                            }
                                            uaa1Var = new uaa1(str9, size);
                                        } else {
                                            if (xca1Var2.equals(wca1.a)) {
                                            }
                                            uaa1Var = null;
                                        }
                                        if (uaa1Var == null) {
                                            x340Var2.r(false);
                                            z2 = false;
                                        } else {
                                            str3 = uaa1Var.a;
                                            i2 = uaa1Var.b;
                                            if (str5 == null) {
                                                x340Var2.i0(-149039560);
                                                strU = cwl1.U(2131820922, i2, new Object[]{str3, Integer.valueOf(i2)}, x340Var2);
                                                x340Var2.r(false);
                                                x340Var2.r(false);
                                                z2 = false;
                                            } else {
                                                x340Var2.i0(-148869463);
                                                x340Var2.r(false);
                                                it = sba1.b.a.iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                    } else {
                                                        next = null;
                                                    }
                                                    kba1Var = (kba1) next;
                                                    if (kba1Var != null) {
                                                        strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                                        z2 = false;
                                                        x340Var2.r(false);
                                                    } else {
                                                        z2 = false;
                                                        x340Var2.r(false);
                                                    }
                                                } while (!((kba1) next).a.equals(str5));
                                                kba1Var = (kba1) next;
                                                if (kba1Var != null) {
                                                    strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                                    z2 = false;
                                                    x340Var2.r(false);
                                                } else {
                                                    z2 = false;
                                                    x340Var2.r(false);
                                                }
                                            }
                                            if (strU == null) {
                                                strI = "";
                                            } else {
                                                strI = strU;
                                            }
                                            x340Var2.r(z2);
                                        }
                                        strU = null;
                                        if (strU == null) {
                                            strI = "";
                                        } else {
                                            strI = strU;
                                        }
                                        x340Var2.r(z2);
                                    } else {
                                        i = 2;
                                        x340Var2.i0(1779555736);
                                        x340Var2.r(false);
                                    }
                                    zG3 = x340Var2.g(pda1Var.d());
                                    objT4 = x340Var2.T();
                                    if (zG3) {
                                        brl0Var = pda1Var.m;
                                        strD = pda1Var.d();
                                        if (strD.equals("recently_played")) {
                                            i = 4;
                                        } else if (strD.equals("followed_artists")) {
                                            i = 1;
                                        } else if (!strD.equals("liked_songs")) {
                                            if (strD.equals("most_played")) {
                                                i = 3;
                                            } else {
                                                i = 0;
                                            }
                                        }
                                        if (i != 0) {
                                            e1m0Var = new e1m0(brl0Var, i);
                                        } else {
                                            e1m0Var = null;
                                        }
                                        x340Var2.s0(e1m0Var);
                                        objT4 = e1m0Var;
                                    } else {
                                        brl0Var = pda1Var.m;
                                        strD = pda1Var.d();
                                        if (strD.equals("recently_played")) {
                                            i = 4;
                                        } else if (strD.equals("followed_artists")) {
                                            i = 1;
                                        } else if (!strD.equals("liked_songs")) {
                                            if (strD.equals("most_played")) {
                                                i = 3;
                                            } else {
                                                i = 0;
                                            }
                                        }
                                        if (i != 0) {
                                            e1m0Var = new e1m0(brl0Var, i);
                                        } else {
                                            e1m0Var = null;
                                        }
                                        x340Var2.s0(e1m0Var);
                                        objT4 = e1m0Var;
                                    }
                                    e1m0Var2 = (e1m0) objT4;
                                    zG4 = x340Var2.g((Map) ven0VarK.getValue()) | x340Var2.g(str4) | x340Var2.g(e1m0Var2);
                                    objT5 = x340Var2.T();
                                    if (zG4) {
                                        zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                        if (zda1Var2 == null) {
                                            zda1Var2 = yda1Var2;
                                        }
                                        if (e1m0Var2 != null) {
                                            r6h1VarB = e1m0Var2.b();
                                        } else {
                                            r6h1VarB = null;
                                        }
                                        if (zda1Var2.equals(xda1.a)) {
                                            aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                        } else if (zda1Var2.equals(yda1Var2)) {
                                            aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                        } else {
                                            if (zda1Var2.equals(uda1.a)) {
                                                aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                            } else {
                                                xtb0Var = xtb0VarA2;
                                                if (zda1Var2 instanceof vda1) {
                                                    list2 = ((vda1) zda1Var2).a;
                                                    if (list2.isEmpty()) {
                                                    }
                                                    u85Var2 = u85Var;
                                                    aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                                    objT5 = aca1Var;
                                                } else {
                                                    u85Var2 = u85Var;
                                                    if (!(zda1Var2 instanceof wda1)) {
                                                        eg.o();
                                                        return null;
                                                    }
                                                    list = ((wda1) zda1Var2).a;
                                                    if (list.isEmpty()) {
                                                    }
                                                    aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                                    objT5 = aca1Var;
                                                }
                                            }
                                            x340Var2.s0(objT5);
                                        }
                                        xtb0Var = xtb0VarA2;
                                        objT5 = aca1Var2;
                                        u85Var2 = u85Var;
                                        x340Var2.s0(objT5);
                                    } else {
                                        zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                        if (zda1Var2 == null) {
                                            zda1Var2 = yda1Var2;
                                        }
                                        if (e1m0Var2 != null) {
                                            r6h1VarB = e1m0Var2.b();
                                        } else {
                                            r6h1VarB = null;
                                        }
                                        if (zda1Var2.equals(xda1.a)) {
                                            aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                        } else if (zda1Var2.equals(yda1Var2)) {
                                            aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                        } else {
                                            if (zda1Var2.equals(uda1.a)) {
                                                aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                            } else {
                                                xtb0Var = xtb0VarA2;
                                                if (zda1Var2 instanceof vda1) {
                                                    list2 = ((vda1) zda1Var2).a;
                                                    if (list2.isEmpty()) {
                                                    }
                                                    u85Var2 = u85Var;
                                                    aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                                    objT5 = aca1Var;
                                                } else {
                                                    u85Var2 = u85Var;
                                                    if (!(zda1Var2 instanceof wda1)) {
                                                        eg.o();
                                                        return null;
                                                    }
                                                    list = ((wda1) zda1Var2).a;
                                                    if (list.isEmpty()) {
                                                    }
                                                    aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                                    objT5 = aca1Var;
                                                }
                                            }
                                            x340Var2.s0(objT5);
                                        }
                                        xtb0Var = xtb0VarA2;
                                        objT5 = aca1Var2;
                                        u85Var2 = u85Var;
                                        x340Var2.s0(objT5);
                                    }
                                    zba1VarC = u7n0.C(xtb0VarA, (dca1) objT5, pda1Var.f, iea1Var2, cba1Var2, new cca1("song_dna_search_tab_skeleton"), pda1Var.j, pda1Var.d(), x340Var2);
                                    sda1Var = new sda1(z6, (xca1) ven0VarK2.getValue(), str5);
                                    gfh0VarC = t1c.c(een.d, false);
                                    iHashCode = Long.hashCode(x340Var2.T);
                                    xos0VarM = x340Var2.m();
                                    qim0VarE = zr7.E(x340Var2, nim0.a);
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
                                    objT6 = x340Var2.T();
                                    obj10 = objT6;
                                    if (objT6 == m4cVar) {
                                        bba1 bba1Var2 = bba1.P0;
                                        x340Var2.s0(bba1Var2);
                                        obj10 = bba1Var2;
                                    }
                                    cev0.n(sda1Var, (iu30) obj10, (qim0) null, apo.r(-1038265344, new ssk(pda1Var, xtb0Var, iea1Var2, cba1Var2, e1m0Var2, u85Var2, watVar, vba1Var, qba1Var4, xtb0VarA, zba1VarC, qba1Var2), x340Var2), x340Var2, 3120);
                                    bwp0.c(0, strI, x340Var2, (qim0) null);
                                    x340Var2.r(true);
                                }
                            }
                            objT = w7xVar;
                            x340Var2.s0(objT);
                            set = (Set) objT;
                            if (i3 == 3) {
                                le81Var = new le81(pda1Var.e());
                            } else {
                                le81Var = null;
                            }
                            objT2 = x340Var2.T();
                            obj6 = objT2;
                            if (objT2 == m4cVar) {
                                hrr0 hrr0VarQ5 = v8r.q(pda1Var.d());
                                x340Var2.s0(hrr0VarQ5);
                                obj6 = hrr0VarQ5;
                            }
                            ven0Var = (ven0) obj6;
                            objT3 = x340Var2.T();
                            obj7 = objT3;
                            if (objT3 == m4cVar) {
                                hrr0 hrr0VarQ6 = v8r.q(le81Var);
                                x340Var2.s0(hrr0VarQ6);
                                obj7 = hrr0VarQ6;
                            }
                            ven0Var2 = (ven0) obj7;
                            Object[] objArr3 = {str, set, pda1Var.d(), le81Var};
                            zG2 = x340Var2.g(le81Var) | x340Var2.i(ven0Var2) | x340Var2.i(pda1Var) | x340Var2.i(ven0Var) | x340Var2.g(str) | x340Var2.g(set) | x340Var2.i(kkw0Var2);
                            str2 = str;
                            Object objT111 = x340Var2.T();
                            if (zG2) {
                                pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                x340Var2.s0(pwm0Var);
                            } else {
                                pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                x340Var2.s0(pwm0Var);
                            }
                            qxd0.u(objArr3, (vu30) pwm0Var, x340Var2);
                            Boolean boolValueOf3 = Boolean.valueOf(z5);
                            zH = x340Var2.h(z6) | x340Var2.h(z5) | x340Var2.i(xtb0VarA2);
                            Object objT24 = x340Var2.T();
                            obj8 = objT24;
                            if (zH) {
                                jda1 jda1Var4 = new jda1(z6, z5, xtb0VarA2, null);
                                x340Var2.s0(jda1Var4);
                                obj8 = jda1Var4;
                            } else {
                                jda1 jda1Var5 = new jda1(z6, z5, xtb0VarA2, null);
                                x340Var2.s0(jda1Var5);
                                obj8 = jda1Var5;
                            }
                            qxd0.t(boolValueOf3, x340Var2, (vu30) obj8);
                            if (i3 != 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zI = x340Var2.i(pda1Var);
                            Object objT25 = x340Var2.T();
                            obj9 = objT25;
                            if (zI) {
                                gda1 gda1Var5 = new gda1(pda1Var, (byte) 2);
                                x340Var2.s0(gda1Var5);
                                obj9 = gda1Var5;
                            } else {
                                gda1 gda1Var6 = new gda1(pda1Var, (byte) 2);
                                x340Var2.s0(gda1Var6);
                                obj9 = gda1Var6;
                            }
                            q3p1.b(0, 0, (Function0) obj9, x340Var2, z);
                            WeakHashMap weakHashMap3 = osl1.x;
                            u85Var = lhc.g(x340Var2).c;
                            watVar = (wat) x340Var2.k(t4k.h);
                            strI = xcg1.i(cwl1.o0(x340Var2, 2131962749), ". ", cwl1.o0(x340Var2, 2131962748));
                            iC2 = l1d.C(i3);
                            if (iC2 == 0) {
                                i = 2;
                                x340Var2.i0(-668393222);
                                x340Var2.r(false);
                                strI = "";
                            } else if (iC2 != 1) {
                                i = 2;
                                if (iC2 != 2) {
                                    throw p3d1.k(x340Var2, 1779552611, false);
                                }
                                x340Var2.i0(1779559917);
                                xca1Var2 = (xca1) ven0VarK2.getValue();
                                x340Var2.i0(1378548153);
                                if (xca1Var2 instanceof uca1) {
                                    uca1Var = (uca1) xca1Var2;
                                    String str10 = uca1Var.a;
                                    if (str5 == null) {
                                        size = uca1Var.b.size();
                                    } else if (str5.equals("artists")) {
                                        size = uca1Var.e.size();
                                    } else {
                                        size = uca1Var.f.size();
                                    }
                                    uaa1Var = new uaa1(str10, size);
                                } else {
                                    if (xca1Var2.equals(wca1.a)) {
                                    }
                                    uaa1Var = null;
                                }
                                if (uaa1Var == null) {
                                    x340Var2.r(false);
                                    z2 = false;
                                } else {
                                    str3 = uaa1Var.a;
                                    i2 = uaa1Var.b;
                                    if (str5 == null) {
                                        x340Var2.i0(-149039560);
                                        strU = cwl1.U(2131820922, i2, new Object[]{str3, Integer.valueOf(i2)}, x340Var2);
                                        x340Var2.r(false);
                                        x340Var2.r(false);
                                        z2 = false;
                                    } else {
                                        x340Var2.i0(-148869463);
                                        x340Var2.r(false);
                                        it = sba1.b.a.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            kba1Var = (kba1) next;
                                            if (kba1Var != null) {
                                                strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                                z2 = false;
                                                x340Var2.r(false);
                                            } else {
                                                z2 = false;
                                                x340Var2.r(false);
                                            }
                                        } while (!((kba1) next).a.equals(str5));
                                        kba1Var = (kba1) next;
                                        if (kba1Var != null) {
                                            strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                            z2 = false;
                                            x340Var2.r(false);
                                        } else {
                                            z2 = false;
                                            x340Var2.r(false);
                                        }
                                    }
                                    if (strU == null) {
                                        strI = "";
                                    } else {
                                        strI = strU;
                                    }
                                    x340Var2.r(z2);
                                }
                                strU = null;
                                if (strU == null) {
                                    strI = "";
                                } else {
                                    strI = strU;
                                }
                                x340Var2.r(z2);
                            } else {
                                i = 2;
                                x340Var2.i0(1779555736);
                                x340Var2.r(false);
                            }
                            zG3 = x340Var2.g(pda1Var.d());
                            objT4 = x340Var2.T();
                            if (zG3) {
                                brl0Var = pda1Var.m;
                                strD = pda1Var.d();
                                if (strD.equals("recently_played")) {
                                    i = 4;
                                } else if (strD.equals("followed_artists")) {
                                    i = 1;
                                } else if (!strD.equals("liked_songs")) {
                                    if (strD.equals("most_played")) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    e1m0Var = new e1m0(brl0Var, i);
                                } else {
                                    e1m0Var = null;
                                }
                                x340Var2.s0(e1m0Var);
                                objT4 = e1m0Var;
                            } else {
                                brl0Var = pda1Var.m;
                                strD = pda1Var.d();
                                if (strD.equals("recently_played")) {
                                    i = 4;
                                } else if (strD.equals("followed_artists")) {
                                    i = 1;
                                } else if (!strD.equals("liked_songs")) {
                                    if (strD.equals("most_played")) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    e1m0Var = new e1m0(brl0Var, i);
                                } else {
                                    e1m0Var = null;
                                }
                                x340Var2.s0(e1m0Var);
                                objT4 = e1m0Var;
                            }
                            e1m0Var2 = (e1m0) objT4;
                            zG4 = x340Var2.g((Map) ven0VarK.getValue()) | x340Var2.g(str4) | x340Var2.g(e1m0Var2);
                            objT5 = x340Var2.T();
                            if (zG4) {
                                zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                if (zda1Var2 == null) {
                                    zda1Var2 = yda1Var2;
                                }
                                if (e1m0Var2 != null) {
                                    r6h1VarB = e1m0Var2.b();
                                } else {
                                    r6h1VarB = null;
                                }
                                if (zda1Var2.equals(xda1.a)) {
                                    aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                } else if (zda1Var2.equals(yda1Var2)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                } else {
                                    if (zda1Var2.equals(uda1.a)) {
                                        aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                    } else {
                                        xtb0Var = xtb0VarA2;
                                        if (zda1Var2 instanceof vda1) {
                                            list2 = ((vda1) zda1Var2).a;
                                            if (list2.isEmpty()) {
                                            }
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            u85Var2 = u85Var;
                                            if (!(zda1Var2 instanceof wda1)) {
                                                eg.o();
                                                return null;
                                            }
                                            list = ((wda1) zda1Var2).a;
                                            if (list.isEmpty()) {
                                            }
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        }
                                    }
                                    x340Var2.s0(objT5);
                                }
                                xtb0Var = xtb0VarA2;
                                objT5 = aca1Var2;
                                u85Var2 = u85Var;
                                x340Var2.s0(objT5);
                            } else {
                                zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                if (zda1Var2 == null) {
                                    zda1Var2 = yda1Var2;
                                }
                                if (e1m0Var2 != null) {
                                    r6h1VarB = e1m0Var2.b();
                                } else {
                                    r6h1VarB = null;
                                }
                                if (zda1Var2.equals(xda1.a)) {
                                    aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                } else if (zda1Var2.equals(yda1Var2)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                } else {
                                    if (zda1Var2.equals(uda1.a)) {
                                        aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                    } else {
                                        xtb0Var = xtb0VarA2;
                                        if (zda1Var2 instanceof vda1) {
                                            list2 = ((vda1) zda1Var2).a;
                                            if (list2.isEmpty()) {
                                            }
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            u85Var2 = u85Var;
                                            if (!(zda1Var2 instanceof wda1)) {
                                                eg.o();
                                                return null;
                                            }
                                            list = ((wda1) zda1Var2).a;
                                            if (list.isEmpty()) {
                                            }
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        }
                                    }
                                    x340Var2.s0(objT5);
                                }
                                xtb0Var = xtb0VarA2;
                                objT5 = aca1Var2;
                                u85Var2 = u85Var;
                                x340Var2.s0(objT5);
                            }
                            zba1VarC = u7n0.C(xtb0VarA, (dca1) objT5, pda1Var.f, iea1Var2, cba1Var2, new cca1("song_dna_search_tab_skeleton"), pda1Var.j, pda1Var.d(), x340Var2);
                            sda1Var = new sda1(z6, (xca1) ven0VarK2.getValue(), str5);
                            gfh0VarC = t1c.c(een.d, false);
                            iHashCode = Long.hashCode(x340Var2.T);
                            xos0VarM = x340Var2.m();
                            qim0VarE = zr7.E(x340Var2, nim0.a);
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
                            objT6 = x340Var2.T();
                            obj10 = objT6;
                            if (objT6 == m4cVar) {
                                bba1 bba1Var3 = bba1.P0;
                                x340Var2.s0(bba1Var3);
                                obj10 = bba1Var3;
                            }
                            cev0.n(sda1Var, (iu30) obj10, (qim0) null, apo.r(-1038265344, new ssk(pda1Var, xtb0Var, iea1Var2, cba1Var2, e1m0Var2, u85Var2, watVar, vba1Var, qba1Var4, xtb0VarA, zba1VarC, qba1Var2), x340Var2), x340Var2, 3120);
                            bwp0.c(0, strI, x340Var2, (qim0) null);
                            x340Var2.r(true);
                        } else {
                            yda1Var2 = yda1Var;
                            if (zda1Var instanceof vda1) {
                                vda1Var = (vda1) zda1Var;
                            } else {
                                vda1Var = null;
                            }
                            if (vda1Var != null) {
                                hashSetJ1 = o7h.j1(vda1Var.a);
                            } else {
                                hashSetJ1 = null;
                            }
                            if (hashSetJ1 == null) {
                                objT = w7xVar;
                            } else {
                                objT = hashSetJ1;
                            }
                            x340Var2.s0(objT);
                            set = (Set) objT;
                            if (i3 == 3) {
                                le81Var = new le81(pda1Var.e());
                            } else {
                                le81Var = null;
                            }
                            objT2 = x340Var2.T();
                            obj6 = objT2;
                            if (objT2 == m4cVar) {
                                hrr0 hrr0VarQ7 = v8r.q(pda1Var.d());
                                x340Var2.s0(hrr0VarQ7);
                                obj6 = hrr0VarQ7;
                            }
                            ven0Var = (ven0) obj6;
                            objT3 = x340Var2.T();
                            obj7 = objT3;
                            if (objT3 == m4cVar) {
                                hrr0 hrr0VarQ8 = v8r.q(le81Var);
                                x340Var2.s0(hrr0VarQ8);
                                obj7 = hrr0VarQ8;
                            }
                            ven0Var2 = (ven0) obj7;
                            Object[] objArr4 = {str, set, pda1Var.d(), le81Var};
                            zG2 = x340Var2.g(le81Var) | x340Var2.i(ven0Var2) | x340Var2.i(pda1Var) | x340Var2.i(ven0Var) | x340Var2.g(str) | x340Var2.g(set) | x340Var2.i(kkw0Var2);
                            str2 = str;
                            Object objT112 = x340Var2.T();
                            if (zG2) {
                                pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                x340Var2.s0(pwm0Var);
                            } else {
                                pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                x340Var2.s0(pwm0Var);
                            }
                            qxd0.u(objArr4, (vu30) pwm0Var, x340Var2);
                            Boolean boolValueOf4 = Boolean.valueOf(z5);
                            zH = x340Var2.h(z6) | x340Var2.h(z5) | x340Var2.i(xtb0VarA2);
                            Object objT26 = x340Var2.T();
                            obj8 = objT26;
                            if (zH) {
                                jda1 jda1Var6 = new jda1(z6, z5, xtb0VarA2, null);
                                x340Var2.s0(jda1Var6);
                                obj8 = jda1Var6;
                            } else {
                                jda1 jda1Var7 = new jda1(z6, z5, xtb0VarA2, null);
                                x340Var2.s0(jda1Var7);
                                obj8 = jda1Var7;
                            }
                            qxd0.t(boolValueOf4, x340Var2, (vu30) obj8);
                            if (i3 != 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zI = x340Var2.i(pda1Var);
                            Object objT27 = x340Var2.T();
                            obj9 = objT27;
                            if (zI) {
                                gda1 gda1Var7 = new gda1(pda1Var, (byte) 2);
                                x340Var2.s0(gda1Var7);
                                obj9 = gda1Var7;
                            } else {
                                gda1 gda1Var8 = new gda1(pda1Var, (byte) 2);
                                x340Var2.s0(gda1Var8);
                                obj9 = gda1Var8;
                            }
                            q3p1.b(0, 0, (Function0) obj9, x340Var2, z);
                            WeakHashMap weakHashMap4 = osl1.x;
                            u85Var = lhc.g(x340Var2).c;
                            watVar = (wat) x340Var2.k(t4k.h);
                            strI = xcg1.i(cwl1.o0(x340Var2, 2131962749), ". ", cwl1.o0(x340Var2, 2131962748));
                            iC2 = l1d.C(i3);
                            if (iC2 == 0) {
                                i = 2;
                                x340Var2.i0(-668393222);
                                x340Var2.r(false);
                                strI = "";
                            } else if (iC2 != 1) {
                                i = 2;
                                if (iC2 != 2) {
                                    throw p3d1.k(x340Var2, 1779552611, false);
                                }
                                x340Var2.i0(1779559917);
                                xca1Var2 = (xca1) ven0VarK2.getValue();
                                x340Var2.i0(1378548153);
                                if (xca1Var2 instanceof uca1) {
                                    uca1Var = (uca1) xca1Var2;
                                    String str11 = uca1Var.a;
                                    if (str5 == null) {
                                        size = uca1Var.b.size();
                                    } else if (str5.equals("artists")) {
                                        size = uca1Var.e.size();
                                    } else {
                                        size = uca1Var.f.size();
                                    }
                                    uaa1Var = new uaa1(str11, size);
                                } else {
                                    if (xca1Var2.equals(wca1.a)) {
                                    }
                                    uaa1Var = null;
                                }
                                if (uaa1Var == null) {
                                    x340Var2.r(false);
                                    z2 = false;
                                } else {
                                    str3 = uaa1Var.a;
                                    i2 = uaa1Var.b;
                                    if (str5 == null) {
                                        x340Var2.i0(-149039560);
                                        strU = cwl1.U(2131820922, i2, new Object[]{str3, Integer.valueOf(i2)}, x340Var2);
                                        x340Var2.r(false);
                                        x340Var2.r(false);
                                        z2 = false;
                                    } else {
                                        x340Var2.i0(-148869463);
                                        x340Var2.r(false);
                                        it = sba1.b.a.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            kba1Var = (kba1) next;
                                            if (kba1Var != null) {
                                                strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                                z2 = false;
                                                x340Var2.r(false);
                                            } else {
                                                z2 = false;
                                                x340Var2.r(false);
                                            }
                                        } while (!((kba1) next).a.equals(str5));
                                        kba1Var = (kba1) next;
                                        if (kba1Var != null) {
                                            strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                            z2 = false;
                                            x340Var2.r(false);
                                        } else {
                                            z2 = false;
                                            x340Var2.r(false);
                                        }
                                    }
                                    if (strU == null) {
                                        strI = "";
                                    } else {
                                        strI = strU;
                                    }
                                    x340Var2.r(z2);
                                }
                                strU = null;
                                if (strU == null) {
                                    strI = "";
                                } else {
                                    strI = strU;
                                }
                                x340Var2.r(z2);
                            } else {
                                i = 2;
                                x340Var2.i0(1779555736);
                                x340Var2.r(false);
                            }
                            zG3 = x340Var2.g(pda1Var.d());
                            objT4 = x340Var2.T();
                            if (zG3) {
                                brl0Var = pda1Var.m;
                                strD = pda1Var.d();
                                if (strD.equals("recently_played")) {
                                    i = 4;
                                } else if (strD.equals("followed_artists")) {
                                    i = 1;
                                } else if (!strD.equals("liked_songs")) {
                                    if (strD.equals("most_played")) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    e1m0Var = new e1m0(brl0Var, i);
                                } else {
                                    e1m0Var = null;
                                }
                                x340Var2.s0(e1m0Var);
                                objT4 = e1m0Var;
                            } else {
                                brl0Var = pda1Var.m;
                                strD = pda1Var.d();
                                if (strD.equals("recently_played")) {
                                    i = 4;
                                } else if (strD.equals("followed_artists")) {
                                    i = 1;
                                } else if (!strD.equals("liked_songs")) {
                                    if (strD.equals("most_played")) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    e1m0Var = new e1m0(brl0Var, i);
                                } else {
                                    e1m0Var = null;
                                }
                                x340Var2.s0(e1m0Var);
                                objT4 = e1m0Var;
                            }
                            e1m0Var2 = (e1m0) objT4;
                            zG4 = x340Var2.g((Map) ven0VarK.getValue()) | x340Var2.g(str4) | x340Var2.g(e1m0Var2);
                            objT5 = x340Var2.T();
                            if (zG4) {
                                zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                if (zda1Var2 == null) {
                                    zda1Var2 = yda1Var2;
                                }
                                if (e1m0Var2 != null) {
                                    r6h1VarB = e1m0Var2.b();
                                } else {
                                    r6h1VarB = null;
                                }
                                if (zda1Var2.equals(xda1.a)) {
                                    aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                } else if (zda1Var2.equals(yda1Var2)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                } else {
                                    if (zda1Var2.equals(uda1.a)) {
                                        aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                    } else {
                                        xtb0Var = xtb0VarA2;
                                        if (zda1Var2 instanceof vda1) {
                                            list2 = ((vda1) zda1Var2).a;
                                            if (list2.isEmpty()) {
                                            }
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            u85Var2 = u85Var;
                                            if (!(zda1Var2 instanceof wda1)) {
                                                eg.o();
                                                return null;
                                            }
                                            list = ((wda1) zda1Var2).a;
                                            if (list.isEmpty()) {
                                            }
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        }
                                    }
                                    x340Var2.s0(objT5);
                                }
                                xtb0Var = xtb0VarA2;
                                objT5 = aca1Var2;
                                u85Var2 = u85Var;
                                x340Var2.s0(objT5);
                            } else {
                                zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                if (zda1Var2 == null) {
                                    zda1Var2 = yda1Var2;
                                }
                                if (e1m0Var2 != null) {
                                    r6h1VarB = e1m0Var2.b();
                                } else {
                                    r6h1VarB = null;
                                }
                                if (zda1Var2.equals(xda1.a)) {
                                    aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                } else if (zda1Var2.equals(yda1Var2)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                } else {
                                    if (zda1Var2.equals(uda1.a)) {
                                        aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                    } else {
                                        xtb0Var = xtb0VarA2;
                                        if (zda1Var2 instanceof vda1) {
                                            list2 = ((vda1) zda1Var2).a;
                                            if (list2.isEmpty()) {
                                            }
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            u85Var2 = u85Var;
                                            if (!(zda1Var2 instanceof wda1)) {
                                                eg.o();
                                                return null;
                                            }
                                            list = ((wda1) zda1Var2).a;
                                            if (list.isEmpty()) {
                                            }
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        }
                                    }
                                    x340Var2.s0(objT5);
                                }
                                xtb0Var = xtb0VarA2;
                                objT5 = aca1Var2;
                                u85Var2 = u85Var;
                                x340Var2.s0(objT5);
                            }
                            zba1VarC = u7n0.C(xtb0VarA, (dca1) objT5, pda1Var.f, iea1Var2, cba1Var2, new cca1("song_dna_search_tab_skeleton"), pda1Var.j, pda1Var.d(), x340Var2);
                            sda1Var = new sda1(z6, (xca1) ven0VarK2.getValue(), str5);
                            gfh0VarC = t1c.c(een.d, false);
                            iHashCode = Long.hashCode(x340Var2.T);
                            xos0VarM = x340Var2.m();
                            qim0VarE = zr7.E(x340Var2, nim0.a);
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
                            objT6 = x340Var2.T();
                            obj10 = objT6;
                            if (objT6 == m4cVar) {
                                bba1 bba1Var4 = bba1.P0;
                                x340Var2.s0(bba1Var4);
                                obj10 = bba1Var4;
                            }
                            cev0.n(sda1Var, (iu30) obj10, (qim0) null, apo.r(-1038265344, new ssk(pda1Var, xtb0Var, iea1Var2, cba1Var2, e1m0Var2, u85Var2, watVar, vba1Var, qba1Var4, xtb0VarA, zba1VarC, qba1Var2), x340Var2), x340Var2, 3120);
                            bwp0.c(0, strI, x340Var2, (qim0) null);
                            x340Var2.r(true);
                        }
                    } else {
                        xca1Var = (xca1) ven0VarK2.getValue();
                        iC = l1d.C(i3);
                        w7xVar = w7x.a;
                        if (iC != 0) {
                            yda1Var2 = yda1Var;
                            if (iC != 1) {
                                if (iC != 2) {
                                    eg.o();
                                } else if (xca1Var instanceof uca1) {
                                    if (str5 == null) {
                                        zEquals = false;
                                    } else {
                                        zEquals = str5.equals("artists");
                                    }
                                    if (!zEquals) {
                                        hashSetJ1 = o7h.j1(((uca1) xca1Var).f);
                                        objT = hashSetJ1;
                                    }
                                    x340Var2.s0(objT);
                                    set = (Set) objT;
                                    if (i3 == 3) {
                                        le81Var = new le81(pda1Var.e());
                                    } else {
                                        le81Var = null;
                                    }
                                    objT2 = x340Var2.T();
                                    obj6 = objT2;
                                    if (objT2 == m4cVar) {
                                        hrr0 hrr0VarQ9 = v8r.q(pda1Var.d());
                                        x340Var2.s0(hrr0VarQ9);
                                        obj6 = hrr0VarQ9;
                                    }
                                    ven0Var = (ven0) obj6;
                                    objT3 = x340Var2.T();
                                    obj7 = objT3;
                                    if (objT3 == m4cVar) {
                                        hrr0 hrr0VarQ10 = v8r.q(le81Var);
                                        x340Var2.s0(hrr0VarQ10);
                                        obj7 = hrr0VarQ10;
                                    }
                                    ven0Var2 = (ven0) obj7;
                                    Object[] objArr5 = {str, set, pda1Var.d(), le81Var};
                                    zG2 = x340Var2.g(le81Var) | x340Var2.i(ven0Var2) | x340Var2.i(pda1Var) | x340Var2.i(ven0Var) | x340Var2.g(str) | x340Var2.g(set) | x340Var2.i(kkw0Var2);
                                    str2 = str;
                                    Object objT113 = x340Var2.T();
                                    if (zG2) {
                                        pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                        x340Var2.s0(pwm0Var);
                                    } else {
                                        pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                        x340Var2.s0(pwm0Var);
                                    }
                                    qxd0.u(objArr5, (vu30) pwm0Var, x340Var2);
                                    Boolean boolValueOf5 = Boolean.valueOf(z5);
                                    zH = x340Var2.h(z6) | x340Var2.h(z5) | x340Var2.i(xtb0VarA2);
                                    Object objT28 = x340Var2.T();
                                    obj8 = objT28;
                                    if (zH) {
                                        jda1 jda1Var8 = new jda1(z6, z5, xtb0VarA2, null);
                                        x340Var2.s0(jda1Var8);
                                        obj8 = jda1Var8;
                                    } else {
                                        jda1 jda1Var9 = new jda1(z6, z5, xtb0VarA2, null);
                                        x340Var2.s0(jda1Var9);
                                        obj8 = jda1Var9;
                                    }
                                    qxd0.t(boolValueOf5, x340Var2, (vu30) obj8);
                                    if (i3 != 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zI = x340Var2.i(pda1Var);
                                    Object objT29 = x340Var2.T();
                                    obj9 = objT29;
                                    if (zI) {
                                        gda1 gda1Var9 = new gda1(pda1Var, (byte) 2);
                                        x340Var2.s0(gda1Var9);
                                        obj9 = gda1Var9;
                                    } else {
                                        gda1 gda1Var10 = new gda1(pda1Var, (byte) 2);
                                        x340Var2.s0(gda1Var10);
                                        obj9 = gda1Var10;
                                    }
                                    q3p1.b(0, 0, (Function0) obj9, x340Var2, z);
                                    WeakHashMap weakHashMap5 = osl1.x;
                                    u85Var = lhc.g(x340Var2).c;
                                    watVar = (wat) x340Var2.k(t4k.h);
                                    strI = xcg1.i(cwl1.o0(x340Var2, 2131962749), ". ", cwl1.o0(x340Var2, 2131962748));
                                    iC2 = l1d.C(i3);
                                    if (iC2 == 0) {
                                        i = 2;
                                        x340Var2.i0(-668393222);
                                        x340Var2.r(false);
                                        strI = "";
                                    } else if (iC2 != 1) {
                                        i = 2;
                                        if (iC2 != 2) {
                                            throw p3d1.k(x340Var2, 1779552611, false);
                                        }
                                        x340Var2.i0(1779559917);
                                        xca1Var2 = (xca1) ven0VarK2.getValue();
                                        x340Var2.i0(1378548153);
                                        if (xca1Var2 instanceof uca1) {
                                            uca1Var = (uca1) xca1Var2;
                                            String str12 = uca1Var.a;
                                            if (str5 == null) {
                                                size = uca1Var.b.size();
                                            } else if (str5.equals("artists")) {
                                                size = uca1Var.e.size();
                                            } else {
                                                size = uca1Var.f.size();
                                            }
                                            uaa1Var = new uaa1(str12, size);
                                        } else {
                                            if (xca1Var2.equals(wca1.a)) {
                                            }
                                            uaa1Var = null;
                                        }
                                        if (uaa1Var == null) {
                                            x340Var2.r(false);
                                            z2 = false;
                                        } else {
                                            str3 = uaa1Var.a;
                                            i2 = uaa1Var.b;
                                            if (str5 == null) {
                                                x340Var2.i0(-149039560);
                                                strU = cwl1.U(2131820922, i2, new Object[]{str3, Integer.valueOf(i2)}, x340Var2);
                                                x340Var2.r(false);
                                                x340Var2.r(false);
                                                z2 = false;
                                            } else {
                                                x340Var2.i0(-148869463);
                                                x340Var2.r(false);
                                                it = sba1.b.a.iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                    } else {
                                                        next = null;
                                                    }
                                                    kba1Var = (kba1) next;
                                                    if (kba1Var != null) {
                                                        strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                                        z2 = false;
                                                        x340Var2.r(false);
                                                    } else {
                                                        z2 = false;
                                                        x340Var2.r(false);
                                                    }
                                                } while (!((kba1) next).a.equals(str5));
                                                kba1Var = (kba1) next;
                                                if (kba1Var != null) {
                                                    strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                                    z2 = false;
                                                    x340Var2.r(false);
                                                } else {
                                                    z2 = false;
                                                    x340Var2.r(false);
                                                }
                                            }
                                            if (strU == null) {
                                                strI = "";
                                            } else {
                                                strI = strU;
                                            }
                                            x340Var2.r(z2);
                                        }
                                        strU = null;
                                        if (strU == null) {
                                            strI = "";
                                        } else {
                                            strI = strU;
                                        }
                                        x340Var2.r(z2);
                                    } else {
                                        i = 2;
                                        x340Var2.i0(1779555736);
                                        x340Var2.r(false);
                                    }
                                    zG3 = x340Var2.g(pda1Var.d());
                                    objT4 = x340Var2.T();
                                    if (zG3) {
                                        brl0Var = pda1Var.m;
                                        strD = pda1Var.d();
                                        if (strD.equals("recently_played")) {
                                            i = 4;
                                        } else if (strD.equals("followed_artists")) {
                                            i = 1;
                                        } else if (!strD.equals("liked_songs")) {
                                            if (strD.equals("most_played")) {
                                                i = 3;
                                            } else {
                                                i = 0;
                                            }
                                        }
                                        if (i != 0) {
                                            e1m0Var = new e1m0(brl0Var, i);
                                        } else {
                                            e1m0Var = null;
                                        }
                                        x340Var2.s0(e1m0Var);
                                        objT4 = e1m0Var;
                                    } else {
                                        brl0Var = pda1Var.m;
                                        strD = pda1Var.d();
                                        if (strD.equals("recently_played")) {
                                            i = 4;
                                        } else if (strD.equals("followed_artists")) {
                                            i = 1;
                                        } else if (!strD.equals("liked_songs")) {
                                            if (strD.equals("most_played")) {
                                                i = 3;
                                            } else {
                                                i = 0;
                                            }
                                        }
                                        if (i != 0) {
                                            e1m0Var = new e1m0(brl0Var, i);
                                        } else {
                                            e1m0Var = null;
                                        }
                                        x340Var2.s0(e1m0Var);
                                        objT4 = e1m0Var;
                                    }
                                    e1m0Var2 = (e1m0) objT4;
                                    zG4 = x340Var2.g((Map) ven0VarK.getValue()) | x340Var2.g(str4) | x340Var2.g(e1m0Var2);
                                    objT5 = x340Var2.T();
                                    if (zG4) {
                                        zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                        if (zda1Var2 == null) {
                                            zda1Var2 = yda1Var2;
                                        }
                                        if (e1m0Var2 != null) {
                                            r6h1VarB = e1m0Var2.b();
                                        } else {
                                            r6h1VarB = null;
                                        }
                                        if (zda1Var2.equals(xda1.a)) {
                                            aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                        } else if (zda1Var2.equals(yda1Var2)) {
                                            aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                        } else {
                                            if (zda1Var2.equals(uda1.a)) {
                                                aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                            } else {
                                                xtb0Var = xtb0VarA2;
                                                if (zda1Var2 instanceof vda1) {
                                                    list2 = ((vda1) zda1Var2).a;
                                                    if (list2.isEmpty()) {
                                                    }
                                                    u85Var2 = u85Var;
                                                    aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                                    objT5 = aca1Var;
                                                } else {
                                                    u85Var2 = u85Var;
                                                    if (!(zda1Var2 instanceof wda1)) {
                                                        eg.o();
                                                        return null;
                                                    }
                                                    list = ((wda1) zda1Var2).a;
                                                    if (list.isEmpty()) {
                                                    }
                                                    aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                                    objT5 = aca1Var;
                                                }
                                            }
                                            x340Var2.s0(objT5);
                                        }
                                        xtb0Var = xtb0VarA2;
                                        objT5 = aca1Var2;
                                        u85Var2 = u85Var;
                                        x340Var2.s0(objT5);
                                    } else {
                                        zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                        if (zda1Var2 == null) {
                                            zda1Var2 = yda1Var2;
                                        }
                                        if (e1m0Var2 != null) {
                                            r6h1VarB = e1m0Var2.b();
                                        } else {
                                            r6h1VarB = null;
                                        }
                                        if (zda1Var2.equals(xda1.a)) {
                                            aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                        } else if (zda1Var2.equals(yda1Var2)) {
                                            aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                        } else {
                                            if (zda1Var2.equals(uda1.a)) {
                                                aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                            } else {
                                                xtb0Var = xtb0VarA2;
                                                if (zda1Var2 instanceof vda1) {
                                                    list2 = ((vda1) zda1Var2).a;
                                                    if (list2.isEmpty()) {
                                                    }
                                                    u85Var2 = u85Var;
                                                    aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                                    objT5 = aca1Var;
                                                } else {
                                                    u85Var2 = u85Var;
                                                    if (!(zda1Var2 instanceof wda1)) {
                                                        eg.o();
                                                        return null;
                                                    }
                                                    list = ((wda1) zda1Var2).a;
                                                    if (list.isEmpty()) {
                                                    }
                                                    aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                                    objT5 = aca1Var;
                                                }
                                            }
                                            x340Var2.s0(objT5);
                                        }
                                        xtb0Var = xtb0VarA2;
                                        objT5 = aca1Var2;
                                        u85Var2 = u85Var;
                                        x340Var2.s0(objT5);
                                    }
                                    zba1VarC = u7n0.C(xtb0VarA, (dca1) objT5, pda1Var.f, iea1Var2, cba1Var2, new cca1("song_dna_search_tab_skeleton"), pda1Var.j, pda1Var.d(), x340Var2);
                                    sda1Var = new sda1(z6, (xca1) ven0VarK2.getValue(), str5);
                                    gfh0VarC = t1c.c(een.d, false);
                                    iHashCode = Long.hashCode(x340Var2.T);
                                    xos0VarM = x340Var2.m();
                                    qim0VarE = zr7.E(x340Var2, nim0.a);
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
                                    objT6 = x340Var2.T();
                                    obj10 = objT6;
                                    if (objT6 == m4cVar) {
                                        bba1 bba1Var5 = bba1.P0;
                                        x340Var2.s0(bba1Var5);
                                        obj10 = bba1Var5;
                                    }
                                    cev0.n(sda1Var, (iu30) obj10, (qim0) null, apo.r(-1038265344, new ssk(pda1Var, xtb0Var, iea1Var2, cba1Var2, e1m0Var2, u85Var2, watVar, vba1Var, qba1Var4, xtb0VarA, zba1VarC, qba1Var2), x340Var2), x340Var2, 3120);
                                    bwp0.c(0, strI, x340Var2, (qim0) null);
                                    x340Var2.r(true);
                                }
                            }
                            objT = w7xVar;
                            x340Var2.s0(objT);
                            set = (Set) objT;
                            if (i3 == 3) {
                                le81Var = new le81(pda1Var.e());
                            } else {
                                le81Var = null;
                            }
                            objT2 = x340Var2.T();
                            obj6 = objT2;
                            if (objT2 == m4cVar) {
                                hrr0 hrr0VarQ11 = v8r.q(pda1Var.d());
                                x340Var2.s0(hrr0VarQ11);
                                obj6 = hrr0VarQ11;
                            }
                            ven0Var = (ven0) obj6;
                            objT3 = x340Var2.T();
                            obj7 = objT3;
                            if (objT3 == m4cVar) {
                                hrr0 hrr0VarQ12 = v8r.q(le81Var);
                                x340Var2.s0(hrr0VarQ12);
                                obj7 = hrr0VarQ12;
                            }
                            ven0Var2 = (ven0) obj7;
                            Object[] objArr6 = {str, set, pda1Var.d(), le81Var};
                            zG2 = x340Var2.g(le81Var) | x340Var2.i(ven0Var2) | x340Var2.i(pda1Var) | x340Var2.i(ven0Var) | x340Var2.g(str) | x340Var2.g(set) | x340Var2.i(kkw0Var2);
                            str2 = str;
                            Object objT114 = x340Var2.T();
                            if (zG2) {
                                pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                x340Var2.s0(pwm0Var);
                            } else {
                                pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                x340Var2.s0(pwm0Var);
                            }
                            qxd0.u(objArr6, (vu30) pwm0Var, x340Var2);
                            Boolean boolValueOf6 = Boolean.valueOf(z5);
                            zH = x340Var2.h(z6) | x340Var2.h(z5) | x340Var2.i(xtb0VarA2);
                            Object objT210 = x340Var2.T();
                            obj8 = objT210;
                            if (zH) {
                                jda1 jda1Var10 = new jda1(z6, z5, xtb0VarA2, null);
                                x340Var2.s0(jda1Var10);
                                obj8 = jda1Var10;
                            } else {
                                jda1 jda1Var11 = new jda1(z6, z5, xtb0VarA2, null);
                                x340Var2.s0(jda1Var11);
                                obj8 = jda1Var11;
                            }
                            qxd0.t(boolValueOf6, x340Var2, (vu30) obj8);
                            if (i3 != 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zI = x340Var2.i(pda1Var);
                            Object objT211 = x340Var2.T();
                            obj9 = objT211;
                            if (zI) {
                                gda1 gda1Var11 = new gda1(pda1Var, (byte) 2);
                                x340Var2.s0(gda1Var11);
                                obj9 = gda1Var11;
                            } else {
                                gda1 gda1Var12 = new gda1(pda1Var, (byte) 2);
                                x340Var2.s0(gda1Var12);
                                obj9 = gda1Var12;
                            }
                            q3p1.b(0, 0, (Function0) obj9, x340Var2, z);
                            WeakHashMap weakHashMap6 = osl1.x;
                            u85Var = lhc.g(x340Var2).c;
                            watVar = (wat) x340Var2.k(t4k.h);
                            strI = xcg1.i(cwl1.o0(x340Var2, 2131962749), ". ", cwl1.o0(x340Var2, 2131962748));
                            iC2 = l1d.C(i3);
                            if (iC2 == 0) {
                                i = 2;
                                x340Var2.i0(-668393222);
                                x340Var2.r(false);
                                strI = "";
                            } else if (iC2 != 1) {
                                i = 2;
                                if (iC2 != 2) {
                                    throw p3d1.k(x340Var2, 1779552611, false);
                                }
                                x340Var2.i0(1779559917);
                                xca1Var2 = (xca1) ven0VarK2.getValue();
                                x340Var2.i0(1378548153);
                                if (xca1Var2 instanceof uca1) {
                                    uca1Var = (uca1) xca1Var2;
                                    String str13 = uca1Var.a;
                                    if (str5 == null) {
                                        size = uca1Var.b.size();
                                    } else if (str5.equals("artists")) {
                                        size = uca1Var.e.size();
                                    } else {
                                        size = uca1Var.f.size();
                                    }
                                    uaa1Var = new uaa1(str13, size);
                                } else {
                                    if (xca1Var2.equals(wca1.a)) {
                                    }
                                    uaa1Var = null;
                                }
                                if (uaa1Var == null) {
                                    x340Var2.r(false);
                                    z2 = false;
                                } else {
                                    str3 = uaa1Var.a;
                                    i2 = uaa1Var.b;
                                    if (str5 == null) {
                                        x340Var2.i0(-149039560);
                                        strU = cwl1.U(2131820922, i2, new Object[]{str3, Integer.valueOf(i2)}, x340Var2);
                                        x340Var2.r(false);
                                        x340Var2.r(false);
                                        z2 = false;
                                    } else {
                                        x340Var2.i0(-148869463);
                                        x340Var2.r(false);
                                        it = sba1.b.a.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            kba1Var = (kba1) next;
                                            if (kba1Var != null) {
                                                strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                                z2 = false;
                                                x340Var2.r(false);
                                            } else {
                                                z2 = false;
                                                x340Var2.r(false);
                                            }
                                        } while (!((kba1) next).a.equals(str5));
                                        kba1Var = (kba1) next;
                                        if (kba1Var != null) {
                                            strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                            z2 = false;
                                            x340Var2.r(false);
                                        } else {
                                            z2 = false;
                                            x340Var2.r(false);
                                        }
                                    }
                                    if (strU == null) {
                                        strI = "";
                                    } else {
                                        strI = strU;
                                    }
                                    x340Var2.r(z2);
                                }
                                strU = null;
                                if (strU == null) {
                                    strI = "";
                                } else {
                                    strI = strU;
                                }
                                x340Var2.r(z2);
                            } else {
                                i = 2;
                                x340Var2.i0(1779555736);
                                x340Var2.r(false);
                            }
                            zG3 = x340Var2.g(pda1Var.d());
                            objT4 = x340Var2.T();
                            if (zG3) {
                                brl0Var = pda1Var.m;
                                strD = pda1Var.d();
                                if (strD.equals("recently_played")) {
                                    i = 4;
                                } else if (strD.equals("followed_artists")) {
                                    i = 1;
                                } else if (!strD.equals("liked_songs")) {
                                    if (strD.equals("most_played")) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    e1m0Var = new e1m0(brl0Var, i);
                                } else {
                                    e1m0Var = null;
                                }
                                x340Var2.s0(e1m0Var);
                                objT4 = e1m0Var;
                            } else {
                                brl0Var = pda1Var.m;
                                strD = pda1Var.d();
                                if (strD.equals("recently_played")) {
                                    i = 4;
                                } else if (strD.equals("followed_artists")) {
                                    i = 1;
                                } else if (!strD.equals("liked_songs")) {
                                    if (strD.equals("most_played")) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    e1m0Var = new e1m0(brl0Var, i);
                                } else {
                                    e1m0Var = null;
                                }
                                x340Var2.s0(e1m0Var);
                                objT4 = e1m0Var;
                            }
                            e1m0Var2 = (e1m0) objT4;
                            zG4 = x340Var2.g((Map) ven0VarK.getValue()) | x340Var2.g(str4) | x340Var2.g(e1m0Var2);
                            objT5 = x340Var2.T();
                            if (zG4) {
                                zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                if (zda1Var2 == null) {
                                    zda1Var2 = yda1Var2;
                                }
                                if (e1m0Var2 != null) {
                                    r6h1VarB = e1m0Var2.b();
                                } else {
                                    r6h1VarB = null;
                                }
                                if (zda1Var2.equals(xda1.a)) {
                                    aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                } else if (zda1Var2.equals(yda1Var2)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                } else {
                                    if (zda1Var2.equals(uda1.a)) {
                                        aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                    } else {
                                        xtb0Var = xtb0VarA2;
                                        if (zda1Var2 instanceof vda1) {
                                            list2 = ((vda1) zda1Var2).a;
                                            if (list2.isEmpty()) {
                                            }
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            u85Var2 = u85Var;
                                            if (!(zda1Var2 instanceof wda1)) {
                                                eg.o();
                                                return null;
                                            }
                                            list = ((wda1) zda1Var2).a;
                                            if (list.isEmpty()) {
                                            }
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        }
                                    }
                                    x340Var2.s0(objT5);
                                }
                                xtb0Var = xtb0VarA2;
                                objT5 = aca1Var2;
                                u85Var2 = u85Var;
                                x340Var2.s0(objT5);
                            } else {
                                zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                if (zda1Var2 == null) {
                                    zda1Var2 = yda1Var2;
                                }
                                if (e1m0Var2 != null) {
                                    r6h1VarB = e1m0Var2.b();
                                } else {
                                    r6h1VarB = null;
                                }
                                if (zda1Var2.equals(xda1.a)) {
                                    aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                } else if (zda1Var2.equals(yda1Var2)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                } else {
                                    if (zda1Var2.equals(uda1.a)) {
                                        aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                    } else {
                                        xtb0Var = xtb0VarA2;
                                        if (zda1Var2 instanceof vda1) {
                                            list2 = ((vda1) zda1Var2).a;
                                            if (list2.isEmpty()) {
                                            }
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            u85Var2 = u85Var;
                                            if (!(zda1Var2 instanceof wda1)) {
                                                eg.o();
                                                return null;
                                            }
                                            list = ((wda1) zda1Var2).a;
                                            if (list.isEmpty()) {
                                            }
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        }
                                    }
                                    x340Var2.s0(objT5);
                                }
                                xtb0Var = xtb0VarA2;
                                objT5 = aca1Var2;
                                u85Var2 = u85Var;
                                x340Var2.s0(objT5);
                            }
                            zba1VarC = u7n0.C(xtb0VarA, (dca1) objT5, pda1Var.f, iea1Var2, cba1Var2, new cca1("song_dna_search_tab_skeleton"), pda1Var.j, pda1Var.d(), x340Var2);
                            sda1Var = new sda1(z6, (xca1) ven0VarK2.getValue(), str5);
                            gfh0VarC = t1c.c(een.d, false);
                            iHashCode = Long.hashCode(x340Var2.T);
                            xos0VarM = x340Var2.m();
                            qim0VarE = zr7.E(x340Var2, nim0.a);
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
                            objT6 = x340Var2.T();
                            obj10 = objT6;
                            if (objT6 == m4cVar) {
                                bba1 bba1Var6 = bba1.P0;
                                x340Var2.s0(bba1Var6);
                                obj10 = bba1Var6;
                            }
                            cev0.n(sda1Var, (iu30) obj10, (qim0) null, apo.r(-1038265344, new ssk(pda1Var, xtb0Var, iea1Var2, cba1Var2, e1m0Var2, u85Var2, watVar, vba1Var, qba1Var4, xtb0VarA, zba1VarC, qba1Var2), x340Var2), x340Var2, 3120);
                            bwp0.c(0, strI, x340Var2, (qim0) null);
                            x340Var2.r(true);
                        } else {
                            yda1Var2 = yda1Var;
                            if (zda1Var instanceof vda1) {
                                vda1Var = (vda1) zda1Var;
                            } else {
                                vda1Var = null;
                            }
                            if (vda1Var != null) {
                                hashSetJ1 = o7h.j1(vda1Var.a);
                            } else {
                                hashSetJ1 = null;
                            }
                            if (hashSetJ1 == null) {
                                objT = w7xVar;
                            } else {
                                objT = hashSetJ1;
                            }
                            x340Var2.s0(objT);
                            set = (Set) objT;
                            if (i3 == 3) {
                                le81Var = new le81(pda1Var.e());
                            } else {
                                le81Var = null;
                            }
                            objT2 = x340Var2.T();
                            obj6 = objT2;
                            if (objT2 == m4cVar) {
                                hrr0 hrr0VarQ13 = v8r.q(pda1Var.d());
                                x340Var2.s0(hrr0VarQ13);
                                obj6 = hrr0VarQ13;
                            }
                            ven0Var = (ven0) obj6;
                            objT3 = x340Var2.T();
                            obj7 = objT3;
                            if (objT3 == m4cVar) {
                                hrr0 hrr0VarQ14 = v8r.q(le81Var);
                                x340Var2.s0(hrr0VarQ14);
                                obj7 = hrr0VarQ14;
                            }
                            ven0Var2 = (ven0) obj7;
                            Object[] objArr7 = {str, set, pda1Var.d(), le81Var};
                            zG2 = x340Var2.g(le81Var) | x340Var2.i(ven0Var2) | x340Var2.i(pda1Var) | x340Var2.i(ven0Var) | x340Var2.g(str) | x340Var2.g(set) | x340Var2.i(kkw0Var2);
                            str2 = str;
                            Object objT115 = x340Var2.T();
                            if (zG2) {
                                pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                x340Var2.s0(pwm0Var);
                            } else {
                                pwm0Var = new pwm0(le81Var, pda1Var, str2, set, kkw0Var2, ven0Var2, ven0Var, (lnm) null);
                                x340Var2.s0(pwm0Var);
                            }
                            qxd0.u(objArr7, (vu30) pwm0Var, x340Var2);
                            Boolean boolValueOf7 = Boolean.valueOf(z5);
                            zH = x340Var2.h(z6) | x340Var2.h(z5) | x340Var2.i(xtb0VarA2);
                            Object objT212 = x340Var2.T();
                            obj8 = objT212;
                            if (zH) {
                                jda1 jda1Var12 = new jda1(z6, z5, xtb0VarA2, null);
                                x340Var2.s0(jda1Var12);
                                obj8 = jda1Var12;
                            } else {
                                jda1 jda1Var13 = new jda1(z6, z5, xtb0VarA2, null);
                                x340Var2.s0(jda1Var13);
                                obj8 = jda1Var13;
                            }
                            qxd0.t(boolValueOf7, x340Var2, (vu30) obj8);
                            if (i3 != 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zI = x340Var2.i(pda1Var);
                            Object objT213 = x340Var2.T();
                            obj9 = objT213;
                            if (zI) {
                                gda1 gda1Var13 = new gda1(pda1Var, (byte) 2);
                                x340Var2.s0(gda1Var13);
                                obj9 = gda1Var13;
                            } else {
                                gda1 gda1Var14 = new gda1(pda1Var, (byte) 2);
                                x340Var2.s0(gda1Var14);
                                obj9 = gda1Var14;
                            }
                            q3p1.b(0, 0, (Function0) obj9, x340Var2, z);
                            WeakHashMap weakHashMap7 = osl1.x;
                            u85Var = lhc.g(x340Var2).c;
                            watVar = (wat) x340Var2.k(t4k.h);
                            strI = xcg1.i(cwl1.o0(x340Var2, 2131962749), ". ", cwl1.o0(x340Var2, 2131962748));
                            iC2 = l1d.C(i3);
                            if (iC2 == 0) {
                                i = 2;
                                x340Var2.i0(-668393222);
                                x340Var2.r(false);
                                strI = "";
                            } else if (iC2 != 1) {
                                i = 2;
                                if (iC2 != 2) {
                                    throw p3d1.k(x340Var2, 1779552611, false);
                                }
                                x340Var2.i0(1779559917);
                                xca1Var2 = (xca1) ven0VarK2.getValue();
                                x340Var2.i0(1378548153);
                                if (xca1Var2 instanceof uca1) {
                                    uca1Var = (uca1) xca1Var2;
                                    String str14 = uca1Var.a;
                                    if (str5 == null) {
                                        size = uca1Var.b.size();
                                    } else if (str5.equals("artists")) {
                                        size = uca1Var.e.size();
                                    } else {
                                        size = uca1Var.f.size();
                                    }
                                    uaa1Var = new uaa1(str14, size);
                                } else {
                                    if (xca1Var2.equals(wca1.a)) {
                                    }
                                    uaa1Var = null;
                                }
                                if (uaa1Var == null) {
                                    x340Var2.r(false);
                                    z2 = false;
                                } else {
                                    str3 = uaa1Var.a;
                                    i2 = uaa1Var.b;
                                    if (str5 == null) {
                                        x340Var2.i0(-149039560);
                                        strU = cwl1.U(2131820922, i2, new Object[]{str3, Integer.valueOf(i2)}, x340Var2);
                                        x340Var2.r(false);
                                        x340Var2.r(false);
                                        z2 = false;
                                    } else {
                                        x340Var2.i0(-148869463);
                                        x340Var2.r(false);
                                        it = sba1.b.a.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            kba1Var = (kba1) next;
                                            if (kba1Var != null) {
                                                strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                                z2 = false;
                                                x340Var2.r(false);
                                            } else {
                                                z2 = false;
                                                x340Var2.r(false);
                                            }
                                        } while (!((kba1) next).a.equals(str5));
                                        kba1Var = (kba1) next;
                                        if (kba1Var != null) {
                                            strU = cwl1.U(2131820923, i2, new Object[]{str3, cwl1.o0(x340Var2, kba1Var.c), Integer.valueOf(i2)}, x340Var2);
                                            z2 = false;
                                            x340Var2.r(false);
                                        } else {
                                            z2 = false;
                                            x340Var2.r(false);
                                        }
                                    }
                                    if (strU == null) {
                                        strI = "";
                                    } else {
                                        strI = strU;
                                    }
                                    x340Var2.r(z2);
                                }
                                strU = null;
                                if (strU == null) {
                                    strI = "";
                                } else {
                                    strI = strU;
                                }
                                x340Var2.r(z2);
                            } else {
                                i = 2;
                                x340Var2.i0(1779555736);
                                x340Var2.r(false);
                            }
                            zG3 = x340Var2.g(pda1Var.d());
                            objT4 = x340Var2.T();
                            if (zG3) {
                                brl0Var = pda1Var.m;
                                strD = pda1Var.d();
                                if (strD.equals("recently_played")) {
                                    i = 4;
                                } else if (strD.equals("followed_artists")) {
                                    i = 1;
                                } else if (!strD.equals("liked_songs")) {
                                    if (strD.equals("most_played")) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    e1m0Var = new e1m0(brl0Var, i);
                                } else {
                                    e1m0Var = null;
                                }
                                x340Var2.s0(e1m0Var);
                                objT4 = e1m0Var;
                            } else {
                                brl0Var = pda1Var.m;
                                strD = pda1Var.d();
                                if (strD.equals("recently_played")) {
                                    i = 4;
                                } else if (strD.equals("followed_artists")) {
                                    i = 1;
                                } else if (!strD.equals("liked_songs")) {
                                    if (strD.equals("most_played")) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    e1m0Var = new e1m0(brl0Var, i);
                                } else {
                                    e1m0Var = null;
                                }
                                x340Var2.s0(e1m0Var);
                                objT4 = e1m0Var;
                            }
                            e1m0Var2 = (e1m0) objT4;
                            zG4 = x340Var2.g((Map) ven0VarK.getValue()) | x340Var2.g(str4) | x340Var2.g(e1m0Var2);
                            objT5 = x340Var2.T();
                            if (zG4) {
                                zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                if (zda1Var2 == null) {
                                    zda1Var2 = yda1Var2;
                                }
                                if (e1m0Var2 != null) {
                                    r6h1VarB = e1m0Var2.b();
                                } else {
                                    r6h1VarB = null;
                                }
                                if (zda1Var2.equals(xda1.a)) {
                                    aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                } else if (zda1Var2.equals(yda1Var2)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                } else {
                                    if (zda1Var2.equals(uda1.a)) {
                                        aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                    } else {
                                        xtb0Var = xtb0VarA2;
                                        if (zda1Var2 instanceof vda1) {
                                            list2 = ((vda1) zda1Var2).a;
                                            if (list2.isEmpty()) {
                                            }
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            u85Var2 = u85Var;
                                            if (!(zda1Var2 instanceof wda1)) {
                                                eg.o();
                                                return null;
                                            }
                                            list = ((wda1) zda1Var2).a;
                                            if (list.isEmpty()) {
                                            }
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        }
                                    }
                                    x340Var2.s0(objT5);
                                }
                                xtb0Var = xtb0VarA2;
                                objT5 = aca1Var2;
                                u85Var2 = u85Var;
                                x340Var2.s0(objT5);
                            } else {
                                zda1Var2 = (zda1) ((Map) ven0VarK.getValue()).get(aea1Var2);
                                if (zda1Var2 == null) {
                                    zda1Var2 = yda1Var2;
                                }
                                if (e1m0Var2 != null) {
                                    r6h1VarB = e1m0Var2.b();
                                } else {
                                    r6h1VarB = null;
                                }
                                if (zda1Var2.equals(xda1.a)) {
                                    aca1Var2 = new cca1("song_dna_search_tab_skeleton");
                                } else if (zda1Var2.equals(yda1Var2)) {
                                    aca1Var2 = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, oca1.a));
                                } else {
                                    if (zda1Var2.equals(uda1.a)) {
                                        aca1Var2 = new aca1("song_dna_search_tab_failed", new rca1(r6h1VarB, nca1.a));
                                    } else {
                                        xtb0Var = xtb0VarA2;
                                        if (zda1Var2 instanceof vda1) {
                                            list2 = ((vda1) zda1Var2).a;
                                            if (list2.isEmpty()) {
                                            }
                                            u85Var2 = u85Var;
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        } else {
                                            u85Var2 = u85Var;
                                            if (!(zda1Var2 instanceof wda1)) {
                                                eg.o();
                                                return null;
                                            }
                                            list = ((wda1) zda1Var2).a;
                                            if (list.isEmpty()) {
                                            }
                                            aca1Var = new aca1("song_dna_search_tab_empty", new rca1(r6h1VarB, new mca1(str4)));
                                            objT5 = aca1Var;
                                        }
                                    }
                                    x340Var2.s0(objT5);
                                }
                                xtb0Var = xtb0VarA2;
                                objT5 = aca1Var2;
                                u85Var2 = u85Var;
                                x340Var2.s0(objT5);
                            }
                            zba1VarC = u7n0.C(xtb0VarA, (dca1) objT5, pda1Var.f, iea1Var2, cba1Var2, new cca1("song_dna_search_tab_skeleton"), pda1Var.j, pda1Var.d(), x340Var2);
                            sda1Var = new sda1(z6, (xca1) ven0VarK2.getValue(), str5);
                            gfh0VarC = t1c.c(een.d, false);
                            iHashCode = Long.hashCode(x340Var2.T);
                            xos0VarM = x340Var2.m();
                            qim0VarE = zr7.E(x340Var2, nim0.a);
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
                            objT6 = x340Var2.T();
                            obj10 = objT6;
                            if (objT6 == m4cVar) {
                                bba1 bba1Var7 = bba1.P0;
                                x340Var2.s0(bba1Var7);
                                obj10 = bba1Var7;
                            }
                            cev0.n(sda1Var, (iu30) obj10, (qim0) null, apo.r(-1038265344, new ssk(pda1Var, xtb0Var, iea1Var2, cba1Var2, e1m0Var2, u85Var2, watVar, vba1Var, qba1Var4, xtb0VarA, zba1VarC, qba1Var2), x340Var2), x340Var2, 3120);
                            bwp0.c(0, strI, x340Var2, (qim0) null);
                            x340Var2.r(true);
                        }
                    }
                    return null;
                }
                x340Var2.b0();
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pda1 pda1Var3 = this.b;
                    y7e1 y7e1Var2 = pda1Var3.s;
                    boolean zI4 = x340Var4.i(pda1Var3);
                    Object objT30 = x340Var4.T();
                    if (zI4 || objT30 == m4cVar2) {
                        nda1 nda1Var = new nda1(0, pda1Var3, pda1.class, "logClear", "logClear()V", 0, (byte) 1);
                        x340Var4.s0(nda1Var);
                        objT30 = nda1Var;
                    }
                    Function0 function1 = (Function0) objT30;
                    boolean zI5 = x340Var4.i(pda1Var3);
                    Object objT31 = x340Var4.T();
                    Object obj18 = objT31;
                    if (zI5 || objT31 == m4cVar2) {
                        ida1 ida1Var2 = new ida1(pda1Var3, b3);
                        x340Var4.s0(ida1Var2);
                        obj18 = ida1Var2;
                    }
                    iu30 iu30Var = (iu30) obj18;
                    boolean zI6 = x340Var4.i(pda1Var3);
                    Object objT32 = x340Var4.T();
                    Object obj19 = objT32;
                    if (zI6 || objT32 == m4cVar2) {
                        ida1 ida1Var3 = new ida1(pda1Var3, b2);
                        x340Var4.s0(ida1Var3);
                        obj19 = ida1Var3;
                    }
                    i1k0.i(y7e1Var2, function1, (qim0) null, iu30Var, (iu30) obj19, pda1Var3.n, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
