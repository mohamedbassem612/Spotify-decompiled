package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ua60 {
    public final String a;
    public final String b;

    public ua60(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua60)) {
            return false;
        }
        ua60 ua60Var = (ua60) obj;
        return this.a.equals(ua60Var.a) && this.b.equals(ua60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
