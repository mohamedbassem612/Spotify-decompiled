package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mwc0 {
    public final xrc0 a;
    public final cp5 b;
    public final kly0 c;
    public final q8n d;

    public mwc0(xrc0 xrc0Var, cp5 cp5Var, caq caqVar, q8n q8nVar) {
        this.a = xrc0Var;
        this.b = cp5Var;
        this.c = caqVar;
        this.d = q8nVar;
    }

    public final o67 a() {
        bdc1 bdc1Var = bdc1.a;
        if (bdc1Var.equals(bdc1Var)) {
            return new o67((byte) 3, this.b, this.d, this.a, ((xo4) this.c.get()).a());
        }
        if (bdc1Var.equals(adc1.a)) {
            hhg1.h("ListMembersSource does not support Strategy.MultiGet");
            return null;
        }
        eg.o();
        return null;
    }
}
