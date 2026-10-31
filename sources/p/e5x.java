package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e5x {
    public byte a = 1;
    public final slj0 b;
    public slj0 c;
    public slj0 d;
    public int e;
    public int f;

    public e5x(slj0 slj0Var) {
        this.b = slj0Var;
        this.c = slj0Var;
    }

    public final int a(int i) {
        slj0 slj0Var = (slj0) this.c.a.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a == 2) {
            if (slj0Var != null) {
                this.c = slj0Var;
                this.f++;
            } else if (i == 65038) {
                b();
            } else if (i != 65039) {
                slj0 slj0Var2 = this.c;
                if (slj0Var2.b != null) {
                    i3 = 3;
                    if (this.f != 1) {
                        this.d = slj0Var2;
                        b();
                    } else if (c()) {
                        this.d = this.c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i2 = i3;
        } else if (slj0Var == null) {
            b();
        } else {
            this.a = (byte) 2;
            this.c = slj0Var;
            this.f = 1;
            i2 = i3;
        }
        this.e = i;
        return i2;
    }

    public final void b() {
        this.a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean c() {
        mkj0 mkj0VarC = this.c.b.c();
        int iA = mkj0VarC.a(6);
        return !(iA == 0 || mkj0VarC.b.get(iA + mkj0VarC.a) == 0) || this.e == 65039;
    }
}
