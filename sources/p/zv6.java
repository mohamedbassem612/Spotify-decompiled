package p;

import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zv6 extends hab0 implements xu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ xpw X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Parcelable g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv6(su6 su6Var, boolean z, em0 em0Var, boolean z2, lik1 lik1Var, iac0 iac0Var, mw6 mw6Var, String str, iw11 iw11Var, String str2, tob1 tob1Var, qy71 qy71Var, qy71 qy71Var2) {
        super(3);
        this.e = su6Var;
        this.c = z;
        this.f = em0Var;
        this.d = z2;
        this.g = lik1Var;
        this.h = iac0Var;
        this.i = mw6Var;
        this.b = str;
        this.X = iw11Var;
        this.t = str2;
        this.Y = tob1Var;
        this.Z = qy71Var;
        this.N0 = qy71Var2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        Object obj4;
        nu nuVar;
        Object next;
        List list;
        String str;
        List list2;
        String strN0;
        List listK;
        String str2;
        String str3;
        Object next2;
        String str4;
        n20 n20Var;
        qim0 qim0VarE;
        String str5;
        boolean z;
        String strK;
        b0k b0kVar;
        boolean z2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.N0;
        Object obj6 = this.Z;
        Object obj7 = this.Y;
        nu nuVar2 = this.X;
        Object obj8 = this.t;
        Object obj9 = this.i;
        Object obj10 = this.h;
        String str6 = this.b;
        w4i1 w4i1Var = this.g;
        Object obj11 = this.f;
        Object obj12 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                mw6 mw6Var = (mw6) obj9;
                iac0 iac0Var = (iac0) obj10;
                Object obj13 = fkj0.X;
                su6 su6Var = (su6) obj12;
                em0 em0Var = (em0) obj11;
                String str7 = (String) em0Var.b;
                hrr0 hrr0Var = (hrr0) em0Var.e;
                hrr0 hrr0Var2 = (hrr0) em0Var.d;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    List list3 = su6Var.f;
                    List list4 = su6Var.g;
                    int i = su6Var.e;
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            obj4 = obj7;
                            int i2 = ((uod1) next).c;
                            Integer num = (Integer) hrr0Var2.getValue();
                            nuVar = nuVar2;
                            if (num == null || i2 != num.intValue()) {
                                obj7 = obj4;
                                nuVar2 = nuVar;
                            }
                        } else {
                            obj4 = obj7;
                            nuVar = nuVar2;
                            next = null;
                        }
                    }
                    uod1 uod1Var = (uod1) next;
                    String strK2 = uod1Var != null ? uod1Var.b : null;
                    if (strK2 == null) {
                        strK2 = x0d.k(x340Var2, 1861140146, 2131955981, x340Var2, false);
                    } else {
                        x340Var2.i0(1861137759);
                        x340Var2.r(false);
                    }
                    List list5 = z6x.a;
                    String str8 = "all";
                    boolean z3 = this.c;
                    if (z3) {
                        x340Var2.i0(1860892471);
                        String strO0 = cwl1.o0(x340Var2, 2131955981);
                        boolean zG = x340Var2.g(list3) | x340Var2.e(i) | x340Var2.g(strO0);
                        list = list3;
                        Object objT = x340Var2.T();
                        if (zG || objT == obj13) {
                            smc0 smc0VarN = k4p1.n();
                            smc0VarN.add(new cb20(null, i > 0 ? Integer.valueOf(i) : null, "all", strO0));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                uod1 uod1Var2 = (uod1) it2.next();
                                smc0VarN.add(new cb20(Integer.valueOf(uod1Var2.c), uod1Var2.d, uod1Var2.a, uod1Var2.b));
                                it2 = it2;
                                str8 = str8;
                            }
                            str = str8;
                            objT = k4p1.k(smc0VarN);
                            x340Var2.s0(objT);
                        } else {
                            str = "all";
                        }
                        list2 = (List) objT;
                        x340Var2.r(false);
                    } else {
                        list = list3;
                        str = "all";
                        str6 = str6;
                        em0Var = em0Var;
                        x340Var2.i0(1861613469);
                        x340Var2.r(false);
                        list2 = list5;
                    }
                    String strO1 = cwl1.o0(x340Var2, 2131962804);
                    b3d0 b3d0Var = (g3d0) hrr0Var.getValue();
                    b3d0 b3d0Var2 = b3d0Var instanceof b3d0 ? b3d0Var : null;
                    String name = b3d0Var2 != null ? b3d0Var2.getName() : null;
                    if (name == null) {
                        name = x0d.k(x340Var2, 1861174220, 2131962806, x340Var2, false);
                    } else {
                        x340Var2.i0(1861171988);
                        x340Var2.r(false);
                    }
                    String strA = em0Var.W().a();
                    b3d0 b3d0Var3 = (g3d0) hrr0Var.getValue();
                    b3d0 b3d0Var4 = b3d0Var3 instanceof b3d0 ? b3d0Var3 : null;
                    String strB = b3d0Var4 != null ? b3d0Var4.b() : null;
                    d3d0 d3d0Var = (g3d0) hrr0Var.getValue();
                    List list6 = list2;
                    d3d0 d3d0Var2 = d3d0Var instanceof d3d0 ? d3d0Var : null;
                    rha1 rha1Var = rha1.a;
                    rha1 rha1Var2 = rha1.b;
                    rha1 rha1Var3 = d3d0Var2 != null ? d3d0Var2.a() ? rha1Var2 : rha1Var : null;
                    if (strB == null || rha1Var3 == null) {
                        strK2 = strK2;
                        rha1Var = rha1Var;
                        x340Var2.i0(1862723300);
                        x340Var2.r(false);
                        strN0 = null;
                    } else {
                        x340Var2.i0(1862348479);
                        int iOrdinal = rha1Var3.ordinal();
                        if (iOrdinal == 0) {
                            z = false;
                            strK = x0d.k(x340Var2, 1861194453, 2131962809, x340Var2, false);
                        } else {
                            if (iOrdinal != 1) {
                                throw p3d1.k(x340Var2, 1861192328, false);
                            }
                            z = false;
                            strK = x0d.k(x340Var2, 1861197398, 2131962811, x340Var2, false);
                        }
                        strN0 = cwl1.n0(2131962805, new Object[]{name, strK}, x340Var2);
                        x340Var2.r(z);
                    }
                    boolean zG2 = x340Var2.g(list4) | x340Var2.g(strO1);
                    boolean z4 = this.d;
                    boolean zH = zG2 | x340Var2.h(z4);
                    Object objT2 = x340Var2.T();
                    if (zH || objT2 == obj13) {
                        if (z4) {
                            smc0 smc0VarN2 = k4p1.n();
                            smc0VarN2.add(new cia1("default", null, strO1, false, null));
                            ArrayList<d3d0> arrayList = new ArrayList();
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                Object next3 = it4.next();
                                if (next3 instanceof b3d0) {
                                    arrayList.add(next3);
                                }
                                it3 = it4;
                            }
                            for (d3d0 d3d0Var3 : arrayList) {
                                String strB2 = d3d0Var3.b();
                                String strB3 = d3d0Var3.b();
                                String name2 = d3d0Var3.getName();
                                boolean z5 = d3d0Var3 instanceof d3d0;
                                d3d0 d3d0Var4 = z5 ? d3d0Var3 : null;
                                smc0VarN2.add(new cia1(strB2, strB3, name2, z5, d3d0Var4 != null ? d3d0Var4.a() ? rha1Var2 : rha1Var : null));
                            }
                            listK = k4p1.k(smc0VarN2);
                        } else {
                            listK = list5;
                        }
                        x340Var2.s0(listK);
                        objT2 = listK;
                    }
                    List list7 = (List) objT2;
                    boolean zG3 = x340Var2.g(str7) | x340Var2.g(strA) | x340Var2.g(strB) | x340Var2.e(rha1Var3 == null ? -1 : rha1Var3.ordinal()) | x340Var2.g(list7);
                    Object objT3 = x340Var2.T();
                    if (zG3 || objT3 == obj13) {
                        str2 = strB;
                        objT3 = new tw6(str7, strA, str2, rha1Var3, list7);
                        str3 = strA;
                        x340Var2.s0(objT3);
                    } else {
                        str3 = strA;
                        str2 = strB;
                    }
                    tw6 tw6Var = (tw6) objT3;
                    Iterator it5 = list.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            int i3 = ((uod1) next2).c;
                            Integer num2 = (Integer) hrr0Var2.getValue();
                            if (num2 != null && i3 == num2.intValue()) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    uod1 uod1Var3 = (uod1) next2;
                    String str9 = (uod1Var3 == null || (str5 = uod1Var3.a) == null) ? str : str5;
                    jx11 jx11VarW = em0Var.W();
                    String str10 = su6Var.h;
                    List list8 = su6Var.i;
                    String str11 = ((lik1) w4i1Var).a;
                    String strW = nhc1.W(em0Var.W().a, "{id}", str7);
                    boolean zBooleanValue = ((Boolean) ((tob1) obj4).getValue()).booleanValue();
                    boolean zI = x340Var2.i(iac0Var) | x340Var2.i(mw6Var);
                    Object objT4 = x340Var2.T();
                    String str12 = strN0;
                    if (zI || objT4 == obj13) {
                        objT4 = new xg6(iac0Var, mw6Var, (byte) 14);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var = (iu30) objT4;
                    x340Var2.i0(2080842152);
                    boolean zE = x340Var2.e(jx11VarW.ordinal()) | x340Var2.g(str10) | x340Var2.g(list8) | x340Var2.g(str11) | x340Var2.g(strW);
                    Object objT5 = x340Var2.T();
                    if (zE || objT5 == obj13) {
                        str4 = str10;
                        objT5 = new c4g0(jx11VarW, str4, list8, str11, strW);
                        x340Var2.s0(objT5);
                    } else {
                        str4 = str10;
                    }
                    c4g0 c4g0Var = (c4g0) objT5;
                    List list9 = c4g0Var.c;
                    jx11 jx11Var = c4g0Var.a;
                    jx11 jx11Var2 = jx11.SONGS;
                    if (jx11Var != jx11Var2 || ihc1.y0(c4g0Var.b) || c4g0Var.c.isEmpty()) {
                        x340Var2.r(false);
                        n20Var = null;
                    } else {
                        String strO2 = cwl1.o0(x340Var2, 2131958055);
                        String strO3 = cwl1.o0(x340Var2, 2131958056);
                        String strN1 = cwl1.n0(2131958059, new Object[]{str4}, x340Var2);
                        boolean zG4 = x340Var2.g(strO2) | x340Var2.g(strO3) | x340Var2.g(strN1);
                        Object objT6 = x340Var2.T();
                        if (zG4 || objT6 == obj13) {
                            objT6 = new d4g0(strO2, strO3, strN1);
                            x340Var2.s0(objT6);
                        }
                        d4g0 d4g0Var = (d4g0) objT6;
                        ven0 ven0VarS = v8r.s(iu30Var, x340Var2);
                        boolean zG5 = x340Var2.g(c4g0Var) | x340Var2.g(d4g0Var) | x340Var2.h(zBooleanValue);
                        Object objT7 = x340Var2.T();
                        if (zG5 || objT7 == obj13) {
                            sqa0 sqa0Var = new sqa0(ven0VarS, (byte) 17);
                            if (c4g0Var.a != jx11Var2 || ihc1.y0(c4g0Var.b) || list9.isEmpty()) {
                                objT7 = null;
                            } else {
                                objT7 = new n20(d4g0Var.a, ltx.c, zBooleanValue ? new hax(d4g0Var.b) : jax.a, new j2d0(sqa0Var, new liu0(d4g0Var.c, o7h.l1(list9), c4g0Var.d, c4g0Var.e), (byte) 21));
                            }
                            x340Var2.s0(objT7);
                        }
                        n20Var = (n20) objT7;
                        x340Var2.r(false);
                    }
                    String str13 = strK2;
                    boolean zH2 = x340Var2.h(z3) | x340Var2.g(str13) | x340Var2.g(str9) | x340Var2.g(str3) | x340Var2.h(z4) | x340Var2.g(name) | x340Var2.g(str12) | x340Var2.g(n20Var) | x340Var2.g(list6) | x340Var2.g(tw6Var) | x340Var2.g(str6);
                    qy71 qy71Var = (qy71) obj6;
                    qy71 qy71Var2 = (qy71) obj5;
                    Object objT8 = x340Var2.T();
                    if (zH2 || objT8 == obj13) {
                        smc0 smc0VarN3 = k4p1.n();
                        if (z3) {
                            jv6 jv6Var = new jv6(str7, str3, (Integer) hrr0Var2.getValue(), list6);
                            smc0VarN3.add(new m40("filter", str13, enx.c, null, new z40(str9, jv6Var.d()), new xg6(qy71Var, jv6Var, (byte) 12), 24));
                        }
                        if (z4) {
                            smc0VarN3.add(new m40("sort", name, rsx.c, str12, new a50(str2 == null ? "default" : str2, tw6Var.d()), new xg6(qy71Var2, tw6Var, (byte) 13), 8));
                        }
                        if (n20Var != null) {
                            smc0VarN3.add(n20Var);
                        }
                        objT8 = k4p1.k(smc0VarN3);
                        x340Var2.s0(objT8);
                    }
                    List list10 = (List) objT8;
                    u7h u7hVar = su6Var.j;
                    qim0 qim0Var = nim0.a;
                    if (u7hVar == null) {
                        x340Var2.i0(1866551489);
                        x340Var2.r(false);
                        qim0VarE = null;
                    } else {
                        x340Var2.i0(1866551490);
                        long j = u7hVar.a;
                        uwr uwrVar = cbx.a;
                        qim0VarE = dug.e(qim0Var, v9c.t((mmr0[]) Arrays.copyOf(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.4f), new u7h(u7h.b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.85f), new u7h(cbx.a(x340Var2).a.c))}, 3), 0.0f, 0.0f, 14), null, 0.0f, 6);
                        x340Var2.r(false);
                    }
                    if (qim0VarE == null) {
                        qim0VarE = qim0Var;
                    }
                    iw11 iw11Var = (iw11) nuVar;
                    String str14 = (String) obj8;
                    String strA2 = em0Var.W().a();
                    List list11 = su6Var.l;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list11, 10));
                    Iterator it6 = list11.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(((jx11) it6.next()).a());
                    }
                    otw.c(iw11Var, new hw11(this.b, str14, list10, strA2, arrayList2, su6Var.b), u291.f(qim0Var, 1.0f).then(qim0VarE), (ipb1) null, x340Var2, 0, 8);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                h7q0 h7q0Var = (t7q0) obj12;
                b0k b0kVar2 = (x340) ((b0k) obj2);
                if (h7q0Var == null) {
                    b0kVar2.i0(1774887068);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(1774887069);
                    rjh0 rjh0Var = (rjh0) obj11;
                    w4i1 w4i1Var2 = w4i1Var;
                    iu30 iu30Var2 = (iu30) obj10;
                    bc71 bc71Var = (bc71) obj9;
                    yxb0 yxb0Var = (yxb0) obj8;
                    nu nuVar3 = nuVar2;
                    yuu0 yuu0Var = (yuu0) obj7;
                    e821 e821Var = (e821) obj6;
                    tyq tyqVar = (tyq) obj5;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    cvx cvxVar2 = cbx.b(b0kVar2).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 6.0f, 0.0f, 16.0f, 5);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM = b0kVar2.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
                    hzj.A.getClass();
                    if (((x340) b0kVar2).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(hmb0.t1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar2, y580.O0);
                    nko1.H(xos0VarM, b0kVar2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                    nko1.F(b0kVar2);
                    nko1.H(qim0VarE2, b0kVar2, y580.Y);
                    h7q0 h7q0Var2 = h7q0Var instanceof h7q0 ? h7q0Var : null;
                    apl aplVar = h7q0Var2 != null ? h7q0Var2.a : null;
                    if (aplVar instanceof ppl) {
                        b0kVar2.i0(1294780254);
                        List<opl> list12 = ((ppl) aplVar).b;
                        ArrayList arrayList3 = new ArrayList();
                        for (opl oplVar : list12) {
                            mg31 mg31Var = oplVar.c;
                            pjh0 pjh0Var = mg31Var != null ? new pjh0(oplVar.b, mg31Var.c, mg31Var.d, mg31Var.g, mg31Var.b, mg31Var.a) : null;
                            if (pjh0Var != null) {
                                arrayList3.add(pjh0Var);
                            }
                        }
                        c380 c380VarA = mqo1.A(arrayList3);
                        boolean zG6 = b0kVar2.g(iu30Var2);
                        Object objT9 = b0kVar2.T();
                        if (zG6 || objT9 == m4cVar) {
                            objT9 = new c5a(iu30Var2, (byte) 29);
                            b0kVar2.s0(objT9);
                        }
                        b0kVar = b0kVar2;
                        otw.c(rjh0Var, new qjh0(c380VarA, w4i1Var2, str6, (iu30) objT9), (qim0) null, (ipb1) null, b0kVar, 0, 12);
                        z2 = false;
                        b0kVar.r(false);
                    } else {
                        b0kVar = b0kVar2;
                        b0kVar.i0(1294823997);
                        boolean zG7 = b0kVar.g(iu30Var2);
                        Object objT10 = b0kVar.T();
                        if (zG7 || objT10 == m4cVar) {
                            objT10 = new ggf(iu30Var2, (byte) 22);
                            b0kVar.s0(objT10);
                        }
                        i8p1.f(h7q0Var, bc71Var, (Function0) objT10, yxb0Var, nuVar3, yuu0Var, e821Var, this.c, this.d, null, tyqVar, b0kVar, 0);
                        z2 = false;
                        b0kVar.r(false);
                    }
                    b0kVar.r(true);
                    b0kVar.r(z2);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv6(t7q0 t7q0Var, rjh0 rjh0Var, w4i1 w4i1Var, String str, iu30 iu30Var, bc71 bc71Var, yxb0 yxb0Var, nu nuVar, yuu0 yuu0Var, e821 e821Var, boolean z, boolean z2, tyq tyqVar) {
        super(3);
        this.e = t7q0Var;
        this.f = rjh0Var;
        this.g = w4i1Var;
        this.b = str;
        this.h = iu30Var;
        this.i = bc71Var;
        this.t = yxb0Var;
        this.X = nuVar;
        this.Y = yuu0Var;
        this.Z = e821Var;
        this.c = z;
        this.d = z2;
        this.N0 = tyqVar;
    }
}
