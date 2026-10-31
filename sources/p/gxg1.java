package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gxg1 extends onm {
    public ArrayList a;
    public Map b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kxg1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxg1(kxg1 kxg1Var, onm onmVar) {
        super(onmVar);
        this.d = kxg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
