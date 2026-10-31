package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oz90 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pz90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz90(pz90 pz90Var, onm onmVar) {
        super(onmVar);
        this.c = pz90Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
