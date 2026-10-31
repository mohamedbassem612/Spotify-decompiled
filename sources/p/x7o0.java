package p;

import android.net.Network;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x7o0 extends y6o0 {
    public final Network a;

    public x7o0(Network network) {
        this.a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7o0) && this.a.equals(((x7o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
