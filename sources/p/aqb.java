package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aqb extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fqb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqb(fqb fqbVar, onm onmVar) {
        super(onmVar);
        this.b = fqbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        Object objA = this.b.a((iu30) null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
