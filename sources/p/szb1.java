package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class szb1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cgd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szb1(cgd cgdVar, lnm lnmVar) {
        super(lnmVar);
        this.b = cgdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
