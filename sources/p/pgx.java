package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class pgx {
    public final int a;
    public final vu30 b;
    public final vu30 c;
    public final vu30 d;

    public /* synthetic */ pgx(int i, int i2, vu30 vu30Var) {
        this((i2 & 1) != 0 ? 19 : i, vu30Var, v30.U0, urw.a1);
    }

    public int a() {
        return this.a;
    }

    public pgx(int i, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3) {
        this.a = i;
        this.b = vu30Var;
        this.c = vu30Var2;
        this.d = vu30Var3;
    }
}
