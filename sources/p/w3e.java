package p;

import com.google.protobuf.BytesValue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w3e extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a4e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3e(a4e a4eVar, onm onmVar) {
        super(onmVar);
        this.b = a4eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e((BytesValue) null, this);
    }
}
