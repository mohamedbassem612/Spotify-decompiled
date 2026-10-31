package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yd71 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ amd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd71(amd amdVar, onm onmVar) {
        super(onmVar);
        this.b = amdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((String) null, this);
    }
}
