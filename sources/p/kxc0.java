package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kxc0 {
    public final xrc0 a;
    public final cp5 b;
    public final kly0 c;
    public final q8n d;

    public kxc0(xrc0 xrc0Var, cp5 cp5Var, caq caqVar, q8n q8nVar) {
        this.a = xrc0Var;
        this.b = cp5Var;
        this.c = caqVar;
        this.d = q8nVar;
    }

    public final jxc0 a(cdc1 cdc1Var) {
        boolean zEquals = cdc1Var.equals(bdc1.a);
        cp5 cp5Var = this.b;
        q8n q8nVar = this.d;
        xrc0 xrc0Var = this.a;
        if (zEquals) {
            return new mxc0(cp5Var, q8nVar, xrc0Var, ((xo4) this.c.get()).a());
        }
        if (cdc1Var.equals(adc1.a)) {
            return new hxc0(cp5Var, q8nVar, xrc0Var);
        }
        eg.o();
        return null;
    }
}
