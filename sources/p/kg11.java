package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kg11 extends t380 {
    public static final Object[] i;
    public static final kg11 t;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        t = new kg11(0, 0, 0, objArr, objArr);
    }

    public kg11(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // p.q280
    public final int c(int i2, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // p.q280, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iB = j0o1.B(obj);
                while (true) {
                    int i2 = iB & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // p.q280
    public final Object[] d() {
        return this.d;
    }

    @Override // p.q280
    public final int e() {
        return this.h;
    }

    @Override // p.q280
    public final int f() {
        return 0;
    }

    @Override // p.t380, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // p.q280
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final mjh1 iterator() {
        return b().listIterator(0);
    }

    @Override // p.t380
    public final b380 r() {
        return b380.l(this.h, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // p.t380, p.q280
    public Object writeReplace() {
        return super.writeReplace();
    }
}
