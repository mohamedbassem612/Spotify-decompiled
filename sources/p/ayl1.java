package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ayl1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ byl1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayl1(byl1 byl1Var, lnm lnmVar) {
        super(lnmVar);
        this.b = byl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
