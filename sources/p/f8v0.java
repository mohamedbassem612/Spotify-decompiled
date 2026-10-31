package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f8v0 extends j7p1 {
    public final String c;
    public final String d;

    public f8v0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8v0)) {
            return false;
        }
        f8v0 f8v0Var = (f8v0) obj;
        return this.c.equals(f8v0Var.c) && this.d.equals(f8v0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
