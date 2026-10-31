package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a1x0 extends onm {
    public ArrayList a;
    public LinkedHashMap b;
    public /* synthetic */ Object c;
    public final /* synthetic */ utw0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1x0(utw0 utw0Var, onm onmVar) {
        super(onmVar);
        this.d = utw0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.p((List) null, this);
    }
}
