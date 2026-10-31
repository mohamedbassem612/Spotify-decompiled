package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rjj1 implements uz3 {
    public final /* synthetic */ wao0 a;
    public final /* synthetic */ hce1 b;
    public final /* synthetic */ m0u0 c;

    public rjj1(wao0 wao0Var, hce1 hce1Var, m0u0 m0u0Var) {
        this.a = wao0Var;
        this.b = hce1Var;
        this.c = m0u0Var;
    }

    public final void c(String str) {
        this.a.invoke(new qjj1(this.b, this.c, str, (byte) 1));
    }

    public final void e(String str) {
        this.a.invoke(new qjj1(this.b, this.c, str, (byte) 0));
    }
}
