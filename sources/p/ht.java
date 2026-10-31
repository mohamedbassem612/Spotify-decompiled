package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ht extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jt b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(jt jtVar, lnm lnmVar) {
        super(lnmVar);
        this.b = jtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.invoke(null, this);
    }
}
