package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ynl1 extends onm {
    public boolean a;
    public String b;
    public List c;
    public String d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ znl1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynl1(znl1 znl1Var, onm onmVar) {
        super(onmVar);
        this.g = znl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d((String) null, this, false);
    }
}
