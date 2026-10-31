package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ky1 {
    public final String a;
    public final String b = "";

    public ky1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky1)) {
            return false;
        }
        ky1 ky1Var = (ky1) obj;
        return this.a.equals(ky1Var.a) && this.b.equals(ky1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
