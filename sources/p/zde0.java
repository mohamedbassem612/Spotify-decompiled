package p;

import com.spotify.local_files_esperanto.proto.EsLocalFiles$DefaultSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zde0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ eee0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zde0(eee0 eee0Var, onm onmVar) {
        super(onmVar);
        this.b = eee0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((EsLocalFiles$DefaultSource) null, this);
    }
}
