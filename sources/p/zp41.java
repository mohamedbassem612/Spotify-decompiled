package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zp41 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bq41 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp41(bq41 bq41Var, onm onmVar) {
        super(onmVar);
        this.c = bq41Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
