package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j6h1 {
    public final String a;
    public final String b;

    public j6h1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6h1)) {
            return false;
        }
        j6h1 j6h1Var = (j6h1) obj;
        return this.a.equals(j6h1Var.a) && this.b.equals(j6h1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
