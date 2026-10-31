package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dq2 extends onm {
    public String a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fq2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(fq2 fq2Var, onm onmVar) {
        super(onmVar);
        this.d = fq2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.I((String) null, this, false);
    }
}
