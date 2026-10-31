package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class maf extends onm {
    public em0 a;
    public LinkedHashMap b;
    public /* synthetic */ Object c;
    public final /* synthetic */ em0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maf(em0 em0Var, onm onmVar) {
        super(onmVar);
        this.d = em0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.U((String) null, (ArrayList) null, this);
    }
}
