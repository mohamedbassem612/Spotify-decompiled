package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eqc1 extends onm {
    public String a;
    public Locale b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hqc1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqc1(hqc1 hqc1Var, onm onmVar) {
        super(onmVar);
        this.d = hqc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, this);
    }
}
