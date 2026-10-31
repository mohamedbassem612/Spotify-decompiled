package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kry extends onm {
    public String a;
    public tv80 b;
    public ou80 c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pry f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kry(pry pryVar, onm onmVar) {
        super(onmVar);
        this.f = pryVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this, null, false);
    }
}
