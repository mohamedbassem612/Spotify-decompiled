package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hhc0 {
    public final String a;
    public final String b;

    public hhc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhc0)) {
            return false;
        }
        hhc0 hhc0Var = (hhc0) obj;
        return this.a.equals(hhc0Var.a) && this.b.equals(hhc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
