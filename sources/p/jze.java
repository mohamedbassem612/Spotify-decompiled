package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jze extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ kze c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jze(kze kzeVar, onm onmVar) {
        super(onmVar);
        this.c = kzeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
