package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uzk extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ z2h b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzk(z2h z2hVar, onm onmVar) {
        super(onmVar);
        this.b = z2hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.d((ArrayList) null, this);
    }
}
