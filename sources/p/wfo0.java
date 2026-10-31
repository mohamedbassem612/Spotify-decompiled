package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wfo0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ wmy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfo0(wmy wmyVar, onm onmVar) {
        super(onmVar);
        this.b = wmyVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.I(this);
    }
}
