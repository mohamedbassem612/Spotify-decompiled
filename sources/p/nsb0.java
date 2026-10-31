package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nsb0 {
    public final Object a;
    public final qsb0 b;
    public int d;
    public nsb0 e;
    public boolean f;
    public int c = -1;
    public final hrr0 g = xto.t((Object) null);

    public nsb0(Object obj, qsb0 qsb0Var) {
        this.a = obj;
        this.b = qsb0Var;
    }

    public final nsb0 a() {
        if (this.f) {
            tf80.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            nsb0 nsb0Var = (nsb0) this.g.getValue();
            if (nsb0Var != null) {
                nsb0Var.a();
            } else {
                nsb0Var = null;
            }
            this.e = nsb0Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            tf80.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            nsb0 nsb0Var = this.e;
            if (nsb0Var != null) {
                nsb0Var.b();
            }
            this.e = null;
        }
    }
}
