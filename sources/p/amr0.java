package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class amr0 {
    public final String a;
    public final String b;

    public amr0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amr0)) {
            return false;
        }
        amr0 amr0Var = (amr0) obj;
        return this.a.equals(amr0Var.a) && this.b.equals(amr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
