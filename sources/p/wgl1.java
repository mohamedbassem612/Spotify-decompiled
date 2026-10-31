package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wgl1 extends onm {
    public List a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ygl1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgl1(ygl1 ygl1Var, onm onmVar) {
        super(onmVar);
        this.d = ygl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
