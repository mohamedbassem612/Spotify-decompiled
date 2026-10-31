package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f640 {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final String e;
    public final String f;

    public f640(Uri uri, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f640)) {
            return false;
        }
        f640 f640Var = (f640) obj;
        return u890.j(this.a, f640Var.a) && u890.j(this.b, f640Var.b) && u890.j(this.c, f640Var.c) && u890.j(this.d, f640Var.d) && u890.j(this.e, f640Var.e) && u890.j(this.f, f640Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Uri uri = this.d;
        return this.f.hashCode() + cy30.d((iD + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.e);
    }
}
