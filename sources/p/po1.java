package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class po1 extends onm {
    public List a;
    public List b;
    public tlo c;
    public so1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ so1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po1(so1 so1Var, lnm lnmVar) {
        super(lnmVar);
        this.f = so1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.m(this);
    }
}
