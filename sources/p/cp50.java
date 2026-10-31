package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cp50 {
    public final String a;
    public final String b;

    public cp50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp50)) {
            return false;
        }
        cp50 cp50Var = (cp50) obj;
        return this.a.equals(cp50Var.a) && this.b.equals(cp50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
