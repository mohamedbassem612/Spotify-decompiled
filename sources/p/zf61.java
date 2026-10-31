package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zf61 extends onm {
    public bg61 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bg61 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf61(bg61 bg61Var, onm onmVar) {
        super(onmVar);
        this.d = bg61Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((Context) null, (String) null, this);
    }
}
