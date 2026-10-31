package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lb81 {
    public final String a;
    public final String b;

    public lb81(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb81)) {
            return false;
        }
        lb81 lb81Var = (lb81) obj;
        return this.a.equals(lb81Var.a) && this.b.equals(lb81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
