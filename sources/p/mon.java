package p;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mon implements oon {
    public final CreateCredentialException a;

    public mon(CreateCredentialException createCredentialException) {
        this.a = createCredentialException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mon) && this.a.equals(((mon) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
