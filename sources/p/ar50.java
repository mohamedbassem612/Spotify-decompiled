package p;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ar50 implements c291 {
    public final df01 a;
    public final Deflater b;
    public final j4t c;
    public boolean d;
    public final CRC32 e;

    public ar50(c291 c291Var) {
        df01 df01Var = new df01(c291Var);
        this.a = df01Var;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new j4t(df01Var, deflater);
        this.e = new CRC32();
        nac nacVar = df01Var.b;
        nacVar.V(8075);
        nacVar.R(8);
        nacVar.R(0);
        nacVar.U(0);
        nacVar.R(0);
        nacVar.R(0);
    }

    @Override // p.c291
    public final void B0(nac nacVar, long j) throws IOException {
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        ip51 ip51Var = nacVar.a;
        ip51Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, ip51Var.c - ip51Var.b);
            this.e.update(ip51Var.a, ip51Var.b, iMin);
            j2 -= (long) iMin;
            ip51Var = ip51Var.f;
            ip51Var.getClass();
        }
        this.c.B0(nacVar, j);
    }

    @Override // p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        df01 df01Var = this.a;
        nac nacVar = df01Var.b;
        if (this.d) {
            return;
        }
        try {
            j4t j4tVar = this.c;
            j4tVar.b.finish();
            j4tVar.a(false);
            int value = (int) this.e.getValue();
            if (df01Var.c) {
                throw new IllegalStateException("closed");
            }
            nacVar.U(zod.M(value));
            df01Var.a();
            int bytesRead = (int) deflater.getBytesRead();
            if (df01Var.c) {
                throw new IllegalStateException("closed");
            }
            nacVar.U(zod.M(bytesRead));
            df01Var.a();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                }
            }
            try {
                df01Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.d = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p.c291, java.io.Flushable
    public final void flush() throws IOException {
        this.c.flush();
    }

    @Override // p.c291
    public final gve1 l() {
        return this.a.a.l();
    }
}
