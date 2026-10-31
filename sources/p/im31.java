package p;

import app.rive.ViewModelInstance;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class im31 extends onm {
    public qj31 a;
    public ViewModelInstance b;
    public Map c;
    public /* synthetic */ Object d;
    public final /* synthetic */ mm31 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im31(mm31 mm31Var, onm onmVar) {
        super(onmVar);
        this.e = mm31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, null, this);
    }
}
