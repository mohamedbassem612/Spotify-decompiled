package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lib extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ mib e;
    public Set f;
    public Set g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lib(mib mibVar, lnm lnmVar) {
        super(lnmVar);
        this.e = mibVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
