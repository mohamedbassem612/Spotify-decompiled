package p;

import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ri1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri1(ni7 ni7Var, wat watVar, ven0 ven0Var, iu30 iu30Var, String str, String str2, String str3, String str4) {
        super(3);
        this.a = (byte) 2;
        this.d = ni7Var;
        this.f = watVar;
        this.b = ven0Var;
        this.e = iu30Var;
        this.g = str;
        this.h = str2;
        this.c = str3;
        this.i = str4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        float f;
        vzq0 vzq0VarH;
        boolean z;
        hax haxVar;
        hax haxVar2;
        nse nseVar;
        float f2;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.i;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.h;
        Object obj10 = this.b;
        Object obj11 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                gv51 gv51Var = (gv51) obj9;
                nbh nbhVar = (nbh) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj4;
                iu30 iu30Var = (iu30) obj7;
                m4c m4cVar = fkj0.X;
                gj1 gj1Var = (gj1) obj8;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(nbhVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Map map = gj1Var.h;
                    c380 c380VarA = mqo1.A(map.values());
                    if (c380VarA.isEmpty()) {
                        x340Var2.i0(-1742174567);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1742801139);
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        d36 d36Var = new d36(8.0f, true, new um5(false));
                        boolean zI = x340Var2.i(c380VarA) | x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            objT = new li1((byte) 0, iu30Var, c380VarA);
                            x340Var2.s0(objT);
                        }
                        ujo1.e(qim0VarY, null, null, d36Var, null, null, false, null, (iu30) objT, x340Var2, 0, 494);
                        x340Var2.r(false);
                    }
                    boolean zG = x340Var2.g((String) ven0Var.getValue());
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        List list = gj1Var.i;
                        ArrayList arrayList = new ArrayList();
                        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                            Object next = it.next();
                            h6q0 h6q0Var = (j6q0) next;
                            if (h6q0Var instanceof h6q0 ? ihc1.h0(h6q0Var.a.b, (String) ven0Var.getValue(), true) : false) {
                                arrayList.add(next);
                            }
                        }
                        objT2 = v8r.q(arrayList);
                        x340Var2.s0(objT2);
                    }
                    ven0 ven0Var2 = (ven0) objT2;
                    if (((List) ven0Var2.getValue()).isEmpty()) {
                        x340Var2.i0(-1741730368);
                        zko1.d(54, 0, apo.r(370791053, new q1((fm50) obj5, gj1Var, ven0Var, (byte) 16), x340Var2), x340Var2, anm1.N("group-invite-link-default-element", nim0Var));
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1740974929);
                        boolean zG2 = x340Var2.g((List) ven0Var2.getValue());
                        Object objT3 = x340Var2.T();
                        if (zG2 || objT3 == m4cVar) {
                            List list2 = (List) ven0Var2.getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj12 : list2) {
                                if (obj12 instanceof b6q0) {
                                    arrayList2.add(obj12);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj13 : arrayList2) {
                                if (((b6q0) obj13).g() != 3) {
                                    arrayList3.add(obj13);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj14 : arrayList3) {
                                if (((b6q0) obj14).g() == 1) {
                                    arrayList4.add(obj14);
                                } else {
                                    arrayList5.add(obj14);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj15 : arrayList4) {
                                if (obj15 instanceof h6q0) {
                                    arrayList6.add(obj15);
                                }
                            }
                            c380 c380VarA2 = mqo1.A(arrayList6);
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj16 : arrayList5) {
                                if (obj16 instanceof h6q0) {
                                    arrayList7.add(obj16);
                                }
                            }
                            mmr0 mmr0Var = new mmr0(c380VarA2, mqo1.A(arrayList7));
                            x340Var2.s0(mmr0Var);
                            objT3 = mmr0Var;
                        }
                        mmr0 mmr0Var2 = (mmr0) objT3;
                        c380 c380Var = (c380) mmr0Var2.a;
                        c380 c380Var2 = (c380) mmr0Var2.b;
                        if (((List) ven0Var2.getValue()).isEmpty()) {
                            x340Var2.i0(-1740549392);
                            WeakHashMap weakHashMap = osl1.x;
                            vzq0 vzq0VarC = hqq0.C(lhc.g(x340Var2).g, x340Var2);
                            x340Var2.r(false);
                            vzq0VarH = vzq0VarC;
                            f = 0.0f;
                        } else {
                            x340Var2.i0(-1740472016);
                            x340Var2.r(false);
                            f = 0.0f;
                            vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                        }
                        qim0 qim0VarA = nbhVar.a(1.0f, bmq0.L(nim0Var, (d6o0) obj6, (g6o0) null), true);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar4 = cbx.b(x340Var2).b;
                        hdh hdhVarN = lnn1.n(uyn1.j(f, 8.0f, f, f, 13), vzq0VarH);
                        boolean zI2 = x340Var2.i((v361) obj11) | x340Var2.i(gj1Var) | x340Var2.i(c380Var) | x340Var2.i(gv51Var) | x340Var2.g(iu30Var) | x340Var2.i(c380Var2) | ((iIntValue & 14) == 4) | x340Var2.g((ven0) obj10);
                        v361 v361Var = (v361) obj11;
                        ven0 ven0Var3 = (ven0) obj10;
                        Object objT4 = x340Var2.T();
                        if (zI2 || objT4 == m4cVar) {
                            objT4 = new qi1(c380Var, c380Var2, v361Var, gj1Var, gv51Var, iu30Var, nbhVar, ven0Var3, (byte) 0);
                            x340Var2.s0(objT4);
                        }
                        ujo1.d(qim0VarA, null, hdhVarN, false, null, null, null, false, null, (iu30) objT4, x340Var2, 0, 506);
                        if (((List) ven0Var2.getValue()).isEmpty()) {
                            z = false;
                            x340Var2.i0(-1733746535);
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(-1735241851);
                            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                            WeakHashMap weakHashMap2 = osl1.x;
                            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarF2);
                            gfh0 gfh0VarC = t1c.c(een.d, false);
                            int iHashCode = Long.hashCode(x340Var2.T);
                            xos0 xos0VarM = x340Var2.m();
                            qim0 qim0VarE = zr7.E(x340Var2, qim0VarP);
                            hzj.A.getClass();
                            if (x340Var2.a == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var2.m0();
                            if (x340Var2.S) {
                                x340Var2.l(n4kVar);
                            } else {
                                x340Var2.v0();
                            }
                            nko1.H(gfh0VarC, x340Var2, y580.O0);
                            nko1.H(xos0VarM, x340Var2, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                            nko1.F(x340Var2);
                            nko1.H(qim0VarE, x340Var2, y580.Y);
                            boolean zG3 = x340Var2.g(iu30Var);
                            Object objT5 = x340Var2.T();
                            if (zG3 || objT5 == m4cVar) {
                                objT5 = new cr0(iu30Var, (byte) 14);
                                x340Var2.s0(objT5);
                            }
                            gbx gbxVar = new gbx(z50.c, (Function0) objT5);
                            idx idxVar = new idx(4);
                            gdx gdxVarR = yla.r(x340Var2);
                            int i = gj1Var.e;
                            if (map.isEmpty()) {
                                x340Var2.i0(-1703507878);
                                haxVar2 = new hax(cwl1.o0(x340Var2, 2131953750));
                                x340Var2.r(false);
                            } else {
                                if (map.size() + gj1Var.f <= i) {
                                    x340Var2.i0(-1703489671);
                                    x340Var2.r(false);
                                    haxVar2 = jax.a;
                                } else {
                                    x340Var2.i0(-1703499329);
                                    hax haxVar3 = new hax(cwl1.U(2131820614, i, new Object[]{Integer.valueOf(i)}, x340Var2));
                                    x340Var2.r(false);
                                    haxVar = haxVar3;
                                }
                                qim0 qim0VarA2 = h2c.a.a(nim0Var, een.h);
                                cvx cvxVar5 = cbx.b(x340Var2).b;
                                foo1.c(gbxVar, idxVar, uyn1.z(0.0f, 8.0f, 1, qim0VarA2), haxVar, gdxVarR, null, null, null, null, null, m4i.c, x340Var2, 0, 48, 1992);
                                x340Var2.r(true);
                                z = false;
                                x340Var2.r(false);
                            }
                            haxVar = haxVar2;
                            qim0 qim0VarA3 = h2c.a.a(nim0Var, een.h);
                            cvx cvxVar6 = cbx.b(x340Var2).b;
                            foo1.c(gbxVar, idxVar, uyn1.z(0.0f, 8.0f, 1, qim0VarA3), haxVar, gdxVarR, null, null, null, null, null, m4i.c, x340Var2, 0, 48, 1992);
                            x340Var2.r(true);
                            z = false;
                            x340Var2.r(false);
                        }
                        x340Var2.r(z);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                rcx rcxVar = (rcx) obj;
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                View view = (View) x340Var3.k(AndroidCompositionLocals_androidKt.f);
                ven0 ven0Var4 = (ven0) obj10;
                mmr0 mmr0Var3 = (mmr0) ven0Var4.getValue();
                nse nseVar2 = (nse) obj8;
                uhd1 uhd1Var = (uhd1) obj7;
                boolean zI3 = x340Var3.i(ven0Var4) | x340Var3.i(nseVar2) | x340Var3.i(view) | x340Var3.i(uhd1Var);
                ven0 ven0Var5 = (ven0) obj10;
                Object objT6 = x340Var3.T();
                if (zI3 || objT6 == fkj0.X) {
                    objT6 = new kse(ven0Var5, nseVar2, view, uhd1Var, null);
                    nseVar = nseVar2;
                    x340Var3.s0(objT6);
                } else {
                    nseVar = nseVar2;
                }
                qxd0.t(mmr0Var3, x340Var3, (vu30) objT6);
                qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                p3v p3vVar = rcxVar.a;
                qim0 qim0VarW = uyn1.w(qim0VarZ, uyn1.j(0.0f, 0.0f, 0.0f, p3vVar != null ? p3vVar.a : 0.0f, 7));
                c380 c380Var3 = (c380) obj6;
                c380 c380Var4 = (c380) obj11;
                qse qseVar = (qse) obj9;
                tbr0 tbr0Var = (tbr0) obj5;
                ven0 ven0Var6 = (ven0) obj4;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarW);
                hzj.A.getClass();
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC2, x340Var3, y580.O0);
                nko1.H(xos0VarM2, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE2, x340Var3, y580.Y);
                myo1.l(uhd1Var, u291.d(nim0Var, 1.0f), apo.r(-645732936, new mse(c380Var3, c380Var4, qseVar, nseVar, tbr0Var, ven0Var6, (byte) 0), x340Var3), x340Var3, 384);
                x340Var3.r(true);
                return rih1Var;
            case 2:
                ni7 ni7Var = (ni7) obj8;
                i2c i2cVar = (i2c) obj;
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                wat watVar = (wat) obj6;
                ven0 ven0Var7 = (ven0) obj10;
                long j = i2cVar.b;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var4.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    long jI = ni7Var.i();
                    float f3 = ((p3v) ven0Var7.getValue()).a;
                    x340Var5.i0(1695697591);
                    if (jI != 9205357640488583168L) {
                        int i2 = (int) (jI & 4294967295L);
                        float f4 = zjy.p(0.0f, new p3v((i2cVar.c() - ((watVar.N0(Float.intBitsToFloat(i2) * Math.min(hjl.i(j) / Float.intBitsToFloat((int) (jI >> 32)), hjl.h(j) / Float.intBitsToFloat(i2))) + 8.0f) + f3)) / 2.0f)).a;
                        x340Var5.r(false);
                        f2 = f4;
                    } else {
                        x340Var5.r(false);
                        f2 = 0.0f;
                    }
                    qim0 qim0VarB = uyn1.B(u291.d(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, f2, 7);
                    iu30 iu30Var2 = (iu30) obj7;
                    String str = (String) obj11;
                    String str2 = (String) obj9;
                    String str3 = (String) obj4;
                    String str4 = (String) obj5;
                    mbh mbhVarA = jbh.a(h36.d, een.P0, x340Var5, 6);
                    int iHashCode3 = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM3 = x340Var5.m();
                    qim0 qim0VarE3 = zr7.E(x340Var5, qim0VarB);
                    hzj.A.getClass();
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
                    nko1.H(mbhVarA, x340Var5, y580.O0);
                    nko1.H(xos0VarM3, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    qim0 qim0VarN = anm1.N("image", u291.f(kk0.q(x340Var5, qim0VarE3, y580.Y, 1.0f, true), 1.0f));
                    boolean zG4 = x340Var5.g(iu30Var2);
                    Object objT7 = x340Var5.T();
                    if (zG4 || objT7 == m4cVar2) {
                        objT7 = new jzk(iu30Var2, (byte) 5);
                        x340Var5.s0(objT7);
                    }
                    eso1.h(ni7Var, new jsl(str), bin.x(qim0VarN, false, null, null, null, (Function0) objT7, 15), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, een.X, (ColorFilter) null, x340Var5, 14380032, 256);
                    u710 u710Var = (u710) x340Var5.k(pxl.e);
                    qim0 qim0VarN2 = anm1.N("external-link", uyn1.B(u291.f(nim0Var, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f, 8));
                    boolean zG5 = x340Var5.g(watVar);
                    Object objT8 = x340Var5.T();
                    if (zG5 || objT8 == m4cVar2) {
                        objT8 = new kxl(watVar, ven0Var7, (byte) 0);
                        x340Var5.s0(objT8);
                    }
                    otw.c(u710Var, new t710(str2, 16, str3, null, false, str4), lrn1.u(qim0VarN2, (iu30) objT8), (ipb1) null, x340Var5, 0, 8);
                    x340Var5.r(true);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                hrr0 hrr0Var = (hrr0) obj8;
                x340 x340Var6 = (b0k) obj2;
                kp5 kp5Var = (kp5) obj7;
                Function0 function0 = (Function0) obj6;
                boolean zI4 = x340Var6.i(hrr0Var) | x340Var6.i(kp5Var) | x340Var6.g(function0);
                Object objT9 = x340Var6.T();
                if (zI4 || objT9 == fkj0.X) {
                    objT9 = new go30(kp5Var, function0, hrr0Var, (byte) 1);
                    x340Var6.s0(objT9);
                }
                Function0 function1 = (Function0) objT9;
                int iC = l1d.C(1);
                if (iC == 0) {
                    x340Var6.i0(366034659);
                    otw.c((hz5) kp5Var.d, new do30((String) obj11, (String) obj9, (String) obj10, (Integer) obj4, function1), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    x340Var6.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var6, 366032592, false);
                    }
                    x340Var6.i0(366051453);
                    otw.c((smp0) kp5Var.e, new omp0((String) obj5, (String) obj11, (String) obj9, ((dg30) kp5Var.c).getResources().getConfiguration().getLocales().get(0).getLanguage(), ((gdx0) kp5Var.g).a.n(), function1), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    x340Var6.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        super(3);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.b = obj6;
        this.c = obj7;
        this.i = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri1(ven0 ven0Var, nse nseVar, uhd1 uhd1Var, c380 c380Var, c380 c380Var2, qse qseVar, tbr0 tbr0Var, ven0 ven0Var2) {
        super(3);
        this.a = (byte) 1;
        this.b = ven0Var;
        this.d = nseVar;
        this.e = uhd1Var;
        this.f = c380Var;
        this.g = c380Var2;
        this.h = qseVar;
        this.i = tbr0Var;
        this.c = ven0Var2;
    }
}
