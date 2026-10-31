package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class au20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ kud c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au20(kud kudVar, lnm lnmVar) {
        super(lnmVar);
        this.c = kudVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
