package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j3q0 extends onm {
    public Set a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k3q0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3q0(k3q0 k3q0Var, onm onmVar) {
        super(onmVar);
        this.d = k3q0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
