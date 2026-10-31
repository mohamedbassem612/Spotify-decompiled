package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ap0 {
    public final int a;
    public final String b;

    public ap0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap0)) {
            return false;
        }
        ap0 ap0Var = (ap0) obj;
        return this.a == ap0Var.a && this.b.equals(ap0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
