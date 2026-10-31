package p;

import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class brm {
    public final ArrayList a;
    public final w4i1 b;
    public final String c;
    public final String d;
    public final boolean e;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public brm(String str, String str2, ArrayList arrayList, w4i1 w4i1Var, boolean z) {
        this.a = arrayList;
        this.b = w4i1Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brm)) {
            return false;
        }
        brm brmVar = (brm) obj;
        return this.a.equals(brmVar.a) && u890.j(this.b, brmVar.b) && u890.j(this.c, brmVar.c) && u890.j(this.d, brmVar.d) && this.e == brmVar.e;
    }

    public final int hashCode() {
        int iD = cy30.d(ydh.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
