package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tzk extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ g4c e;
    public List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzk(g4c g4cVar, lnm lnmVar) {
        super(lnmVar);
        this.e = g4cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= os00.INVALID_ID;
        return this.e.emit(null, this);
    }
}
