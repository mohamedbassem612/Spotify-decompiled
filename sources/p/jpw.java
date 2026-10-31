package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jpw extends onm {
    public String a;
    public String b;
    public String c;
    public q1m d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kpw f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpw(kpw kpwVar, onm onmVar) {
        super(onmVar);
        this.f = kpwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object objA = this.f.a(null, null, null, null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
