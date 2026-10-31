package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fvg extends onm {
    public Context a;
    public List b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ovg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvg(ovg ovgVar, onm onmVar) {
        super(onmVar);
        this.e = ovgVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.k(null, null, 0L, this);
    }
}
