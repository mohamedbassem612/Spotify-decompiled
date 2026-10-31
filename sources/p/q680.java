package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q680 extends onm {
    public Intent a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ s680 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q680(s680 s680Var, onm onmVar) {
        super(onmVar);
        this.e = s680Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c((Intent) null, (String) null, (String) null, this);
    }
}
