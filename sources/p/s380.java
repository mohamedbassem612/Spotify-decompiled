package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s380 implements Serializable {
    public final Object[] a;

    public s380(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        return t380.q(this.a);
    }
}
