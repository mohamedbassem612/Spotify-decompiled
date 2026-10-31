package p;

import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yhw implements diw {
    public final SubmitCheckoutResponse.Dialog a;

    public yhw(SubmitCheckoutResponse.Dialog dialog) {
        this.a = dialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhw) && this.a.equals(((yhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
