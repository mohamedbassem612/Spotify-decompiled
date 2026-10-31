package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oki0 extends hso1 {
    public final String b;
    public final boolean c;

    public oki0(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oki0)) {
            return false;
        }
        oki0 oki0Var = (oki0) obj;
        return u890.j(this.b, oki0Var.b) && this.c == oki0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
