package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ytc0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ haa0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytc0(haa0 haa0Var, onm onmVar) {
        super(onmVar);
        this.c = haa0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.f((String) null, this);
    }
}
