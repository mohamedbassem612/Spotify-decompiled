package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c1x extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ w0x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1x(w0x w0xVar, lnm lnmVar) {
        super(lnmVar);
        this.c = w0xVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
