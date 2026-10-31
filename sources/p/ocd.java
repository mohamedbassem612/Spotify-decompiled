package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ocd extends onm {
    public zu90 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pcd c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocd(pcd pcdVar, onm onmVar) {
        super(onmVar);
        this.c = pcdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
