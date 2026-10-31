package p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jq71 {
    public final Uri a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final boolean f;
    public final List g;

    public jq71(Uri uri, Integer num, Integer num2, String str, String str2, boolean z, List list) {
        this.a = uri;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = list;
    }

    public final String a() {
        String str = this.e;
        String str2 = this.d;
        if (str2 == null || str == null) {
            return str2 != null ? str2 : str;
        }
        return xcg1.i(str2, "\n", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq71)) {
            return false;
        }
        jq71 jq71Var = (jq71) obj;
        return this.a.equals(jq71Var.a) && u890.j(this.b, jq71Var.b) && u890.j(this.c, jq71Var.c) && u890.j(this.d, jq71Var.d) && u890.j(this.e, jq71Var.e) && this.f == jq71Var.f && u890.j(this.g, jq71Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.g.hashCode() + xcg1.g((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f);
    }
}
