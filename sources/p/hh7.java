package p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.v2.AssociatedTextsRowComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hh7 implements j0i {
    public final kly0 a;

    public hh7(jly0 jly0Var) {
        this.a = jly0Var;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        AssociatedTextsRowComponent associatedTextsRowComponentO = AssociatedTextsRowComponent.o(any.q());
        List itemsList = associatedTextsRowComponentO.getItemsList();
        ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
        Iterator it = itemsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AssociatedTextsRowComponent.Item) it.next()).o());
        }
        String strY0 = o7h.y0(arrayList, " ", (String) null, (String) null, (iu30) null, 62);
        List<AssociatedTextsRowComponent.Item> itemsList2 = associatedTextsRowComponentO.getItemsList();
        ArrayList arrayList2 = new ArrayList(q7h.U(itemsList2, 10));
        for (AssociatedTextsRowComponent.Item item : itemsList2) {
            String url = item.n().n().getUrl();
            String strO = item.n().n().o();
            String strO2 = item.n().o();
            String strQ = item.n().q();
            String strName = item.n().p().name();
            int i = 0;
            if (strName == null) {
                bhn0.i("Name is null");
            } else if (strName.equals("DEFAULT")) {
                i = 1;
            } else if (strName.equals("ARTIST")) {
                i = 2;
            } else if (strName.equals("SHOW")) {
                i = 3;
            } else if (strName.equals("USER")) {
                i = 4;
            } else {
                hhg1.n("No enum constant com.spotify.watchfeed.uiusecases.associatedtextsrow.ArtworkType.".concat(strName));
            }
            arrayList2.add(new sm8(i, url, strO, strO2, strQ));
        }
        return new dh7(associatedTextsRowComponentO.n(), strY0, arrayList, arrayList2);
    }

    @Override // p.j0i
    public final Class b() {
        return dh7.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.a.get();
    }
}
