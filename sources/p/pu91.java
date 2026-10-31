package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pu91 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ru91 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu91(ru91 ru91Var, onm onmVar) {
        super(onmVar);
        this.b = ru91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.c((bs41) null, 0.0f, (iu30) null, this);
    }
}
