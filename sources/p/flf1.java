package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class flf1 {
    public final String a;
    public final String b;

    public flf1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flf1)) {
            return false;
        }
        flf1 flf1Var = (flf1) obj;
        return this.a.equals(flf1Var.a) && this.b.equals(flf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
