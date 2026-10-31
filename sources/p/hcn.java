package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hcn extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ icn c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcn(icn icnVar, onm onmVar) {
        super(onmVar);
        this.c = icnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
