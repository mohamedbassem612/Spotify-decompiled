package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bo90 extends bgg1 {
    public final /* synthetic */ su30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo90(Iterator it, su30 su30Var) {
        super(it, (byte) 0);
        this.c = su30Var;
    }

    @Override // p.bgg1
    public final Object a(Object obj) {
        return this.c.apply(obj);
    }
}
