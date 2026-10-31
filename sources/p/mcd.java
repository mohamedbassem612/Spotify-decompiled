package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mcd extends onm {
    public goe a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pcd e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcd(pcd pcdVar, onm onmVar) {
        super(onmVar);
        this.e = pcdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, null, null, null, this);
    }
}
