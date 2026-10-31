package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hzn1 extends ewn1 {
    public static final hzn1 e = new hzn1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public hzn1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // p.ewn1, p.lvn1
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p.lvn1
    public final int c() {
        return this.d;
    }

    @Override // p.lvn1
    public final int d() {
        return 0;
    }

    @Override // p.lvn1
    public final Object[] e() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y3o1.l0(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
