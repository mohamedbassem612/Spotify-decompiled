package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p3b0 {
    public int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d = new ArrayList(0);
    public final ArrayList e;

    public p3b0(int i) {
        this.a = i;
        zjj0.a.getClass();
        List listA = yjj0.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            arrayList.add(new uia0());
        }
        this.e = arrayList;
    }
}
