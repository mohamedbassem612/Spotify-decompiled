package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u3b0 {
    public int a;
    public final String b;
    public y3b0 d;
    public final ArrayList f;
    public final ArrayList g;
    public y3b0 h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList c = new ArrayList(0);
    public final ArrayList e = new ArrayList(0);

    public u3b0(int i, String str) {
        this.a = i;
        this.b = str;
        new ArrayList(0);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = new ArrayList(0);
        this.j = new ArrayList(0);
        zjj0.a.getClass();
        List listA = yjj0.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            arrayList.add(new yia0());
        }
        this.k = arrayList;
    }

    public final String a() {
        return this.b;
    }
}
