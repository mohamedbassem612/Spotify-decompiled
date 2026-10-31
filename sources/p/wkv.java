package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wkv extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zkv b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkv(zkv zkvVar, onm onmVar) {
        super(onmVar);
        this.b = zkvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
