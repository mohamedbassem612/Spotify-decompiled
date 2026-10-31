package p;

import android.content.ComponentName;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jtc extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ktc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtc(ktc ktcVar, onm onmVar) {
        super(onmVar);
        this.c = ktcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((ComponentName) null, this);
    }
}
