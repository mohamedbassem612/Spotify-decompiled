package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ufm0 {
    public final String a;
    public final String b;

    public ufm0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufm0)) {
            return false;
        }
        ufm0 ufm0Var = (ufm0) obj;
        return this.a.equals(ufm0Var.a) && this.b.equals(ufm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
