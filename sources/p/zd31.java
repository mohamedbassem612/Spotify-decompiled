package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zd31 extends onm {
    public kp1 a;
    public Iterator b;
    public String c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ nt21 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd31(nt21 nt21Var, onm onmVar) {
        super(onmVar);
        this.f = nt21Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
