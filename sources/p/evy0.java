package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class evy0 extends onm {
    public String a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ivy0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evy0(ivy0 ivy0Var, lnm lnmVar) {
        super(lnmVar);
        this.d = ivy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.invoke(null, this);
    }
}
