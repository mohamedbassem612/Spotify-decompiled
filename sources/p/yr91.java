package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yr91 {
    public final String a;
    public final int b;

    public yr91(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yr91.class != obj.getClass()) {
            return false;
        }
        yr91 yr91Var = (yr91) obj;
        return u890.j(this.a, yr91Var.a) && this.b == yr91Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + xcg1.g(this.a.hashCode() * 961, 31, false);
    }
}
