package androidx.car.app.model.signin;

import android.net.Uri;
import java.util.Objects;
import p.qrd;
import p.rj81;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class QRCodeSignInMethod implements rj81 {
    private final Uri mUri;

    public QRCodeSignInMethod(Uri uri) {
        Objects.requireNonNull(uri);
        this.mUri = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QRCodeSignInMethod) {
            return Objects.equals(this.mUri, ((QRCodeSignInMethod) obj).mUri);
        }
        return false;
    }

    public Uri getUri() {
        Uri uri = this.mUri;
        Objects.requireNonNull(uri);
        return uri;
    }

    public int hashCode() {
        return Objects.hash(this.mUri);
    }

    private QRCodeSignInMethod() {
        this.mUri = null;
    }
}
