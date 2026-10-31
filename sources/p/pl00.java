package p;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pl00 extends gf30 {
    public final long b;
    public final boolean c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ i25 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl00(i25 i25Var, c291 c291Var, long j, boolean z) {
        super(c291Var);
        this.h = i25Var;
        this.b = j;
        this.c = z;
        this.f = z;
    }

    @Override // p.gf30, p.c291
    public final void B0(nac nacVar, long j) throws IOException {
        if (this.g) {
            eg.m("closed");
            return;
        }
        long j2 = this.b;
        if (j2 != -1 && this.e + j > j2) {
            StringBuilder sbS = cy30.s(j2, "expected ", " bytes but received ");
            sbS.append(this.e + j);
            throw new ProtocolException(sbS.toString());
        }
        try {
            if (this.f) {
                this.f = false;
                i25 i25Var = this.h;
                ((xa00) i25Var.c).u((jf01) i25Var.b);
            }
            super.B0(nacVar, j);
            this.e += j;
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    public final IOException a(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return i25.b(this.h, this.e, this.c, iOException, 4);
    }

    @Override // p.gf30, p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        long j = this.b;
        if (j != -1 && this.e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }

    @Override // p.gf30, p.c291, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionA = a(e);
            iOExceptionA.getClass();
            throw iOExceptionA;
        }
    }
}
