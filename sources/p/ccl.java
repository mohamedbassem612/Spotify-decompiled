package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ccl extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ecl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccl(ecl eclVar, onm onmVar) {
        super(onmVar);
        this.b = eclVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
