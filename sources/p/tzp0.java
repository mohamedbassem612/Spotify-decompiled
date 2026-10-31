package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tzp0 extends hf30 {
    public final long b;
    public final ozp0 c;
    public final ntf0 d;
    public long e;
    public long f;
    public voe1 g;
    public boolean h;
    public boolean i;
    public boolean t;

    public tzp0(gbc gbcVar, long j, ozp0 ozp0Var, ntf0 ntf0Var) {
        super(gbcVar);
        this.b = j;
        this.c = ozp0Var;
        this.d = ntf0Var;
        if (j == 0) {
            a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    public final long O0(nac nacVar, long j) throws IOException {
        try {
            long jO0 = ((hf30) this).a.O0(nacVar, j);
            if (jO0 == -1) {
                a();
                return -1L;
            }
            if (jO0 > 0) {
                this.f += jO0;
                voe1 voe1VarK = gtv0.k();
                voe1 voe1Var = this.g;
                if (voe1Var != null) {
                    long j2 = voe1VarK.a;
                    long j3 = voe1Var.a;
                    int i = sjm0.b;
                    long jA = kkn.A(j2, j3);
                    int i2 = vzp0.d;
                    if (jfv.c(jA, dro.y()) >= 0) {
                        this.g = voe1VarK;
                        c();
                    }
                } else {
                    this.g = voe1VarK;
                    c();
                }
            }
            long j4 = this.e + jO0;
            this.e = j4;
            if (j4 == this.b) {
                a();
            }
            return jO0;
        } catch (IOException e) {
            this.t = true;
            c();
            throw e;
        }
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        c();
        this.d.invoke(Long.valueOf(this.e));
    }

    public final void c() {
        long j = this.f;
        if (j == 0) {
            return;
        }
        this.c.invoke(Long.valueOf(j));
        this.f = 0L;
    }

    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        super.close();
        if (this.t) {
            return;
        }
        a();
    }
}
