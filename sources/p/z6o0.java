package p;

import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z6o0 extends y6o0 {
    public final Network a;
    public final NetworkCapabilities b;

    public z6o0(Network network, NetworkCapabilities networkCapabilities) {
        this.a = network;
        this.b = networkCapabilities;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6o0)) {
            return false;
        }
        z6o0 z6o0Var = (z6o0) obj;
        return this.a.equals(z6o0Var.a) && this.b.equals(z6o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
