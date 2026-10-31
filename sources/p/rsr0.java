package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rsr0 {
    public final String a;
    public final Uri b;
    public final mdg0 c;
    public final tho1 d;
    public final boolean e;

    public rsr0(String str, Uri uri, mdg0 mdg0Var, tho1 tho1Var, boolean z) {
        this.a = str;
        this.b = uri;
        this.c = mdg0Var;
        this.d = tho1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsr0)) {
            return false;
        }
        rsr0 rsr0Var = (rsr0) obj;
        return u890.j(this.a, rsr0Var.a) && u890.j(this.b, rsr0Var.b) && this.c == rsr0Var.c && u890.j(this.d, rsr0Var.d) && this.e == rsr0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + hrt.h(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31);
    }
}
