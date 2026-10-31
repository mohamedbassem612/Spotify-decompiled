package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pz2 implements vr20 {
    public final /* synthetic */ tl7 a;
    public final /* synthetic */ n811 b;
    public final /* synthetic */ float c;

    public pz2(pgr pgrVar, n811 n811Var, float f) {
        this.a = pgrVar;
        this.b = n811Var;
        this.c = f;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        int iIntValue = ((Number) obj).intValue();
        n811 n811Var = this.b;
        tl7.f(this.a, iIntValue - n811Var.a, (Float) null, this.c, 6);
        n811Var.a = iIntValue;
        return rih1.a;
    }
}
