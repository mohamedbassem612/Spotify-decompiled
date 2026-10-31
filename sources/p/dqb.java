package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dqb extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fqb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqb(fqb fqbVar, onm onmVar) {
        super(onmVar);
        this.b = fqbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objD = this.b.d(0, (byte[]) null, this);
        return objD == d9n.a ? objD : new e331(objD);
    }
}
