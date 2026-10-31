package p;

import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pt2 extends onm {
    public long a;
    public TimeZone b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qt2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt2(qt2 qt2Var, onm onmVar) {
        super(onmVar);
        this.d = qt2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
