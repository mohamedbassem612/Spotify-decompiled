package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eoi0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bjx b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoi0(bjx bjxVar, onm onmVar) {
        super(onmVar);
        this.b = bjxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.J(null, null, this);
    }
}
