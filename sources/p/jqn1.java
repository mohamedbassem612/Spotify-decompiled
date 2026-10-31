package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jqn1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zsc b;
    public int c;
    public xrn1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqn1(zsc zscVar, onm onmVar) {
        super(onmVar);
        this.b = zscVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.K(this);
    }
}
