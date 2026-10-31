package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kee extends onm {
    public tvv a;
    public List b;
    public fta c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fta f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kee(fta ftaVar, onm onmVar) {
        super(onmVar);
        this.f = ftaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.p(null, this);
    }
}
