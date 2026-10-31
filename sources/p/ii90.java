package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ii90 {
    public final String a;
    public final String b;

    public ii90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii90)) {
            return false;
        }
        ii90 ii90Var = (ii90) obj;
        return this.a.equals(ii90Var.a) && this.b.equals(ii90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
