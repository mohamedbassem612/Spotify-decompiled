package p;

import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ef01 extends InputStream implements InputStreamRetargetInterface {
    public final /* synthetic */ ff01 a;

    public ef01(ff01 ff01Var) {
        this.a = ff01Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        ff01 ff01Var = this.a;
        if (!ff01Var.c) {
            return (int) Math.min(ff01Var.b.b, 2147483647L);
        }
        k220.i("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ff01 ff01Var = this.a;
        nac nacVar = ff01Var.b;
        if (ff01Var.c) {
            k220.i("closed");
            return 0;
        }
        zod.u(bArr.length, i, i2);
        if (nacVar.b == 0 && ff01Var.a.O0(nacVar, 8192L) == -1) {
            return -1;
        }
        return nacVar.read(bArr, i, i2);
    }

    public final String toString() {
        return this.a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) throws IOException {
        ff01 ff01Var = this.a;
        nac nacVar = ff01Var.b;
        if (ff01Var.c) {
            k220.i("closed");
            return 0L;
        }
        long j = 0;
        while (true) {
            if (nacVar.b == 0 && ff01Var.a.O0(nacVar, 8192L) == -1) {
                return j;
            }
            long j2 = nacVar.b;
            j += j2;
            zod.u(j2, 0L, j2);
            ip51 ip51Var = nacVar.a;
            while (j2 > 0) {
                ip51Var.getClass();
                int iMin = (int) Math.min(j2, ip51Var.c - ip51Var.b);
                outputStream.write(ip51Var.a, ip51Var.b, iMin);
                int i = ip51Var.b + iMin;
                ip51Var.b = i;
                long j3 = iMin;
                nacVar.b -= j3;
                j2 -= j3;
                if (i == ip51Var.c) {
                    ip51 ip51VarA = ip51Var.a();
                    nacVar.a = ip51VarA;
                    pq51.a(ip51Var);
                    ip51Var = ip51VarA;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        ff01 ff01Var = this.a;
        nac nacVar = ff01Var.b;
        if (ff01Var.c) {
            k220.i("closed");
            return 0;
        }
        if (nacVar.b == 0 && ff01Var.a.O0(nacVar, 8192L) == -1) {
            return -1;
        }
        return nacVar.u() & 255;
    }
}
