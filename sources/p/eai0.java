package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eai0 implements rjp0 {
    public final ymd0 a;
    public final rjp0 b;
    public int c = -1;

    public eai0(ymd0 ymd0Var, rjp0 rjp0Var) {
        this.a = ymd0Var;
        this.b = rjp0Var;
    }

    public final void a() {
        this.a.g(this);
    }

    @Override // p.rjp0
    public final void b(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.b(obj);
        }
    }
}
