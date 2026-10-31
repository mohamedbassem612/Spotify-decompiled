package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class qtr {
    public boolean a;
    public boolean c;
    public boolean e;
    public rm5 g;
    public xu30 b = new bz0((byte) 7);
    public vu30 d = new s55((byte) 7);
    public bv30 f = new ptr(5, null);

    public mc41 a() {
        return this.g;
    }

    public final void b(bv30 bv30Var) {
        this.f = bv30Var;
        this.e = true;
    }

    public final void c(xu30 xu30Var) {
        this.b = xu30Var;
        this.a = true;
    }

    public final void d(iu30 iu30Var, vu30 vu30Var) {
        e(new rm5(iu30Var, vu30Var));
    }

    public void e(rm5 rm5Var) {
        this.g = rm5Var;
    }
}
