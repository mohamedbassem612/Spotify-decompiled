package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ilo implements av30, Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ ilo(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof tzg) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((tzg) it.next()).a(), arrayList2);
                }
                return o7h.p1(arrayList2);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (!list.contains(((i) obj3).getUri())) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            default:
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof niv0) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    r7h.W(((niv0) it2.next()).b(), arrayList5);
                }
                return o7h.p1(arrayList5);
        }
    }
}
