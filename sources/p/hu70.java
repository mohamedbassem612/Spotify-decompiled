package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hu70 extends iu70 {
    public final au70 a;
    public final String b;

    public hu70(au70 au70Var, String str) {
        this.a = au70Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu70)) {
            return false;
        }
        hu70 hu70Var = (hu70) obj;
        return u890.j(this.a, hu70Var.a) && u890.j(this.b, hu70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
