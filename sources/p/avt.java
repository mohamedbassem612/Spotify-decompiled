package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class avt extends onm {
    public hab0 a;
    public xgn0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bvt d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avt(bvt bvtVar, onm onmVar) {
        super(onmVar);
        this.d = bvtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d((Function0) null, this);
    }
}
