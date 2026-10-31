package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class clb0 extends onm {
    public Context a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fjb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clb0(fjb fjbVar, onm onmVar) {
        super(onmVar);
        this.d = fjbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.j(null, 0, this);
    }
}
