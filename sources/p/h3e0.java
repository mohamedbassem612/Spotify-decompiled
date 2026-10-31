package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h3e0 implements j3e0 {
    public final String a;
    public final String b;

    public h3e0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3e0)) {
            return false;
        }
        h3e0 h3e0Var = (h3e0) obj;
        return this.a.equals(h3e0Var.a) && this.b.equals(h3e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
