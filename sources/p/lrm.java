package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lrm implements nrm {
    public final w4i1 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public lrm(String str, String str2, List list, w4i1 w4i1Var, boolean z) {
        this.a = w4i1Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
    }

    @Override // p.nrm
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrm)) {
            return false;
        }
        lrm lrmVar = (lrm) obj;
        return u890.j(this.a, lrmVar.a) && u890.j(this.b, lrmVar.b) && u890.j(this.c, lrmVar.c) && this.d == lrmVar.d && this.e.equals(lrmVar.e);
    }

    @Override // p.nrm
    public final w4i1 getSender() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // p.nrm
    public final String y() {
        return this.c;
    }

    @Override // p.nrm
    public final boolean z() {
        return this.d;
    }
}
