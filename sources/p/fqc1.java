package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fqc1 extends onm {
    public Locale a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hqc1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqc1(hqc1 hqc1Var, onm onmVar) {
        super(onmVar);
        this.c = hqc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, this);
    }
}
