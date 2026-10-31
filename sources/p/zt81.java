package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zt81 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ au81 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt81(au81 au81Var, onm onmVar) {
        super(onmVar);
        this.b = au81Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((ut81) null, this);
    }
}
