package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lha0 extends onm {
    public bcr a;
    public mha0 b;
    public LinkedHashMap c;
    public String d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ mha0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lha0(mha0 mha0Var, faa faaVar) {
        super(faaVar);
        this.g = mha0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c((bcr) null, this);
    }
}
