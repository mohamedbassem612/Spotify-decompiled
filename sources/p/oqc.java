package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oqc implements fka1 {
    public boolean a;
    public final /* synthetic */ gbc b;
    public final /* synthetic */ i25 c;
    public final /* synthetic */ df01 d;

    public oqc(gbc gbcVar, i25 i25Var, df01 df01Var) {
        this.b = gbcVar;
        this.c = i25Var;
        this.d = df01Var;
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) throws IOException {
        try {
            long jO0 = this.b.O0(nacVar, j);
            df01 df01Var = this.d;
            if (jO0 != -1) {
                nacVar.e(df01Var.b, nacVar.b - jO0, jO0);
                df01Var.a();
                return jO0;
            }
            if (!this.a) {
                this.a = true;
                df01Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.a) {
                throw e;
            }
            this.a = true;
            this.c.a();
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zG;
        if (!this.a) {
            try {
                zG = z4n1.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.a = true;
                this.c.a();
            }
        }
        this.b.close();
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.b.l();
    }
}
