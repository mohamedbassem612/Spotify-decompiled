package p;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t60 extends onm {
    public LinkedHashSet a;
    public Object b;
    public Set c;
    public /* synthetic */ Object d;
    public final /* synthetic */ w60 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(w60 w60Var, onm onmVar) {
        super(onmVar);
        this.e = w60Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f((List) null, (k2) null, this);
    }
}
