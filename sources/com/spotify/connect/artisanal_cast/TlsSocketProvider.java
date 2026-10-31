package com.spotify.connect.artisanal_cast;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.bhn0;
import p.k220;
import p.lh2;
import p.orc1;
import p.sl21;
import p.sye1;
import p.xu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001/B7\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R,\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/spotify/connect/artisanal_cast/TlsSocketProvider;", "", "Lkotlin/Function0;", "Ljava/net/Socket;", "socketFactory", "Lkotlin/Function3;", "", "", "Ljavax/net/ssl/SSLSocket;", "tlsSocketFactory", "<init>", "(Lkotlin/jvm/functions/Function0;Lp/xu30;)V", "()V", "socketOrThrow", "()Ljavax/net/ssl/SSLSocket;", "expectedSocket", "Lp/rih1;", "closeSocket", "(Ljava/net/Socket;)V", "host", "port", "connect", "(Ljava/lang/String;I)V", "startHandshake", "", "read", "()[B", "data", "", "send", "([B)Z", "close", "Lkotlin/jvm/functions/Function0;", "Lp/xu30;", "Ljava/util/concurrent/ExecutorService;", "writer", "Ljava/util/concurrent/ExecutorService;", "socketLock", "Ljava/lang/Object;", "socket", "Ljava/net/Socket;", "closed", "Z", "Ljava/io/IOException;", "writeError", "Ljava/io/IOException;", "Companion", "p/sye1", "shared_connect_artisanal_cast-tls_socket_android_kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TlsSocketProvider {
    private static final sye1 Companion = new sye1();

    @Deprecated
    public static final int READ_BUFFER_SIZE = 16384;
    private volatile boolean closed;
    private Socket socket;
    private final Function0 socketFactory;
    private final Object socketLock;
    private final xu30 tlsSocketFactory;
    private volatile IOException writeError;
    private final ExecutorService writer;

    public TlsSocketProvider() {
        this(orc1.a1, new lh2(3, Companion, sye1.class, "createPlatformSocket", "createPlatformSocket(Ljava/net/Socket;Ljava/lang/String;I)Ljavax/net/ssl/SSLSocket;", 0, (byte) 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeSocket(Socket expectedSocket) {
        synchronized (this.socketLock) {
            if (this.socket == expectedSocket) {
                this.socket = null;
            }
        }
        Companion.getClass();
        if (expectedSocket != null) {
            try {
                expectedSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    private final SSLSocket socketOrThrow() {
        SSLSocket sSLSocket;
        synchronized (this.socketLock) {
            Socket socket = this.socket;
            sSLSocket = socket instanceof SSLSocket ? (SSLSocket) socket : null;
        }
        if (sSLSocket != null) {
            return sSLSocket;
        }
        k220.i("Socket is not connected");
        return null;
    }

    public final void close() {
        Socket socket;
        synchronized (this.socketLock) {
            this.closed = true;
            socket = this.socket;
            this.socket = null;
        }
        this.writer.shutdownNow();
        Companion.getClass();
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void connect(String host, int port) throws Exception {
        String str;
        boolean z;
        Socket socket = (Socket) this.socketFactory.invoke();
        synchronized (this.socketLock) {
            try {
                if (this.closed) {
                    str = "Socket is closed";
                } else if (this.socket != null) {
                    str = "Socket is already connected";
                } else {
                    this.socket = socket;
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            Companion.getClass();
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
            bhn0.f(str);
            return;
        }
        boolean z2 = true;
        try {
            socket.connect(new InetSocketAddress(host, port), 15000);
            SSLSocket sSLSocket = (SSLSocket) this.tlsSocketFactory.invoke(socket, host, Integer.valueOf(port));
            synchronized (this.socketLock) {
                if (this.closed || this.socket != socket) {
                    z = true;
                } else {
                    this.socket = sSLSocket;
                    z = false;
                }
            }
            if (z) {
                Companion.getClass();
                if (sSLSocket != null) {
                    try {
                        sSLSocket.close();
                    } catch (IOException unused2) {
                    }
                }
                throw new SocketException("Socket is closed");
            }
        } catch (Exception e) {
            synchronized (this.socketLock) {
                if (this.socket == socket) {
                    this.socket = null;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Companion.getClass();
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
                throw e;
            }
        }
    }

    public final byte[] read() throws IOException {
        byte[] bArr = new byte[READ_BUFFER_SIZE];
        try {
            int i = socketOrThrow().getInputStream().read(bArr);
            if (i < 0) {
                return null;
            }
            return Arrays.copyOf(bArr, i);
        } catch (IOException e) {
            IOException iOException = this.writeError;
            if (iOException != null) {
                throw new IOException("TLS write failed", iOException);
            }
            throw e;
        }
    }

    public final boolean send(byte[] data) {
        SSLSocket sSLSocket;
        synchronized (this.socketLock) {
            Socket socket = this.socket;
            sSLSocket = socket instanceof SSLSocket ? (SSLSocket) socket : null;
        }
        if (sSLSocket == null || this.closed) {
            return false;
        }
        try {
            this.writer.execute(new sl21(sSLSocket, data, this, (byte) 10));
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    public final void startHandshake() throws SocketException {
        SSLSocket sSLSocketSocketOrThrow = socketOrThrow();
        sSLSocketSocketOrThrow.setSoTimeout(15000);
        try {
            sSLSocketSocketOrThrow.startHandshake();
        } finally {
            try {
                sSLSocketSocketOrThrow.setSoTimeout(0);
            } catch (SocketException unused) {
            }
        }
    }

    public TlsSocketProvider(Function0 function0, xu30 xu30Var) {
        this.socketFactory = function0;
        this.tlsSocketFactory = xu30Var;
        this.writer = Executors.newSingleThreadExecutor();
        this.socketLock = new Object();
    }
}
