package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kf9 implements pf9 {
    public final String a;
    public final int b;

    public kf9(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf9)) {
            return false;
        }
        kf9 kf9Var = (kf9) obj;
        return this.a.equals(kf9Var.a) && this.b == kf9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
