package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pib extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ f64 e;
    public Map f;
    public Set g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pib(f64 f64Var, lnm lnmVar) {
        super(lnmVar);
        this.e = f64Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit((Object) null, this);
    }
}
