package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class us20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ huz c;
    public vr20 d;
    public Iterator e;
    public int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us20(huz huzVar, lnm lnmVar) {
        super(lnmVar);
        this.c = huzVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect((vr20) null, this);
    }
}
