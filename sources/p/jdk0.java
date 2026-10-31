package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jdk0 extends onm {
    public boolean a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ldk0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdk0(ldk0 ldk0Var, onm onmVar) {
        super(onmVar);
        this.d = ldk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.j(false, this);
    }
}
