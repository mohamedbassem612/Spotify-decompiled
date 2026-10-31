package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bhi0 {
    public final String a;
    public final String b;

    public bhi0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhi0)) {
            return false;
        }
        bhi0 bhi0Var = (bhi0) obj;
        return this.a.equals(bhi0Var.a) && this.b.equals(bhi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
