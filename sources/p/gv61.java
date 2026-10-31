package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gv61 implements mr20 {
    public final /* synthetic */ jge a;
    public final /* synthetic */ sq61 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kv61 d;
    public final /* synthetic */ zu61 e;
    public final /* synthetic */ int f;

    public gv61(jge jgeVar, sq61 sq61Var, int i, kv61 kv61Var, zu61 zu61Var, int i2) {
        this.a = jgeVar;
        this.b = sq61Var;
        this.c = i;
        this.d = kv61Var;
        this.e = zu61Var;
        this.f = i2;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        Object objCollect = this.a.collect(new fv61(vr20Var, this.b, this.c, this.d, this.e, this.f), lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
