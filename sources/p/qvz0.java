package p;

import com.ravelin.core.repository.RavelinWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qvz0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ RavelinWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvz0(RavelinWorker ravelinWorker, onm onmVar) {
        super(onmVar);
        this.b = ravelinWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return RavelinWorker.j(this.b, this);
    }
}
