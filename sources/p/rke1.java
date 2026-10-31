package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rke1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ lvc1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rke1(lvc1 lvc1Var, onm onmVar) {
        super(onmVar);
        this.b = lvc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.R(this);
    }
}
