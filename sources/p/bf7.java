package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bf7 extends iqo1 {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final tv80 h;

    public bf7(String str, String str2, String str3, String str4, tv80 tv80Var) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf7)) {
            return false;
        }
        bf7 bf7Var = (bf7) obj;
        return u890.j(this.d, bf7Var.d) && u890.j(this.e, bf7Var.e) && u890.j(this.f, bf7Var.f) && u890.j(this.g, bf7Var.g) && u890.j(this.h, bf7Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.d(cy30.d(cy30.d(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
