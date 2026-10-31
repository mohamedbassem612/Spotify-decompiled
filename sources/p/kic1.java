package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kic1 implements Serializable {
    public final Object a;
    public final int b;

    public kic1(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kic1)) {
            return false;
        }
        kic1 kic1Var = (kic1) obj;
        return u890.j(this.a, kic1Var.a) && this.b == kic1Var.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Integer.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
