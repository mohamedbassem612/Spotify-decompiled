package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hwl extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ iwl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwl(iwl iwlVar, lnm lnmVar) {
        super(lnmVar);
        this.c = iwlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
