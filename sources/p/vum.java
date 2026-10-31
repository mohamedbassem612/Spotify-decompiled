package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vum extends onm {
    public List a;
    public List b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ com.spotify.contribution.repositoryimpl.f g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vum(com.spotify.contribution.repositoryimpl.f fVar, onm onmVar) {
        super(onmVar);
        this.g = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((List) null, this);
    }
}
