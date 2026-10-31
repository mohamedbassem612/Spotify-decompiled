package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c2c implements a2c {
    public final izr0 a;
    public final int b;
    public final int c;
    public int d;
    public short e;

    public c2c(npm0 npm0Var) {
        izr0 izr0Var = npm0Var.e;
        this.a = izr0Var;
        izr0Var.R(12);
        this.c = izr0Var.I() & 255;
        this.b = izr0Var.I();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, short] */
    public final int a() {
        izr0 izr0Var = this.a;
        int i = this.c;
        if (i == 8) {
            return izr0Var.E();
        }
        if (i == 16) {
            return izr0Var.L();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        ?? E = izr0Var.E();
        this.e = E;
        return (E & 240) >> 4;
    }

    public final int d() {
        return -1;
    }

    public final int k() {
        return this.b;
    }
}
