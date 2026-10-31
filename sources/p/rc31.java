package p;

import io.reactivex.rxjava3.subjects.SingleSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rc31 extends onm {
    public int a;
    public iu30 b;
    public iu30 c;
    public Function0 d;
    public SingleSubject e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tc31 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc31(tc31 tc31Var, onm onmVar) {
        super(onmVar);
        this.g = tc31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(0, null, null, null, this);
    }
}
