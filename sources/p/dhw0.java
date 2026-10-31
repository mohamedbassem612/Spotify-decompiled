package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dhw0 extends onm {
    public Context.Builder a;
    public ContextPage.Builder b;
    public Collection c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ghw0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhw0(ghw0 ghw0Var, onm onmVar) {
        super(onmVar);
        this.e = ghw0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
