package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rro extends onm {
    public int X;
    public String a;
    public String b;
    public String c;
    public zuc0 d;
    public zuc0 e;
    public zuc0 f;
    public Map g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ sro t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rro(sro sroVar, onm onmVar) {
        super(onmVar);
        this.t = sroVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.X |= Integer.MIN_VALUE;
        return this.t.d(null, null, null, null, this);
    }
}
