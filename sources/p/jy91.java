package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jy91 extends onm {
    public List a;
    public mif1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ my91 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy91(my91 my91Var, onm onmVar) {
        super(onmVar);
        this.d = my91Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
