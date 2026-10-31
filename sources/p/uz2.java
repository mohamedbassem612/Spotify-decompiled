package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uz2 implements lqm0 {
    public final /* synthetic */ mih1 a;
    public final /* synthetic */ float b;

    public uz2(mih1 mih1Var, float f) {
        this.a = mih1Var;
        this.b = f;
    }

    @Override // p.lqm0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo604measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        long jB;
        int iP;
        ArrayList arrayList = (ArrayList) list;
        int i = 0;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        long jB2 = jjl.b(0, hjl.i(j), 0, 0, 13);
        List list6 = list2;
        ArrayList arrayList2 = new ArrayList(q7h.U(list6, 10));
        Iterator it = list6.iterator();
        while (it.hasNext()) {
            arrayList2.add(((afh0) it.next()).H(jB2));
        }
        List list7 = list4;
        ArrayList arrayList3 = new ArrayList(q7h.U(list7, 10));
        Iterator it2 = list7.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((afh0) it2.next()).H(jB2));
        }
        boolean zW = ifh0Var.W();
        mih1 mih1Var = this.a;
        if (!zW || hjl.j(j) <= 0) {
            jB = jB2;
        } else {
            int iJ = (hjl.j(j) - mih1Var.c(ifh0Var)) - mih1Var.d(ifh0Var);
            int iI0 = ifh0Var.i0(this.b);
            Iterator it3 = o7h.N0(arrayList3, arrayList2).iterator();
            int i2 = 0;
            while (it3.hasNext()) {
                i2 += ((q5t0) it3.next()).b;
            }
            int i3 = iI0 + i2;
            if (iJ <= 0) {
                iP = 0;
            } else {
                float f = iJ;
                iP = yoi1.p(iJ - i3, jch0.U(0.3f * f), jch0.U(f * 0.55f));
            }
            jB = hjl.b(jB2, 0, 0, 0, iP, 7);
        }
        List list8 = list3;
        ArrayList arrayList4 = new ArrayList(q7h.U(list8, 10));
        Iterator it4 = list8.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((afh0) it4.next()).H(jB));
        }
        List list9 = list5;
        ArrayList arrayList5 = new ArrayList(q7h.U(list9, 10));
        Iterator it5 = list9.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((afh0) it5.next()).H(jB2));
        }
        ArrayList arrayListN0 = o7h.N0(arrayList5, o7h.N0(arrayList3, o7h.N0(arrayList4, arrayList2)));
        Iterator it6 = arrayListN0.iterator();
        while (it6.hasNext()) {
            i += ((q5t0) it6.next()).b;
        }
        return ifh0Var.S(hjl.i(j), jjl.f(mih1Var.c(ifh0Var) + mih1Var.d(ifh0Var) + i, j), b7x.a, new cc2(mih1Var, arrayListN0, (byte) 2));
    }
}
