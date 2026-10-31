package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w3s extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3s(rir rirVar, lnm lnmVar) {
        super(lnmVar);
        this.c = rirVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
