package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bu91 {
    public final boolean a;
    public final String b;

    public bu91(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu91)) {
            return false;
        }
        bu91 bu91Var = (bu91) obj;
        return this.a == bu91Var.a && this.b.equals(bu91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
