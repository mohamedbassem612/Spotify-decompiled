package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zbp1 extends d1p1 {
    public static final zbp1 e = new zbp1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public zbp1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // p.d1p1, p.wso1
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p.wso1
    public final int c() {
        return this.d;
    }

    @Override // p.wso1
    public final int d() {
        return 0;
    }

    @Override // p.wso1
    public final Object[] e() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gho1.u(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
