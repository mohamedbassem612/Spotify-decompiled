package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sbs extends onm {
    public List a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pbq d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbs(pbq pbqVar, onm onmVar) {
        super(onmVar);
        this.d = pbqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.n0(null, null, this, null);
    }
}
