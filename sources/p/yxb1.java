package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yxb1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ayb1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxb1(ayb1 ayb1Var, onm onmVar) {
        super(onmVar);
        this.c = ayb1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f((String) null, this);
    }
}
