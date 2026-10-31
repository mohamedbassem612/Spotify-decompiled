package p;

import com.spotify.contribution.repositoryimpl.a;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wom extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wom(a aVar, onm onmVar) {
        super(onmVar);
        this.c = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((List) null, this);
    }
}
