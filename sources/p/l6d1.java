package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l6d1 extends z1p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public l6d1(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = f4i1.f("Request to ", str, " failed is survey disabled.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6d1)) {
            return false;
        }
        l6d1 l6d1Var = (l6d1) obj;
        return u890.j(this.c, l6d1Var.c) && u890.j(this.d, l6d1Var.d) && u890.j(this.e, l6d1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return "surveyAdFeatureDisabled";
    }

    public final String n() {
        return this.c;
    }

    public final String o() {
        return this.e;
    }
}
