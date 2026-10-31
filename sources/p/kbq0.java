package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kbq0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mbq0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbq0(mbq0 mbq0Var, onm onmVar) {
        super(onmVar);
        this.b = mbq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(this);
    }
}
