package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class di60 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ei60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di60(ei60 ei60Var, onm onmVar) {
        super(onmVar);
        this.c = ei60Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
