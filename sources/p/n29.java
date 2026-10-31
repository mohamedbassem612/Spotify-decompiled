package p;

import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n29 {
    public final byte a;
    public final Surface b;

    /* JADX WARN: Multi-variable type inference failed */
    public n29(int i, Surface surface) {
        this.a = i;
        if (surface != null) {
            this.b = surface;
        } else {
            bhn0.i("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n29)) {
            return false;
        }
        n29 n29Var = (n29) obj;
        return this.a == n29Var.a && this.b.equals(n29Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + ((int) this.a) + ", surface=" + this.b + "}";
    }
}
