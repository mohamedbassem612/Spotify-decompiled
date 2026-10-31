package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ieg1 {
    public static final ieg1 c = new ieg1("", 0);
    public final String a;
    public final int b;

    public ieg1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieg1)) {
            return false;
        }
        ieg1 ieg1Var = (ieg1) obj;
        return this.a.equals(ieg1Var.a) && this.b == ieg1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
