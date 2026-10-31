package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class om11 {
    public final String a;
    public final String b;

    public om11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om11)) {
            return false;
        }
        om11 om11Var = (om11) obj;
        return this.a.equals(om11Var.a) && this.b.equals(om11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
