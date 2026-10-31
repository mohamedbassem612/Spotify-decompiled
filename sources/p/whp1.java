package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class whp1 extends d1p1 {
    public final transient Object[] c;
    public final transient boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public whp1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    public final Object get(int i) {
        gho1.u(i, 1);
        Object obj = this.c[i + i + (this.d ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return 1;
    }
}
