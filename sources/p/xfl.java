package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xfl extends onm {
    public boolean a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yfl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfl(yfl yflVar, onm onmVar) {
        super(onmVar);
        this.d = yflVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        d9n d9nVarB = this.d.b((String) null, (String) null, this, false);
        return d9nVarB == d9n.a ? d9nVarB : new e331(d9nVarB);
    }
}
