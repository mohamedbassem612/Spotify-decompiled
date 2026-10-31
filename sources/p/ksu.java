package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ksu extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ lsu c;
    public r261 d;
    public esu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksu(lsu lsuVar, onm onmVar) {
        super(onmVar);
        this.c = lsuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
