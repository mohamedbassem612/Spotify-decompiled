package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bpw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fwv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpw(fwv fwvVar, lnm lnmVar) {
        super(lnmVar);
        this.c = fwvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
