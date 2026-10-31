package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyp0 {
    public final String a;
    public final String b;

    public cyp0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyp0)) {
            return false;
        }
        cyp0 cyp0Var = (cyp0) obj;
        return this.a.equals(cyp0Var.a) && this.b.equals(cyp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
