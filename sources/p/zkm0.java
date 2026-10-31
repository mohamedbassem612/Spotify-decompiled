package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zkm0 {
    public final String a;
    public final int b;

    public zkm0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkm0)) {
            return false;
        }
        zkm0 zkm0Var = (zkm0) obj;
        return u890.j(this.a, zkm0Var.a) && this.b == zkm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
