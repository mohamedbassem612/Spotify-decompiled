package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class woj1 extends onm {
    public String a;
    public String b;
    public Uri c;
    public long d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vi11 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woj1(vi11 vi11Var, onm onmVar) {
        super(onmVar);
        this.h = vi11Var;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        Object objY = this.h.y(null, null, null, 0L, this);
        return objY == d9n.a ? objY : new e331(objY);
    }
}
