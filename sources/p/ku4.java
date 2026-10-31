package p;

import org.chromium.net.NetworkException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ku4 extends NetworkException {
    public final android.net.http.NetworkException a;

    public ku4(android.net.http.NetworkException networkException, boolean z) {
        super(networkException.getMessage(), networkException);
        this.a = networkException;
        if (!z && w74.j(networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.isImmediatelyRetryable();
    }
}
