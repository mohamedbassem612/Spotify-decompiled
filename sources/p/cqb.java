package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cqb extends onm {
    public j120 a;
    public upb b;
    public sy21 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fqb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqb(fqb fqbVar, onm onmVar) {
        super(onmVar);
        this.e = fqbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objC = this.e.c((j120) null, this);
        return objC == d9n.a ? objC : new e331(objC);
    }
}
