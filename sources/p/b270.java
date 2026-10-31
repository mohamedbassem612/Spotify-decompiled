package p;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b270 implements fka1 {
    public final ff01 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public b270(ff01 ff01Var) {
        this.a = ff01Var;
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) throws IOException {
        int i;
        int iG;
        do {
            int i2 = this.e;
            ff01 ff01Var = this.a;
            if (i2 == 0) {
                ff01Var.skip(this.f);
                this.f = 0;
                if ((this.c & 4) == 0) {
                    i = this.d;
                    int iN = w4n1.n(ff01Var);
                    this.e = iN;
                    this.b = iN;
                    int iD = ff01Var.d() & 255;
                    this.c = ff01Var.d() & 255;
                    Logger logger = c270.d;
                    if (logger.isLoggable(Level.FINE)) {
                        rhc rhcVar = o170.a;
                        logger.fine(o170.b(true, this.d, this.b, iD, this.c));
                    }
                    iG = ff01Var.g() & Integer.MAX_VALUE;
                    this.d = iG;
                    if (iD != 9) {
                        throw new IOException(iD + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jO0 = ff01Var.O0(nacVar, Math.min(j, i2));
                if (jO0 != -1) {
                    this.e -= (int) jO0;
                    return jO0;
                }
            }
            return -1L;
        } while (iG == i);
        k220.i("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.a.a.l();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
