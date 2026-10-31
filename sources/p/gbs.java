package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gbs extends onm {
    public yom0 a;
    public tom0 b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ uwl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbs(uwl uwlVar, onm onmVar) {
        super(onmVar);
        this.f = uwlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, null, null, this);
    }
}
