package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fr10 {
    public final String a;
    public final String b;
    public final boolean c;
    public final cy10 d;
    public final Mode e;
    public final String f;
    public final boolean g;

    public /* synthetic */ fr10(String str, String str2, boolean z, Mode mode, String str3, boolean z2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, (cy10) null, (i & 16) != 0 ? Mode.MARTINI : mode, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z2);
    }

    public static fr10 a(fr10 fr10Var, cy10 cy10Var) {
        String str = fr10Var.a;
        String str2 = fr10Var.b;
        boolean z = fr10Var.c;
        Mode mode = fr10Var.e;
        String str3 = fr10Var.f;
        boolean z2 = fr10Var.g;
        fr10Var.getClass();
        return new fr10(str, str2, z, cy10Var, mode, str3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr10)) {
            return false;
        }
        fr10 fr10Var = (fr10) obj;
        return u890.j(this.a, fr10Var.a) && u890.j(this.b, fr10Var.b) && this.c == fr10Var.c && this.d == fr10Var.d && this.e == fr10Var.e && u890.j(this.f, fr10Var.f) && this.g == fr10Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        cy10 cy10Var = this.d;
        return Boolean.hashCode(this.g) + cy30.d((this.e.hashCode() + ((iG + (cy10Var != null ? cy10Var.hashCode() : 0)) * 31)) * 31, 31, this.f);
    }

    public fr10(String str, String str2, boolean z, cy10 cy10Var, Mode mode, String str3, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = cy10Var;
        this.e = mode;
        this.f = str3;
        this.g = z2;
    }
}
