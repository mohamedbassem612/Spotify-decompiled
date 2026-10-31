package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class evi1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public evi1(String str, String str2, String str3, String str4, String str5, String str6) {
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
        if (!(obj instanceof evi1)) {
            return false;
        }
        evi1 evi1Var = (evi1) obj;
        return this.a.equals(evi1Var.a) && this.b.equals(evi1Var.b) && this.c.equals(evi1Var.c) && this.d.equals(evi1Var.d) && this.e.equals(evi1Var.e) && this.f.equals(evi1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
