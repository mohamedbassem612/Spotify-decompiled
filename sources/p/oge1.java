package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oge1 {
    public final String a;
    public final char b;

    public oge1(String str, char c) {
        this.a = str;
        this.b = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oge1)) {
            return false;
        }
        oge1 oge1Var = (oge1) obj;
        return this.a.equals(oge1Var.a) && this.b == oge1Var.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
