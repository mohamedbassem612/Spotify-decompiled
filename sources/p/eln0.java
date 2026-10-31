package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eln0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public eln0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eln0)) {
            return false;
        }
        eln0 eln0Var = (eln0) obj;
        return this.a.equals(eln0Var.a) && this.b.equals(eln0Var.b) && this.c.equals(eln0Var.c) && this.d.equals(eln0Var.d) && this.e.equals(eln0Var.e) && this.f.equals(eln0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
