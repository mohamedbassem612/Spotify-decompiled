package p;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l170 extends i170 {
    public long e;
    public final /* synthetic */ n170 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l170(n170 n170Var, l370 l370Var, long j) {
        super(n170Var, l370Var);
        this.f = n170Var;
        this.e = j;
        if (j == 0) {
            a(v360.b);
        }
    }

    @Override // p.i170, p.fka1
    public final long O0(nac nacVar, long j) throws IOException {
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            eg.m("closed");
            return 0L;
        }
        long j2 = this.e;
        if (j2 == 0) {
            return -1L;
        }
        long jO0 = super.O0(nacVar, Math.min(j2, j));
        if (jO0 == -1) {
            this.f.b.b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(n170.f);
            throw protocolException;
        }
        long j3 = this.e - jO0;
        this.e = j3;
        if (j3 == 0) {
            a(v360.b);
        }
        return jO0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.c) {
            return;
        }
        if (this.e != 0) {
            try {
                zG = z4n1.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.f.b.b();
                a(n170.f);
            }
        }
        this.c = true;
    }
}
