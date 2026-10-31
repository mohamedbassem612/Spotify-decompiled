package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vy20 {
    public final dz20 a;
    public final ha4 b;
    public final oen0 c;
    public final oen0 d;
    public boolean e;

    public vy20(dz20 dz20Var, ha4 ha4Var) {
        this.a = dz20Var;
        this.b = ha4Var;
        oen0 oen0Var = ij41.a;
        this.c = new oen0();
        this.d = new oen0();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        y0u y0uVar = new y0u(this);
        wdn0 wdn0Var = this.b.Q1;
        if (wdn0Var.h(y0uVar) < 0) {
            wdn0Var.b(y0uVar);
        }
        this.e = true;
    }
}
