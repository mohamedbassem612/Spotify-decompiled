package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class od2 extends onm {
    public short a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pd2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od2(pd2 pd2Var, onm onmVar) {
        super(onmVar);
        this.d = pd2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0L, this);
    }
}
