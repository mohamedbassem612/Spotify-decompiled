package p;

import android.content.res.TypedArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cdc extends onm {
    public TypedArray a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uwg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdc(uwg uwgVar, onm onmVar) {
        super(onmVar);
        this.c = uwgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
