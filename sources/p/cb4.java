package p;

import java.net.InetAddress;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cb4 {
    public final InetAddress a;
    public final int b;

    public cb4(InetAddress inetAddress, int i) {
        this.a = inetAddress;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb4)) {
            return false;
        }
        cb4 cb4Var = (cb4) obj;
        return this.a.equals(cb4Var.a) && this.b == cb4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
