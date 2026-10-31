package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m881 {
    public final String a;
    public final String b;
    public final Uri c;
    public final Integer d;
    public final boolean e;

    public m881(String str, String str2, Uri uri, Integer num, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = num;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m881)) {
            return false;
        }
        m881 m881Var = (m881) obj;
        return u890.j(this.a, m881Var.a) && u890.j(this.b, m881Var.b) && this.c.equals(m881Var.c) && u890.j(this.d, m881Var.d) && this.e == m881Var.e;
    }

    public final int hashCode() {
        int iH = hrt.h(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iH + (num == null ? 0 : num.hashCode())) * 31);
    }
}
