package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tjo1 extends yho1 {
    public final transient Object[] h;
    public final transient boolean i;
    public final transient int t;

    /* JADX WARN: Multi-variable type inference failed */
    public tjo1(int i, int i2, Object[] objArr) {
        super((byte) 4);
        this.h = objArr;
        this.i = i;
        this.t = i2;
    }

    public final Object get(int i) {
        eio1.E(i, this.t);
        Object obj = this.h[i + i + (this.i ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.t;
    }
}
