package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jcc0 implements yum1 {
    public final kjq0 a;

    public jcc0(agc0 agc0Var, kjq0 kjq0Var) {
        this.a = kjq0Var;
    }

    @Override // p.yum1
    public final boolean a(String str) {
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
            return true;
        }
        return nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false);
    }

    @Override // p.yum1
    public final void b(ssi0 ssi0Var) {
        this.a.invoke(ssi0Var);
    }
}
