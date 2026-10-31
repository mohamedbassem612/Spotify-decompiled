package p;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nrs implements c291 {
    public final OutputStream a;
    public final c6a1 b;
    public final /* synthetic */ zsc c;

    public nrs(zsc zscVar) {
        this.c = zscVar;
        Socket socket = (Socket) zscVar.b;
        this.a = socket.getOutputStream();
        this.b = new c6a1(socket);
    }

    @Override // p.c291
    public final void B0(nac nacVar, long j) throws IOException {
        zod.u(nacVar.b, 0L, j);
        while (j > 0) {
            c6a1 c6a1Var = this.b;
            c6a1Var.f();
            ip51 ip51Var = nacVar.a;
            ip51Var.getClass();
            int iMin = (int) Math.min(j, ip51Var.c - ip51Var.b);
            c6a1Var.i();
            try {
                try {
                    this.a.write(ip51Var.a, ip51Var.b, iMin);
                    if (c6a1Var.j()) {
                        throw c6a1Var.l(null);
                    }
                    int i = ip51Var.b + iMin;
                    ip51Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    nacVar.b -= j2;
                    if (i == ip51Var.c) {
                        nacVar.a = ip51Var.a();
                        pq51.a(ip51Var);
                    }
                } catch (IOException e) {
                    if (!c6a1Var.j()) {
                        throw e;
                    }
                    throw c6a1Var.l(e);
                }
            } catch (Throwable th) {
                c6a1Var.j();
                throw th;
            }
        }
    }

    @Override // p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.a;
        zsc zscVar = this.c;
        c6a1 c6a1Var = this.b;
        c6a1Var.i();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) zscVar.c;
                Socket socket = (Socket) zscVar.b;
                int iC = ltn1.C(atomicInteger, 1);
                if (iC == 0) {
                    c6a1Var.j();
                    return;
                }
                if (iC != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    c6a1Var.j();
                    return;
                }
                socket.close();
                if (c6a1Var.j()) {
                    throw c6a1Var.l(null);
                }
            } catch (IOException e) {
                if (!c6a1Var.j()) {
                    throw e;
                }
                throw c6a1Var.l(e);
            }
        } catch (Throwable th) {
            c6a1Var.j();
            throw th;
        }
    }

    @Override // p.c291, java.io.Flushable
    public final void flush() throws IOException {
        c6a1 c6a1Var = this.b;
        c6a1Var.i();
        try {
            try {
                this.a.flush();
                if (c6a1Var.j()) {
                    throw c6a1Var.l(null);
                }
            } catch (IOException e) {
                if (!c6a1Var.j()) {
                    throw e;
                }
                throw c6a1Var.l(e);
            }
        } catch (Throwable th) {
            c6a1Var.j();
            throw th;
        }
    }

    @Override // p.c291
    public final gve1 l() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.b) + ')';
    }
}
