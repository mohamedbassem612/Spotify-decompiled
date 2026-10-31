package p;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r6b1 extends SocketFactory {
    public final SocketFactory a = SocketFactory.getDefault();
    public final tif1 b = gex0.f();

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws SocketException {
        tif1 tif1Var = this.b;
        String str = "CLR-" + inetAddress;
        String str2 = "nt_socket_" + inetAddress;
        try {
            tif1Var.e(2, str, str2);
            Socket socketCreateSocket = this.a.createSocket(inetAddress, i);
            tif1Var.f(str, str2);
            socketCreateSocket.getClass();
            socketCreateSocket.setTcpNoDelay(true);
            return socketCreateSocket;
        } catch (Throwable th) {
            tif1Var.f(str, str2);
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws SocketException {
        tif1 tif1Var = this.b;
        String strM = l1d.m("CLR-", str);
        String strM2 = l1d.m("nt_socket_", str);
        try {
            tif1Var.e(2, strM, strM2);
            Socket socketCreateSocket = this.a.createSocket(str, i);
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
        tif1 tif1Var = this.b;
        String strM = l1d.m("CLR-", str);
        String strM2 = l1d.m("nt_socket_", str);
        try {
            tif1Var.e(2, strM, strM2);
            Socket socketCreateSocket = this.a.createSocket(str, i, inetAddress, i2);
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
    public final Socket createSocket() throws SocketException {
        tif1 tif1Var = this.b;
        try {
            tif1Var.e(2, "CLR", "nt_socket");
            Socket socketCreateSocket = this.a.createSocket();
            tif1Var.f("CLR", "nt_socket");
            socketCreateSocket.getClass();
            socketCreateSocket.setTcpNoDelay(true);
            return socketCreateSocket;
        } catch (Throwable th) {
            tif1Var.f("CLR", "nt_socket");
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException {
        tif1 tif1Var = this.b;
        String str = "CLR-" + inetAddress;
        String str2 = "nt_socket_" + inetAddress;
        try {
            tif1Var.e(2, str, str2);
            Socket socketCreateSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
            tif1Var.f(str, str2);
            socketCreateSocket.getClass();
            socketCreateSocket.setTcpNoDelay(true);
            return socketCreateSocket;
        } catch (Throwable th) {
            tif1Var.f(str, str2);
            throw th;
        }
    }
}
