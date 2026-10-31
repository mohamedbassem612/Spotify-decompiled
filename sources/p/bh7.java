package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bh7 {
    public final String a;
    public final String b;

    public bh7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh7)) {
            return false;
        }
        bh7 bh7Var = (bh7) obj;
        return this.a.equals(bh7Var.a) && this.b.equals(bh7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
