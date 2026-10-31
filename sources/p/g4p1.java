package p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g4p1 extends e3p1 {
    public Object[] d;
    public int e;

    public g4p1(int i) {
        eqr0.X(i, "initialCapacity");
        ((e3p1) this).a = new Object[i];
        ((e3p1) this).b = 0;
        this.d = new Object[i4p1.k(i)];
    }

    public final /* bridge */ /* synthetic */ g4p1 b(Object obj) {
        if (this.d != null) {
            int iK = i4p1.k(((e3p1) this).b);
            Object[] objArr = this.d;
            if (iK <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iY = omo1.y(iHashCode);
                while (true) {
                    int i = iY & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        a(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iY = i + 1;
                }
            }
        }
        this.d = null;
        a(obj);
        return this;
    }

    public final i4p1 d() {
        i4p1 i4p1VarO;
        int i = ((e3p1) this).b;
        if (i == 0) {
            return f6p1.i;
        }
        if (i == 1) {
            Object obj = ((e3p1) this).a[0];
            Objects.requireNonNull(obj);
            return new m4p1(obj, (byte) 1);
        }
        if (this.d == null || i4p1.k(i) != this.d.length) {
            i4p1VarO = i4p1.o(((e3p1) this).b, ((e3p1) this).a);
            ((e3p1) this).b = i4p1VarO.size();
        } else {
            int i2 = ((e3p1) this).b;
            Object[] objArrCopyOf = ((e3p1) this).a;
            int length = objArrCopyOf.length;
            if (i2 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.e;
            Object[] objArr = this.d;
            i4p1VarO = new f6p1(i3, objArr.length - 1, ((e3p1) this).b, objArrCopyOf, objArr);
        }
        ((e3p1) this).c = true;
        this.d = null;
        return i4p1VarO;
    }
}
