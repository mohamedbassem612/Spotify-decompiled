package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wxb1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ayb1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxb1(ayb1 ayb1Var, onm onmVar) {
        super(onmVar);
        this.b = ayb1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((String) null, this);
    }
}
