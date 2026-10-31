package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n0k extends hab0 implements gv30 {
    public static final n0k b;
    public static final n0k c;
    public final /* synthetic */ byte a;

    static {
        int i = 9;
        b = new n0k(i, (byte) 0);
        c = new n0k(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0k(int i, byte b2) {
        super(i);
        this.a = b2;
    }

    public final Object b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        h290 arrayList;
        h290 arrayList2;
        wnb1 m0kVar;
        List list;
        kl11 kl11Var;
        jo70 jo70Var;
        ljh1 ljh1Var;
        us6 us6Var;
        q2o q2oVar;
        s211 s211Var;
        tdv0 tdv0Var;
        switch (this.a) {
            case 0:
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = (k1r) obj2;
                i1r i1rVar3 = (k1r) obj3;
                i1r i1rVar4 = (k1r) obj4;
                i1r i1rVar5 = (k1r) obj5;
                i1r i1rVar6 = (k1r) obj6;
                i1r i1rVar7 = (k1r) obj7;
                i1r i1rVar8 = (k1r) obj8;
                i1r i1rVar9 = (k1r) obj9;
                i1r i1rVar10 = i1rVar instanceof i1r ? i1rVar : null;
                h290 arrayList3 = z6x.a;
                h290 h290Var = (i1rVar10 == null || (tdv0Var = (tdv0) i1rVar10.a) == null) ? arrayList3 : tdv0Var.a;
                i1r i1rVar11 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                h290 h290Var2 = (i1rVar11 == null || (s211Var = (s211) i1rVar11.a) == null) ? arrayList3 : s211Var.a;
                i1r i1rVar12 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                if (i1rVar12 == null || (q2oVar = (q2o) i1rVar12.a) == null) {
                    arrayList = arrayList3;
                } else {
                    ArrayList arrayList4 = q2oVar.a.a;
                    arrayList = new ArrayList(q7h.U(arrayList4, 10));
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((xh51) it.next()).a);
                    }
                }
                i1r i1rVar13 = i1rVar4 instanceof i1r ? i1rVar4 : null;
                h290 h290Var3 = (i1rVar13 == null || (us6Var = (us6) i1rVar13.a) == null) ? arrayList3 : us6Var.a;
                i1r i1rVar14 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                h290 h290VarK0 = (i1rVar14 == null || (ljh1Var = (ljh1) i1rVar14.a) == null) ? arrayList3 : o7h.K0(ljh1Var.a, ljh1Var.b);
                i1r i1rVar15 = i1rVar6 instanceof i1r ? i1rVar6 : null;
                String str = (i1rVar15 == null || (jo70Var = (jo70) i1rVar15.a) == null) ? null : jo70Var.a;
                i1r i1rVar16 = i1rVar7 instanceof i1r ? i1rVar7 : null;
                if (i1rVar16 == null || (kl11Var = (kl11) i1rVar16.a) == null) {
                    arrayList2 = arrayList3;
                } else {
                    ArrayList arrayList5 = kl11Var.a.a;
                    arrayList2 = new ArrayList(q7h.U(arrayList5, 10));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((yh51) it2.next()).a);
                    }
                }
                i1r i1rVar17 = i1rVar8 instanceof i1r ? i1rVar8 : null;
                pnt pntVar = i1rVar17 != null ? (pnt) i1rVar17.a : null;
                i1r i1rVar18 = i1rVar9 instanceof i1r ? i1rVar9 : null;
                if (i1rVar18 != null && (list = (List) i1rVar18.a) != null) {
                    List<pvc0> list2 = list;
                    arrayList3 = new ArrayList(q7h.U(list2, 10));
                    for (pvc0 pvc0Var : list2) {
                        arrayList3.add(new ovl1(pvc0Var.c, mqo1.G(pvc0Var.f)));
                    }
                }
                m0kVar = new m0k(h290Var, h290Var2, arrayList, h290Var3, h290VarK0, str, arrayList2, pntVar, arrayList3);
                break;
            default:
                m0kVar = new wnb1((jo70) obj, (xkk1) obj2, (hll) obj3, (hzy) obj4, (iix0) obj5, (h2v) obj6, (zoy0) obj7, (w281) obj8, (mdz) obj9);
                break;
        }
        return m0kVar;
    }
}
