package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pbs extends onm {
    public String a;
    public ArrayList b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pbq d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbs(pbq pbqVar, onm onmVar) {
        super(onmVar);
        this.d = pbqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.p(null, null, null, this);
    }
}
