package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n90 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(vt vtVar, lnm lnmVar) {
        super(lnmVar);
        this.c = vtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
