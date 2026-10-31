package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ek81 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fk81 c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek81(fk81 fk81Var, onm onmVar) {
        super(onmVar);
        this.c = fk81Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
