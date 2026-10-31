package p;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class voh0 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String str = zoi1.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public voh0(av7 av7Var) {
        this.a = (Uri) av7Var.c;
        this.b = (String) av7Var.d;
        this.c = (String) av7Var.e;
        this.d = av7Var.a;
        this.e = av7Var.b;
        this.f = (String) av7Var.f;
        this.g = (String) av7Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voh0)) {
            return false;
        }
        voh0 voh0Var = (voh0) obj;
        return this.a.equals(voh0Var.a) && Objects.equals(this.b, voh0Var.b) && Objects.equals(this.c, voh0Var.c) && this.d == voh0Var.d && this.e == voh0Var.e && Objects.equals(this.f, voh0Var.f) && Objects.equals(this.g, voh0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
