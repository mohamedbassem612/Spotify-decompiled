package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vhu0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ z2h b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhu0(z2h z2hVar, onm onmVar) {
        super(onmVar);
        this.b = z2hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
