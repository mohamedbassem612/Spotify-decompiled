package p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kxn1 extends wrn1 implements RandomAccess, szn1, s5o1 {
    public static final float[] d;
    public static final kxn1 e;
    public float[] b;
    public int c;

    static {
        float[] fArr = new float[0];
        d = fArr;
        e = new kxn1(fArr, 0, false);
    }

    public kxn1(float[] fArr, int i, boolean z) {
        super(z);
        this.b = fArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i < 0 || i > (i2 = this.c)) {
            eg.g(qhn1.c(this.c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        float[] fArr = this.b;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[f4i1.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, fArr2, 0, i);
            System.arraycopy(this.b, i, fArr2, i3, this.c - i);
            this.b = fArr2;
        }
        this.b[i] = fFloatValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p.wrn1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        collection.getClass();
        if (!(collection instanceof kxn1)) {
            return super.addAll(collection);
        }
        kxn1 kxn1Var = (kxn1) collection;
        int i = kxn1Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArrCopyOf = this.b;
        if (i3 > fArrCopyOf.length) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i3);
            this.b = fArrCopyOf;
        }
        System.arraycopy(kxn1Var.b, 0, fArrCopyOf, this.c, kxn1Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final kxn1 zzg(int i) {
        if (i >= this.c) {
            return new kxn1(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        bhn0.q();
        return null;
    }

    public final float e(int i) {
        k(i);
        return this.b[i];
    }

    @Override // p.wrn1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxn1)) {
            return super.equals(obj);
        }
        kxn1 kxn1Var = (kxn1) obj;
        if (this.c == kxn1Var.c) {
            float[] fArr = kxn1Var.b;
            for (int i = 0; i < this.c; i++) {
                if (Float.floatToIntBits(this.b[i]) == Float.floatToIntBits(fArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(float f) {
        c();
        int i = this.c;
        float[] fArr = this.b;
        int length = fArr.length;
        if (i == length) {
            fArr = new float[f4i1.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, fArr, 0, this.c);
            this.b = fArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        fArr[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        k(i);
        return Float.valueOf(this.b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.b[i]);
        }
        return iFloatToIntBits;
    }

    public final void i(int i) {
        int length = this.b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.b = new float[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = f4i1.a(length, 3, 2, 1, 10);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void k(int i) {
        if (i < 0 || i >= this.c) {
            eg.g(qhn1.c(this.c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // p.wrn1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        k(i);
        float[] fArr = this.b;
        float f = fArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            eg.g("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.b;
        System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        k(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}
