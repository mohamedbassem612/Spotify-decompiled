package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vdc0 extends onm {
    public Set a;
    public ouc0 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zdc0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdc0(zdc0 zdc0Var, onm onmVar) {
        super(onmVar);
        this.e = zdc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.l(null, this);
    }
}
