package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hmk0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hmk0(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    public static final void a(res resVar, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, iu30 iu30Var, rmk0 rmk0Var) {
        if (d(ven0Var)) {
            return;
        }
        ven0Var.setValue(Boolean.TRUE);
        faa0 faa0Var = (faa0) ven0Var2.getValue();
        lnm lnmVar = null;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        ven0Var3.setValue((Object) null);
        ((cdk0) resVar.d).c();
        fn31.T(c9nVar, (o8n) null, 0, new wkk0(iu30Var, rmk0Var, resVar, lnmVar, (byte) 2), 3);
    }

    public static final boolean d(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:90:0x01a8  */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        String strN;
        ksw kswVar = (ksw) obj;
        rbn0 rbn0Var = (rbn0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        wbn0 wbn0Var = (wbn0) this.b;
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(kswVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? x340Var.g(rbn0Var) : x340Var.i(rbn0Var) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        byte b = 0;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1171) != 1170)) {
            int i2 = ybn0.b;
            qim0 qim0VarR = d7e.r(((ez61) ahl.a).a, u291.v(nim0.a, 284.0f), false);
            nbn0 nbn0Var = rbn0Var.c;
            if (u890.j(nbn0Var, obn0.a)) {
                x340Var2.i0(104885395);
                dxo1.k(qim0VarR, x340Var2, 0);
                x340Var2.r(false);
            } else if (u890.j(nbn0Var, mbn0.a)) {
                x340Var2.i0(104887440);
                boolean z = (i & 896) == 256;
                Object objT = x340Var2.T();
                if (z || objT == m4cVar) {
                    objT = new nfk0(iu30Var, (byte) 14);
                    x340Var2.s0(objT);
                }
                rwo1.h(0, (Function0) objT, x340Var2, qim0VarR);
                x340Var2.r(false);
            } else {
                if (!(nbn0Var instanceof nbn0)) {
                    throw p3d1.k(x340Var2, 104886164, false);
                }
                x340Var2.i0(-1043278249);
                boolean zG = x340Var2.g(rbn0Var.a);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = ycm.a(wbn0Var.d);
                    x340Var2.s0(objT2);
                }
                j2i j2iVarR = apo.r(231367824, new ubn0(wbn0Var, rbn0Var, (byte) 2), x340Var2);
                j2i j2iVarR2 = apo.r(1851598870, new vbn0((idm) objT2, rbn0Var, nbn0Var, b), x340Var2);
                nbn0 nbn0Var2 = nbn0Var;
                String str = nbn0Var2.a;
                pjw0 pjw0Var = nbn0Var2.e;
                boolean zG2 = x340Var2.g(pjw0Var) | x340Var2.g(str);
                Object objT3 = x340Var2.T();
                if (zG2 || objT3 == m4cVar) {
                    mjw0 mjw0Var = pjw0Var.b;
                    mjw0 mjw0Var2 = mjw0Var instanceof mjw0 ? mjw0Var : null;
                    if (mjw0Var2 == null) {
                        objT3 = null;
                    } else {
                        ojw0 ojw0Var = mjw0Var2.b;
                        w6j1 w6j1Var = mjw0Var2.a.a;
                        if (w6j1Var instanceof w6j1) {
                            strN = w6j1Var.a.a;
                        } else {
                            if (!(w6j1Var instanceof x6j1)) {
                                eg.o();
                                return null;
                            }
                            String str2 = ((x6j1) w6j1Var).a;
                            if (ihc1.y0(str2)) {
                                str2 = null;
                            }
                            strN = str2 != null ? wqn1.n(str2) : null;
                        }
                        if (strN == null) {
                            objT3 = null;
                        } else {
                            String str3 = !ihc1.y0(strN) ? strN : null;
                            if (str3 != null) {
                                objT3 = new klw0(str3, ojw0Var != null ? jfv.h(ojw0Var.a) : 0L, ojw0Var != null ? jfv.h(ojw0Var.b) : 0L, false, true, 1, str);
                            } else {
                                objT3 = null;
                            }
                        }
                    }
                    x340Var2.s0(objT3);
                }
                bcn0.a(kswVar, (klw0) objT3, rbn0Var.a, wbn0Var.a, wbn0Var.b, rbn0Var.b, apo.r(-1610894230, new tbn0(nbn0Var, j2iVarR, j2iVarR2, rbn0Var), x340Var2), x340Var2, 1572864 | (i & 14));
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        lgn0 lgn0Var = (lgn0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 112) ^ 48) > 32 && x340Var.g(lgn0Var)) || (iIntValue & 48) == 32;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new zem0(lgn0Var, (byte) 23);
            x340Var2.s0(objT);
        }
        x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(499815136, new ukm0((e27) this.b, iu30Var, (byte) 4), x340Var2), x340Var2, 24576, 48, 2030);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        et90 et90Var = (et90) this.b;
        oin0 oin0Var = ((pin0) obj2).a;
        if (oin0Var instanceof lin0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1174445183);
            mod.b(oi7.a.a((gw70) et90Var.c), apo.r(848383469, new qin0(oin0Var, (byte) 0), x340Var2), x340Var2, 56);
            x340Var2.r(false);
        } else if (oin0Var instanceof min0) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1174459791);
            mod.c(new ely0[]{q7f0.a.a((woa) et90Var.d), q7f0.b.a((kma) et90Var.e)}, apo.r(-456061290, new qin0(oin0Var, (byte) 1), x340Var3), x340Var3, 56);
            x340Var3.r(false);
        } else {
            if (!u890.j(oin0Var, nin0.a)) {
                throw p3d1.k(x340Var, 1174443231, false);
            }
            x340 x340Var4 = x340Var;
            x340Var4.i0(1174475961);
            x340Var4.r(false);
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        res resVar = (res) this.b;
        boolean z = true;
        if (((f1o0) obj2).a) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1494618709);
            if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new nfk0(iu30Var, (byte) 17);
                x340Var2.s0(objT);
            }
            resVar.h((Function0) objT, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1494696147);
            if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT2 = x340Var3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new nfk0(iu30Var, (byte) 18);
                x340Var3.s0(objT2);
            }
            resVar.j((Function0) objT2, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(2, (wux) null, apo.r(-1416989716, new vbn0(this.b, obj2, obj3, (byte) 2), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(2, (wux) null, apo.r(622851453, new vbn0(this.b, obj2, obj3, (byte) 3), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(2, (wux) null, apo.r(-926171312, new vbn0(obj2, obj3, this.b, (byte) 4), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        n3o1.d(((hao0) this.b).c, (iu30) obj3, (b0k) obj4, (iIntValue >> 3) & 112);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        eio0 eio0Var = (eio0) obj2;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        cio0 cio0Var = eio0Var instanceof cio0 ? (cio0) eio0Var : null;
        List list = cio0Var != null ? cio0Var.a : null;
        if (list == null) {
            list = z6x.a;
        }
        String str = cio0Var != null ? cio0Var.b : null;
        if (str == null) {
            str = "";
        }
        String str2 = cio0Var != null ? cio0Var.c : null;
        oho1.n(new hio0(str, list, str2 != null ? str2 : "", cio0Var != null ? cio0Var.d : null), (hcs) ((el9) this.b).h, b0kVar, 0);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        x340 x340Var;
        boolean z;
        fcf0 fcf0VarC;
        float f;
        boolean z2;
        List list;
        b0k b0kVar;
        frr0 frr0Var;
        c9n c9nVar;
        fyo1 fyo1Var;
        lnm lnmVar;
        hok1 hok1Var;
        rpo0 rpo0Var;
        bs91 bs91Var;
        iu30 iu30Var;
        byte b = this.a;
        gex0 gex0Var = h36.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        Integer num = null;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                dmk0 dmk0Var = (dmk0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                hnk0 hnk0Var = dmk0Var.b;
                boolean z3 = hnk0Var instanceof enk0;
                x340 x340Var2 = (b0k) obj4;
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                if (!(hnk0Var instanceof fnk0)) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    x340Var2.i0(987337201);
                    x340Var = x340Var2;
                    fcf0VarC = h5p1.G(new ocf0(2131886161), (String) null, (xu30) null, x340Var2, 0, 62).c();
                    z = false;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var2;
                    z = false;
                    x340Var.i0(987492790);
                    x340Var.r(false);
                    fcf0VarC = null;
                }
                kbf0 kbf0VarS = m5n1.S(x340Var);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.TRUE);
                    x340Var.s0(objT2);
                }
                mod.b(oi7.a.a((gw70) ((yxb0) obj6).e), apo.r(303544086, new ofi0(z3, dmk0Var, fcf0VarC, kbf0VarS, (ven0) objT2, (byte) 1), x340Var), x340Var, 56);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT3);
                }
                ven0 ven0Var2 = (ven0) objT3;
                Boolean boolValueOf = Boolean.valueOf(z3);
                boolean zH = x340Var.h(z3) | x340Var.i(ven0Var2) | (((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var2)) && (iIntValue & 384) != 256) ? z : true);
                Object objT4 = x340Var.T();
                if (zH || objT4 == m4cVar) {
                    objT4 = new mbg(z3, iu30Var2, ven0Var2, null, (byte) 2);
                    x340Var.s0(objT4);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT4);
                return rih1Var;
            case 1:
                smk0 smk0Var = (smk0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                res resVar = (res) obj6;
                int i = smk0Var.d;
                boolean z4 = smk0Var.c;
                List list2 = smk0Var.a;
                b0k b0kVar2 = (x340) ((b0k) obj4);
                Object objT5 = b0kVar2.T();
                m4c m4cVar2 = fkj0.X;
                if (objT5 == m4cVar2) {
                    objT5 = qxd0.M(o6x.a, b0kVar2);
                    b0kVar2.s0(objT5);
                }
                c9n c9nVar2 = (c9n) objT5;
                Object objT6 = b0kVar2.T();
                if (objT6 == m4cVar2) {
                    objT6 = v8r.q((Object) null);
                    b0kVar2.s0(objT6);
                }
                ven0 ven0Var3 = (ven0) objT6;
                Object objT7 = b0kVar2.T();
                if (objT7 == m4cVar2) {
                    objT7 = us71.i(0.0f, b0kVar2);
                }
                drr0 drr0Var = (drr0) objT7;
                Object objT8 = b0kVar2.T();
                if (objT8 == m4cVar2) {
                    objT8 = mgo1.e(0, 1, 0, 5);
                    b0kVar2.s0(objT8);
                }
                sen0 sen0Var = (sen0) objT8;
                Object objT9 = b0kVar2.T();
                if (objT9 == m4cVar2) {
                    objT9 = p3d1.m(0L, b0kVar2);
                }
                frr0 frr0Var2 = (frr0) objT9;
                Object objT10 = b0kVar2.T();
                if (objT10 == m4cVar2) {
                    objT10 = p3d1.m(0L, b0kVar2);
                }
                frr0 frr0Var3 = (frr0) objT10;
                Object objT11 = b0kVar2.T();
                if (objT11 == m4cVar2) {
                    objT11 = v8r.q((Object) null);
                    b0kVar2.s0(objT11);
                }
                ven0 ven0Var4 = (ven0) objT11;
                Object objT12 = b0kVar2.T();
                if (objT12 == m4cVar2) {
                    objT12 = v8r.q(Boolean.FALSE);
                    b0kVar2.s0(objT12);
                }
                ven0 ven0Var5 = (ven0) objT12;
                Integer num2 = (Integer) ven0Var3.getValue();
                boolean zI = b0kVar2.i(resVar) | b0kVar2.i(sen0Var);
                Object objT13 = b0kVar2.T();
                if (zI || objT13 == m4cVar2) {
                    f = 0.0f;
                    z2 = true;
                    list = list2;
                    tmk0 tmk0Var = new tmk0(resVar, sen0Var, ven0Var3, drr0Var, frr0Var2, frr0Var3, (lnm) null);
                    b0kVar2.s0(tmk0Var);
                    objT13 = tmk0Var;
                } else {
                    f = 0.0f;
                    z2 = true;
                    list = list2;
                }
                qxd0.t(num2, b0kVar2, (vu30) objT13);
                boolean zI2 = b0kVar2.i(smk0Var) | b0kVar2.i(resVar) | b0kVar2.i(sen0Var);
                Object objT14 = b0kVar2.T();
                if (zI2 || objT14 == m4cVar2) {
                    b0kVar = b0kVar2;
                    cvs cvsVar = new cvs(smk0Var, resVar, sen0Var, ven0Var5, drr0Var, frr0Var2, frr0Var3, ven0Var3, (lnm) null);
                    resVar = resVar;
                    frr0Var = frr0Var3;
                    b0kVar.s0(cvsVar);
                    objT14 = cvsVar;
                } else {
                    b0kVar = b0kVar2;
                    frr0Var = frr0Var3;
                }
                qxd0.t(list, b0kVar, (vu30) objT14);
                List listM = p7h.M(new String[]{cwl1.o0(b0kVar, 2131958862), cwl1.o0(b0kVar, 2131958863), cwl1.o0(b0kVar, 2131958864), cwl1.o0(b0kVar, 2131958865)});
                List list3 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                int i2 = 0;
                for (Object obj7 : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw 0;
                    }
                    sr10 sr10Var = (sr10) obj7;
                    if (z4) {
                        int i4 = smk0Var.b;
                        fyo1Var = i2 < i4 ? cx10.c : i2 == i4 ? dx10.c : ex10.c;
                    } else {
                        fyo1Var = i2 == i ? zw10.c : ax10.c;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) ((i2 < 0 || i2 >= listM.size()) ? "Transition" : listM.get(i2)));
                    if (smk0Var.e) {
                        sb.append(" (" + sr10Var.b + ")");
                    }
                    String string = sb.toString();
                    Integer num3 = (Integer) ven0Var3.getValue();
                    boolean z5 = (num3 != null && i2 == num3.intValue()) ? z2 : false;
                    Integer num4 = (Integer) ven0Var3.getValue();
                    arrayList.add(new gx10(string, fyo1Var, z5, (num4 != null && i2 == num4.intValue()) ? drr0Var.s() : f));
                    i2 = i3;
                    i = i;
                }
                boolean z6 = (z4 != 0 || i < 0) ? false : z2;
                boolean zI3 = b0kVar.i(resVar) | b0kVar.i(c9nVar2) | (((((iIntValue2 & 896) ^ 384) <= 256 || !b0kVar.g(iu30Var3)) && (iIntValue2 & 384) != 256) ? false : z2);
                Object objT15 = b0kVar.T();
                if (zI3 || objT15 == m4cVar2) {
                    umk0 umk0Var = new umk0(resVar, c9nVar2, ven0Var5, ven0Var4, ven0Var3, iu30Var3, (byte) 0);
                    c9nVar = c9nVar2;
                    b0kVar.s0(umk0Var);
                    objT15 = umk0Var;
                } else {
                    c9nVar = c9nVar2;
                }
                x74.f((Function0) objT15, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(-1919629262, new wmk0(resVar, arrayList, smk0Var, iu30Var3, c9nVar, z6, ven0Var5, ven0Var3, ven0Var4, drr0Var, frr0Var2, frr0Var), b0kVar), b0kVar, 12582912, 48, 1918);
                return rih1Var;
            case 2:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                w2g0.c((qim0) null, (tl3) null, apo.r(-1858375332, new iwf0((dok0) obj2, (psy) obj6, (iu30) obj3, (byte) 26), b0kVar3), b0kVar3, 3072, 7);
                return rih1Var;
            case 3:
                ksw kswVar = (ksw) obj;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                ng20 ng20Var = (ng20) obj6;
                x340 x340Var4 = x340Var3;
                x340Var4.i0(1182661200);
                qim0 qim0VarZ = uyn1.z(dsa0.m(x340Var4, 2131167023), 0.0f, 2, nim0Var);
                x340Var4.r(false);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(gfh0VarC, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                ((kpg0) ng20Var.b).a.c().a(((iIntValue3 >> 3) & 126) | ((iIntValue3 << 6) & 896), obj2, x340Var3, kswVar, iu30Var4);
                x340Var5.r(true);
                return rih1Var;
            case 4:
                ksw kswVar2 = (ksw) obj;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                qj0 qj0Var = (qj0) obj6;
                qim0 qim0Var = (qim0) ((vu30) qj0Var.e).invoke(x340Var6, 0);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var7 = x340Var6;
                int iHashCode2 = Long.hashCode(x340Var7.T);
                xos0 xos0VarM2 = x340Var7.m();
                qim0 qim0VarE2 = zr7.E(x340Var6, qim0Var);
                hzj.A.getClass();
                x340 x340Var8 = x340Var6;
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(gfh0VarC2, x340Var6, y580.O0);
                nko1.H(xos0VarM2, x340Var6, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var6, y580.R0);
                nko1.F(x340Var6);
                nko1.H(qim0VarE2, x340Var6, y580.Y);
                ((xpw) qj0Var.d).c().a(((iIntValue4 >> 3) & 126) | ((iIntValue4 << 6) & 896), obj2, x340Var6, kswVar2, iu30Var5);
                x340Var8.r(true);
                return rih1Var;
            case 5:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a((gw70) ((ng20) obj6).b), apo.r(-1817746299, new skm0((qkm0) obj2, (iu30) obj3, (byte) 1), b0kVar4), b0kVar4, 56);
                return rih1Var;
            case 6:
                ehm0 ehm0Var = (ehm0) obj2;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                int i5 = ehm0Var.c;
                cm0 cm0Var = (cm0) obj6;
                if (i5 == 2 && !ehm0Var.b.isEmpty()) {
                    x340 x340Var10 = x340Var9;
                    x340Var10.i0(-610347164);
                    cm0Var.g(ehm0Var, x340Var10, (iIntValue5 >> 3) & 14);
                    x340Var10.r(false);
                } else if (i5 == 3 || i5 == 4) {
                    x340 x340Var11 = x340Var9;
                    x340Var11.i0(-610235192);
                    cm0Var.h(x340Var11, 0);
                    x340Var11.r(false);
                } else {
                    x340 x340Var12 = x340Var9;
                    x340Var12.i0(-610187483);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 7:
                hqm0 hqm0Var = (hqm0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if (hqm0Var.a.isEmpty()) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(470042123);
                    x340Var14.r(false);
                } else {
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(469465523);
                    int i6 = iIntValue6 >> 3;
                    x2g0.m(hqm0Var, iu30Var6, apo.r(-1258436609, new ukm0(hqm0Var, (jqm0) obj6, (byte) 2), x340Var15), x340Var15, (i6 & 112) | (i6 & 14) | 384);
                    x340Var15.r(false);
                }
                return rih1Var;
            case 8:
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((yqm0) obj6).b), apo.r(228918316, new loi0((uqm0) obj2, (iu30) obj3, (byte) 14), b0kVar5), b0kVar5, 56);
                return rih1Var;
            case 9:
                mrm0 mrm0Var = (mrm0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                int iIntValue7 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var16 = (b0k) obj4;
                iac0 iac0Var = (iac0) x340Var16.k(jfe0.a);
                ven0 ven0VarS = v8r.s(iu30Var7, x340Var16);
                krm0 krm0Var = mrm0Var.a;
                ven0 ven0VarS2 = v8r.s(krm0Var, x340Var16);
                wrm0 wrm0Var = (wrm0) obj6;
                enk1 enk1Var = wrm0Var.Y;
                ty60 ty60Var = wrm0Var.g;
                boolean zI4 = x340Var16.i(iac0Var) | x340Var16.i(ven0VarS2) | x340Var16.i(ven0VarS) | x340Var16.i(wrm0Var);
                Object objT16 = x340Var16.T();
                if (zI4 || objT16 == m4cVar3) {
                    objT16 = new ofk0(iac0Var, ven0VarS2, ven0VarS, wrm0Var, (lnm) null);
                    x340Var16.s0(objT16);
                }
                qxd0.s(ty60Var, iac0Var, (vu30) objT16, x340Var16);
                lrm0 lrm0Var = mrm0Var.b;
                int i7 = (iIntValue7 & 112) ^ 48;
                int i8 = (iIntValue7 & 896) ^ 384;
                boolean zI5 = ((i7 > 32 && x340Var16.i(mrm0Var)) || (iIntValue7 & 48) == 32) | x340Var16.i(wrm0Var) | ((i8 > 256 && x340Var16.g(iu30Var7)) || (iIntValue7 & 384) == 256);
                Object objT17 = x340Var16.T();
                lnm lnmVar2 = null;
                if (zI5 || objT17 == m4cVar3) {
                    objT17 = new wkk0(mrm0Var, wrm0Var, iu30Var7, lnmVar2, (byte) 7);
                    lnmVar = null;
                    x340Var16.s0(objT17);
                } else {
                    lnmVar = null;
                }
                qxd0.t(lrm0Var, x340Var16, (vu30) objT17);
                Object objT18 = x340Var16.T();
                if (objT18 == m4cVar3) {
                    objT18 = v8r.q(krm0Var);
                    x340Var16.s0(objT18);
                }
                ven0 ven0Var6 = (ven0) objT18;
                boolean zI6 = ((i7 > 32 && x340Var16.i(mrm0Var)) || (iIntValue7 & 48) == 32) | x340Var16.i(ven0Var6) | x340Var16.i(wrm0Var);
                Object objT19 = x340Var16.T();
                if (zI6 || objT19 == m4cVar3) {
                    objT19 = new az80(mrm0Var, wrm0Var, ven0Var6, lnmVar, (byte) 28);
                    x340Var16.s0(objT19);
                }
                qxd0.t(krm0Var, x340Var16, (vu30) objT19);
                int iOrdinal = krm0Var.ordinal();
                rih1 rih1Var2 = rih1.a;
                if (iOrdinal == 0) {
                    x340Var16.i0(-1219880040);
                    nrm0 nrm0Var = wrm0Var.h;
                    boolean z7 = (i8 > 256 && x340Var16.g(iu30Var7)) || (iIntValue7 & 384) == 256;
                    Object objT20 = x340Var16.T();
                    if (z7 || objT20 == m4cVar3) {
                        objT20 = new nfk0(iu30Var7, (byte) 8);
                        x340Var16.s0(objT20);
                    }
                    nrm0Var.d((Function0) objT20, x340Var16, 0);
                    x340Var16.r(false);
                    return rih1Var2;
                }
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var16, -1219881060, false);
                }
                x340Var16.i0(838526199);
                ven0 ven0VarS3 = v8r.s(iu30Var7, x340Var16);
                ven0 ven0VarS4 = v8r.s(wrm0Var.i, x340Var16);
                boolean zG = x340Var16.g(enk1Var);
                Object objT21 = x340Var16.T();
                if (zG || objT21 == m4cVar3) {
                    lvp lvpVar = wrm0Var.b;
                    w9u0 w9u0Var = wrm0Var.f;
                    ty60 ty60Var2 = wrm0Var.g;
                    xs3 xs3Var = new xs3(ven0VarS4, ven0VarS3, (byte) 14);
                    q2j0 q2j0Var = new q2j0(ven0VarS3, (byte) 5);
                    iu30 iu30Var8 = wrm0Var.X;
                    switch (lvpVar.a) {
                        case 0:
                            nwp nwpVar = (nwp) ((gbp) lvpVar.b).c;
                            Context context = (Context) nwpVar.b.d;
                            c8o.l(context);
                            pe peVarG = nwpVar.a.g();
                            c8o.l(peVarG);
                            Flowable flowable = (Flowable) nwpVar.l.get();
                            em0 em0Var = nwpVar.a;
                            kt91 kt91VarD1 = em0Var.d1();
                            c8o.l(kt91VarD1);
                            dma1 dma1VarZ0 = em0Var.Z0();
                            c8o.l(dma1VarZ0);
                            exg1 exg1Var = new exg1(dma1VarZ0, nwpVar.f());
                            mr4 mr4VarF = nwpVar.f();
                            q8n q8nVarG0 = em0Var.g0();
                            c8o.l(q8nVarG0);
                            hok1Var = new hok1(context, peVarG, flowable, kt91VarD1, exg1Var, mr4VarF, q8nVarG0, w9u0Var, ty60Var2, xs3Var, q2j0Var, iu30Var8, enk1Var);
                            break;
                        case 1:
                            thq thqVar = (thq) lvpVar.b;
                            daq daqVar = thqVar.b;
                            hok1Var = new hok1((Context) daqVar.x1.a, (pe) daqVar.p9.get(), (Flowable) daqVar.D5.get(), (kt91) daqVar.f8.get(), (exg1) ((v5q) thqVar.c).S4.get(), (mr4) daqVar.ri.get(), (q8n) daqVar.V2.get(), w9u0Var, ty60Var2, xs3Var, q2j0Var, iu30Var8, enk1Var);
                            break;
                        case 2:
                            r7q r7qVar = lvpVar.b;
                            daq daqVar2 = r7qVar.b;
                            hok1Var = new hok1((Context) daqVar2.x1.a, (pe) daqVar2.p9.get(), (Flowable) daqVar2.D5.get(), (kt91) daqVar2.f8.get(), (exg1) ((s7q) r7qVar.d).c7.get(), (mr4) daqVar2.ri.get(), (q8n) daqVar2.V2.get(), w9u0Var, ty60Var2, xs3Var, q2j0Var, iu30Var8, enk1Var);
                            break;
                        default:
                            r7q r7qVar2 = lvpVar.b;
                            daq daqVar3 = r7qVar2.b;
                            hok1Var = new hok1((Context) daqVar3.x1.a, (pe) daqVar3.p9.get(), (Flowable) daqVar3.D5.get(), (kt91) daqVar3.f8.get(), (exg1) r7qVar2.d.Cf.get(), (mr4) daqVar3.ri.get(), (q8n) daqVar3.V2.get(), w9u0Var, ty60Var2, xs3Var, q2j0Var, iu30Var8, enk1Var);
                            break;
                    }
                    objT21 = hok1Var;
                    x340Var16.s0(objT21);
                }
                otw.c((ink1) objT21, rih1Var2, wrm0Var.Z, (ipb1) null, x340Var16, 48, 8);
                x340Var16.r(false);
                return rih1Var2;
            case 10:
                lbt0 lbt0Var = (lbt0) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                evm0 evm0Var = (evm0) obj6;
                xfx xfxVar = evm0Var.a;
                oh4 oh4Var = evm0Var.b.b;
                boolean zL = oh4Var.l();
                boolean zS = oh4Var.s();
                boolean zF = oh4Var.F();
                qim0 qim0VarN = anm1.N("multi_user", nim0Var);
                boolean z8 = (((iIntValue8 & 896) ^ 384) > 256 && x340Var17.g(iu30Var9)) || (iIntValue8 & 384) == 256;
                x340 x340Var18 = x340Var17;
                Object objT22 = x340Var18.T();
                if (z8 || objT22 == fkj0.X) {
                    objT22 = new wck0(iu30Var9, (byte) 3);
                    x340Var18.s0(objT22);
                }
                o4o1.j(xfxVar, lbt0Var, qim0VarN, zL, true, zS, zF, (iu30) objT22, x340Var18, (iIntValue8 & 112) | 24576, 0);
                return rih1Var;
            case 11:
                lbt0 lbt0Var2 = (lbt0) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                fvm0 fvm0Var = (fvm0) obj6;
                xfx xfxVar2 = fvm0Var.a;
                oh4 oh4Var2 = fvm0Var.b.b;
                boolean zL2 = oh4Var2.l();
                boolean zS2 = oh4Var2.s();
                boolean zF2 = oh4Var2.F();
                qim0 qim0VarN2 = anm1.N("multi_user", uyn1.x(nim0Var, 16.0f));
                boolean z9 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var19.g(iu30Var10)) || (iIntValue9 & 384) == 256;
                x340 x340Var20 = x340Var19;
                Object objT23 = x340Var20.T();
                if (z9 || objT23 == fkj0.X) {
                    objT23 = new wck0(iu30Var10, (byte) 4);
                    x340Var20.s0(objT23);
                }
                o4o1.j(xfxVar2, lbt0Var2, qim0VarN2, zL2, false, zS2, zF2, (iu30) objT23, x340Var20, iIntValue9 & 112, 16);
                return rih1Var;
            case 12:
                gxm0 gxm0Var = (gxm0) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                hh5 hh5Var = gxm0Var.a;
                boolean z10 = gxm0Var.b;
                boolean z11 = gxm0Var.c;
                fxm0 fxm0Var = gxm0Var.d;
                dxm0 dxm0Var = fxm0Var instanceof dxm0 ? (dxm0) fxm0Var : null;
                Integer numValueOf = dxm0Var != null ? Integer.valueOf(dxm0Var.a) : null;
                boolean z12 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var21.g(iu30Var11)) || (iIntValue10 & 384) == 256;
                x340 x340Var22 = x340Var21;
                Object objT24 = x340Var22.T();
                if (z12 || objT24 == fkj0.X) {
                    objT24 = new wck0(iu30Var11, (byte) 5);
                    x340Var22.s0(objT24);
                }
                ot11.f(hh5Var, z10, z11, numValueOf, (iu30) objT24, ((hxm0) obj6).a, (qim0) null, x340Var22, 0);
                return rih1Var;
            case 13:
                ((o2n0) obj6).f((l2n0) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 14:
                v2n0 v2n0Var = (v2n0) obj2;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                int i9 = v2n0Var.b;
                qlb qlbVar = (qlb) obj6;
                jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var23, 0);
                x340 x340Var24 = x340Var23;
                int iHashCode3 = Long.hashCode(x340Var24.T);
                xos0 xos0VarM3 = x340Var24.m();
                qim0 qim0VarE3 = zr7.E(x340Var23, nim0Var);
                hzj.A.getClass();
                x340 x340Var25 = x340Var23;
                if (x340Var25.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(jw31VarA, x340Var23, y580.O0);
                nko1.H(xos0VarM3, x340Var23, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var23, y580.R0);
                nko1.F(x340Var23);
                nko1.H(qim0VarE3, x340Var23, y580.Y);
                if (i9 != 1) {
                    x340Var25.i0(-754535758);
                    qlbVar.h(i9, x340Var23, 0);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var23).b;
                    op71.g(x340Var23, u291.v(nim0Var, 4.0f));
                    x340Var25.r(false);
                } else {
                    x340Var25.i0(-754402179);
                    x340Var25.r(false);
                }
                qlbVar.j(v2n0Var, x340Var23, (iIntValue11 >> 3) & 14);
                x340Var25.r(true);
                return rih1Var;
            case 15:
                l3n0 l3n0Var = (l3n0) obj2;
                ((Number) obj5).intValue();
                j541.e(l3n0Var.a, l3n0Var.b, l3n0Var.c, l3n0Var.d, ((n3n0) obj6).b, l3n0Var.e, (qim0) null, (b0k) obj4, 0);
                return rih1Var;
            case 16:
                ((jd6) obj6).h((i4n0) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 17:
                p4n0 p4n0Var = (p4n0) obj2;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                int i10 = p4n0Var.c;
                qlb qlbVar2 = (qlb) obj6;
                jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var26, 0);
                x340 x340Var27 = x340Var26;
                int iHashCode4 = Long.hashCode(x340Var27.T);
                xos0 xos0VarM4 = x340Var27.m();
                qim0 qim0VarE4 = zr7.E(x340Var26, nim0Var);
                hzj.A.getClass();
                x340 x340Var28 = x340Var26;
                if (x340Var28.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var28.m0();
                if (x340Var28.S) {
                    x340Var28.l(n4kVar);
                } else {
                    x340Var28.v0();
                }
                nko1.H(jw31VarA2, x340Var26, y580.O0);
                nko1.H(xos0VarM4, x340Var26, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var26, y580.R0);
                nko1.F(x340Var26);
                nko1.H(qim0VarE4, x340Var26, y580.Y);
                if (i10 != 1) {
                    x340Var28.i0(1775405766);
                    qlbVar2.g(i10, x340Var26, 0);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var26).b;
                    op71.g(x340Var26, u291.v(nim0Var, 4.0f));
                    x340Var28.r(false);
                } else {
                    x340Var28.i0(1775539345);
                    x340Var28.r(false);
                }
                qlbVar2.k(p4n0Var, x340Var26, (iIntValue12 >> 3) & 14);
                x340Var28.r(true);
                return rih1Var;
            case 18:
                b0k b0kVar6 = (b0k) obj4;
                ((Number) obj5).intValue();
                b6n0 b6n0Var = (b6n0) obj6;
                mod.b(oi7.a.a(b6n0Var.a), apo.r(-2053880683, new y5n0(b6n0Var, (u5n0) obj2, (iu30) obj3), b0kVar6), b0kVar6, 56);
                return rih1Var;
            case 19:
                return e(obj, obj2, obj3, obj4, obj5);
            case 20:
                return f(obj, obj2, obj3, obj4, obj5);
            case 21:
                return g(obj, obj2, obj3, obj4, obj5);
            case 22:
                ((rtn0) obj3).a((otn0) obj, (wnb0) obj6, (b0k) obj4, ((Number) obj5).intValue() & 14);
                return rih1Var;
            case 23:
                return h(obj, obj2, obj3, obj4, obj5);
            case 24:
                return i(obj, obj2, obj3, obj4, obj5);
            case 25:
                return j(obj, obj2, obj3, obj4, obj5);
            case 26:
                return k(obj, obj2, obj3, obj4, obj5);
            case 27:
                return m(obj, obj2, obj3, obj4, obj5);
            case 28:
                return n(obj, obj2, obj3, obj4, obj5);
            default:
                rpo0 rpo0Var2 = (rpo0) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                int iIntValue13 = ((Number) obj5).intValue();
                jpo0 jpo0Var = rpo0Var2.c;
                x340 x340Var29 = (b0k) obj4;
                Object objT25 = x340Var29.T();
                m4c m4cVar4 = fkj0.X;
                if (objT25 == m4cVar4) {
                    objT25 = v8r.q(Boolean.FALSE);
                    x340Var29.s0(objT25);
                }
                ven0 ven0Var7 = (ven0) objT25;
                Object objT26 = x340Var29.T();
                if (objT26 == m4cVar4) {
                    objT26 = new bs91();
                    x340Var29.s0(objT26);
                }
                bs91 bs91Var2 = (bs91) objT26;
                String strO0 = cwl1.o0(x340Var29, 2131954136);
                int i11 = (iIntValue13 & 112) ^ 48;
                boolean zI7 = ((i11 > 32 && x340Var29.g(rpo0Var2)) || (iIntValue13 & 48) == 32) | x340Var29.i(ven0Var7);
                Object objT27 = x340Var29.T();
                if (zI7 || objT27 == m4cVar4) {
                    objT27 = new m3n0((Object) rpo0Var2, (Object) ven0Var7, (lnm) num, (byte) 27);
                    x340Var29.s0(objT27);
                }
                qxd0.t(jpo0Var, x340Var29, (vu30) objT27);
                boolean zI8 = ((i11 > 32 && x340Var29.g(rpo0Var2)) || (iIntValue13 & 48) == 32) | x340Var29.i(bs91Var2) | x340Var29.g(strO0) | ((((iIntValue13 & 896) ^ 384) > 256 && x340Var29.g(iu30Var12)) || (iIntValue13 & 384) == 256);
                Object objT28 = x340Var29.T();
                if (zI8 || objT28 == m4cVar4) {
                    rpo0Var = rpo0Var2;
                    objT28 = new ofk0(rpo0Var, bs91Var2, strO0, iu30Var12, null, (byte) 11, false);
                    bs91Var = bs91Var2;
                    iu30Var = iu30Var12;
                    x340Var29.s0(objT28);
                } else {
                    rpo0Var = rpo0Var2;
                    iu30Var = iu30Var12;
                    bs91Var = bs91Var2;
                }
                qxd0.t(jpo0Var, x340Var29, (vu30) objT28);
                nyx.a(0, (wux) null, apo.r(748491631, new e9g0(rpo0Var, iu30Var, (res) obj6, ven0Var7, bs91Var, (byte) 13), x340Var29), x340Var29, 3072, 7);
                return rih1Var;
        }
    }
}
