package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class zrg0 implements Update {
    public static final zrg0 a = new zrg0();

    public final Next a(Object obj, Object obj2) {
        boolean z;
        msg0 msg0Var = (msg0) obj;
        prg0 prg0Var = (prg0) obj2;
        int i = msg0Var.e;
        String str = msg0Var.a;
        List<irg0> list = msg0Var.d;
        boolean z2 = false;
        if (prg0Var instanceof jrg0) {
            List<irg0> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (irg0 irg0Var : list2) {
                arrayList.add(irg0.a(irg0Var, true, !(irg0Var.e ^ irg0Var.d)));
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((irg0) it.next()).e) {
                        z2 = true;
                        break;
                    }
                }
            }
            return Next.i(new msg0(list.size(), str, arrayList, true, z2), Effects.a(new drg0[]{new drg0(new xrg0(str))}));
        }
        if (prg0Var instanceof krg0) {
            List<irg0> list3 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
            for (irg0 irg0Var2 : list3) {
                arrayList2.add(irg0.a(irg0Var2, false, irg0Var2.e ^ irg0Var2.d));
            }
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((irg0) it2.next()).e) {
                        z2 = true;
                        break;
                    }
                }
            }
            return Next.i(new msg0(0, str, arrayList2, false, z2), Effects.a(new drg0[]{new drg0(new wrg0(str))}));
        }
        int i2 = -1;
        if (prg0Var instanceof nrg0) {
            String str2 = ((nrg0) prg0Var).a;
            int i3 = 0;
            for (irg0 irg0Var3 : list) {
                if (u890.j(irg0Var3.a, str2) && !irg0Var3.d) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            boolean z3 = !((irg0) list.get(i2)).e;
            ArrayList arrayList3 = new ArrayList(list);
            arrayList3.set(i2, irg0.a((irg0) list.get(i2), true, z3));
            int i4 = i + 1;
            if (arrayList3.isEmpty()) {
                break;
            }
            Iterator it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                    break;
                }
                if (((irg0) it3.next()).e) {
                    z2 = true;
                    break;
                }
            }
            return Next.i(new msg0(i4, str, arrayList3, i4 == list.size(), z2), Effects.a(new drg0[]{new drg0(new vrg0(str2))}));
        }
        if (prg0Var instanceof org0) {
            String str3 = ((org0) prg0Var).a;
            int i5 = 0;
            for (irg0 irg0Var4 : list) {
                if (u890.j(irg0Var4.a, str3) && irg0Var4.d) {
                    i2 = i5;
                    break;
                }
                i5++;
            }
            boolean z4 = !((irg0) list.get(i2)).e;
            ArrayList arrayList4 = new ArrayList(list);
            arrayList4.set(i2, irg0.a((irg0) list.get(i2), false, z4));
            if (arrayList4.isEmpty()) {
                z = false;
            } else {
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    if (((irg0) it4.next()).e) {
                        z = true;
                    }
                }
                z = false;
            }
            return Next.i(new msg0(i - 1, str, arrayList4, false, z), Effects.a(new drg0[]{new drg0(new urg0(str3))}));
        }
        if (!(prg0Var instanceof mrg0)) {
            if (prg0Var instanceof lrg0) {
                return msg0Var.c ? Next.a(Effects.a(new grg0[]{grg0.c})) : Next.a(Effects.a(new crg0[]{crg0.c}));
            }
            eg.o();
            return null;
        }
        drg0 drg0Var = new drg0(new trg0(str));
        List list4 = list;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list4) {
            irg0 irg0Var5 = (irg0) obj3;
            if (irg0Var5.e && irg0Var5.d) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((irg0) it5.next()).a);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : list4) {
            irg0 irg0Var6 = (irg0) obj4;
            if (irg0Var6.e && !irg0Var6.d) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            arrayList8.add(((irg0) it6.next()).a);
        }
        return Next.a(Effects.a(new ozn1[]{drg0Var, new erg0(arrayList6, arrayList8), frg0.c}));
    }
}
