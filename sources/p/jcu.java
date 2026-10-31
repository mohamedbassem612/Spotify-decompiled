package p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jcu implements ncu {
    public final NsdServiceInfo a;

    public final boolean equals(Object obj) {
        if (obj instanceof jcu) {
            return this.a.equals(((jcu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LostService(serviceInfo=" + this.a + ")";
    }
}
