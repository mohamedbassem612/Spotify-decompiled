package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xmk0 {
    public final long a;
    public final int b;
    public final Set c;

    public xmk0(int i, long j, Set set) {
        this.a = j;
        this.b = i;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmk0)) {
            return false;
        }
        xmk0 xmk0Var = (xmk0) obj;
        return this.a == xmk0Var.a && this.b == xmk0Var.b && this.c.equals(xmk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Long.hashCode(this.a) * 31, 31);
    }
}
