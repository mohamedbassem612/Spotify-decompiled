package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class snf0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tnf0 c;
    public pdw d;
    public Uri e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snf0(tnf0 tnf0Var, onm onmVar) {
        super(onmVar);
        this.c = tnf0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
