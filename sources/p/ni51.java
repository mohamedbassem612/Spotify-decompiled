package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ni51 implements xwg1 {
    public final mi51 a;
    public final izr0 b = new izr0(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public ni51(mi51 mi51Var) {
        this.a = mi51Var;
    }

    @Override // p.xwg1
    public final void a(int i, izr0 izr0Var) {
        int iE;
        boolean z = (i & 1) != 0;
        if (z) {
            iE = izr0Var.b + izr0Var.E();
        } else {
            iE = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            izr0Var.R(iE);
            this.d = 0;
        }
        while (izr0Var.a() > 0) {
            int i2 = this.d;
            izr0 izr0Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iE2 = izr0Var.E();
                    izr0Var.R(izr0Var.b - 1);
                    if (iE2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(izr0Var.a(), 3 - this.d);
                izr0Var.o(this.d, izr0Var2.a, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    izr0Var2.R(0);
                    izr0Var2.Q(3);
                    izr0Var2.S(1);
                    int iE3 = izr0Var2.E();
                    int iE4 = izr0Var2.E();
                    this.e = (iE3 & SemanticState.Focused) != 0;
                    int i4 = (((iE3 & 15) << 8) | iE4) + 3;
                    this.c = i4;
                    byte[] bArr = izr0Var2.a;
                    if (bArr.length < i4) {
                        izr0Var2.d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(izr0Var.a(), this.c - this.d);
                izr0Var.o(this.d, izr0Var2.a, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        izr0Var2.Q(i6);
                    } else {
                        if (zoi1.q(0, izr0Var2.a, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        izr0Var2.Q(this.c - 4);
                    }
                    izr0Var2.R(0);
                    this.a.a(izr0Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // p.xwg1
    public final void b() {
        this.f = true;
    }

    @Override // p.xwg1
    public final void c(yve1 yve1Var, gc10 gc10Var, wwg1 wwg1Var) {
        this.a.c(yve1Var, gc10Var, wwg1Var);
        this.f = true;
    }
}
