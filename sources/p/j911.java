package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j911 implements d6o0 {
    public final /* synthetic */ float a;
    public final /* synthetic */ es41 b;
    public final /* synthetic */ n8b1 c;

    public j911(float f, es41 es41Var, n8b1 n8b1Var) {
        this.a = f;
        this.b = es41Var;
        this.c = n8b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(long j, long j2, lnm lnmVar) {
        i911 i911Var;
        if (lnmVar instanceof i911) {
            i911Var = (i911) lnmVar;
            int i = i911Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i911Var.c = i - Integer.MIN_VALUE;
            } else {
                i911Var = new i911(this, (onm) lnmVar);
            }
        } else {
            i911Var = new i911(this, (onm) lnmVar);
        }
        Object obj = i911Var.a;
        int i2 = i911Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            es41 es41Var = this.b;
            int iMin = (int) Math.min(this.a, es41Var.f.s());
            int iS = es41Var.a.s();
            if (iMin > 0 && iS > 0 && iS < iMin) {
                if (iS < iMin / 2) {
                    iMin = 0;
                }
                i911Var.c = 1;
                Object objF = es41Var.f(iMin, this.c, i911Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new qui1(0L);
    }
}
