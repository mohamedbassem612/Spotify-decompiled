package p;

import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aqc {
    public final boolean a;
    public final RestrictedIntegrationsResponse b;

    public aqc(boolean z, RestrictedIntegrationsResponse restrictedIntegrationsResponse) {
        this.a = z;
        this.b = restrictedIntegrationsResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqc)) {
            return false;
        }
        aqc aqcVar = (aqc) obj;
        return this.a == aqcVar.a && this.b.equals(aqcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
