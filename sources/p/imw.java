package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class imw extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mmw b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imw(mmw mmwVar, onm onmVar) {
        super(onmVar);
        this.b = mmwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
