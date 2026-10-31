package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kjb0 implements e9j1 {
    public final saj1 a;
    public final String b;

    public kjb0(saj1 saj1Var, String str) {
        this.a = saj1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjb0)) {
            return false;
        }
        kjb0 kjb0Var = (kjb0) obj;
        return this.a.equals(kjb0Var.a) && this.b.equals(kjb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
