package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yut extends onm {
    public boolean a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bvt e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yut(bvt bvtVar, lnm lnmVar) {
        super(lnmVar);
        this.e = bvtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(false, this);
    }
}
