package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z280 extends g7 implements c380 {
    public final c380 a;
    public final int b;
    public final int c;

    public z280(c380 c380Var, int i, int i2) {
        this.a = c380Var;
        this.b = i;
        wxo1.o(i, i2, c380Var.size());
        this.c = i2 - i;
    }

    public final int b() {
        return this.c;
    }

    public final Object get(int i) {
        wxo1.m(i, this.c);
        return this.a.get(this.b + i);
    }

    public final z280 subList(int i, int i2) {
        wxo1.o(i, i2, this.c);
        int i3 = this.b;
        return new z280(this.a, i + i3, i3 + i2);
    }
}
