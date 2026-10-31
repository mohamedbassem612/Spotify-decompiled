package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gu40 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public vr20 d;
    public int e;
    public final /* synthetic */ u5z f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu40(u5z u5zVar, lnm lnmVar) {
        super(lnmVar);
        this.f = u5zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
