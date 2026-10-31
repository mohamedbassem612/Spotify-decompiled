package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bve0 implements jik1 {
    public final bqr0 a;
    public String b;
    public n6r0 c;

    public bve0(bqr0 bqr0Var, agc0 agc0Var) {
        this.a = bqr0Var;
    }

    public final String a(String str) {
        return (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) ? "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ" : str;
    }

    public final lik1 getViewUri() {
        String str = this.b;
        if (str == null) {
            str = this.a.a.b;
        }
        return new lik1(a(str));
    }
}
