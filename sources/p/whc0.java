package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class whc0 implements lsg, Iterable, ola0 {
    public final int a;
    public final int b;

    public whc0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean isEmpty() {
        return m().compareTo(n()) > 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        tr80 tr80Var = new tr80(this.a, this.b, 1);
        ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
        lr80 it = tr80Var.iterator();
        while (it.hasNext()) {
            arrayList.add(new vhc0(it.nextInt()));
        }
        return arrayList.iterator();
    }

    public final Comparable m() {
        return new vhc0(this.a);
    }

    public final Comparable n() {
        return new vhc0(this.b);
    }
}
