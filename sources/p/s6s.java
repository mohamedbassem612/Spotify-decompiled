package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s6s extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ l6s b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6s(l6s l6sVar, onm onmVar) {
        super(onmVar);
        this.b = l6sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.r(this);
    }
}
