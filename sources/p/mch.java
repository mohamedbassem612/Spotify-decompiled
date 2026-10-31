package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mch implements f4r {
    public final ArrayList a;

    public mch(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f4r f4rVar = (f4r) it.next();
            r7h.W(f4rVar instanceof mch ? ((mch) f4rVar).a : k4p1.x(f4rVar), arrayList2);
        }
        this.a = arrayList2;
    }

    @Override // p.f4r
    public final f1r a(Object obj) {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((f4r) it.next()).a(obj));
        }
        return new lch(arrayList2);
    }
}
