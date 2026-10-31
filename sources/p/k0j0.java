package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k0j0 {
    public final String a;
    public final CappingState b;

    static {
        CappingState.Companion companion = CappingState.INSTANCE;
    }

    public k0j0(String str, CappingState cappingState) {
        this.a = str;
        this.b = cappingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (k0j0.class.equals(obj != null ? obj.getClass() : null)) {
            return u890.j(this.a, ((k0j0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
