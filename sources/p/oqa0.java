package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oqa0 extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rqa0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqa0(rqa0 rqa0Var, onm onmVar) {
        super(onmVar);
        this.d = rqa0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
