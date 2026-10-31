package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wum extends onm {
    public String a;
    public nvm b;
    public /* synthetic */ Object c;
    public final /* synthetic */ com.spotify.contribution.repositoryimpl.f d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wum(com.spotify.contribution.repositoryimpl.f fVar, onm onmVar) {
        super(onmVar);
        this.d = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b((String) null, (nvm) null, this);
    }
}
