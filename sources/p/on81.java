package p;

import com.spotify.signup.signup.v2.proto.CompleteAccountCreationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class on81 extends sn81 {
    public final CompleteAccountCreationResponse a;

    public on81(CompleteAccountCreationResponse completeAccountCreationResponse) {
        this.a = completeAccountCreationResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on81) && this.a.equals(((on81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
