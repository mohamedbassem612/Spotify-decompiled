package p;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class shp1 extends ugp1 implements RandomAccess, iip1 {
    public static final float[] d;
    public static final shp1 e;
    public float[] b;
    public int c;

    static {
        float[] fArr = new float[0];
        d = fArr;
        e = new shp1(fArr, 0, false);
    }

    public shp1(float[] fArr, int i, boolean z) {
        super(z);
        this.b = fArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i < 0 || i > (i2 = this.c)) {
            eg.g(ppo1.w(this.c, i, (byte) 13, "Index:", ", Size:"));
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

    @Override // p.ugp1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = mip1.a;
        collection.getClass();
        if (!(collection instanceof shp1)) {
            return super.addAll(collection);
        }
        shp1 shp1Var = (shp1) collection;
        int i = shp1Var.c;
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
        System.arraycopy(shp1Var.b, 0, fArrCopyOf, this.c, shp1Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            eg.g(ppo1.w(this.c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p.ugp1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shp1)) {
            return super.equals(obj);
        }
        shp1 shp1Var = (shp1) obj;
        if (this.c == shp1Var.c) {
            float[] fArr = shp1Var.b;
            for (int i = 0; i < this.c; i++) {
                if (Float.floatToIntBits(this.b[i]) == Float.floatToIntBits(fArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Float.valueOf(this.b[i]);
    }

    @Override // p.ugp1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.b[i]);
        }
        return iFloatToIntBits;
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

    @Override // p.ugp1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        c(i);
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
        b();
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
        b();
        c(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // p.lip1
    public final lip1 zzf(int i) {
        if (i >= this.c) {
            return new shp1(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        bhn0.q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
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
        fArr[i2] = fFloatValue;
        return true;
    }
}
