package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rwa1 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ swa1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwa1(swa1 swa1Var, onm onmVar) {
        super(onmVar);
        this.c = swa1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
