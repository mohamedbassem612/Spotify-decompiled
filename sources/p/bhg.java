package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bhg extends onm {
    public boolean a;
    public boolean b;
    public tv80 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ chg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhg(chg chgVar, onm onmVar) {
        super(onmVar);
        this.e = chgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.o(false, null, false, this);
    }
}
