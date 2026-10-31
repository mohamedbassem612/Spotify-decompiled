package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pi31 extends onm {
    public ni31 a;
    public Map b;
    public byte[] c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ti31 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi31(ti31 ti31Var, onm onmVar) {
        super(onmVar);
        this.e = ti31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, this);
    }
}
