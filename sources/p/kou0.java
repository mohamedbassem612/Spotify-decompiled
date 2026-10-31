package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kou0 {
    public final String a;
    public final String b;

    public kou0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kou0)) {
            return false;
        }
        kou0 kou0Var = (kou0) obj;
        return this.a.equals(kou0Var.a) && this.b.equals(kou0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
