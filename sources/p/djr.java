package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class djr extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ijr c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djr(ijr ijrVar, onm onmVar) {
        super(onmVar);
        this.c = ijrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((String) null, this, false);
    }
}
