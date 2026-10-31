package p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eap0 implements iap0 {
    public final NsdServiceInfo a;

    public final boolean equals(Object obj) {
        if (obj instanceof eap0) {
            return this.a.equals(((eap0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResolvedService(serviceInfo=" + this.a + ")";
    }
}
