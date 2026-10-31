package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ish1 {
    public final String a;
    public final String b;

    public ish1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ish1)) {
            return false;
        }
        ish1 ish1Var = (ish1) obj;
        return u890.j(this.a, ish1Var.a) && this.b.equals(ish1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
