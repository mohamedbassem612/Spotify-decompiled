package p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b6o1 extends wrn1 implements RandomAccess {
    public static final Object[] d;
    public static final b6o1 e;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        e = new b6o1(objArr, 0, false);
    }

    public b6o1(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.c)) {
            eg.g(qhn1.c(this.c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[f4i1.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i) {
        int length = this.b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.b = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = f4i1.a(length, 3, 2, 1, 10);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    public final void e(int i) {
        if (i < 0 || i >= this.c) {
            eg.g(qhn1.c(this.c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // p.wrn1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.c;
            if (i == list.size()) {
                if (!(obj instanceof b6o1)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.b[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                b6o1 b6o1Var = (b6o1) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.b[i3].equals(b6o1Var.b[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        e(i);
        return this.b[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.b[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // p.wrn1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        e(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        e(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ c0o1 zzg(int i) {
        if (i >= this.c) {
            return new b6o1(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        bhn0.q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i = this.c;
        Object[] objArrCopyOf = this.b;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.b, f4i1.a(length, 3, 2, 1, 10));
            this.b = objArrCopyOf;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
