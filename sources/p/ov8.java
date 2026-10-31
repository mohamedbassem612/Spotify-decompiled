package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ov8 extends onm {
    public lv8 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rwj c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov8(rwj rwjVar, onm onmVar) {
        super(onmVar);
        this.c = rwjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.s(null, this);
    }
}
