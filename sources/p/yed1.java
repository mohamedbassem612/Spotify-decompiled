package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yed1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cn6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yed1(cn6 cn6Var, lnm lnmVar) {
        super(lnmVar);
        this.c = cn6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
