package p;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a94 extends anm1 {
    public final X509TrustManager d;
    public final X509TrustManagerExtensions e;

    public a94(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.d = x509TrustManager;
        this.e = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a94) && ((a94) obj).d == this.d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.d);
    }

    public final List o(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.e.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
