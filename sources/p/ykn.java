package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ykn {
    public final String a;
    public final t7q0 b;
    public final String c;
    public final List d;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public ykn(String str, t7q0 t7q0Var, String str2, List list) {
        this.a = str;
        this.b = t7q0Var;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykn)) {
            return false;
        }
        ykn yknVar = (ykn) obj;
        return u890.j(this.a, yknVar.a) && u890.j(this.b, yknVar.b) && u890.j(this.c, yknVar.c) && u890.j(this.d, yknVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
