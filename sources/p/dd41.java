package p;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dd41 implements gd41 {
    public final CreateCredentialException a;

    public dd41(CreateCredentialException createCredentialException) {
        this.a = createCredentialException;
    }

    public final CreateCredentialException a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd41) && this.a.equals(((dd41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
