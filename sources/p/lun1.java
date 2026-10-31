package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lun1 extends rqn1 {
    public final transient Object[] h;
    public final transient boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public lun1(int i, Object[] objArr) {
        super((byte) 3);
        this.h = objArr;
        this.i = i;
    }

    public final Object get(int i) {
        epo1.L(i, 1);
        Object obj = this.h[i + i + (this.i ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return 1;
    }
}
