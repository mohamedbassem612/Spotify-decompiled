package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ty2 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ gid b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty2(gid gidVar, onm onmVar) {
        super(onmVar);
        this.b = gidVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
