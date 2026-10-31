package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xy21 implements rz21 {
    public final String a;
    public final String b;

    public xy21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy21)) {
            return false;
        }
        xy21 xy21Var = (xy21) obj;
        return u890.j(this.a, xy21Var.a) && u890.j(this.b, xy21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
