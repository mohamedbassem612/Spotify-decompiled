package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tmc0 {
    public List a;

    static {
        new v9c((byte) 14);
    }

    public tmc0(List list) {
        this.a = new ArrayList(list);
    }

    public void a(Iterable iterable) {
        if (this.a instanceof b380) {
            this.a = new ArrayList(this.a);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.add(it.next());
        }
    }

    public void b(Iterable iterable) {
        if (iterable instanceof b380) {
            this.a = w0h1.j(iterable);
            return;
        }
        if (!v9c.c(iterable)) {
            this.a = z1p1.A(iterable);
            return;
        }
        List list = this.a;
        if (!(list instanceof b380)) {
            list.clear();
        } else {
            w280 w280Var = b380.b;
            this.a = bg11.e;
        }
    }

    public List c(qs31 qs31Var) {
        ArrayList arrayList = new ArrayList();
        for (qy8 qy8Var : this.a) {
            if (qy8Var.a.match(qs31Var)) {
                arrayList.add(qy8Var);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
