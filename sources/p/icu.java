package p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class icu implements ncu {
    public final NsdServiceInfo a;

    public final boolean equals(Object obj) {
        if (obj instanceof icu) {
            return this.a.equals(((icu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FoundService(serviceInfo=" + this.a + ")";
    }
}
