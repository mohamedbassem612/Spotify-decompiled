package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dwc extends onm {
    public fwc a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bwc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwc(bwc bwcVar, lnm lnmVar) {
        super(lnmVar);
        this.c = bwcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
