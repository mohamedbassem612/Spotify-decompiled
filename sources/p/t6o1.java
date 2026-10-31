package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t6o1 extends n6o1 {
    public static final t6o1 e = new t6o1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public t6o1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // p.y5o1
    public final Object[] b() {
        return this.c;
    }

    @Override // p.y5o1
    public final int d() {
        return this.d;
    }

    @Override // p.y5o1
    public final boolean e() {
        return false;
    }

    @Override // p.n6o1, p.y5o1
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ila0.M(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
