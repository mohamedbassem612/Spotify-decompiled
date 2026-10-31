package p;

import com.spotify.address.endpoint.model.v1.proto.GetFormResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class byz implements o700 {
    public final GetFormResponse a;

    public byz(GetFormResponse getFormResponse) {
        this.a = getFormResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byz) && u890.j(this.a, ((byz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
