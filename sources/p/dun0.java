package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dun0 extends onm {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ eun0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dun0(eun0 eun0Var, lnm lnmVar) {
        super(lnmVar);
        this.d = eun0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
