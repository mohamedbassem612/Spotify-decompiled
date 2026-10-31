package p;

import android.net.Network;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v6o0 extends y6o0 {
    public final Network a;

    public v6o0(Network network) {
        this.a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6o0) && this.a.equals(((v6o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
