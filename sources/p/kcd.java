package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kcd extends onm {
    public goe a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pcd c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcd(pcd pcdVar, onm onmVar) {
        super(onmVar);
        this.c = pcdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, null, this);
    }
}
