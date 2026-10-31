package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sok1 extends onm {
    public String a;
    public String b;
    public String c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ wok1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sok1(wok1 wok1Var, onm onmVar) {
        super(onmVar);
        this.f = wok1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.g(this);
    }
}
