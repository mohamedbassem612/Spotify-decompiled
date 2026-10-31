package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i3n0 {
    public final String a;
    public final String b;

    public i3n0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3n0)) {
            return false;
        }
        i3n0 i3n0Var = (i3n0) obj;
        return u890.j(this.a, i3n0Var.a) && this.b.equals(i3n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
