package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y460 implements hn41 {
    public final kly0 a;
    public final kly0 b;

    public y460(caq caqVar, caq caqVar2) {
        this.a = caqVar;
        this.b = caqVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.hn41
    public final Object a(onm onmVar) {
        x460 x460Var;
        if (onmVar instanceof x460) {
            x460Var = (x460) onmVar;
            int i = x460Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x460Var.c = i - Integer.MIN_VALUE;
            } else {
                x460Var = new x460(this, onmVar);
            }
        } else {
            x460Var = new x460(this, onmVar);
        }
        Object obj = x460Var.a;
        int i2 = x460Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (((z44) this.b.get()).a() && !((ilb1) this.a.get()).a.b().a(w8c0.d)) {
            return "headless_startup";
        }
        x460Var.c = 1;
        hap1.f(x460Var);
        return d9n.a;
    }
}
