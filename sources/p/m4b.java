package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m4b extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ n4b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4b(n4b n4bVar, onm onmVar) {
        super(onmVar);
        this.b = n4bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s(null, this);
    }
}
