package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v041 extends onm {
    public long a;
    public long b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public ArrayList g;
    public /* synthetic */ Object h;
    public final /* synthetic */ y041 i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v041(y041 y041Var, onm onmVar) {
        super(onmVar);
        this.i = y041Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        return this.i.b(0L, 0L, 0L, false, false, this);
    }
}
