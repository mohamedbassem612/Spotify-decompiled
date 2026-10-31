package p;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ql00 extends hf30 {
    public final long b;
    public final boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ i25 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql00(i25 i25Var, fka1 fka1Var, long j, boolean z) {
        super(fka1Var);
        this.h = i25Var;
        this.b = j;
        this.c = z;
        this.e = true;
        if (j == 0) {
            a(null);
        }
    }

    @Override // p.hf30, p.fka1
    public final long O0(nac nacVar, long j) throws IOException {
        if (this.g) {
            eg.m("closed");
            return 0L;
        }
        try {
            long jO0 = this.a.O0(nacVar, j);
            boolean z = this.e;
            i25 i25Var = this.h;
            if (z) {
                this.e = false;
                ((xa00) i25Var.c).z((jf01) i25Var.b);
            }
            if (jO0 == -1) {
                a(null);
                return -1L;
            }
            long j2 = this.d + jO0;
            long j3 = this.b;
            if (j3 == -1 || j2 <= j3) {
                this.d = j2;
                if (((sl00) i25Var.e).e()) {
                    a(null);
                }
                return jO0;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    public final IOException a(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        i25 i25Var = this.h;
        if (iOException == null && this.e) {
            this.e = false;
            ((xa00) i25Var.c).z((jf01) i25Var.b);
        }
        return i25.b(i25Var, this.d, this.c, iOException, 8);
    }

    @Override // p.hf30, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }
}
