package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cqc1 extends onm {
    public String a;
    public Locale b;
    public Locale c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hqc1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqc1(hqc1 hqc1Var, onm onmVar) {
        super(onmVar);
        this.e = hqc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
