package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ses0 {
    public int a;
    public final jh5[] b;
    public final k3r[] c;
    public boolean d;
    public int e;

    public ses0(int i, jh5[] jh5VarArr, k3r[] k3rVarArr) {
        this.a = i;
        this.b = jh5VarArr;
        this.c = k3rVarArr;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        eg.m("PeekBuffer is not leased");
    }

    public final void b(int i) {
        if (i < 0 || i >= this.a) {
            bhn0.f(cy30.i(i, "Index ", this.a, " is outside PeekBuffer size "));
        }
    }

    public final int c() {
        return this.a;
    }

    public final void d(int i) {
        a();
        b(i);
        if (this.e > 0) {
            e(i);
        } else {
            eg.m("A filter frame must be active");
        }
    }

    public abstract void e(int i);

    public abstract boolean f(int i);

    public final boolean g(int i) {
        a();
        b(i);
        return (this.b[i] == null || this.c[i] != null || f(i)) ? false : true;
    }

    public final jh5 h(int i) {
        b(i);
        return this.b[i];
    }

    public final void i(long j) {
        a();
        if (this.e <= 0) {
            eg.m("No filter frame is active");
        } else {
            j(j);
            this.e--;
        }
    }

    public abstract void j(long j);

    public final long k() {
        a();
        this.e++;
        return l();
    }

    public abstract long l();

    public abstract void m();

    public final void n(int i, k3r k3rVar) {
        a();
        if (!g(i)) {
            bhn0.f(gvg.e(i, "Position ", " is not visible and unresolved"));
        } else {
            b(i);
            this.c[i] = k3rVar;
        }
    }

    public final k3r o(int i) {
        b(i);
        return this.c[i];
    }

    public final void p(int i, jh5 jh5Var) {
        a();
        b(i);
        this.b[i] = jh5Var;
    }
}
