package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dp11 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kdy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp11(kdy0 kdy0Var, onm onmVar) {
        super(onmVar);
        this.b = kdy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m((String) null, (String) null, (List) null, this, false);
    }
}
