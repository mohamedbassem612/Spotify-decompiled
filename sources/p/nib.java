package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nib extends onm {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public vr20 d;
    public int e;
    public final /* synthetic */ hib f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nib(hib hibVar, lnm lnmVar) {
        super(lnmVar);
        this.f = hibVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.emit((Object) null, this);
    }
}
