package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g6c0 {
    public final lzn0 a;
    public final iuz b;
    public final j6y c;
    public final evm1 d;
    public final kly0 e;
    public final q8n f;

    public g6c0(lzn0 lzn0Var, iuz iuzVar, j6y j6yVar, evm1 evm1Var, kly0 kly0Var, q8n q8nVar) {
        this.a = lzn0Var;
        this.b = iuzVar;
        this.c = j6yVar;
        this.d = evm1Var;
        this.e = kly0Var;
        this.f = q8nVar;
    }

    public final Object a(tv80 tv80Var, onm onmVar) {
        xab1 xab1Var;
        if (this.d.q()) {
            iuz iuzVar = this.b;
            iuzVar.c.d();
            xab1 xab1Var2 = iuzVar.d;
            if (xab1Var2 == null || !xab1Var2.isActive()) {
                iuzVar.d = fn31.T(iuzVar.b, (o8n) null, 0, new bu(iuzVar, (lnm) null, (byte) 16), 3);
            }
            this.c.a();
        }
        v6c0 v6c0Var = (v6c0) ((t6c0) this.e.get());
        if (v6c0Var.c.a() && ((xab1Var = v6c0Var.g) == null || !xab1Var.isActive())) {
            v6c0Var.g = fn31.T(v6c0Var.d, (o8n) null, 0, new no70(v6c0Var, (lnm) null, (byte) 23), 3);
        }
        Object objY = fn31.Y(this.f, new y160(tv80Var, this, null, (byte) 26), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
