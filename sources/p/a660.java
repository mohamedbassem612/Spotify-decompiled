package p;

import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a660 implements ec10 {
    public gc10 b;
    public fc10 c;
    public o0g d;
    public qpm0 e;
    public int g;
    public long h;
    public int i;
    public final izr0 a = new izr0(16);
    public long j = -1;
    public byte f = 0;

    @Override // p.ec10
    public final void a(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                qpm0 qpm0Var = this.e;
                qpm0Var.getClass();
                qpm0Var.a(j, j2);
                return;
            }
            return;
        }
        this.f = (byte) 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.b = gc10Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        while (true) {
            byte b = this.f;
            if (b == 0) {
                int i = this.i;
                izr0 izr0Var = this.a;
                if (i == 0) {
                    if (!fc10Var.g(izr0Var.a, 0, 8, true)) {
                        gc10 gc10Var = this.b;
                        gc10Var.getClass();
                        gc10Var.s();
                        this.b.c(new bc9(-9223372036854775807L));
                        this.f = (byte) 4;
                        return -1;
                    }
                    this.i = 8;
                    izr0Var.R(0);
                    this.h = izr0Var.G();
                    this.g = izr0Var.q();
                }
                if (this.h == 1) {
                    fc10Var.readFully(izr0Var.a, 8, 8);
                    this.i += 8;
                    this.h = izr0Var.K();
                }
                if (this.g == 1836086884) {
                    long position = fc10Var.getPosition();
                    this.j = position;
                    long j = this.i;
                    enm0 enm0Var = new enm0(0L, position - j, -9223372036854775807L, position, this.h - j);
                    gc10 gc10Var2 = this.b;
                    gc10Var2.getClass();
                    gtf1 gtf1VarW = gc10Var2.w(SemanticState.ReadOnly, 4);
                    ge30 ge30Var = new ge30();
                    ge30Var.n = asj0.p("image/heic");
                    ge30Var.l = new hjj0(enm0Var);
                    xvj1.q(ge30Var, gtf1VarW);
                    this.f = (byte) 2;
                } else {
                    this.f = (byte) 1;
                }
            } else if (b == 1) {
                fc10Var.u((int) (this.h - ((long) this.i)));
                this.i = 0;
                this.f = (byte) 0;
            } else {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 4) {
                            return -1;
                        }
                        bhn0.w();
                        return 0;
                    }
                    if (this.d == null || fc10Var != this.c) {
                        this.c = fc10Var;
                        this.d = new o0g(fc10Var, this.j);
                    }
                    qpm0 qpm0Var = this.e;
                    qpm0Var.getClass();
                    int iC = qpm0Var.c(this.d, sfv0Var);
                    if (iC == 1) {
                        sfv0Var.a += this.j;
                    }
                    return iC;
                }
                if (this.e == null) {
                    this.e = new qpm0(jqc1.o0, 8);
                }
                o0g o0gVar = new o0g(fc10Var, this.j);
                this.d = o0gVar;
                if (this.e.d(o0gVar)) {
                    qpm0 qpm0Var2 = this.e;
                    long j2 = this.j;
                    gc10 gc10Var3 = this.b;
                    gc10Var3.getClass();
                    qpm0Var2.b(new o0g(j2, gc10Var3, (byte) 15));
                    this.f = (byte) 3;
                } else {
                    gc10 gc10Var4 = this.b;
                    gc10Var4.getClass();
                    gc10Var4.s();
                    this.b.c(new bc9(-9223372036854775807L));
                    this.f = (byte) 4;
                }
            }
        }
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        return eio1.D(fc10Var, true);
    }

    @Override // p.ec10
    public final void release() {
        qpm0 qpm0Var = this.e;
        if (qpm0Var != null) {
            qpm0Var.getClass();
            this.e = null;
        }
    }
}
