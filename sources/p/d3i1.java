package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d3i1 extends onm {
    public vf01 a;
    public p811 b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ e3i1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3i1(e3i1 e3i1Var, onm onmVar) {
        super(onmVar);
        this.f = e3i1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((vf01) null, this);
    }
}
