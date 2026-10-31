package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ktc1 {
    public final String a;
    public final String b;

    public ktc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktc1)) {
            return false;
        }
        ktc1 ktc1Var = (ktc1) obj;
        return this.a.equals(ktc1Var.a) && this.b.equals(ktc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
