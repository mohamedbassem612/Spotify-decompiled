package p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class reh0 implements teh0 {
    public final NsdServiceInfo a;

    public reh0(NsdServiceInfo nsdServiceInfo) {
        this.a = nsdServiceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof reh0) && this.a.equals(((reh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
