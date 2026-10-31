package androidx.credentials.exceptions;

import kotlin.Metadata;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialCustomException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetCredentialCustomException extends GetCredentialException {
    public final String c;

    public GetCredentialCustomException(String str, String str2) {
        super(str, str2);
        this.c = str;
        if (str.length() > 0) {
            return;
        }
        hhg1.n("type must not be empty");
        throw null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }
}
