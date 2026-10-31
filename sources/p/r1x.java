package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r1x extends onm {
    public ruw a;
    public ju0 b;
    public String c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ z1x f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1x(z1x z1xVar, onm onmVar) {
        super(onmVar);
        this.f = z1xVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= os00.INVALID_ID;
        return this.f.a(null, null, this);
    }
}
