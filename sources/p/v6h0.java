package p;

import android.net.Uri;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class v6h0 implements Update {
    public static final v6h0 a = new v6h0();

    /* JADX WARN: Code duplicated, block: B:225:0x057b  */
    /* JADX WARN: Code duplicated, block: B:277:0x0699  */
    public final Next a(Object obj, Object obj2) {
        boolean z;
        int iNextIndex;
        boolean z2;
        String str;
        mmr0 mmr0Var;
        String str2;
        Iterator it;
        boolean zJ;
        int i;
        String str3;
        c380 c380VarA;
        h5h0 h5h0VarF;
        a6h0 a6h0Var = (a6h0) obj;
        e4h0 e4h0Var = (e4h0) obj2;
        se11 se11Var = u6h0.a;
        String str4 = a6h0Var.e;
        long j = a6h0Var.A;
        boolean z3 = a6h0Var.d;
        c380<h5h0> c380Var = a6h0Var.a;
        long j2 = a6h0Var.E;
        boolean z4 = a6h0Var.q;
        boolean z5 = a6h0Var.c;
        String str5 = a6h0Var.b;
        if (e4h0Var instanceof c2h0) {
            return ((c2h0) e4h0Var).b != j2 ? Next.j() : Next.h(u6h0.V(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -536879109)));
        }
        if (e4h0Var instanceof m2h0) {
            return Next.i(a6h0.a(a6h0Var, mqo1.A(o7h.O0(new b5h0("", true), c380Var)), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -8198), Collections.singleton(lzg0.a));
        }
        if (e4h0Var instanceof d2h0) {
            d2h0 d2h0Var = (d2h0) e4h0Var;
            if (d2h0Var.h != j2) {
                return Next.j();
            }
            return (z5 || str5 != null) ? u6h0.b(u6h0.W(a6h0Var), d2h0Var.a, d2h0Var.b, d2h0Var.c, d2h0Var.d, d2h0Var.e, d2h0Var.f, d2h0Var.g, 256) : Next.j();
        }
        if (e4h0Var instanceof d3h0) {
            return (z4 && z5) ? Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, ((d3h0) e4h0Var).a, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -8193)) : Next.j();
        }
        if (e4h0Var instanceof i2h0) {
            return u6h0.m(a6h0Var, (i2h0) e4h0Var);
        }
        if (e4h0Var.equals(s3h0.a)) {
            return u6h0.m(a6h0Var, new i2h0(j, y18.a));
        }
        if (e4h0Var instanceof h2h0) {
            if (a6h0Var.z) {
                h2h0 h2h0Var = (h2h0) e4h0Var;
                if (j == h2h0Var.a) {
                    return u6h0.b(a6h0.a(u6h0.W(a6h0Var), null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -167772161), h2h0Var.b, null, null, null, null, null, 0, 504);
                }
            }
            return Next.j();
        }
        if (e4h0Var instanceof b3h0) {
            b3h0 b3h0Var = (b3h0) e4h0Var;
            if (!z4) {
                return Next.j();
            }
            a6h0 a6h0VarA = a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -196609);
            String str6 = b3h0Var.a;
            qzg0 qzg0Var = new qzg0(str6);
            ls50 ls50Var = b3h0Var.b;
            return Next.i(a6h0VarA, dm61.B0(new k0h0[]{qzg0Var, ls50Var != null ? u6h0.R(str6, ls50Var) : null}));
        }
        int i2 = 0;
        boolean z6 = true;
        if (e4h0Var.equals(c3h0.a)) {
            return z4 ? Next.h(u6h0.V(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -73733))) : Next.j();
        }
        if (e4h0Var instanceof v2h0) {
            v2h0 v2h0Var = (v2h0) e4h0Var;
            if (v2h0Var.j != j2) {
                return Next.j();
            }
            if (!z5) {
                return Next.j();
            }
            String str7 = v2h0Var.a;
            String str8 = v2h0Var.c;
            a6h0 a6h0VarA2 = a6h0.a(a6h0Var, null, str7, false, false, str8 == null ? str4 : str8, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -536870931);
            Set setSingleton = Collections.singleton(new qzg0(v2h0Var.a));
            o7h0 o7h0Var = v2h0Var.b;
            return o7h0Var != null ? u6h0.a(a6h0VarA2, o7h0Var, v2h0Var.d, v2h0Var.e, v2h0Var.f, v2h0Var.g, v2h0Var.h, v2h0Var.i, setSingleton) : Next.i(a6h0.a(a6h0VarA2, null, null, true, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -5), setSingleton);
        }
        if (!(e4h0Var instanceof x2h0)) {
            boolean z7 = true;
            if (e4h0Var instanceof b4h0) {
                String str9 = a6h0Var.b;
                c380 c380Var2 = a6h0Var.a;
                if (!u890.j(str9, (Object) null) || a6h0Var.d || a6h0Var.c) {
                    return Next.j();
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : c380Var2) {
                    if (u6h0.T((h5h0) obj3) == null) {
                        arrayList.add(obj3);
                    }
                }
                new ArrayList();
                throw null;
            }
            if (e4h0Var instanceof a4h0) {
                throw null;
            }
            boolean z8 = e4h0Var instanceof c4h0;
            Set setSingleton2 = w7x.a;
            if (z8) {
                return !u890.j(str5, (Object) null) ? Next.j() : Next.h(a6h0.a(a6h0Var, fg91.b, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, setSingleton2, 2147483624));
            }
            if (e4h0Var.equals(w2h0.a)) {
                mmr0 mmr0VarD = u6h0.d(a6h0Var);
                return Next.i((a6h0) mmr0VarD.a, (Set) mmr0VarD.b);
            }
            if (e4h0Var.equals(a3h0.a)) {
                return Next.h(a6h0.a(a6h0Var, null, null, false, !z3, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -9));
            }
            if (e4h0Var instanceof m3h0) {
                return u6h0.C(a6h0Var, (m3h0) e4h0Var);
            }
            if (e4h0Var instanceof y2h0) {
                y2h0 y2h0Var = (y2h0) e4h0Var;
                c380 c380Var3 = y2h0Var.b;
                String str10 = y2h0Var.a;
                if (c380Var3.isEmpty()) {
                    return Next.j();
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(c380Var, 10));
                for (h5h0 a5h0Var : c380Var) {
                    if (a5h0Var instanceof a5h0) {
                        a5h0 a5h0Var2 = (a5h0) a5h0Var;
                        c380<Object> c380Var4 = a5h0Var2.b;
                        ArrayList arrayList3 = new ArrayList(q7h.U(c380Var4, 10));
                        for (Object objA : c380Var4) {
                            if (objA instanceof qx01) {
                                qx01 qx01Var = (qx01) objA;
                                if (u890.j(qx01Var.a, str10)) {
                                    objA = qx01.a(qx01Var, c380Var3, false, false, 43);
                                }
                            }
                            arrayList3.add(objA);
                        }
                        a5h0Var = new a5h0(a5h0Var2.a, mqo1.A(arrayList3));
                    }
                    arrayList2.add(a5h0Var);
                }
                c380 c380VarA2 = mqo1.A(arrayList2);
                String str11 = y2h0Var.c;
                Map mapP = a6h0Var.f3p;
                if (str11 != null) {
                    mapP = sqg0.P(mapP, new mmr0(str10, str11));
                }
                return Next.h(a6h0.a(a6h0Var, c380VarA2, null, false, false, null, false, null, null, false, null, null, false, null, null, mapP, false, false, null, null, false, 0L, null, null, null, 0L, null, -32770));
            }
            if (e4h0Var instanceof z2h0) {
                z2h0 z2h0Var = (z2h0) e4h0Var;
                ArrayList arrayList4 = new ArrayList(q7h.U(c380Var, 10));
                for (h5h0 a5h0Var3 : c380Var) {
                    if (a5h0Var3 instanceof a5h0) {
                        a5h0 a5h0Var4 = (a5h0) a5h0Var3;
                        c380<Object> c380Var5 = a5h0Var4.b;
                        ArrayList arrayList5 = new ArrayList(q7h.U(c380Var5, 10));
                        for (Object objA2 : c380Var5) {
                            if (objA2 instanceof qx01) {
                                qx01 qx01Var2 = (qx01) objA2;
                                if (u890.j(qx01Var2.a, z2h0Var.a)) {
                                    objA2 = qx01.a(qx01Var2, null, false, z7, 47);
                                }
                            }
                            arrayList5.add(objA2);
                            z7 = true;
                        }
                        a5h0Var3 = new a5h0(a5h0Var4.a, mqo1.A(arrayList5));
                    }
                    arrayList4.add(a5h0Var3);
                    z7 = true;
                }
                return Next.h(a6h0.a(a6h0Var, mqo1.A(arrayList4), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -2));
            }
            if (e4h0Var instanceof x3h0) {
                return u6h0.J(a6h0Var, (x3h0) e4h0Var);
            }
            if (e4h0Var instanceof w3h0) {
                w3h0 w3h0Var = (w3h0) e4h0Var;
                String str12 = w3h0Var.a;
                return Next.i(a6h0Var, Collections.singleton(new xzg0(str12, w3h0Var.b, u6h0.e(a6h0Var, str12, w3h0Var.b), null, a6h0Var.b, w3h0Var.c, null, null, w3h0Var.d, 0, 712)));
            }
            if (e4h0Var instanceof g3h0) {
                return Next.i(a6h0Var, Collections.singleton(new tzg0(((g3h0) e4h0Var).a, null, true)));
            }
            if (e4h0Var instanceof j2h0) {
                return u6h0.n(a6h0Var, (j2h0) e4h0Var);
            }
            if (e4h0Var instanceof u3h0) {
                u3h0 u3h0Var = (u3h0) e4h0Var;
                return u6h0.C(a6h0Var, new m3h0(u3h0Var.a, u3h0Var.b));
            }
            if (e4h0Var instanceof v3h0) {
                return u6h0.I(a6h0Var, (v3h0) e4h0Var);
            }
            if (e4h0Var instanceof e3h0) {
                return u6h0.w(a6h0Var, (e3h0) e4h0Var);
            }
            if (e4h0Var instanceof f3h0) {
                f3h0 f3h0Var = (f3h0) e4h0Var;
                return u6h0.C(a6h0Var, new m3h0(f3h0Var.a, f3h0Var.b));
            }
            if (e4h0Var instanceof p3h0) {
                return u6h0.F(a6h0Var, (p3h0) e4h0Var);
            }
            if (e4h0Var instanceof o3h0) {
                return u6h0.E(a6h0Var, (o3h0) e4h0Var);
            }
            if (e4h0Var instanceof e2h0) {
                return u6h0.k(a6h0Var, (e2h0) e4h0Var);
            }
            if (e4h0Var instanceof f2h0) {
                return u6h0.i(a6h0Var, ((f2h0) e4h0Var).a, i28.b) ? Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, i28.c, null, null, 0L, null, -134217729)) : Next.j();
            }
            if (e4h0Var instanceof g2h0) {
                return u6h0.l(a6h0Var, (g2h0) e4h0Var);
            }
            if (e4h0Var.equals(n3h0.a)) {
                return u6h0.D(a6h0Var);
            }
            if (e4h0Var.equals(h3h0.a)) {
                return u6h0.x(a6h0Var);
            }
            if (e4h0Var instanceof n2h0) {
                return u6h0.q(a6h0Var, (n2h0) e4h0Var);
            }
            if (e4h0Var instanceof k3h0) {
                return u6h0.A(a6h0Var, (k3h0) e4h0Var);
            }
            if (e4h0Var.equals(q3h0.a)) {
                Uri uri = a6h0Var.C;
                if (uri != null) {
                    setSingleton2 = Collections.singleton(new nzg0(Collections.singletonList(uri)));
                }
                return Next.i(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -268439553), setSingleton2);
            }
            if (e4h0Var instanceof s2h0) {
                return a6h0Var.h.a ? Next.a(Collections.singleton(ozg0.a)) : Next.a(Collections.singleton(new tzg0("spotify:playlist:37i9dQZF1EYkqdzj48dyYq", ((s2h0) e4h0Var).a, false)));
            }
            if (e4h0Var instanceof r2h0) {
                return ((r2h0) e4h0Var).a ? Next.h(a6h0.a(a6h0Var, null, null, false, false, null, false, null, null, false, null, null, true, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -4097)) : Next.j();
            }
            if (e4h0Var instanceof t2h0) {
                return u6h0.u(a6h0Var, (t2h0) e4h0Var);
            }
            if (e4h0Var instanceof y3h0) {
                return u6h0.K(a6h0Var, (y3h0) e4h0Var);
            }
            if (u890.j(e4h0Var, r3h0.a)) {
                return u6h0.G(a6h0Var);
            }
            if (e4h0Var instanceof z3h0) {
                return u6h0.L(a6h0Var, (z3h0) e4h0Var);
            }
            if (e4h0Var instanceof d4h0) {
                return u6h0.M(a6h0Var, (d4h0) e4h0Var);
            }
            if (e4h0Var instanceof k2h0) {
                return u6h0.o(a6h0Var, (k2h0) e4h0Var);
            }
            if (u890.j(e4h0Var, l2h0.a)) {
                return u6h0.p(a6h0Var);
            }
            if (e4h0Var instanceof l3h0) {
                return u6h0.B(a6h0Var, (l3h0) e4h0Var);
            }
            if (e4h0Var instanceof u2h0) {
                return u6h0.v(a6h0Var, (u2h0) e4h0Var);
            }
            if (e4h0Var instanceof p2h0) {
                return u6h0.s(a6h0Var, (p2h0) e4h0Var);
            }
            if (e4h0Var instanceof q2h0) {
                return u6h0.t(a6h0Var, (q2h0) e4h0Var);
            }
            if (e4h0Var instanceof o2h0) {
                return u6h0.r(a6h0Var);
            }
            if (e4h0Var instanceof j3h0) {
                return u6h0.z(a6h0Var, (j3h0) e4h0Var);
            }
            if (u890.j(e4h0Var, i3h0.a)) {
                return u6h0.y(a6h0Var);
            }
            if (u890.j(e4h0Var, t3h0.a)) {
                return u6h0.H(a6h0Var);
            }
            eg.o();
            return null;
        }
        x2h0 x2h0Var = (x2h0) e4h0Var;
        if (str5 != null && !str5.equals(x2h0Var.a)) {
            return Next.j();
        }
        if (str5 == null && !z5) {
            return Next.j();
        }
        c380 c380Var6 = x2h0Var.b;
        if (c380Var6 == null || !c380Var6.isEmpty()) {
            Iterator it2 = c380Var6.iterator();
            while (true) {
                if (it2.hasNext()) {
                    h5h0 h5h0Var = (h5h0) it2.next();
                    if ((h5h0Var instanceof g5h0) || (h5h0Var instanceof z4h0)) {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        if (a6h0Var.u && !z && (h5h0VarF = u6h0.f(a6h0Var)) != null) {
            return Next.h(a6h0.a(a6h0Var, mqo1.s(new h5h0[]{h5h0VarF}), x2h0Var.a, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -1056792));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : c380Var) {
            if (obj4 instanceof e5h0) {
                arrayList6.add(obj4);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : arrayList6) {
            c380 c380Var7 = ((e5h0) obj5).a;
            if (c380Var7 == null || !c380Var7.isEmpty()) {
                Iterator it3 = c380Var7.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (ihc1.y0(((iys0) it3.next()).e));
            }
            arrayList7.add(obj5);
        }
        ListIterator listIterator = c380Var.listIterator(c380Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((h5h0) listIterator.previous()) instanceof c5h0) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        List list = z6x.a;
        c380 c380VarA3 = mqo1.A(o7h.N0(arrayList7, iNextIndex >= 0 ? o7h.d1(c380Var, iNextIndex + 1) : list));
        String str13 = a6h0Var.s;
        if (str13 == null || !z4) {
            str13 = null;
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj6 : c380Var) {
            if (u6h0.T((h5h0) obj6) != null) {
                arrayList8.add(obj6);
            }
        }
        if (c380Var.isEmpty()) {
            str = str4;
            z2 = true;
            mmr0Var = new mmr0(list, arrayList8);
        } else {
            Iterator it4 = c380Var.iterator();
            while (true) {
                if (it4.hasNext()) {
                    h5h0 h5h0Var2 = (h5h0) it4.next();
                    String strS = u6h0.S(h5h0Var2);
                    if (strS == null || u6h0.T(h5h0Var2) != null) {
                        strS = null;
                    }
                    if (strS != null) {
                        ArrayList arrayList9 = new ArrayList();
                        for (h5h0 h5h0Var3 : (Iterable) c380Var) {
                            String strS2 = u6h0.S(h5h0Var3);
                            if (strS2 == null || u6h0.T(h5h0Var3) != null) {
                                strS2 = null;
                            }
                            if (strS2 != null) {
                                arrayList9.add(strS2);
                            }
                        }
                        Set setP1 = o7h.p1(arrayList9);
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj7 : (Iterable) c380Var6) {
                            h5h0 h5h0Var4 = (h5h0) obj7;
                            Set set = setP1;
                            String strS3 = u6h0.S(h5h0Var4);
                            if (!o7h.i0(set, (strS3 == null || u6h0.T(h5h0Var4) != null) ? null : strS3)) {
                                arrayList10.add(obj7);
                            }
                            z6 = z6;
                        }
                        z2 = z6;
                        ArrayList arrayList11 = new ArrayList();
                        Iterator it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            ppk1 ppk1VarU = u6h0.U((h5h0) it5.next());
                            if (ppk1VarU != null) {
                                arrayList11.add(ppk1VarU);
                            }
                        }
                        ArrayList arrayList12 = new ArrayList(arrayList11);
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            h5h0 h5h0Var5 = (h5h0) it6.next();
                            ppk1 ppk1VarU2 = u6h0.U(h5h0Var5);
                            if (ppk1VarU2 == null) {
                                str2 = str4;
                                it = it6;
                                i = -1;
                                break;
                            }
                            Iterator it7 = arrayList12.iterator();
                            int i3 = i2;
                            while (true) {
                                if (!it7.hasNext()) {
                                    str2 = str4;
                                    it = it6;
                                    i = -1;
                                    break;
                                }
                                ppk1 ppk1Var = (ppk1) it7.next();
                                if ((ppk1Var instanceof npk1) && (ppk1VarU2 instanceof npk1)) {
                                    npk1 npk1Var = (npk1) ppk1Var;
                                    str2 = str4;
                                    npk1 npk1Var2 = (npk1) ppk1VarU2;
                                    it = it6;
                                    if (npk1Var.a != npk1Var2.a) {
                                        zJ = false;
                                    } else {
                                        ArrayList arrayListO = u6h0.O(npk1Var.b);
                                        ArrayList arrayListO2 = u6h0.O(npk1Var2.b);
                                        if (arrayListO.isEmpty() || arrayListO2.isEmpty()) {
                                            zJ = false;
                                        } else {
                                            if (arrayListO.size() < arrayListO2.size() || !u890.j(arrayListO.subList(0, arrayListO2.size()), arrayListO2)) {
                                                if (arrayListO2.size() < arrayListO.size() || !u890.j(arrayListO2.subList(0, arrayListO.size()), arrayListO)) {
                                                    zJ = false;
                                                }
                                            }
                                            zJ = z2;
                                        }
                                    }
                                } else {
                                    str2 = str4;
                                    it = it6;
                                    zJ = u890.j(ppk1Var, ppk1VarU2);
                                }
                                if (zJ) {
                                    i = i3;
                                    break;
                                }
                                i3++;
                                it6 = it;
                                str4 = str2;
                            }
                            if (i >= 0) {
                                arrayList13.add(h5h0Var5);
                                arrayList12.remove(i);
                            } else {
                                arrayList14.add(h5h0Var5);
                            }
                            it6 = it;
                            str4 = str2;
                            i2 = 0;
                        }
                        str = str4;
                        ArrayList arrayList15 = new ArrayList();
                        Iterator it8 = arrayList13.iterator();
                        while (it8.hasNext()) {
                            String strT = u6h0.T((h5h0) it8.next());
                            if (strT != null) {
                                arrayList15.add(strT);
                            }
                        }
                        Set setP2 = o7h.p1(arrayList15);
                        ArrayList arrayList16 = new ArrayList();
                        ArrayList arrayList17 = new ArrayList();
                        for (Object obj8 : arrayList14) {
                            if (o7h.i0(setP2, u6h0.T((h5h0) obj8))) {
                                arrayList16.add(obj8);
                            } else {
                                arrayList17.add(obj8);
                            }
                        }
                        mmr0Var = new mmr0(o7h.N0(arrayList16, arrayList13), arrayList17);
                    }
                } else {
                    str = str4;
                    z2 = true;
                    mmr0Var = new mmr0(list, arrayList8);
                }
            }
        }
        List list2 = (List) mmr0Var.a;
        ArrayList arrayListN0 = o7h.N0((List) mmr0Var.b, o7h.N0(c380Var6, c380VarA3));
        if (str13 != null) {
            Object objC0 = o7h.C0(c380Var6);
            g5h0 g5h0Var = objC0 instanceof g5h0 ? (g5h0) objC0 : null;
            if (u890.j(g5h0Var != null ? g5h0Var.b : null, str13)) {
                str3 = null;
                c380VarA = mqo1.A(arrayListN0);
            } else {
                str3 = null;
                c380VarA = mqo1.A(o7h.O0(new g5h0(null, String.valueOf(str13.hashCode()), str13), arrayListN0));
            }
        } else {
            str3 = null;
            c380VarA = mqo1.A(arrayListN0);
        }
        ArrayList arrayList18 = new ArrayList();
        for (Object obj9 : c380Var6) {
            if (obj9 instanceof a5h0) {
                arrayList18.add(obj9);
            }
        }
        ArrayList arrayList19 = new ArrayList();
        Iterator it9 = arrayList18.iterator();
        while (it9.hasNext()) {
            r7h.W(((a5h0) it9.next()).b, arrayList19);
        }
        ArrayList arrayList20 = new ArrayList();
        for (Object obj10 : arrayList19) {
            if (obj10 instanceof qx01) {
                arrayList20.add(obj10);
            }
        }
        ArrayList arrayList21 = new ArrayList();
        for (Object obj11 : arrayList20) {
            String str14 = ((qx01) obj11).a;
            Set set2 = s4b1.f;
            if (!(uic.x(str14).c == blc0.x4 ? z2 : false)) {
                arrayList21.add(obj11);
            }
        }
        ArrayList arrayList22 = new ArrayList(q7h.U(arrayList21, 10));
        Iterator it10 = arrayList21.iterator();
        while (it10.hasNext()) {
            arrayList22.add(((qx01) it10.next()).a);
        }
        List listJ0 = o7h.j0(arrayList22);
        ArrayList arrayList23 = new ArrayList(q7h.U(listJ0, 10));
        Iterator it11 = listJ0.iterator();
        while (it11.hasNext()) {
            arrayList23.add(new vzg0((String) it11.next()));
        }
        Set setP3 = o7h.p1(arrayList23);
        c380 c380Var8 = c380VarA;
        String str15 = x2h0Var.a;
        boolean z9 = a6h0Var.q;
        String str16 = z9 ? a6h0Var.n : str3;
        String str17 = x2h0Var.c;
        if (str17 == null) {
            str17 = str;
        }
        Set set3 = a6h0Var.F;
        ArrayList arrayList24 = new ArrayList();
        Iterator it12 = list2.iterator();
        while (it12.hasNext()) {
            String strT2 = u6h0.T((h5h0) it12.next());
            if (strT2 != null) {
                arrayList24.add(strT2);
            }
        }
        String str18 = str3;
        a6h0 a6h0VarA3 = a6h0.a(a6h0Var, c380Var8, str15, z9, false, str17, false, null, null, false, null, null, false, str16, null, null, false, false, null, null, false, 0L, null, null, null, 0L, dm61.y0(set3, arrayList24), 2147213288);
        String str19 = a6h0VarA3.g;
        if (z4 || str19 == null) {
            return setP3.isEmpty() ? Next.h(a6h0VarA3) : Next.i(a6h0VarA3, setP3);
        }
        return u6h0.P(a6h0.a(a6h0VarA3, null, null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -65), str19, str18, 12);
    }
}
