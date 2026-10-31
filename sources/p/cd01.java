package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cd01 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ed01 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd01(ed01 ed01Var, onm onmVar) {
        super(onmVar);
        this.b = ed01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
