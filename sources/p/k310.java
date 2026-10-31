package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k310 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final Double f;
    public final String g;
    public final boolean h;

    public k310(boolean z, String str, String str2, String str3, Uri uri, Double d, String str4, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = uri;
        this.f = d;
        this.g = str4;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k310)) {
            return false;
        }
        k310 k310Var = (k310) obj;
        return this.a == k310Var.a && u890.j(this.b, k310Var.b) && this.c.equals(k310Var.c) && u890.j(this.d, k310Var.d) && u890.j(this.e, k310Var.e) && u890.j(this.f, k310Var.f) && u890.j(this.g, k310Var.g) && this.h == k310Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.e;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Double d = this.f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
