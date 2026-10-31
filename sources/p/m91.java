package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m91 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ n91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m91(n91 n91Var, onm onmVar) {
        super(onmVar);
        this.c = n91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
