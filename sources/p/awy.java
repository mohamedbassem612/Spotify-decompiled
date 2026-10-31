package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class awy extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ sjb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awy(sjb sjbVar, onm onmVar) {
        super(onmVar);
        this.b = sjbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y(null, null, this);
    }
}
