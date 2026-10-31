package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class asd1 {
    public pl10[] a;
    public boolean b;
    public char c;
    public Object d;

    public static asd1 b() {
        asd1 asd1Var = new asd1();
        asd1Var.b = true;
        asd1Var.c = (char) 0;
        return asd1Var;
    }

    public asd1 a() {
        zod.j("execute parameter required", ((vy11) this.d) != null);
        pl10[] pl10VarArr = this.a;
        boolean z = this.b;
        char c = this.c;
        asd1 asd1Var = new asd1();
        asd1Var.d = this;
        asd1Var.a = pl10VarArr;
        boolean z2 = false;
        if (pl10VarArr != null && z) {
            z2 = true;
        }
        asd1Var.b = z2;
        asd1Var.c = c;
        return asd1Var;
    }

    public void c(px40 px40Var, bsd1 bsd1Var) {
        ((vy11) ((asd1) this.d).d).accept(px40Var, bsd1Var);
    }

    public void d(vy11 vy11Var) {
        this.d = vy11Var;
    }

    public void e() {
        this.b = false;
    }

    public void f(pl10... pl10VarArr) {
        this.a = pl10VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(int i) {
        this.c = i;
    }

    public boolean h() {
        return this.b;
    }

    public pl10[] i() {
        return this.a;
    }

    public int j() {
        return this.c;
    }
}
