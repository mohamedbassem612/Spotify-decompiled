package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n4r0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ o4r0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4r0(o4r0 o4r0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = o4r0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
