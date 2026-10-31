package p;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fb80 implements fka1 {
    public final ff01 a;
    public final Inflater b;
    public int c;
    public boolean d;

    public fb80(fka1 fka1Var, Inflater inflater) {
        this(sj1.g(fka1Var), inflater);
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) throws IOException {
        do {
            long jA = a(nacVar, j);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.z0());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(nac nacVar, long j) throws IOException {
        Inflater inflater = this.b;
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.d) {
            eg.m("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                ip51 ip51VarM = nacVar.M(1);
                int iMin = (int) Math.min(j, 8192 - ip51VarM.c);
                boolean zNeedsInput = inflater.needsInput();
                ff01 ff01Var = this.a;
                if (zNeedsInput && !ff01Var.z0()) {
                    ip51 ip51Var = ff01Var.b.a;
                    ip51Var.getClass();
                    int i = ip51Var.c;
                    int i2 = ip51Var.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(ip51Var.a, i2, i3);
                }
                int iInflate = inflater.inflate(ip51VarM.a, ip51VarM.c, iMin);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    ff01Var.skip(remaining);
                }
                if (iInflate > 0) {
                    ip51VarM.c += iInflate;
                    long j2 = iInflate;
                    nacVar.b += j2;
                    return j2;
                }
                if (ip51VarM.b == ip51VarM.c) {
                    nacVar.a = ip51VarM.a();
                    pq51.a(ip51VarM);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.a.a.l();
    }

    public fb80(ff01 ff01Var, Inflater inflater) {
        this.a = ff01Var;
        this.b = inflater;
    }
}
