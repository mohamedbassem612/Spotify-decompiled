package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w4o0 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kqi0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4o0(kqi0 kqi0Var, onm onmVar) {
        super(onmVar);
        this.c = kqi0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.i(false, this);
    }
}
