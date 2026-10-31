package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ec81 {
    public final String a;
    public final String b;

    public ec81(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec81)) {
            return false;
        }
        ec81 ec81Var = (ec81) obj;
        return this.a.equals(ec81Var.a) && this.b.equals(ec81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
