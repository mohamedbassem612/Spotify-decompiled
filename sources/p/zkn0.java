package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zkn0 {
    public final String a;
    public final String b;

    public zkn0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkn0)) {
            return false;
        }
        zkn0 zkn0Var = (zkn0) obj;
        return this.a.equals(zkn0Var.a) && this.b.equals(zkn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
