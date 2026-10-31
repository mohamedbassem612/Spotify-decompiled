package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s6y0 extends onm {
    public int X;
    public String a;
    public tv80 b;
    public h6y0 c;
    public UUID d;
    public m6y0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ u6y0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6y0(u6y0 u6y0Var, onm onmVar) {
        super(onmVar);
        this.t = u6y0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.X |= Integer.MIN_VALUE;
        return this.t.m(null, false, null, false, false, this);
    }
}
