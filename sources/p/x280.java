package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x280 implements Serializable {
    public final Object[] a;

    public x280(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        return b380.q(this.a);
    }
}
