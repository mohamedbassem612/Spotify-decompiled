package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f8k {
    public final String a;
    public final String b;

    public f8k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8k)) {
            return false;
        }
        f8k f8kVar = (f8k) obj;
        return this.a.equals(f8kVar.a) && this.b.equals(f8kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
