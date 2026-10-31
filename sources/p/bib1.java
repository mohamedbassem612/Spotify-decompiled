package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bib1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rd1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bib1(rd1 rd1Var, onm onmVar) {
        super(onmVar);
        this.c = rd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
