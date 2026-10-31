package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class swm1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rwm1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swm1(rwm1 rwm1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = rwm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
