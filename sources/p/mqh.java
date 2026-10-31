package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mqh extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nqh d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqh(nqh nqhVar, onm onmVar) {
        super(onmVar);
        this.d = nqhVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objA = this.d.a(null, null, this);
        return objA == d9n.a ? objA : new ei31((String) objA);
    }
}
