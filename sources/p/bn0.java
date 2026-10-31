package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bn0 extends z1p1 {
    public final String d;
    public final String e;
    public final String c = "ad_data_missing";
    public final String f = "";

    public bn0(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        return this.c.equals(bn0Var.c) && this.d.equals(bn0Var.d) && u890.j(this.e, bn0Var.e) && this.f.equals(bn0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.c;
    }

    public final String n() {
        return this.f;
    }
}
