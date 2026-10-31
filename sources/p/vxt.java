package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vxt extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wxt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxt(wxt wxtVar, onm onmVar) {
        super(onmVar);
        this.c = wxtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
