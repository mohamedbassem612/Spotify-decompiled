package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hhb extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ihb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhb(ihb ihbVar, onm onmVar) {
        super(onmVar);
        this.b = ihbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
