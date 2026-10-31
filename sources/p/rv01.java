package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rv01 extends onm {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xaz0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv01(xaz0 xaz0Var, onm onmVar) {
        super(onmVar);
        this.c = xaz0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l((List) null, this);
    }
}
