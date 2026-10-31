package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jn1 extends onm {
    public String a;
    public String b;
    public Serializable c;
    public /* synthetic */ Object d;
    public final /* synthetic */ mn1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn1(mn1 mn1Var, onm onmVar) {
        super(onmVar);
        this.e = mn1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((String) null, this);
    }
}
