package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gfy extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ hfy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfy(hfy hfyVar, onm onmVar) {
        super(onmVar);
        this.c = hfyVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
