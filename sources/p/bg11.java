package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bg11 extends b380 {
    public static final bg11 e = new bg11(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public bg11(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // p.b380, p.q280
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p.q280
    public final Object[] d() {
        return this.c;
    }

    @Override // p.q280
    public final int e() {
        return this.d;
    }

    @Override // p.q280
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dm5.q(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p.q280
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // p.b380, p.q280
    public Object writeReplace() {
        return super.writeReplace();
    }
}
