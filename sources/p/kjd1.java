package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kjd1 implements tjd1 {
    public final String a;
    public final int b;

    public kjd1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjd1)) {
            return false;
        }
        kjd1 kjd1Var = (kjd1) obj;
        return u890.j(this.a, kjd1Var.a) && this.b == kjd1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
