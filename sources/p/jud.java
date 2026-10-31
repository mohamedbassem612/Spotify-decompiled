package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jud extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ kud e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jud(kud kudVar, lnm lnmVar) {
        super(lnmVar);
        this.e = kudVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
