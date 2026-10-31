package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wjg implements owy0 {
    public final tka0 a = rc11.a.b(rto0.class);

    public wjg(d520 d520Var, wmy wmyVar, uz5 uz5Var, ji5 ji5Var) {
    }

    @Override // p.owy0
    public final tka0 a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.owy0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object b(rto0 rto0Var, onm onmVar) {
        vjg vjgVar;
        if (onmVar instanceof vjg) {
            vjgVar = (vjg) onmVar;
            int i = vjgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vjgVar.c = i - Integer.MIN_VALUE;
            } else {
                vjgVar = new vjg(this, onmVar);
            }
        } else {
            vjgVar = new vjg(this, onmVar);
        }
        Object obj = vjgVar.a;
        int i2 = vjgVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            return new fs50(new bho0(4), rto0Var.d, "");
        }
        if (i2 == 1) {
            hm5.M(obj);
            throw null;
        }
        if (i2 == 2) {
            hm5.M(obj);
            return obj;
        }
        eg.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
