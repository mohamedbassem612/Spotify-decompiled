package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rut extends onm {
    public hab0 a;
    public xgn0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sut d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rut(sut sutVar, onm onmVar) {
        super(onmVar);
        this.d = sutVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i((Function0) null, this);
    }
}
