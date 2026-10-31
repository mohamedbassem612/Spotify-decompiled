package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yh7 extends onm {
    public List a;
    public a930 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ai7 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh7(ai7 ai7Var, onm onmVar) {
        super(onmVar);
        this.f = ai7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= os00.INVALID_ID;
        return this.f.c(this);
    }
}
