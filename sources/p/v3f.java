package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v3f extends onm {
    public String a;
    public String b;
    public Serializable c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ w3f f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3f(w3f w3fVar, onm onmVar) {
        super(onmVar);
        this.f = w3fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0, null, this);
    }
}
