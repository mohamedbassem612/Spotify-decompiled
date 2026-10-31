package p;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j4t implements c291 {
    public final df01 a;
    public final Deflater b;
    public boolean c;

    public j4t(df01 df01Var, Deflater deflater) {
        this.a = df01Var;
        this.b = deflater;
    }

    @Override // p.c291
    public final void B0(nac nacVar, long j) throws IOException {
        zod.u(nacVar.b, 0L, j);
        while (true) {
            Deflater deflater = this.b;
            if (j <= 0) {
                deflater.setInput(zno1.b, 0, 0);
                return;
            }
            ip51 ip51Var = nacVar.a;
            ip51Var.getClass();
            int iMin = (int) Math.min(j, ip51Var.c - ip51Var.b);
            deflater.setInput(ip51Var.a, ip51Var.b, iMin);
            a(false);
            long j2 = iMin;
            nacVar.b -= j2;
            int i = ip51Var.b + iMin;
            ip51Var.b = i;
            if (i == ip51Var.c) {
                nacVar.a = ip51Var.a();
                pq51.a(ip51Var);
            }
            j -= j2;
        }
    }

    public final void a(boolean z) throws IOException {
        ip51 ip51VarM;
        int iDeflate;
        df01 df01Var = this.a;
        nac nacVar = df01Var.b;
        while (true) {
            ip51VarM = nacVar.M(1);
            byte[] bArr = ip51VarM.a;
            int i = ip51VarM.c;
            Deflater deflater = this.b;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                ip51VarM.c += iDeflate;
                nacVar.b += (long) iDeflate;
                df01Var.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (ip51VarM.b == ip51VarM.c) {
            nacVar.a = ip51VarM.a();
            pq51.a(ip51VarM);
        }
    }

    @Override // p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        if (this.c) {
            return;
        }
        deflater.finish();
        a(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p.c291, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.a.flush();
    }

    @Override // p.c291
    public final gve1 l() {
        return this.a.a.l();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + ')';
    }
}
