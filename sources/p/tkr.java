package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tkr extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vkr d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkr(vkr vkrVar, onm onmVar) {
        super(onmVar);
        this.d = vkrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e((String) null, (String) null, this);
    }
}
