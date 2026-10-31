package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i5p1 extends r3p1 {
    public static final i5p1 e;
    public static final m3p1 f;
    public final transient Object[] c;
    public final transient int d;

    static {
        i5p1 i5p1Var = new i5p1(0, new Object[0]);
        e = i5p1Var;
        f = new m3p1(i5p1Var, 0);
    }

    public i5p1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // p.j3p1
    public final Object[] c() {
        return this.c;
    }

    @Override // p.j3p1
    public final int d() {
        return 0;
    }

    @Override // p.j3p1
    public final int e() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ulo1.w(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p.r3p1, p.j3p1
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
