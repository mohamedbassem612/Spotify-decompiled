package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dkv0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fkv0 c;
    public xjv0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkv0(fkv0 fkv0Var, onm onmVar) {
        super(onmVar);
        this.c = fkv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
