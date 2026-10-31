package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ft20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ iib c;
    public vr20 d;
    public Serializable e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft20(iib iibVar, lnm lnmVar) {
        super(lnmVar);
        this.c = iibVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect((vr20) null, this);
    }
}
