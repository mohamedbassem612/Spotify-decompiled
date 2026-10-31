package p;

import com.spotify.address.endpoint.model.v1.proto.SubmitFormResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class biw implements giw {
    public final SubmitFormResponse.Suggestion a;

    public biw(SubmitFormResponse.Suggestion suggestion) {
        this.a = suggestion;
    }

    public final SubmitFormResponse.Suggestion a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof biw) && this.a.equals(((biw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
