package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jkd extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vnb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkd(vnb vnbVar, lnm lnmVar) {
        super(lnmVar);
        this.c = vnbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
