package p;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c6a1 extends fj7 {
    public final Socket n;

    public c6a1(Socket socket) {
        this.n = socket;
    }

    @Override // p.fj7
    public final void k() {
        Socket socket = this.n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!v4n1.a(e)) {
                throw e;
            }
            v4n1.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            v4n1.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
