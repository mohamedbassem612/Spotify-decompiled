package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oip0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ j4p0 c;
    public vr20 d;
    public Iterator e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oip0(j4p0 j4p0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = j4p0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
