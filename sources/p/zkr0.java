package p;

import com.spotify.contribution.repositoryimpl.g;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zkr0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ g b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkr0(g gVar, onm onmVar) {
        super(onmVar);
        this.b = gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, 0, null, this);
    }
}
