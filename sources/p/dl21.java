package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dl21 implements chu {
    public final String a;
    public final co0 b;

    public dl21(String str, co0 co0Var) {
        this.a = str;
        this.b = co0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl21)) {
            return false;
        }
        dl21 dl21Var = (dl21) obj;
        return u890.j(this.a, dl21Var.a) && this.b == dl21Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
