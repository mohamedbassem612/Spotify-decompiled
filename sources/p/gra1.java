package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gra1 extends onm {
    public vr20 a;
    public rqa1 b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ asa1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gra1(asa1 asa1Var, onm onmVar) {
        super(onmVar);
        this.f = asa1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, null, this);
    }
}
