package p;

import com.spotify.accessory.categorizer.CategorizerResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lks extends onm {
    public ikb a;
    public CategorizerResponse b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mks d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lks(mks mksVar, onm onmVar) {
        super(onmVar);
        this.d = mksVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
