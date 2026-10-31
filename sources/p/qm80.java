package p;

import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qm80 {
    public final String a;
    public final ArrayList b;
    public final String c;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public qm80(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm80)) {
            return false;
        }
        qm80 qm80Var = (qm80) obj;
        return u890.j(this.a, qm80Var.a) && this.b.equals(qm80Var.b) && u890.j(this.c, qm80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
