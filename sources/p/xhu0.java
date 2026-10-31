package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xhu0 extends onm {
    public List a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z2h d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhu0(z2h z2hVar, onm onmVar) {
        super(onmVar);
        this.d = z2hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, this);
    }
}
