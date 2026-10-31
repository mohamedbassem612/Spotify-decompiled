package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class la90 implements na90 {
    public final String a;
    public final String b;

    public la90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la90)) {
            return false;
        }
        la90 la90Var = (la90) obj;
        return this.a.equals(la90Var.a) && this.b.equals(la90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
