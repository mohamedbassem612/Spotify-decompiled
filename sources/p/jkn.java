package p;

import android.app.DatePickerDialog;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jkn extends hab0 implements xu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkn(zkn zknVar, iu30 iu30Var, d6o0 d6o0Var, wn50 wn50Var, v361 v361Var, gv51 gv51Var, cb0 cb0Var, ven0 ven0Var, fm50 fm50Var, ven0 ven0Var2) {
        super(3);
        this.c = zknVar;
        this.b = iu30Var;
        this.d = d6o0Var;
        this.e = wn50Var;
        this.f = v361Var;
        this.g = gv51Var;
        this.h = cb0Var;
        this.i = ven0Var;
        this.X = fm50Var;
        this.t = ven0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:193:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:195:0x0800  */
    /* JADX WARN: Code duplicated, block: B:197:0x0807  */
    /* JADX WARN: Code duplicated, block: B:198:0x080d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0841  */
    /* JADX WARN: Code duplicated, block: B:207:0x0863  */
    /* JADX WARN: Code duplicated, block: B:209:0x087c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0885  */
    /* JADX WARN: Code duplicated, block: B:212:0x089b  */
    /* JADX WARN: Code duplicated, block: B:214:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:216:0x08e6  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        y7e1 y7e1Var;
        List list;
        Iterator it;
        Function0 function0;
        tob1 tob1Var;
        vk80 vk80VarH;
        m4c m4cVar;
        boolean z;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        y7e1 y7e1Var2;
        boolean zG;
        Object objT;
        int i;
        hax haxVar;
        String strY0;
        byte b = this.a;
        Function0 function1 = hmb0.t1;
        iu30 iu30Var = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.c;
        Object obj7 = this.X;
        Object obj8 = this.h;
        Object obj9 = this.g;
        Object obj10 = this.e;
        Object obj11 = this.d;
        Object obj12 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                cb0 cb0Var = (cb0) obj8;
                gv51 gv51Var = (gv51) obj9;
                wn50 wn50Var = (wn50) obj10;
                nbh nbhVar = (nbh) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj5;
                zkn zknVar = (zkn) obj6;
                m4c m4cVar2 = fkj0.X;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var2.g(nbhVar) ? 4 : 2;
                }
                boolean z2 = (iIntValue & 19) != 18;
                int i2 = iIntValue & 1;
                int i3 = iIntValue;
                x340 x340Var3 = x340Var2;
                if (!x340Var3.Y(i2, z2)) {
                    x340Var3.b0();
                    return rih1Var;
                }
                Map map = zknVar.g;
                List list2 = zknVar.b;
                List listA = mqo1.A(map.values());
                boolean zE = ((add) x340Var3.k(ade0.c)).e();
                nim0 nim0Var = nim0.a;
                if (zE) {
                    x340Var3.i0(59776818);
                    y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var3);
                    if (listA.isEmpty()) {
                        strY0 = x0d.k(x340Var3, 59905654, 2131953757, x340Var3, false);
                    } else {
                        x340Var3.i0(60005784);
                        Object objT2 = x340Var3.T();
                        if (objT2 == m4cVar2) {
                            objT2 = y6n.c1;
                            x340Var3.s0(objT2);
                        }
                        strY0 = o7h.y0(listA, ", ", (String) null, (String) null, (iu30) objT2, 30);
                        x340Var3.r(false);
                    }
                    String str = strY0;
                    uwr uwrVar = cbx.a;
                    fyx fyxVar = new fyx(new zxx(cbx.a(x340Var3).b.a, cbx.a(x340Var3).b.b, cbx.a(x340Var3).b.b, cbx.a(x340Var3).b.a, cbx.a(x340Var3).a.a.a(), cbx.a(x340Var3).a.a.a(), cbx.a(x340Var3).b.c, cbx.a(x340Var3).a.b.c(), cbx.a(x340Var3).a.b.c(), cbx.a(x340Var3).b.d));
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    cvx cvxVar = cbx.b(x340Var3).b;
                    rwo1.a(y7e1VarD, fyxVar, uyn1.x(qim0VarF, 8.0f), null, str, null, null, false, null, null, null, null, d6e1.b, null, null, null, null, null, 0.0f, false, x340Var3, 0, 3072, 0, 2088936);
                    x340Var = x340Var3;
                    x340Var.r(false);
                    y7e1Var = y7e1VarD;
                } else {
                    x340Var = x340Var3;
                    listA = listA;
                    x340Var.i0(61109043);
                    x340Var.r(false);
                    y7e1Var = null;
                }
                boolean zIsEmpty = listA.isEmpty();
                iu30 iu30Var2 = this.b;
                if (zIsEmpty) {
                    x340Var.i0(61846037);
                    x340Var.r(false);
                } else {
                    x340Var.i0(61201206);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    qim0 qim0VarY = uyn1.y(qim0VarF2, 16.0f, 8.0f);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    boolean zI = x340Var.i(listA) | x340Var.g(iu30Var2);
                    Object objT3 = x340Var.T();
                    if (zI || objT3 == m4cVar2) {
                        objT3 = new li1((byte) 3, iu30Var2, listA);
                        x340Var.s0(objT3);
                    }
                    ujo1.e(qim0VarY, null, null, d36Var, null, null, false, null, (iu30) objT3, x340Var, 0, 494);
                    x340Var.r(false);
                }
                boolean zG2 = x340Var.g(listA);
                Object objT4 = x340Var.T();
                if (zG2 || objT4 == m4cVar2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj13 : list2) {
                        if (obj13 instanceof d6q0) {
                            arrayList.add(obj13);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        d6q0 d6q0Var = (d6q0) next;
                        if (listA.isEmpty()) {
                            list = listA;
                            it = it2;
                        } else if (listA.isEmpty()) {
                            list = listA;
                            it = it2;
                            arrayList2.add(next);
                        } else {
                            Iterator it3 = listA.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    list = listA;
                                    it = it2;
                                    if (d6q0Var.a.contains((w4i1) it3.next())) {
                                        it2 = it;
                                        listA = list;
                                    }
                                } else {
                                    list = listA;
                                    it = it2;
                                    arrayList2.add(next);
                                }
                            }
                        }
                        it2 = it;
                        listA = list;
                    }
                    objT4 = v8r.q(mqo1.A(arrayList2));
                    x340Var.s0(objT4);
                }
                ven0 ven0Var2 = (ven0) objT4;
                boolean zG3 = x340Var.g((String) ven0Var.getValue());
                Object objT5 = x340Var.T();
                if (zG3 || objT5 == m4cVar2) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        h6q0 h6q0Var = (j6q0) next2;
                        Iterator it5 = it4;
                        if (h6q0Var instanceof h6q0 ? ihc1.h0(h6q0Var.a.b, (String) ven0Var.getValue(), true) : false) {
                            arrayList3.add(next2);
                        }
                        it4 = it5;
                        function1 = function1;
                    }
                    function0 = function1;
                    objT5 = v8r.q(arrayList3);
                    x340Var.s0(objT5);
                } else {
                    function0 = function1;
                }
                tob1 tob1Var2 = (ven0) objT5;
                boolean z3 = zknVar.j && ((String) ven0Var.getValue()).length() == 0;
                if (((List) tob1Var2.getValue()).isEmpty()) {
                    x340Var.i0(62903602);
                    zko1.d(54, 0, apo.r(-1381225112, new mzj((fm50) obj7, zknVar, ven0Var, (byte) 28), x340Var), x340Var, anm1.N("group-invite-link-default-element", nim0Var));
                    x340Var.r(false);
                    return rih1Var;
                }
                x340Var.i0(63757001);
                boolean zG4 = x340Var.g((List) tob1Var2.getValue());
                Object objT6 = x340Var.T();
                if (zG4 || objT6 == m4cVar2) {
                    List list3 = (List) tob1Var2.getValue();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj14 : list3) {
                        if (obj14 instanceof b6q0) {
                            arrayList4.add(obj14);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj15 : arrayList4) {
                        tob1 tob1Var3 = tob1Var2;
                        if (((b6q0) obj15).g() != 3) {
                            arrayList5.add(obj15);
                        }
                        tob1Var2 = tob1Var3;
                    }
                    tob1Var = tob1Var2;
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        Object next3 = it6.next();
                        Iterator it7 = it6;
                        if (((b6q0) next3).g() == 1) {
                            arrayList6.add(next3);
                        } else {
                            arrayList7.add(next3);
                        }
                        it6 = it7;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj16 : arrayList6) {
                        if (obj16 instanceof h6q0) {
                            arrayList8.add(obj16);
                        }
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj17 : arrayList8) {
                        if (((h6q0) obj17).c) {
                            arrayList9.add(obj17);
                        }
                    }
                    c380 c380VarA = mqo1.A(arrayList9);
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj18 : arrayList7) {
                        if (obj18 instanceof h6q0) {
                            arrayList10.add(obj18);
                        }
                    }
                    objT6 = new mmr0(c380VarA, mqo1.A(arrayList10));
                    x340Var.s0(objT6);
                } else {
                    tob1Var = tob1Var2;
                }
                mmr0 mmr0Var = (mmr0) objT6;
                c380 c380Var = (c380) mmr0Var.a;
                c380 c380Var2 = (c380) mmr0Var.b;
                xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
                List list4 = (List) ven0Var2.getValue();
                boolean zG5 = x340Var.g(ven0Var2) | x340Var.g(xtb0VarA);
                Object objT7 = x340Var.T();
                if (zG5 || objT7 == m4cVar2) {
                    objT7 = new ywj(xtb0VarA, ven0Var2, null, (byte) 1);
                    x340Var.s0(objT7);
                }
                Parcelable.Creator creator = d6q0.CREATOR;
                qxd0.t(list4, x340Var, (vu30) objT7);
                if (((List) tob1Var.getValue()).isEmpty()) {
                    x340Var.i0(64497932);
                    WeakHashMap weakHashMap = osl1.x;
                    vk80VarH = hqq0.C(lhc.g(x340Var).g, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(64575308);
                    x340Var.r(false);
                    vk80VarH = uyn1.h(3, 0.0f, 0.0f);
                }
                qim0 qim0VarA = nbhVar.a(1.0f, bmq0.L(nim0Var, (d6o0) obj11, (g6o0) null), true);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var).b;
                hdh hdhVarN = lnn1.n(uyn1.j(0.0f, 8.0f, 0.0f, 0.0f, 13), vk80VarH);
                boolean zG6 = x340Var.g(ven0Var2) | x340Var.i(wn50Var) | x340Var.i((v361) obj12) | x340Var.g(zknVar) | x340Var.i(c380Var) | x340Var.i(gv51Var) | x340Var.g(iu30Var2) | x340Var.i(c380Var2) | x340Var.h(z3) | x340Var.i(cb0Var) | ((i3 & 14) == 4);
                v361 v361Var = (v361) obj12;
                ven0 ven0Var3 = (ven0) obj4;
                Object objT8 = x340Var.T();
                if (!zG6) {
                    if (objT8 == m4cVar) {
                    }
                    m4cVar = m4cVar2;
                    ujo1.d(qim0VarA, xtb0VarA, hdhVarN, false, null, null, null, false, null, (iu30) objT8, x340Var, 0, 504);
                    if (((List) tob1Var.getValue()).isEmpty()) {
                        z = false;
                        x340Var.i0(72770933);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(71113208);
                        qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                        WeakHashMap weakHashMap2 = osl1.x;
                        qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF3);
                        gfh0VarC = t1c.c(een.d, false);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarP);
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        y7e1Var2 = y7e1Var;
                        zG = x340Var.g(y7e1Var2) | x340Var.g(iu30Var2);
                        objT = x340Var.T();
                        if (!zG || objT == m4cVar) {
                            i = 4;
                            objT = new efb(y7e1Var2, iu30Var2, (byte) 4);
                            x340Var.s0(objT);
                        } else {
                            i = 4;
                        }
                        gbx gbxVar = new gbx(z50.c, (Function0) objT);
                        idx idxVar = new idx(i);
                        gdx gdxVarR = yla.r(x340Var);
                        if (map.size() < 2) {
                            x340Var.i0(1669142469);
                            haxVar = new hax(cwl1.o0(x340Var, 2131953755));
                            x340Var.r(false);
                        } else if (map.size() > 9) {
                            x340Var.i0(1669153670);
                            haxVar = new hax(cwl1.o0(x340Var, 2131953756));
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1669160196);
                            x340Var.r(false);
                            haxVar = jax.a;
                        }
                        hax haxVar2 = haxVar;
                        qim0 qim0VarA2 = h2c.a.a(nim0Var, een.h);
                        cvx cvxVar6 = cbx.b(x340Var).b;
                        foo1.c(gbxVar, idxVar, uyn1.z(0.0f, 8.0f, 1, qim0VarA2), haxVar2, gdxVarR, null, null, null, null, null, ugi.b, x340Var, 0, 48, 1992);
                        x340Var.r(true);
                        z = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z);
                    return rih1Var;
                }
                m4cVar = m4cVar2;
                m4cVar = m4cVar2;
                objT8 = new ikn(c380Var, c380Var2, z3, ven0Var2, wn50Var, v361Var, zknVar, gv51Var, iu30Var2, cb0Var, nbhVar, ven0Var3);
                x340Var.s0(objT8);
                m4cVar = m4cVar2;
                ujo1.d(qim0VarA, xtb0VarA, hdhVarN, false, null, null, null, false, null, (iu30) objT8, x340Var, 0, 504);
                if (((List) tob1Var.getValue()).isEmpty()) {
                    x340Var.i0(71113208);
                    qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                    WeakHashMap weakHashMap3 = osl1.x;
                    qim0 qim0VarP2 = x0d.p(lhc.g(x340Var).g, 32, qim0VarF4);
                    gfh0VarC = t1c.c(een.d, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarP2);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    y7e1Var2 = y7e1Var;
                    zG = x340Var.g(y7e1Var2) | x340Var.g(iu30Var2);
                    objT = x340Var.T();
                    if (zG) {
                        i = 4;
                        objT = new efb(y7e1Var2, iu30Var2, (byte) 4);
                        x340Var.s0(objT);
                    } else {
                        i = 4;
                        objT = new efb(y7e1Var2, iu30Var2, (byte) 4);
                        x340Var.s0(objT);
                    }
                    gbx gbxVar2 = new gbx(z50.c, (Function0) objT);
                    idx idxVar2 = new idx(i);
                    gdx gdxVarR2 = yla.r(x340Var);
                    if (map.size() < 2) {
                        x340Var.i0(1669142469);
                        haxVar = new hax(cwl1.o0(x340Var, 2131953755));
                        x340Var.r(false);
                    } else if (map.size() > 9) {
                        x340Var.i0(1669153670);
                        haxVar = new hax(cwl1.o0(x340Var, 2131953756));
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1669160196);
                        x340Var.r(false);
                        haxVar = jax.a;
                    }
                    hax haxVar3 = haxVar;
                    qim0 qim0VarA3 = h2c.a.a(nim0Var, een.h);
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    foo1.c(gbxVar2, idxVar2, uyn1.z(0.0f, 8.0f, 1, qim0VarA3), haxVar3, gdxVarR2, null, null, null, null, null, ugi.b, x340Var, 0, 48, 1992);
                    x340Var.r(true);
                    z = false;
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(72770933);
                    x340Var.r(false);
                }
                x340Var.r(z);
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                c3o c3oVar = (c3o) obj11;
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    era eraVar = een.P0;
                    qim0 qim0VarZ = u291.z(u291.D((qim0) obj6, eraVar, 2), (fra) null, 3);
                    boolean zG7 = x340Var5.g(iu30Var) | x340Var5.g(c3oVar);
                    Object objT9 = x340Var5.T();
                    if (zG7 || objT9 == fkj0.X) {
                        objT9 = new sqm(iu30Var, c3oVar, (byte) 11);
                        x340Var5.s0(objT9);
                    }
                    qim0 qim0VarX = bin.x(qim0VarZ, false, null, null, null, (Function0) objT9, 15);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar8 = cbx.b(x340Var5).b;
                    c380 c380Var3 = (c380) obj10;
                    String str2 = (String) obj12;
                    String str3 = (String) obj9;
                    iu30 iu30Var3 = (iu30) obj8;
                    iu30 iu30Var4 = (iu30) obj5;
                    ezc ezcVar = (ezc) obj4;
                    a3o a3oVar = (a3o) obj7;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new g21(eraVar, (byte) 29)), een.N0, x340Var5, 48);
                    int iHashCode2 = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM2 = x340Var5.m();
                    qim0 qim0VarE2 = zr7.E(x340Var5, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var5.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var5.m0();
                    if (x340Var5.S) {
                        x340Var5.l(function1);
                    } else {
                        x340Var5.v0();
                    }
                    nko1.H(jw31VarA, x340Var5, y580.O0);
                    nko1.H(xos0VarM2, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    nko1.H(qim0VarE2, x340Var5, y580.Y);
                    if (c380Var3.isEmpty()) {
                        x340Var5.i0(-1344420387);
                        x340Var5.r(false);
                    } else {
                        x340Var5.i0(-1344464593);
                        hso1.i(c380Var3, null, x340Var5, 0);
                        x340Var5.r(false);
                    }
                    pro1.d(str2, str3, iu30Var3, iu30Var4, ezcVar, null, a3oVar, x340Var5, 0);
                    x340Var5.r(true);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                qim0 qim0VarW = uyn1.w(u291.d((qim0) obj6, 1.0f), (vzq0) obj);
                ven0 ven0Var4 = (ven0) obj5;
                x340 x340Var6 = (b0k) obj2;
                ven0 ven0Var5 = (ven0) obj4;
                boolean zI2 = x340Var6.i(ven0Var4) | x340Var6.g(iu30Var) | x340Var6.g((iu30) obj11) | x340Var6.g((Function0) obj10) | x340Var6.i(ven0Var5) | x340Var6.g((iu30) obj12) | x340Var6.g((iu30) obj9) | x340Var6.g((iu30) obj8) | x340Var6.g((iu30) obj7);
                iu30 iu30Var5 = (iu30) obj11;
                Function0 function2 = (Function0) obj10;
                iu30 iu30Var6 = (iu30) obj12;
                iu30 iu30Var7 = (iu30) obj9;
                iu30 iu30Var8 = (iu30) obj8;
                iu30 iu30Var9 = (iu30) obj7;
                Object objT10 = x340Var6.T();
                if (zI2 || objT10 == fkj0.X) {
                    objT10 = new eya1(this.b, iu30Var5, function2, iu30Var6, ven0Var4, ven0Var5, iu30Var7, iu30Var8, iu30Var9);
                    x340Var6.s0(objT10);
                }
                dm5.a((iu30) objT10, qim0VarW, (iu30) null, x340Var6, 0, 4);
                return rih1Var;
            default:
                vzq0 vzq0Var = (vzq0) obj;
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13), (es41) obj6, apo.r(1394976247, new o06(vzq0Var, (zci1) obj11, (lz20) obj10, (y7e1) obj12, (az20) obj9, (k6a1) obj8, (DatePickerDialog) obj5, (y7e1) obj4, (y7e1) obj7, this.b, (byte) 6), b0kVar), b0kVar, 384, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkn(qim0 qim0Var, iu30 iu30Var, c3o c3oVar, c380 c380Var, String str, String str2, iu30 iu30Var2, iu30 iu30Var3, ezc ezcVar, a3o a3oVar) {
        super(3);
        this.c = qim0Var;
        this.b = iu30Var;
        this.d = c3oVar;
        this.e = c380Var;
        this.f = str;
        this.g = str2;
        this.h = iu30Var2;
        this.i = iu30Var3;
        this.t = ezcVar;
        this.X = a3oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkn(qim0 qim0Var, ven0 ven0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, ven0 ven0Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, iu30 iu30Var6) {
        super(3);
        this.c = qim0Var;
        this.i = ven0Var;
        this.b = iu30Var;
        this.d = iu30Var2;
        this.e = function0;
        this.t = ven0Var2;
        this.f = iu30Var3;
        this.g = iu30Var4;
        this.h = iu30Var5;
        this.X = iu30Var6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkn(es41 es41Var, zci1 zci1Var, lz20 lz20Var, y7e1 y7e1Var, az20 az20Var, k6a1 k6a1Var, DatePickerDialog datePickerDialog, y7e1 y7e1Var2, y7e1 y7e1Var3, iu30 iu30Var) {
        super(3);
        this.c = es41Var;
        this.d = zci1Var;
        this.e = lz20Var;
        this.f = y7e1Var;
        this.g = az20Var;
        this.h = k6a1Var;
        this.i = datePickerDialog;
        this.t = y7e1Var2;
        this.X = y7e1Var3;
        this.b = iu30Var;
    }
}
