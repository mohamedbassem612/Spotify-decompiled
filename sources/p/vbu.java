package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vbu extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wbu c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbu(wbu wbuVar, onm onmVar) {
        super(onmVar);
        this.c = wbuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
