package p;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zob extends i9 implements s190, RandomAccess, onw0 {
    public static final boolean[] d;
    public static final zob e;
    public boolean[] b;
    public int c;

    static {
        boolean[] zArr = new boolean[0];
        d = zArr;
        e = new zob(zArr, 0, false);
    }

    public zob(boolean[] zArr, int i, boolean z) {
        super(z);
        this.b = zArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i < 0 || i > (i2 = this.c)) {
            eg.g(cy30.i(i, "Index:", this.c, ", Size:"));
            return;
        }
        boolean[] zArr = this.b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[f4i1.a(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, zArr2, 0, i);
            System.arraycopy(this.b, i, zArr2, i + 1, this.c - i);
            this.b = zArr2;
        }
        this.b[i] = zBooleanValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p.i9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = l290.a;
        collection.getClass();
        if (!(collection instanceof zob)) {
            return super.addAll(collection);
        }
        zob zobVar = (zob) collection;
        int i = zobVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArrCopyOf = this.b;
        if (i3 > zArrCopyOf.length) {
            zArrCopyOf = Arrays.copyOf(zArrCopyOf, i3);
            this.b = zArrCopyOf;
        }
        System.arraycopy(zobVar.b, 0, zArrCopyOf, this.c, zobVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(boolean z) {
        b();
        int i = this.c;
        boolean[] zArr = this.b;
        if (i == zArr.length) {
            zArr = new boolean[f4i1.a(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, zArr, 0, this.c);
            this.b = zArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        zArr[i2] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.c) {
            eg.g(cy30.i(i, "Index:", this.c, ", Size:"));
        }
    }

    @Override // p.h290
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final zob h(int i) {
        if (i >= this.c) {
            return new zob(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        bhn0.q();
        return null;
    }

    @Override // p.i9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zob)) {
            return super.equals(obj);
        }
        zob zobVar = (zob) obj;
        if (this.c != zobVar.c) {
            return false;
        }
        boolean[] zArr = zobVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Boolean.valueOf(this.b[i]);
    }

    @Override // p.i9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            int i3 = i * 31;
            boolean z = this.b[i2];
            Charset charset = l290.a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p.i9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        d(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            eg.g("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.b;
        System.arraycopy(zArr, i2, zArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(((Boolean) obj).booleanValue());
        return true;
    }
}
