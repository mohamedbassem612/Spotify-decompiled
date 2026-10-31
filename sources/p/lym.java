package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class lym extends tv30 implements vu30 {
    public static final lym a = new lym(2, mym.class, "mapPopularSongsState", "mapPopularSongsState(Lcom/spotify/songdna/contributorsheet/ContributorSheetPopularSongsElement$Props;Lcom/spotify/kodiak/dataloader/DataResult;)Lcom/spotify/songdna/contributorsheet/ContributorSheetPopularSongsElement$State;", 1);

    public final Object invoke(Object obj, Object obj2) {
        fym fymVar = (fym) obj;
        i1r i1rVar = (k1r) obj2;
        if (i1rVar instanceof j1r) {
            return hym.a;
        }
        if (!(i1rVar instanceof h1r)) {
            if (!(i1rVar instanceof i1r)) {
                eg.o();
                return null;
            }
            List listD1 = o7h.d1((List) i1rVar.a, 10);
            ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
            Iterator it = listD1.iterator();
            while (it.hasNext()) {
                arrayList.add(((pvc0) it.next()).c);
            }
            c380 c380VarA = mqo1.A(arrayList);
            if (!c380VarA.isEmpty()) {
                return new gym(fymVar.a, c380VarA);
            }
        }
        return iym.a;
    }
}
