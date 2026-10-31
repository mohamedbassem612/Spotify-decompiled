package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yx8 extends onm {
    public vr20 a;
    public Object b;
    public Object c;
    public Serializable d;
    public Object e;
    public o8n f;
    public bpb1 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ay8 i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx8(ay8 ay8Var, lnm lnmVar) {
        super(lnmVar);
        this.i = ay8Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        this.i.collect(null, this);
        return d9n.a;
    }
}
