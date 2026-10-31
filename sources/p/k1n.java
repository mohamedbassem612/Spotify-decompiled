package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k1n extends onm {
    public String a;
    public LinkedHashSet b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a2n d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1n(a2n a2nVar, onm onmVar) {
        super(onmVar);
        this.d = a2nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.E((String) null, this);
    }
}
