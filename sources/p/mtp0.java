package p;

import com.spotify.offline_esperanto.proto.EsOffline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mtp0 {
    public final EsOffline.OfflineLicenseInfo.Expiry a;

    public mtp0(EsOffline.OfflineLicenseInfo.Expiry expiry) {
        this.a = expiry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtp0) && u890.j(this.a, ((mtp0) obj).a);
    }

    public final int hashCode() {
        EsOffline.OfflineLicenseInfo.Expiry expiry = this.a;
        if (expiry == null) {
            return 0;
        }
        return expiry.hashCode();
    }
}
