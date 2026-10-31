package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lcd extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ pcd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcd(pcd pcdVar, onm onmVar) {
        super(onmVar);
        this.b = pcdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, null, this);
    }
}
