package p;

import androidx.credentials.exceptions.GetCredentialException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ao21 implements fo21 {
    public final GetCredentialException a;

    public ao21(GetCredentialException getCredentialException) {
        this.a = getCredentialException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao21) && this.a.equals(((ao21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
