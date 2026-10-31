package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z4i1 {
    public final String a;
    public final String b;

    public z4i1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4i1)) {
            return false;
        }
        z4i1 z4i1Var = (z4i1) obj;
        return u890.j(this.a, z4i1Var.a) && u890.j(this.b, z4i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
