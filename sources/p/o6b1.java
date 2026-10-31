package p;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o6b1 extends SSLSocketFactory {
    public final X509TrustManager a;
    public final SSLSocketFactory b;
    public final tif1 c;

    public o6b1() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        this.c = !ihc1.h0("profile", "release", false) ? xco0.a : e95.a;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                this.a = x509TrustManager;
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
                this.b = sSLContext.getSocketFactory();
                return;
            }
        }
        bhn0.f("Unexpected default trust managers:".concat(Arrays.toString(trustManagers)));
        throw null;
    }

    public final X509TrustManager a() {
        return this.a;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws SocketException {
        tif1 tif1Var = this.c;
        String str2 = "TLS-" + socket;
        String strM = l1d.m("nt_socket_", str);
        try {
            tif1Var.e(2, str2, strM);
            Socket socketCreateSocket = this.b.createSocket(socket, str, i, z);
            tif1Var.f(str2, strM);
            socketCreateSocket.getClass();
            socketCreateSocket.setTcpNoDelay(true);
            return socketCreateSocket;
        } catch (Throwable th) {
            tif1Var.f(str2, strM);
            throw th;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.b.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.b.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws SocketException {
        tif1 tif1Var = this.c;
        String strM = l1d.m("TLS-", str);
        String strM2 = l1d.m("nt_socket_", str);
        try {
            tif1Var.e(2, strM, strM2);
            Socket socketCreateSocket = this.b.createSocket(str, i);
            tif1Var.f(strM, strM2);
            socketCreateSocket.getClass();
            socketCreateSocket.setTcpNoDelay(true);
            return socketCreateSocket;
        } catch (Throwable th) {
            tif1Var.f(strM, strM2);
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws SocketException {
        tif1 tif1Var = this.c;
        String strM = l1d.m("TLS-", str);
        String strM2 = l1d.m("nt_socket_", str);
        try {
            tif1Var.e(2, strM, strM2);
            Socket socketCreateSocket = this.b.createSocket(str, i, inetAddress, i2);
            tif1Var.f(strM, strM2);
            socketCreateSocket.getClass();
            socketCreateSocket.setTcpNoDelay(true);
            return socketCreateSocket;
        } catch (Throwable th) {
            tif1Var.f(strM, strM2);
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.b.createSocket(inetAddress, i);
        socketCreateSocket.getClass();
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.b.createSocket(inetAddress, i, inetAddress2, i2);
        socketCreateSocket.getClass();
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }
}
