package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ia50 {
    public final String a;
    public final String b;

    public ia50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia50)) {
            return false;
        }
        ia50 ia50Var = (ia50) obj;
        return this.a.equals(ia50Var.a) && this.b.equals(ia50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
