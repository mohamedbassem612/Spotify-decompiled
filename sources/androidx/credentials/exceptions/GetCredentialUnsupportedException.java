package androidx.credentials.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialUnsupportedException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetCredentialUnsupportedException extends GetCredentialException {
    public GetCredentialUnsupportedException(String str) {
        super("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION", str);
    }

    public GetCredentialUnsupportedException() {
        this(null);
    }
}
