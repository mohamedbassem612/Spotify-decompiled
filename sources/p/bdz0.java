package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bdz0 {
    public final n0v0 a;
    public final aek1 b = new aek1(10, 20);
    public List c;
    public int d;
    public List e;

    public bdz0(n0v0 n0v0Var) {
        this.a = n0v0Var;
        z6x z6xVar = z6x.a;
        this.c = z6xVar;
        this.e = z6xVar;
    }

    public final void a() {
        int iP = yoi1.p(this.b.d, 0, this.c.size());
        int i = iP + 20;
        int size = this.c.size();
        if (i > size) {
            i = size;
        }
        ArrayList arrayListO0 = o7h.o0(this.c.subList(iP, i));
        if (arrayListO0.equals(this.e)) {
            return;
        }
        this.e = arrayListO0;
        ArrayList arrayList = new ArrayList(q7h.U(arrayListO0, 10));
        Iterator it = arrayListO0.iterator();
        while (it.hasNext()) {
            arrayList.add(mcz0.a.a((String) it.next()));
        }
        ((rhg0) this.a.b).a(o7h.p1(arrayList), (ArrayList) null, (ArrayList) null);
    }
}
