package p;

import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class otx0 extends tv30 implements vu30 {
    /* JADX WARN: Code duplicated, block: B:117:0x0212  */
    /* JADX WARN: Code duplicated, block: B:176:0x039f  */
    public final Object invoke(Object obj, Object obj2) {
        pvx0 pvx0Var;
        Object next;
        Object objPrevious;
        Object objPrevious2;
        boolean z;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        bwi0 bwi0Var;
        bwi0 bwi0Var2;
        Object objPrevious3;
        eux0 eux0VarA = (eux0) obj;
        ktx0 ktx0Var = (ktx0) obj2;
        List list = eux0VarA.u;
        ((qby0) ((lyc) this).receiver).getClass();
        ttx0 ttx0Var = eux0VarA.w;
        String str = eux0VarA.m;
        if ((ktx0Var instanceof hsx0) || (ktx0Var instanceof ftx0) || (ktx0Var instanceof osx0)) {
            b9f b9fVar = (b9f) o7h.C0(list);
            if ((b9fVar instanceof a9f) || (b9fVar instanceof i8f)) {
                return Next.j();
            }
        }
        boolean z2 = ktx0Var instanceof wrx0;
        cux0 cux0Var = cux0.c;
        if (z2) {
            stx0 stx0Var = (stx0) ttx0Var;
            if (str == null) {
                return Next.j();
            }
            String str2 = stx0Var.b;
            return Next.i(eux0.a(eux0VarA, cux0Var, null, false, null, null, false, null, null, null, false, null, null, 33554430), Collections.singleton(str2 != null ? new lqx0(str, str2) : new kqx0(str)));
        }
        if (ktx0Var instanceof rrx0) {
            return qby0.c(eux0VarA);
        }
        if (ktx0Var instanceof dtx0) {
            return qby0.c(eux0VarA);
        }
        boolean z3 = ktx0Var instanceof vsx0;
        gvx0 gvx0Var = gvx0.a;
        if (z3) {
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious3 = null;
                    break;
                }
                objPrevious3 = listIterator.previous();
            } while (!(((b9f) objPrevious3) instanceof e8f));
            b9f b9fVar2 = (b9f) objPrevious3;
            String strS = b9fVar2 != null ? b9fVar2.s() : null;
            if (str == null) {
                return Next.j();
            }
            if (strS == null) {
                return Next.j();
            }
            if (!qby0.a(eux0VarA)) {
                return Next.a(Collections.singleton(gvx0Var));
            }
            String str3 = strS;
            return Next.i(eux0.a(eux0VarA, cux0Var, null, false, null, null, false, null, null, null, false, null, null, 33554430), f46.S0(new frx0[]{new wqx0(str, str3), new drx0(eux0VarA.b, str3, eux0VarA.q, eux0VarA.r)}));
        }
        if (ktx0Var instanceof wsx0) {
            return ((wsx0) ktx0Var).a ? Next.a(Collections.singleton(gvx0Var)) : Next.h(eux0.a(eux0VarA, new ytx0(nsx0.a), null, false, null, null, false, null, null, null, false, null, null, 33554430));
        }
        if (!(ktx0Var instanceof zsx0)) {
            if (!(ktx0Var instanceof orx0)) {
                if (ktx0Var instanceof asx0) {
                    return (str == null || !eux0VarA.t) ? Next.a(Collections.singleton(gvx0Var)) : Next.a(f46.S0(new frx0[]{new hqx0(str), gvx0Var}));
                }
                if (ktx0Var instanceof xsx0) {
                    return qby0.d(eux0VarA, ktx0Var);
                }
                return ktx0Var instanceof ctx0 ? qby0.d(eux0VarA, ktx0Var) : fxx0.H(eux0VarA, ktx0Var);
            }
            stx0 stx0Var2 = (stx0) ttx0Var;
            String str4 = eux0VarA.m;
            kqx0 kqx0Var = str4 != null ? new kqx0(str4) : null;
            eux0 eux0Var = new eux0(cux0Var, eux0VarA.b, false, eux0VarA.d, new dux0(), eux0VarA.f, null, null, eux0VarA.k, eux0VarA.l, str4, null, null, eux0VarA.f12p, null, null, false, null, stx0Var2, false, 25085824);
            kqf1 kqf1Var = eux0VarA.i;
            if (kqf1Var != null) {
                List list2 = kqf1Var.c;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof eqf1) {
                        arrayList4.add(obj3);
                    }
                }
                Iterator it = arrayList4.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((eqf1) next).f.e);
                eqf1 eqf1Var = (eqf1) next;
                if (eqf1Var != null) {
                    String str5 = eqf1Var.a;
                    String str6 = eqf1Var.f.a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    pvx0Var = new pvx0(str5, str6);
                } else {
                    pvx0Var = null;
                }
            } else {
                pvx0Var = null;
            }
            return Next.i(eux0Var, dm61.B0(new frx0[]{pvx0Var, kqx0Var}));
        }
        zsx0 zsx0Var = (zsx0) ktx0Var;
        List list3 = zsx0Var.f;
        List list4 = zsx0Var.c;
        List list5 = list3;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list5) {
            if (obj4 instanceof cwi0) {
                arrayList5.add(obj4);
            }
        }
        ListIterator listIterator2 = arrayList5.listIterator(arrayList5.size());
        do {
            if (!listIterator2.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator2.previous();
        } while (((cwi0) objPrevious).f == null);
        cwi0 cwi0Var = (cwi0) objPrevious;
        ArrayList arrayList6 = (cwi0Var == null || (bwi0Var2 = cwi0Var.f) == null) ? null : bwi0Var2.c;
        ListIterator listIterator3 = arrayList5.listIterator(arrayList5.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                objPrevious2 = null;
                break;
            }
            objPrevious2 = listIterator3.previous();
            bwi0 bwi0Var3 = ((cwi0) objPrevious2).f;
            if (bwi0Var3 != null && (!bwi0Var3.c.isEmpty())) {
                break;
            }
        }
        cwi0 cwi0Var2 = (cwi0) objPrevious2;
        ArrayList arrayList7 = (cwi0Var2 == null || (bwi0Var = cwi0Var2.f) == null) ? null : bwi0Var.c;
        if (arrayList7 != null) {
            ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                arrayList8.add(((awi0) it2.next()).a());
            }
            if (list4 != null) {
                List list6 = list4;
                arrayList3 = new ArrayList(q7h.U(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((awi0) it3.next()).a());
                }
            } else {
                arrayList3 = null;
            }
            if (arrayList8.equals(arrayList3)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!eux0VarA.x || z) {
            arrayList = arrayList6;
            i = 10;
        } else {
            i = 10;
            arrayList = arrayList6;
            eux0VarA = eux0.a(eux0VarA, null, null, false, null, null, false, null, null, null, false, null, null, 16777215);
        }
        if (list4 != 0) {
            List list7 = list4;
            arrayList2 = new ArrayList(q7h.U(list7, i));
            Iterator it4 = list7.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((awi0) it4.next()).a());
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = z6x.a;
        }
        ArrayList arrayList9 = arrayList2;
        Next nextH = fxx0.H(eux0VarA, zsx0.a(zsx0Var, null, arrayList, 251));
        if (nextH.d()) {
            nextH = Next.i(eux0.a((eux0) nextH.g(), null, null, false, null, null, false, null, null, arrayList9, false, null, null, 33030143), nextH.b());
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj5 : list5) {
            if (obj5 instanceof dwi0) {
                arrayList10.add(obj5);
            }
        }
        dwi0 dwi0Var = (dwi0) o7h.C0(arrayList10);
        if (dwi0Var == null) {
            return nextH;
        }
        LinkedHashSet linkedHashSetX0 = dm61.x0(new uqx0(dwi0Var.c, dwi0Var.d, zsx0Var.a, dwi0Var.a), nextH.b());
        return nextH.d() ? Next.i(nextH.g(), linkedHashSetX0) : Next.a(linkedHashSetX0);
    }
}
