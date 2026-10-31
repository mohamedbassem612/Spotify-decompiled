package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sha implements o5d0 {
    public final o5d0 a;
    public byte b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public sha(o5d0 o5d0Var) {
        this.a = o5d0Var;
    }

    public final void a() {
        byte b = this.b;
        if (b == 0) {
            return;
        }
        o5d0 o5d0Var = this.a;
        if (b == 1) {
            o5d0Var.b(this.c, this.d);
        } else if (b == 2) {
            o5d0Var.c(this.c, this.d);
        } else if (b == 3) {
            o5d0Var.d(this.c, this.d, this.e);
        }
        this.e = null;
        this.b = (byte) 0;
    }

    @Override // p.o5d0
    public final void b(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = (byte) 1;
    }

    @Override // p.o5d0
    public final void c(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            a();
            this.c = i;
            this.d = i2;
            this.b = (byte) 2;
        }
    }

    @Override // p.o5d0
    public final void d(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.e == obj) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = (byte) 3;
    }

    @Override // p.o5d0
    public final void e(int i, int i2) {
        a();
        this.a.e(i, i2);
    }
}
