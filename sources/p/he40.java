package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class he40 implements ie40 {
    public final String a;
    public final String b;

    public he40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he40)) {
            return false;
        }
        he40 he40Var = (he40) obj;
        return u890.j(this.a, he40Var.a) && u890.j(this.b, he40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + cy30.d(l1d.C(2) * 31, 31, this.a);
    }
}
