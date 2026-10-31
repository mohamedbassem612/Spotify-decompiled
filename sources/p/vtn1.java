package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vtn1 extends rqn1 {
    public static final vtn1 t = new vtn1(0, new Object[0]);
    public final transient Object[] h;
    public final transient int i;

    public vtn1(int i, Object[] objArr) {
        super((byte) 3);
        this.h = objArr;
        this.i = i;
    }

    @Override // p.rqn1, p.e5n1
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        epo1.L(i, this.i);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p.e5n1
    public final int i() {
        return this.i;
    }

    @Override // p.e5n1
    public final int l() {
        return 0;
    }

    @Override // p.e5n1
    public final Object[] n() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
