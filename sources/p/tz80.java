package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tz80 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ od00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz80(od00 od00Var, lnm lnmVar) {
        super(lnmVar);
        this.c = od00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
