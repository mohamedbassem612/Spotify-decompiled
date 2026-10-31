package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class toe extends onm {
    public String a;
    public ArrayList b;
    public Set c;
    public /* synthetic */ Object d;
    public final /* synthetic */ uoe e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toe(uoe uoeVar, onm onmVar) {
        super(onmVar);
        this.e = uoeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, null, this);
    }
}
