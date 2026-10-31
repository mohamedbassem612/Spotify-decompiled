package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v211 implements pd51 {
    public final d8r0 a;
    public final c380 b;

    public v211(d8r0 d8r0Var, c380 c380Var) {
        this.a = d8r0Var;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v211)) {
            return false;
        }
        v211 v211Var = (v211) obj;
        return this.a.equals(v211Var.a) && u890.j(this.b, v211Var.b);
    }

    @Override // p.pd51
    public final String getId() {
        return "recommended-searches";
    }

    public final int hashCode() {
        return this.b.hashCode() + hrt.i(this.a, 1609117048, 31);
    }
}
