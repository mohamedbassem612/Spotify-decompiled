package p;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a85 implements X509TrustManager {
    public final /* synthetic */ byte a;

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        byte b = this.a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        byte b = this.a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        switch (this.a) {
            case 0:
                return new X509Certificate[0];
            default:
                return new X509Certificate[0];
        }
    }

    private final void a(X509Certificate[] x509CertificateArr, String str) {
    }

    private final void b(X509Certificate[] x509CertificateArr, String str) {
    }

    private final void c(X509Certificate[] x509CertificateArr, String str) {
    }

    private final void d(X509Certificate[] x509CertificateArr, String str) {
    }
}
