package p;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bdl1 implements adl1 {
    public final gc10 a;
    public final gtf1 b;
    public final w8h c;
    public final ie30 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public bdl1(gc10 gc10Var, gtf1 gtf1Var, w8h w8hVar, String str, int i) throws ParserException {
        this.a = gc10Var;
        this.b = gtf1Var;
        this.c = w8hVar;
        int i2 = w8hVar.a;
        int i3 = w8hVar.b;
        int i4 = (w8hVar.d * i2) / 8;
        int i5 = w8hVar.c;
        if (i5 != i4) {
            throw ParserException.a((RuntimeException) null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        ge30 ge30Var = new ge30();
        ge30Var.n = asj0.p("audio/wav");
        ge30Var.o = asj0.p(str);
        ge30Var.i = i7;
        ge30Var.j = i7;
        ge30Var.f52p = iMax;
        ge30Var.I = i2;
        int i8 = w8hVar.f;
        ge30Var.J = i8 == 0 ? -1 : i8 << 2;
        ge30Var.K = i3;
        ge30Var.L = i;
        this.d = new ie30(ge30Var);
    }

    @Override // p.adl1
    public final void a(int i, long j) {
        ddl1 ddl1Var = new ddl1(this.c, 1, i, j);
        this.a.c(ddl1Var);
        ie30 ie30Var = this.d;
        gtf1 gtf1Var = this.b;
        gtf1Var.a(ie30Var);
        gtf1Var.g(ddl1Var.e);
    }

    @Override // p.adl1
    public final boolean b(fc10 fc10Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iE = this.b.e(fc10Var, (int) Math.min(i2 - i, j2), true);
            if (iE == -1) {
                j2 = 0;
            } else {
                this.g += iE;
                j2 -= (long) iE;
            }
        }
        w8h w8hVar = this.c;
        int i3 = w8hVar.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = w8hVar.b;
            String str = zoi1.a;
            long jG0 = j3 + zoi1.g0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.b(jG0, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // p.adl1
    public final void c(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }
}
