package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vmw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmw(wmw wmwVar, onm onmVar) {
        super(onmVar);
        this.c = wmwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
