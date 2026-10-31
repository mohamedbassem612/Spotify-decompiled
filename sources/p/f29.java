package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f29 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final rm5 f;

    public f29(String str, String str2, String str3, String str4, int i, rm5 rm5Var) {
        if (str == null) {
            bhn0.i("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            bhn0.i("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            bhn0.i("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            bhn0.i("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = rm5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f29) {
            f29 f29Var = (f29) obj;
            return this.a.equals(f29Var.a) && this.b.equals(f29Var.b) && this.c.equals(f29Var.c) && this.d.equals(f29Var.d) && this.e == f29Var.e && this.f == f29Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
