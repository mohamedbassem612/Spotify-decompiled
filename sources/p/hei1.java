package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hei1 extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iei1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hei1(iei1 iei1Var, onm onmVar) {
        super(onmVar);
        this.d = iei1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.m(null, this);
    }
}
