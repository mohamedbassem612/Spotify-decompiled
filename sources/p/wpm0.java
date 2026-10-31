package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wpm0 implements ytw {
    public final izr0 a;
    public final xpm0 b;
    public final String c;
    public final int d;
    public final String e;
    public gtf1 f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public wpm0(String str, int i, String str2) {
        izr0 izr0Var = new izr0(4);
        this.a = izr0Var;
        izr0Var.a[0] = -1;
        this.b = new xpm0();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // p.ytw
    public final void a(izr0 izr0Var) {
        this.f.getClass();
        while (izr0Var.a() > 0) {
            byte b = this.h;
            izr0 izr0Var2 = this.a;
            if (b == 0) {
                byte[] bArr = izr0Var.a;
                int i = izr0Var.b;
                int i2 = izr0Var.c;
                while (true) {
                    if (i >= i2) {
                        izr0Var.R(i2);
                        break;
                    }
                    byte b2 = bArr[i];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.k && (b2 & 224) == 224;
                    this.k = z;
                    if (z2) {
                        izr0Var.R(i + 1);
                        this.k = false;
                        izr0Var2.a[1] = bArr[i];
                        this.i = 2;
                        this.h = (byte) 1;
                        break;
                    }
                    i++;
                }
            } else if (b == 1) {
                int iMin = Math.min(izr0Var.a(), 4 - this.i);
                izr0Var.o(this.i, izr0Var2.a, iMin);
                int i3 = this.i + iMin;
                this.i = i3;
                if (i3 >= 4) {
                    izr0Var2.R(0);
                    int iQ = izr0Var2.q();
                    xpm0 xpm0Var = this.b;
                    if (xpm0Var.a(iQ)) {
                        this.m = xpm0Var.c;
                        if (!this.j) {
                            this.l = (((long) xpm0Var.g) * 1000000) / ((long) xpm0Var.d);
                            ge30 ge30Var = new ge30();
                            ge30Var.a = this.g;
                            ge30Var.n = asj0.p(this.e);
                            ge30Var.o = asj0.p(xpm0Var.b);
                            ge30Var.f52p = SemanticState.Obscured;
                            ge30Var.I = xpm0Var.e;
                            ge30Var.K = xpm0Var.d;
                            ge30Var.d = this.c;
                            ge30Var.f = this.d;
                            this.f.a(new ie30(ge30Var));
                            this.j = true;
                        }
                        izr0Var2.R(0);
                        this.f.f(4, izr0Var2);
                        this.h = (byte) 2;
                    } else {
                        this.i = 0;
                        this.h = (byte) 1;
                    }
                }
            } else {
                if (b != 2) {
                    bhn0.w();
                    return;
                }
                int iMin2 = Math.min(izr0Var.a(), this.m - this.i);
                this.f.f(iMin2, izr0Var);
                int i4 = this.i + iMin2;
                this.i = i4;
                if (i4 >= this.m) {
                    dm5.y(this.n != -9223372036854775807L);
                    this.f.b(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = (byte) 0;
                }
            }
        }
    }

    @Override // p.ytw
    public final void b() {
        this.h = (byte) 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        wwg1Var.a();
        wwg1Var.b();
        this.g = wwg1Var.e;
        wwg1Var.b();
        this.f = gc10Var.w(wwg1Var.d, 1);
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        this.n = j;
    }
}
