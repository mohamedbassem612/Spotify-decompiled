package p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class r380 extends n280 {
    public Object[] d;
    public int e;

    @Override // p.o280
    public /* bridge */ /* synthetic */ o280 a(Object obj) {
        g(obj);
        return this;
    }

    public r380 g(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iM = t380.m(this.b);
            Object[] objArr = this.d;
            if (iM <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = j0o1.A(iHashCode);
                while (true) {
                    int i = iA & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        c(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iA = i + 1;
                }
            }
        }
        this.d = null;
        c(obj);
        return this;
    }

    public r380 h(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            e(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        return this;
    }

    public t380 i() {
        t380 t380VarN;
        int i = this.b;
        if (i == 0) {
            int i2 = t380.c;
            return kg11.t;
        }
        if (i == 1) {
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            int i3 = t380.c;
            return new b291(obj);
        }
        if (this.d == null || t380.m(i) != this.d.length) {
            t380VarN = t380.n(this.b, this.a);
            this.b = t380VarN.size();
        } else {
            int i4 = this.b;
            Object[] objArrCopyOf = this.a;
            int length = objArrCopyOf.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            int i5 = this.e;
            Object[] objArr = this.d;
            t380VarN = new kg11(i5, objArr.length - 1, this.b, objArrCopyOf, objArr);
        }
        this.c = true;
        this.d = null;
        return t380VarN;
    }
}
