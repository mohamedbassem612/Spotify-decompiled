package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class abl extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ y0l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abl(y0l y0lVar, lnm lnmVar) {
        super(lnmVar);
        this.c = y0lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
