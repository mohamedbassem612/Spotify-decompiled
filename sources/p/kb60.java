package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kb60 extends hab0 implements xu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb60(String str, ArrayList arrayList, String str2, vu30 vu30Var, boolean z, cmt cmtVar, String str3, String str4, kjp kjpVar, ijp ijpVar, jjp jjpVar) {
        super(3);
        this.c = str;
        this.g = arrayList;
        this.d = str2;
        this.h = vu30Var;
        this.b = z;
        this.i = cmtVar;
        this.e = str3;
        this.f = str4;
        this.t = kjpVar;
        this.X = ijpVar;
        this.Y = jjpVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        jkr0 jkr0Var;
        rih1 rih1Var;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        boolean zH0;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var2 = rih1.a;
        Object obj9 = this.Y;
        Object obj10 = this.c;
        Object obj11 = this.X;
        Object obj12 = this.t;
        Object obj13 = this.e;
        Object obj14 = this.d;
        Object obj15 = this.f;
        Object obj16 = this.i;
        Object obj17 = this.h;
        Object obj18 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2c i2cVar = (i2c) obj;
                int iIntValue = ((Number) obj3).intValue();
                vu30 vu30Var = (vu30) obj17;
                Object obj19 = fkj0.X;
                String str = (String) obj10;
                x340 x340Var = (b0k) obj2;
                ArrayList arrayList = (ArrayList) obj18;
                String str2 = (String) obj14;
                boolean zG = x340Var.g(str) | x340Var.g(arrayList) | x340Var.g(str2);
                Object objT = x340Var.T();
                if (zG || objT == obj19) {
                    objT = Integer.valueOf(omo1.n(str, str2, arrayList));
                    x340Var.s0(objT);
                }
                int iIntValue2 = ((Number) objT).intValue();
                boolean zI = x340Var.i(arrayList);
                Object objT2 = x340Var.T();
                if (zI || objT2 == obj19) {
                    i = 0;
                    objT2 = new jb60(arrayList, (byte) 0);
                    x340Var.s0(objT2);
                } else {
                    i = 0;
                }
                jkr0 jkr0VarB = lkr0.b(iIntValue2, (Function0) objT2, x340Var, i, 2);
                Object objT3 = x340Var.T();
                if (objT3 == obj19) {
                    objT3 = bb00.h(iIntValue2, x340Var);
                }
                hdn0 hdn0Var = (hdn0) objT3;
                boolean zI2 = x340Var.i(jkr0VarB) | x340Var.i(hdn0Var) | x340Var.g(vu30Var);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == obj19) {
                    objT4 = new f530(jkr0VarB, vu30Var, hdn0Var, (lnm) null, (byte) 13);
                    jkr0Var = jkr0VarB;
                    x340Var.s0(objT4);
                } else {
                    jkr0Var = jkr0VarB;
                }
                qxd0.s(jkr0Var, arrayList, (vu30) objT4, x340Var);
                ijp ijpVar = (ijp) obj11;
                Object objT5 = x340Var.T();
                if (objT5 == obj19) {
                    ijpVar.getClass();
                    objT5 = new db60();
                    x340Var.s0(objT5);
                }
                db60 db60Var = (db60) objT5;
                jjp jjpVar = (jjp) obj9;
                Object objT6 = x340Var.T();
                if (objT6 == obj19) {
                    lzn0 lzn0Var = (lzn0) ((yb60) ((g1i) jjpVar.a.c).b).b.get();
                    c8o.l(lzn0Var);
                    objT6 = new slx0(lzn0Var);
                    x340Var.s0(objT6);
                }
                slx0 slx0Var = (slx0) objT6;
                if (u1p1.y(x340Var)) {
                    x340Var.i0(-1959594930);
                    fno1.e(i2cVar, arrayList, jkr0Var, this.b, db60Var, slx0Var, x340Var, (iIntValue & 14) | 294912);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1959364507);
                    wmo1.f(i2cVar, arrayList, jkr0Var, this.b, (cmt) obj16, (String) obj13, (String) obj15, db60Var, slx0Var, (kjp) obj12, x340Var, (iIntValue & 14) | 150994944);
                    x340Var.r(false);
                }
                return rih1Var2;
            case 1:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarH = l6o1.H(u291.f(nim0Var, 1.0f), (es41) obj10, false, 14);
                olo0 olo0Var = (olo0) obj14;
                ven0 ven0Var = (ven0) obj13;
                iu30 iu30Var = (iu30) obj15;
                ven0 ven0Var2 = (ven0) obj18;
                iu30 iu30Var2 = (iu30) obj17;
                c9n c9nVar = (c9n) obj16;
                vy71 vy71Var = (vy71) obj12;
                ven0 ven0Var3 = (ven0) obj11;
                Function0 function0 = (Function0) obj9;
                mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                ajo1.d(0, olo0Var.a, olo0Var.b, x340Var2, null);
                mlo0 mlo0Var = olo0Var.d;
                boolean zI3 = x340Var4.i(ven0Var) | x340Var4.g(iu30Var);
                Object objT7 = x340Var4.T();
                if (zI3 || objT7 == m4cVar) {
                    objT7 = new gp0(iu30Var, ven0Var, (byte) 26);
                    x340Var4.s0(objT7);
                }
                iu30 iu30Var3 = (iu30) objT7;
                llo0 llo0Var = olo0Var.e;
                boolean zI4 = x340Var4.i(ven0Var2) | x340Var4.g(iu30Var2);
                Object objT8 = x340Var4.T();
                if (zI4 || objT8 == m4cVar) {
                    objT8 = new gp0(iu30Var2, ven0Var2, (byte) 27);
                    x340Var4.s0(objT8);
                }
                ajo1.f(mlo0Var, iu30Var3, llo0Var, (iu30) objT8, null, x340Var2, 0);
                String str3 = olo0Var.c;
                boolean zI5 = x340Var4.i(c9nVar) | x340Var4.i(vy71Var) | x340Var4.i(ven0Var3) | x340Var4.g(function0);
                Object objT9 = x340Var4.T();
                if (zI5 || objT9 == m4cVar) {
                    objT9 = new yt6(c9nVar, vy71Var, function0, ven0Var3, (byte) 1);
                    x340Var4.s0(objT9);
                }
                ajo1.c(0, str3, (Function0) objT9, x340Var2, null, this.b);
                ydh.l(nim0Var, 48.0f, x340Var2, x340Var4, true);
                return rih1Var2;
            default:
                cb0 cb0Var = (cb0) obj16;
                iu30 iu30Var4 = (iu30) obj15;
                tln tlnVar = (tln) obj14;
                nbh nbhVar = (nbh) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                dp71 dp71Var = (dp71) obj13;
                ven0 ven0Var4 = (ven0) obj12;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var5.g(nbhVar) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x340Var6.b0();
                    return rih1Var2;
                }
                boolean zG2 = x340Var6.g((String) ven0Var4.getValue());
                Object objT10 = x340Var6.T();
                if (zG2 || objT10 == m4cVar2) {
                    c380 c380Var = dp71Var.a;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = c380Var.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        Object next = it2.next();
                        rih1 rih1Var3 = rih1Var2;
                        d6q0 d6q0Var = (j6q0) next;
                        Object obj20 = obj9;
                        if (d6q0Var instanceof d6q0) {
                            d6q0 d6q0Var2 = d6q0Var;
                            obj7 = obj18;
                            obj8 = obj10;
                            if (!ihc1.h0(d6q0Var2.b, (String) ven0Var4.getValue(), true)) {
                                List list = d6q0Var2.a;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator it3 = list.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (ihc1.h0(((w4i1) it3.next()).b, (String) ven0Var4.getValue(), true)) {
                                            }
                                        }
                                    }
                                }
                            }
                            zH0 = true;
                        } else {
                            obj7 = obj18;
                            obj8 = obj10;
                            zH0 = d6q0Var instanceof h6q0 ? ihc1.h0(((h6q0) d6q0Var).a.b, (String) ven0Var4.getValue(), true) : false;
                        }
                        if (zH0) {
                            arrayList2.add(next);
                        }
                        it = it2;
                        obj9 = obj20;
                        obj18 = obj7;
                        obj10 = obj8;
                        rih1Var2 = rih1Var3;
                    }
                    rih1Var = rih1Var2;
                    obj4 = obj9;
                    obj5 = obj18;
                    obj6 = obj10;
                    objT10 = v8r.q(arrayList2);
                    x340Var6.s0(objT10);
                } else {
                    rih1Var = rih1Var2;
                    obj4 = obj9;
                    obj5 = obj18;
                    obj6 = obj10;
                }
                ven0 ven0Var5 = (ven0) objT10;
                if (((List) ven0Var5.getValue()).isEmpty()) {
                    x340Var6.i0(-1846394435);
                    zko1.d(48, 1, apo.r(-955251832, new qm71((jwf0) obj11, dp71Var, ven0Var4, (byte) 1), x340Var6), x340Var6, null);
                    x340Var6.r(false);
                    return rih1Var;
                }
                x340Var6.i0(-1845919732);
                List list2 = (List) ven0Var5.getValue();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj21 : list2) {
                    if (obj21 instanceof b6q0) {
                        arrayList3.add(obj21);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj22 : arrayList3) {
                    if (((b6q0) obj22).g() != 3) {
                        arrayList4.add(obj22);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj23 : arrayList4) {
                    if (((b6q0) obj23).g() == 1) {
                        arrayList5.add(obj23);
                    } else {
                        arrayList6.add(obj23);
                    }
                }
                qim0 qim0VarN = anm1.N("share_with_page_lazy_list", bmq0.L(nim0Var, (d6o0) obj6, (g6o0) null));
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var6).b;
                zzq0 zzq0VarJ = uyn1.j(0.0f, 8.0f, 0.0f, 0.0f, 13);
                WeakHashMap weakHashMap = osl1.x;
                hdh hdhVarN = lnn1.n(zzq0VarJ, hqq0.C(lhc.g(x340Var6).g, x340Var6));
                boolean zI6 = x340Var6.i(tlnVar) | x340Var6.g(dp71Var) | x340Var6.g(iu30Var4) | x340Var6.i((mxf0) obj5) | x340Var6.i(arrayList5) | x340Var6.i((yp71) obj17) | x340Var6.i(arrayList6) | x340Var6.h(this.b) | ((iIntValue3 & 14) == 4) | x340Var6.i(cb0Var);
                mxf0 mxf0Var = (mxf0) obj5;
                yp71 yp71Var = (yp71) obj17;
                ven0 ven0Var6 = (ven0) obj4;
                Object objT11 = x340Var6.T();
                if (zI6 || objT11 == m4cVar2) {
                    objT11 = new axm0(arrayList5, arrayList6, this.b, tlnVar, dp71Var, iu30Var4, mxf0Var, yp71Var, nbhVar, ven0Var6, cb0Var);
                    x340Var6.s0(objT11);
                }
                ujo1.d(qim0VarN, null, hdhVarN, false, null, null, null, false, null, (iu30) objT11, x340Var6, 0, 506);
                x340Var6.r(false);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb60(d6o0 d6o0Var, tln tlnVar, dp71 dp71Var, iu30 iu30Var, mxf0 mxf0Var, yp71 yp71Var, boolean z, cb0 cb0Var, ven0 ven0Var, jwf0 jwf0Var, ven0 ven0Var2) {
        super(3);
        this.c = d6o0Var;
        this.d = tlnVar;
        this.e = dp71Var;
        this.f = iu30Var;
        this.g = mxf0Var;
        this.h = yp71Var;
        this.b = z;
        this.i = cb0Var;
        this.t = ven0Var;
        this.X = jwf0Var;
        this.Y = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb60(es41 es41Var, olo0 olo0Var, ven0 ven0Var, iu30 iu30Var, ven0 ven0Var2, iu30 iu30Var2, c9n c9nVar, vy71 vy71Var, ven0 ven0Var3, Function0 function0, boolean z) {
        super(3);
        this.c = es41Var;
        this.d = olo0Var;
        this.e = ven0Var;
        this.f = iu30Var;
        this.g = ven0Var2;
        this.h = iu30Var2;
        this.i = c9nVar;
        this.t = vy71Var;
        this.X = ven0Var3;
        this.Y = function0;
        this.b = z;
    }
}
