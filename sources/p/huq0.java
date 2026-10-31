package p;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class huq0 implements c291 {
    public final FileOutputStream a;
    public final gve1 b;

    public huq0(FileOutputStream fileOutputStream, gve1 gve1Var) {
        this.a = fileOutputStream;
        this.b = gve1Var;
    }

    @Override // p.c291
    public final void B0(nac nacVar, long j) throws IOException {
        zod.u(nacVar.b, 0L, j);
        while (j > 0) {
            this.b.f();
            ip51 ip51Var = nacVar.a;
            ip51Var.getClass();
            int iMin = (int) Math.min(j, ip51Var.c - ip51Var.b);
            this.a.write(ip51Var.a, ip51Var.b, iMin);
            int i = ip51Var.b + iMin;
            ip51Var.b = i;
            long j2 = iMin;
            j -= j2;
            nacVar.b -= j2;
            if (i == ip51Var.c) {
                nacVar.a = ip51Var.a();
                pq51.a(ip51Var);
            }
        }
    }

    @Override // p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // p.c291, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // p.c291
    public final gve1 l() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }
}
