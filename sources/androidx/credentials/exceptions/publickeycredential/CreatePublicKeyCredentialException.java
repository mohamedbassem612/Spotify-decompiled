package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Metadata;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CreatePublicKeyCredentialException extends CreateCredentialException {
    public static final /* synthetic */ int d = 0;
    public final String c;

    public CreatePublicKeyCredentialException(String str, CharSequence charSequence) {
        super(str, charSequence);
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
