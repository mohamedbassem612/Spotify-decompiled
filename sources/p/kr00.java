package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kr00 {
    public final String a;
    public final h290 b;

    public kr00(String str, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr00)) {
            return false;
        }
        kr00 kr00Var = (kr00) obj;
        return this.a.equals(kr00Var.a) && this.b.equals(kr00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
