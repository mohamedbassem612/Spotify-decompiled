package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jhb extends onm {
    public List a;
    public vgn0 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ phb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhb(phb phbVar, onm onmVar) {
        super(onmVar);
        this.f = phbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
