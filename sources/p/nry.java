package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nry extends onm {
    public long a;
    public ou80 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pry e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nry(pry pryVar, onm onmVar) {
        super(onmVar);
        this.e = pryVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(0L, null, false, this);
    }
}
