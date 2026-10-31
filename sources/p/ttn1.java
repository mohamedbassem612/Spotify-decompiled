package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ttn1 extends dsn1 {
    public static final ttn1 e = new ttn1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public ttn1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // p.dsn1, p.srn1
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p.srn1
    public final int c() {
        return this.d;
    }

    @Override // p.srn1
    public final int d() {
        return 0;
    }

    @Override // p.srn1
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        r4o1.Y(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p.srn1
    public final Object[] i() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
