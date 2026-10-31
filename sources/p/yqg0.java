package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yqg0 {
    public final String a;
    public final int b;

    public yqg0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqg0)) {
            return false;
        }
        yqg0 yqg0Var = (yqg0) obj;
        return this.a.equals(yqg0Var.a) && this.b == yqg0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
