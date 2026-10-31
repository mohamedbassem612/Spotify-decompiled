package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class duc0 extends onm {
    public String a;
    public orc0 b;
    public haa0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ haa0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duc0(haa0 haa0Var, onm onmVar) {
        super(onmVar);
        this.e = haa0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.p((String) null, (orc0) null, this);
    }
}
