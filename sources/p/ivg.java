package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ivg extends onm {
    public final /* synthetic */ ovg X;
    public int Y;
    public Context a;
    public List b;
    public Long c;
    public Object d;
    public uug e;
    public long f;
    public long g;
    public int h;
    public int i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivg(ovg ovgVar, onm onmVar) {
        super(onmVar);
        this.X = ovgVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.d(null, null, null, this);
    }
}
