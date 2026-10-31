package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nje1 implements oje1 {
    public final String a;
    public final String b;

    public nje1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nje1)) {
            return false;
        }
        nje1 nje1Var = (nje1) obj;
        return this.a.equals(nje1Var.a) && this.b.equals(nje1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
