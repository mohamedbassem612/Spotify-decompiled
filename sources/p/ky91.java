package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ky91 extends onm {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ my91 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky91(my91 my91Var, onm onmVar) {
        super(onmVar);
        this.c = my91Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
