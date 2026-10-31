package p;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xj80 implements fka1 {
    public final InputStream a;
    public final gve1 b;

    public xj80(InputStream inputStream, gve1 gve1Var) {
        this.a = inputStream;
        this.b = gve1Var;
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
        try {
            this.b.f();
            ip51 ip51VarM = nacVar.M(1);
            int i = this.a.read(ip51VarM.a, ip51VarM.c, (int) Math.min(j, 8192 - ip51VarM.c));
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
        } catch (AssertionError e) {
            if (v4n1.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
