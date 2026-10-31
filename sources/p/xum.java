package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xum extends onm {
    public String a;
    public nvm b;
    public zgo1 c;
    public som d;
    public /* synthetic */ Object e;
    public final /* synthetic */ com.spotify.contribution.repositoryimpl.f f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xum(com.spotify.contribution.repositoryimpl.f fVar, onm onmVar) {
        super(onmVar);
        this.f = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c((String) null, (nvm) null, (zgo1) null, this);
    }
}
