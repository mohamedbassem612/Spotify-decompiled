package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uol1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vol1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uol1(vol1 vol1Var, onm onmVar) {
        super(onmVar);
        this.b = vol1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, this);
    }
}
