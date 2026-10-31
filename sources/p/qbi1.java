package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qbi1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sbi1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbi1(sbi1 sbi1Var, onm onmVar) {
        super(onmVar);
        this.c = sbi1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, (String) null, this);
    }
}
