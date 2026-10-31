package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bc21 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ rut0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc21(rut0 rut0Var, onm onmVar) {
        super(onmVar);
        this.b = rut0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j((String) null, this);
    }
}
