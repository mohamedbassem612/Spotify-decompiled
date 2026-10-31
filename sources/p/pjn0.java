package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pjn0 extends qjn0 {
    public final String a;
    public final boolean b;

    public pjn0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjn0)) {
            return false;
        }
        pjn0 pjn0Var = (pjn0) obj;
        return u890.j(this.a, pjn0Var.a) && this.b == pjn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
