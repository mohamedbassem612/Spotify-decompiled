package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zy3 {
    public final String a;
    public final String b;

    public zy3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy3)) {
            return false;
        }
        zy3 zy3Var = (zy3) obj;
        return this.a.equals(zy3Var.a) && this.b.equals(zy3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
