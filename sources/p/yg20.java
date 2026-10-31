package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yg20 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg20(int i, byte b) {
        super(2);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = 2;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                b2p1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                b2p1.m((b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                v9p1.p((b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                si1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                j82.n((b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                j82.r((b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                y540 y540Var = (y540) obj;
                String str = y540Var.a;
                String str2 = y540Var.b;
                hoj0 hoj0VarC = ((ioj0) obj2).c(xkk1.class, str);
                if (hoj0VarC == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                goj0 goj0VarA = hoj0VarC.a();
                goj0VarA.getClass();
                up70 up70VarA = ((ez00) goj0VarA.a).a.a(vp70.c);
                String str3 = up70VarA != null ? up70VarA.a.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                return new b640(str, str2, str3);
            case 7:
                ((Number) obj2).intValue();
                d1u.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                d1u.n((b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                d1u.q((b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                dsa0.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                cgj1.q((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                j9k1.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                j9k1.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                j9k1.k((b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                il50 il50Var = (il50) obj;
                kl50 kl50Var = (nl50) obj2;
                ArrayList arrayList = il50Var.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((el50) it.next()).a);
                }
                Set setP1 = o7h.p1(arrayList2);
                if (kl50Var instanceof ll50) {
                    return zo10.g(kl50Var, il50Var);
                }
                if (kl50Var instanceof ml50) {
                    ml50 ml50Var = (ml50) kl50Var;
                    List list = ml50Var.c;
                    return !o7h.p1(list).equals(setP1) ? zo10.g(kl50Var, il50Var) : Next.h(new ml50(il50Var.a, list, ml50Var.b));
                }
                if (!(kl50Var instanceof kl50)) {
                    eg.o();
                    return null;
                }
                kl50 kl50Var2 = kl50Var;
                List<jl50> list2 = kl50Var2.c;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((jl50) it2.next()).a);
                }
                if (!o7h.p1(arrayList3).equals(setP1)) {
                    return zo10.g(kl50Var, il50Var);
                }
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((el50) obj3).a, obj3);
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                for (jl50 jl50Var : list2) {
                    arrayList4.add(new jl50(jl50Var.a, jl50Var.b, jl50Var.c, jl50Var.d, ((el50) sqg0.G(jl50Var.a, linkedHashMap)).b));
                }
                mmr0 mmr0VarQ = lm5.q(kl50Var, kl50.a(kl50Var2, il50Var.a, arrayList4, (String) null, (String) null, 26));
                return Next.i((nl50) mmr0VarQ.a, (Set) mmr0VarQ.b);
            case 16:
                il50 il50Var2 = (il50) obj;
                return First.c(zo10.f(il50Var2), Collections.singleton(new nbw(il50Var2.c)));
            case 17:
                ((Number) obj2).intValue();
                nyn1.m((b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gra graVar = een.h;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarR = u291.r(nim0Var, 24.0f);
                    long j = u7h.f;
                    cr31 cr31Var = er31.a;
                    qim0 qim0VarF = dug.f(qim0VarR, j, cr31Var);
                    float f = yy51.c;
                    long j2 = u7h.b;
                    qim0 qim0VarE = d1u.E(f, u7h.b(j2, 0.2f, 0.0f, 0.0f, 0.0f, 14), qim0VarF, cr31Var);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarE);
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
                    nko1.H(qim0VarE2, x340Var2, y580.Y);
                    w0h1.a(fux.c, isl.a, u291.r(nim0Var, 12.0f), j2, 0L, false, x340Var2, fux.d | 48, 48);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 19:
                ue60 ue60Var = (ue60) obj;
                List list3 = (List) obj2;
                c380 c380Var = ue60Var.c;
                hvl1 hvl1Var = ue60Var.b;
                String str4 = ue60Var.a;
                List list4 = list3;
                ArrayList<mmr0> arrayListV1 = o7h.v1(c380Var, list4);
                ArrayList arrayList5 = new ArrayList();
                for (mmr0 mmr0Var : arrayListV1) {
                    String str5 = (String) mmr0Var.a;
                    i1r i1rVar = (k1r) mmr0Var.b;
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    mmr0 mmr0Var2 = i1rVar2 != null ? new mmr0(str5, i1rVar2.a) : null;
                    if (mmr0Var2 != null) {
                        arrayList5.add(mmr0Var2);
                    }
                }
                if (arrayList5.isEmpty()) {
                    if (list3.size() >= c380Var.size()) {
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                if (((k1r) it3.next()) instanceof j1r) {
                                }
                            }
                        }
                        return new xe60(str4, hvl1Var);
                    }
                    return new we60(str4, hvl1Var, c380Var.size());
                }
                Iterator it4 = arrayList5.iterator();
                if (!it4.hasNext()) {
                    hhg1.k();
                    return null;
                }
                Integer numValueOf = Integer.valueOf(se60.a((qe60) ((mmr0) it4.next()).b).a());
                while (it4.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(se60.a((qe60) ((mmr0) it4.next()).b).a());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(new te60((String) ((mmr0) it5.next()).a, ue60Var.d, num));
                }
                return new ve60(str4, hvl1Var, mqo1.A(arrayList6));
            case 20:
                ((Number) obj2).intValue();
                u0p1.d((b0k) obj, 1);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                o4p1.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                String strContextUri = ((PlayerState) obj2).contextUri();
                if (strContextUri.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || strContextUri.equals("spotify:collection:tracks") || strContextUri.equals("spotify:internal:collection:tracks") || (nhc1.Y(strContextUri, "spotify:user:", false) && nhc1.R(strContextUri, ":collection", false))) {
                    i = 1;
                }
                return new yb80(i);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                k1u.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                k1u.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                qxd0.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                qxd0.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                acq0.u((b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                hqq0.o((b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                hqq0.y((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg20(Object obj, byte b) {
        super(2);
        this.a = b;
    }
}
