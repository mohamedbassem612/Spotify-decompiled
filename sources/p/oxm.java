package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class oxm extends tv30 implements vu30 {
    public static final oxm a = new oxm(2, pxm.class, "mapCollaboratorsState", "mapCollaboratorsState(Lcom/spotify/songdna/contributorsheet/ContributorSheetCollaboratorsElement$Props;Lcom/spotify/kodiak/dataloader/DataResult;)Lcom/spotify/songdna/contributorsheet/ContributorSheetCollaboratorsElement$State;", 1);

    public final Object invoke(Object obj, Object obj2) {
        ixm ixmVar = (ixm) obj;
        i1r i1rVar = (k1r) obj2;
        Set set = pxm.a;
        if (i1rVar instanceof j1r) {
            return kxm.a;
        }
        if (!(i1rVar instanceof h1r)) {
            if (!(i1rVar instanceof i1r)) {
                eg.o();
                return null;
            }
            List list = (List) i1rVar.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (!o7h.i0(pxm.a, i1o1.j((String) ((pvc0) obj3).f.get("type")))) {
                    arrayList.add(obj3);
                }
            }
            List<pvc0> listD1 = o7h.d1(arrayList, 5);
            ArrayList arrayList2 = new ArrayList(q7h.U(listD1, 10));
            for (pvc0 pvc0Var : listD1) {
                String str = pvc0Var.c;
                String str2 = (String) pvc0Var.f.get("record_count");
                Integer numC0 = str2 != null ? nhc1.c0(str2) : null;
                arrayList2.add(new gxm(str, numC0 != null ? numC0.intValue() : 0));
            }
            c380 c380VarA = mqo1.A(arrayList2);
            if (!c380VarA.isEmpty()) {
                return new jxm(ixmVar.a, c380VarA);
            }
        }
        return lxm.a;
    }
}
