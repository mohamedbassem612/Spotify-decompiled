package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f6p1 extends i4p1 {
    public static final Object[] h;
    public static final f6p1 i;
    public final transient Object[] c;
    public final transient int d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new f6p1(0, 0, 0, objArr, objArr);
    }

    public f6p1(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.c = objArr;
        this.d = i2;
        this.e = objArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // p.j3p1
    public final k5n1 b() {
        return m().listIterator(0);
    }

    @Override // p.j3p1
    public final Object[] c() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.e;
            if (objArr.length != 0) {
                int iZ = omo1.z(obj);
                while (true) {
                    int i2 = iZ & this.f;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZ = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // p.j3p1
    public final int d() {
        return 0;
    }

    @Override // p.j3p1
    public final int e() {
        return this.g;
    }

    @Override // p.j3p1
    public final boolean f() {
        return false;
    }

    @Override // p.i4p1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // p.j3p1
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.g;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    @Override // p.i4p1
    public final r3p1 n() {
        int i2 = this.g;
        return i2 == 0 ? i5p1.e : new i5p1(i2, this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
