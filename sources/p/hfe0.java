package p;

import java.net.InetAddress;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hfe0 {
    public final InetAddress a;
    public final int b;

    public hfe0(InetAddress inetAddress, int i) {
        this.a = inetAddress;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfe0)) {
            return false;
        }
        hfe0 hfe0Var = (hfe0) obj;
        return this.a.equals(hfe0Var.a) && this.b == hfe0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
