package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class chn1 extends egn1 {
    public static final chn1 t = new chn1(0, new Object[0]);
    public final transient Object[] h;
    public final transient int i;

    public chn1(int i, Object[] objArr) {
        super((byte) 2);
        this.h = objArr;
        this.i = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wmo1.D(i, this.i);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p.e5n1
    public final Object[] k() {
        return this.h;
    }

    @Override // p.e5n1
    public final int l() {
        return 0;
    }

    @Override // p.e5n1
    public final int m() {
        return this.i;
    }

    @Override // p.egn1, p.e5n1
    public final int o(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
