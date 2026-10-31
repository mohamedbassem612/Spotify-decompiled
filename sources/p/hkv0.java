package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hkv0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jkv0 c;
    public zjv0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkv0(jkv0 jkv0Var, onm onmVar) {
        super(onmVar);
        this.c = jkv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
