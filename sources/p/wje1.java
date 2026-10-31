package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wje1 extends onm {
    public Intent a;
    public boolean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yje1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wje1(yje1 yje1Var, onm onmVar) {
        super(onmVar);
        this.e = yje1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(null, null, false, this);
    }
}
