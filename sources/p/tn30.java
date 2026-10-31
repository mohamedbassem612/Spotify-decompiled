package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tn30 {
    public final String a;
    public final String b;

    public tn30(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn30)) {
            return false;
        }
        tn30 tn30Var = (tn30) obj;
        return this.a.equals(tn30Var.a) && this.b.equals(tn30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
