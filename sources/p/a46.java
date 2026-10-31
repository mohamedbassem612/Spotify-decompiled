package p;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a46 extends x36 {
    public Object[] a;
    public int b;

    @Override // p.x36
    public final int b() {
        return this.b;
    }

    @Override // p.x36
    public final void c(int i, ig5 ig5Var) {
        Object[] objArrCopyOf = this.a;
        if (objArrCopyOf.length <= i) {
            int length = objArrCopyOf.length;
            do {
                length *= 2;
            } while (length <= i);
            objArrCopyOf = Arrays.copyOf(this.a, length);
            this.a = objArrCopyOf;
        }
        if (objArrCopyOf[i] == null) {
            this.b++;
        }
        objArrCopyOf[i] = ig5Var;
    }

    @Override // p.x36
    public final Object get(int i) {
        return f46.n0(i, this.a);
    }

    @Override // p.x36, java.lang.Iterable
    public final Iterator iterator() {
        return new z36(this);
    }
}
