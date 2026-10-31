package p;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ors implements fka1 {
    public final InputStream a;
    public final c6a1 b;
    public final /* synthetic */ zsc c;

    public ors(zsc zscVar) {
        this.c = zscVar;
        Socket socket = (Socket) zscVar.b;
        this.a = socket.getInputStream();
        this.b = new c6a1(socket);
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) throws IOException {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        c6a1 c6a1Var = this.b;
        c6a1Var.f();
        ip51 ip51VarM = nacVar.M(1);
        int iMin = (int) Math.min(j, 8192 - ip51VarM.c);
        try {
            c6a1Var.i();
            try {
                try {
                    int i = this.a.read(ip51VarM.a, ip51VarM.c, iMin);
                    if (c6a1Var.j()) {
                        throw c6a1Var.l(null);
                    }
                    if (i != -1) {
                        ip51VarM.c += i;
                        long j2 = i;
                        nacVar.b += j2;
                        return j2;
                    }
                    if (ip51VarM.b != ip51VarM.c) {
                        return -1L;
                    }
                    nacVar.a = ip51VarM.a();
                    pq51.a(ip51VarM);
                    return -1L;
                } catch (IOException e) {
                    if (c6a1Var.j()) {
                        throw c6a1Var.l(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                c6a1Var.j();
                throw th;
            }
        } catch (AssertionError e2) {
            if (v4n1.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zsc zscVar = this.c;
        c6a1 c6a1Var = this.b;
        c6a1Var.i();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) zscVar.c;
                Socket socket = (Socket) zscVar.b;
                int iC = ltn1.C(atomicInteger, 2);
                if (iC == 0) {
                    c6a1Var.j();
                    return;
                }
                if (iC == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    c6a1Var.j();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.a.close();
                    }
                }
                if (c6a1Var.j()) {
                    throw c6a1Var.l(null);
                }
            } catch (Throwable th) {
                c6a1Var.j();
                throw th;
            }
        } catch (IOException e) {
            if (!c6a1Var.j()) {
                throw e;
            }
            throw c6a1Var.l(e);
        }
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
