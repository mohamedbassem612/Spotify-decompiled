package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lei1 extends onm {
    public String a;
    public String b;
    public String c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mei1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lei1(mei1 mei1Var, onm onmVar) {
        super(onmVar);
        this.f = mei1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, null, this);
    }
}
