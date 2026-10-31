package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class idw0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jdw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idw0(jdw0 jdw0Var, onm onmVar) {
        super(onmVar);
        this.c = jdw0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
