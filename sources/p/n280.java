package p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class n280 extends o280 {
    public Object[] a;
    public int b;
    public boolean c;

    public n280(int i) {
        n3p1.j(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void d(Object... objArr) {
        int length = objArr.length;
        i8p1.l(length, objArr);
        f(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof q280) {
                this.b = ((q280) collection).c(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void f(int i) {
        Object[] objArr = this.a;
        int iB = o280.b(objArr.length, this.b + i);
        if (iB > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, iB);
            this.c = false;
        }
    }
}
