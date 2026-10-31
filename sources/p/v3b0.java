package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v3b0 implements q3b0 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d;

    public v3b0() {
        zjj0.a.getClass();
        List listA = yjj0.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            arrayList.add(new kja0());
        }
        this.d = arrayList;
    }

    @Override // p.q3b0
    public final ArrayList a() {
        return this.b;
    }

    @Override // p.q3b0
    public final ArrayList b() {
        return this.c;
    }

    @Override // p.q3b0
    public final ArrayList c() {
        return this.a;
    }
}
