package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aje extends onm {
    public d0r a;
    public String b;
    public Iterator c;
    public ahe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mje f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aje(mje mjeVar, onm onmVar) {
        super(onmVar);
        this.f = mjeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, null, null, this);
    }
}
