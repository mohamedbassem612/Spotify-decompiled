package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wfl extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yfl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfl(yfl yflVar, onm onmVar) {
        super(onmVar);
        this.c = yflVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        d9n d9nVarA = this.c.a((String) null, this);
        return d9nVarA == d9n.a ? d9nVarA : new e331(d9nVarA);
    }
}
