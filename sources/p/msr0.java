package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class msr0 extends onm {
    public String a;
    public Uri b;
    public mdg0 c;
    public tho1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ nsr0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msr0(nsr0 nsr0Var, onm onmVar) {
        super(onmVar);
        this.f = nsr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(this);
    }
}
