package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ugr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugr0(ven0 ven0Var, xhl xhlVar, su suVar, String str, String str2, u7h u7hVar, long j, boolean z, String str3) {
        super(2);
        this.d = ven0Var;
        this.e = xhlVar;
        this.f = suVar;
        this.g = str;
        this.h = str2;
        this.i = u7hVar;
        this.b = j;
        this.c = z;
        this.t = str3;
    }

    public final Object invoke(Object obj, Object obj2) {
        float fFloatValue;
        int iI0;
        ArrayList arrayList;
        x340 x340Var;
        m4c m4cVar;
        byte b = this.a;
        su suVar = this.f;
        boolean z = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.d;
        Object obj6 = this.e;
        Object obj7 = this.t;
        Object obj8 = this.i;
        switch (b) {
            case 0:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                ngr0 ngr0Var = (ngr0) obj5;
                boolean z2 = ngr0Var instanceof lgr0;
                Integer numValueOf = null;
                if (z2) {
                    fFloatValue = 0.0f;
                } else {
                    if (!(ngr0Var instanceof mgr0)) {
                        eg.o();
                        return null;
                    }
                    fFloatValue = 1.0f - ((Number) ((Function0) obj6).invoke()).floatValue();
                }
                int iU = jch0.U(tlc1Var.X0(8.0f) * fFloatValue);
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P(zgr0.a, new j2i(1226718487, new tse0(suVar, (byte) 18), true)))).H(hjl.b(j, 0, 0, 0, 0, 10));
                if (z2) {
                    iI0 = 0;
                } else {
                    if (!(ngr0Var instanceof mgr0)) {
                        eg.o();
                        return null;
                    }
                    iI0 = tlc1Var.i0(8.0f);
                }
                int i = (hjl.i(j) - q5t0VarH.a) - (iI0 * 2);
                int i2 = i < 0 ? 0 : i;
                List listP = tlc1Var.P(zgr0.c, new j2i(-634247304, new k7f((byte) 26, (vu30) obj4, false), true));
                ArrayList arrayList2 = new ArrayList(q7h.U(listP, 10));
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    q5t0 q5t0VarH2 = ((afh0) it.next()).H(jjl.a(0, i2, 0, hjl.h(j)));
                    i2 -= q5t0VarH2.a;
                    arrayList2.add(q5t0VarH2);
                    obj7 = obj7;
                }
                Object obj9 = obj7;
                if (fFloatValue > 0.0f) {
                    ArrayList arrayListN0 = o7h.N0(arrayList2, Collections.singletonList(q5t0VarH));
                    List listP2 = tlc1Var.P(zgr0.d, new j2i(220669616, new qi6(arrayListN0, this.b, (qim0) obj8, (byte) 12), true));
                    arrayList = new ArrayList(q7h.U(listP2, 10));
                    int i3 = 0;
                    for (Object obj10 : listP2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        afh0 afh0Var = (afh0) obj10;
                        int i5 = ((q5t0) arrayListN0.get(i3)).a;
                        int i6 = ((q5t0) arrayListN0.get(i3)).b;
                        if (!((i6 >= 0) & (i5 >= 0))) {
                            sf80.a("width and height must be >= 0");
                        }
                        arrayList.add(afh0Var.H(jjl.h(i5, i5, i6, i6)));
                        i3 = i4;
                    }
                } else {
                    arrayList = z6x.a;
                }
                Iterator it2 = arrayList2.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    i7 += ((q5t0) it2.next()).a;
                }
                int i8 = z ? i7 - q5t0VarH.a : 0;
                int iAbs = (iU * 2) + Math.abs(i8) + q5t0VarH.a + i7;
                afh0 afh0Var2 = (afh0) o7h.q0(tlc1Var.P(zgr0.b, new j2i(-1248664718, new jxj0((qim0) obj9, (vu30) obj3), true)));
                int iK = hjl.k(j) - iAbs;
                int i9 = iK < 0 ? 0 : iK;
                int i10 = hjl.i(j) - iAbs;
                q5t0 q5t0VarH3 = afh0Var2.H(hjl.b(j, i9, i10 < 0 ? 0 : i10, 0, 0, 12));
                int i11 = q5t0VarH.b;
                int i12 = q5t0VarH3.b;
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    numValueOf = Integer.valueOf(((q5t0) it3.next()).b);
                    while (it3.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((q5t0) it3.next()).b);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                }
                int iMax = Math.max(i11, Math.max(i12, numValueOf != null ? numValueOf.intValue() : 0));
                return tlc1Var.S(hjl.i(j), iMax, b7x.a, new tgr0(arrayList, iU, q5t0VarH, i8, q5t0VarH3, arrayList2, iMax));
            default:
                String str = (String) obj7;
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                xhl xhlVar = (xhl) obj6;
                m4c m4cVar2 = fkj0.X;
                int i13 = iIntValue & 11;
                rih1 rih1Var = rih1.a;
                if (i13 == 2) {
                    x340 x340Var3 = x340Var2;
                    if (x340Var3.H()) {
                        x340Var3.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj5).setValue(rih1Var);
                int i14 = ((uhl) xhlVar).b;
                xhlVar.m();
                x340 x340Var4 = x340Var2;
                x340Var4.i0(-1632722225);
                xhl xhlVar2 = (xhl) xhlVar.l().b;
                ihl ihlVarK = xhlVar2.k();
                ihl ihlVarK2 = xhlVar2.k();
                ihl ihlVarK3 = xhlVar2.k();
                ihl ihlVarK4 = xhlVar2.k();
                ihl ihlVarK5 = xhlVar2.k();
                ihl ihlVarK6 = xhlVar2.k();
                ihl ihlVarK7 = xhlVar2.k();
                ihl ihlVarK8 = xhlVar2.k();
                boolean zI = x340Var4.i(ihlVarK3) | x340Var4.i(ihlVarK7);
                Object objT = x340Var4.T();
                if (zI || objT == m4cVar2) {
                    objT = new jih(ihlVarK3, ihlVarK7, (byte) 6);
                    x340Var4.s0(objT);
                }
                nim0 nim0Var = nim0.a;
                lcc.b(xhl.j(nim0Var, ihlVarK6, (iu30) objT), x340Var4, 0);
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                boolean zI2 = x340Var4.i(ihlVarK6) | x340Var4.i(ihlVarK);
                Object objT2 = x340Var4.T();
                if (zI2 || objT2 == m4cVar2) {
                    objT2 = new jih(ihlVarK6, ihlVarK, (byte) 7);
                    x340Var4.s0(objT2);
                }
                lcc.l(0, str2, str3, x340Var4, xhl.j(nim0Var, ihlVarK7, (iu30) objT2));
                u7h u7hVar = (u7h) obj8;
                boolean zD = x340Var4.d(8.0f);
                Object objT3 = x340Var4.T();
                if (zD || objT3 == m4cVar2) {
                    objT3 = new yvf1(1, (byte) 14);
                    x340Var4.s0(objT3);
                }
                lcc.a(u7hVar, this.b, xhl.j(nim0Var, ihlVarK5, (iu30) objT3), x340Var4, 0);
                boolean zI3 = x340Var4.i(ihlVarK5);
                Object objT4 = x340Var4.T();
                if (zI3 || objT4 == m4cVar2) {
                    objT4 = new nij1(ihlVarK5, (byte) 1);
                    x340Var4.s0(objT4);
                }
                lcc.n(xhl.j(nim0Var, ihlVarK4, (iu30) objT4), x340Var4, 0);
                u7h u7hVar2 = (u7h) obj8;
                boolean zI4 = x340Var4.i(ihlVarK5) | x340Var4.d(16.0f);
                Object objT5 = x340Var4.T();
                if (zI4 || objT5 == m4cVar2) {
                    objT5 = new nij1(ihlVarK5, (byte) 2);
                    x340Var4.s0(objT5);
                }
                lcc.m(u7hVar2, this.b, xhl.j(nim0Var, ihlVarK3, (iu30) objT5), x340Var4, 0);
                boolean zI5 = x340Var4.i(ihlVarK3);
                Object objT6 = x340Var4.T();
                if (zI5 || objT6 == m4cVar2) {
                    objT6 = new nij1(ihlVarK3, (byte) 3);
                    x340Var4.s0(objT6);
                }
                lcc.f(xhl.j(nim0Var, ihlVarK2, (iu30) objT6), x340Var4, 0);
                if (z) {
                    x340Var4.i0(-1630989388);
                    u7h u7hVar3 = (u7h) obj8;
                    boolean zI6 = x340Var4.i(ihlVarK3) | x340Var4.d(16.0f);
                    Object objT7 = x340Var4.T();
                    if (zI6 || objT7 == m4cVar2) {
                        objT7 = new nij1(ihlVarK3, (byte) 4);
                        x340Var4.s0(objT7);
                    }
                    m4cVar = m4cVar2;
                    lcc.h(u7hVar3, str, this.b, xhl.j(nim0Var, ihlVarK, (iu30) objT7), x340Var4, 0);
                    x340Var = x340Var4;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var4;
                    m4cVar = m4cVar2;
                    x340Var.i0(-1630625727);
                    boolean zI7 = x340Var.i(ihlVarK3) | x340Var.d(16.0f);
                    Object objT8 = x340Var.T();
                    if (zI7 || objT8 == m4cVar) {
                        objT8 = new nij1(ihlVarK3, (byte) 5);
                        x340Var.s0(objT8);
                    }
                    lcc.g((u7h) obj8, str, this.b, xhl.j(nim0Var, ihlVarK, (iu30) objT8), x340Var, 0);
                    x340Var.r(false);
                }
                boolean zI8 = x340Var.i(ihlVarK);
                Object objT9 = x340Var.T();
                if (zI8 || objT9 == m4cVar) {
                    objT9 = new nij1(ihlVarK, (byte) 6);
                    x340Var.s0(objT9);
                }
                lcc.p(xhl.j(nim0Var, ihlVarK8, (iu30) objT9), x340Var, 0);
                x340Var.r(false);
                if (((uhl) xhlVar).b == i14) {
                    return rih1Var;
                }
                qxd0.S(suVar, x340Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugr0(ngr0 ngr0Var, Function0 function0, boolean z, Function0 function1, vu30 vu30Var, long j, qim0 qim0Var, qim0 qim0Var2, vu30 vu30Var2) {
        super(2);
        this.d = ngr0Var;
        this.e = function0;
        this.c = z;
        this.f = function1;
        this.g = vu30Var;
        this.b = j;
        this.i = qim0Var;
        this.t = qim0Var2;
        this.h = vu30Var2;
    }
}
