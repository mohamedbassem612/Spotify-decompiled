package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class an71 extends onm {
    public Set a;
    public Set b;
    public Set c;
    public /* synthetic */ Object d;
    public final /* synthetic */ in71 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an71(in71 in71Var, onm onmVar) {
        super(onmVar);
        this.e = in71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
