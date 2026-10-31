package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e7d0 extends onm {
    public qxc0 a;
    public ArrayList b;
    public Set c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wj3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7d0(wj3 wj3Var, onm onmVar) {
        super(onmVar);
        this.e = wj3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(null, this);
    }
}
