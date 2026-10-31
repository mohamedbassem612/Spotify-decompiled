package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m4s extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ n4s b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4s(n4s n4sVar, onm onmVar) {
        super(onmVar);
        this.b = n4sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
