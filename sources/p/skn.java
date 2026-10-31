package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class skn implements xkn {
    public final String a;
    public final String b;
    public final List c;
    public final w4i1 d;
    public final boolean e;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public skn(String str, String str2, List list, w4i1 w4i1Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = w4i1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skn)) {
            return false;
        }
        skn sknVar = (skn) obj;
        return u890.j(this.a, sknVar.a) && u890.j(this.b, sknVar.b) && u890.j(this.c, sknVar.c) && u890.j(this.d, sknVar.d) && this.e == sknVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.e) + ydh.d(this.d, f4i1.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31);
    }
}
