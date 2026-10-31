package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vjg extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ wjg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjg(wjg wjgVar, onm onmVar) {
        super(onmVar);
        this.b = wjgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
