package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pl10 extends u9 {
    public static final Parcelable.Creator<pl10> CREATOR = new e9n1((byte) 28);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public pl10(int i, long j, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pl10) {
            pl10 pl10Var = (pl10) obj;
            if (k8p1.h(this.a, pl10Var.a) && j() == pl10Var.j() && this.d == pl10Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{this.a, Long.valueOf(j()), Boolean.valueOf(this.d)});
    }

    public final long j() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final String toString() {
        drj0 drj0VarR = k8p1.r(this);
        drj0VarR.d(this.a, "name");
        drj0VarR.d(Long.valueOf(j()), "version");
        drj0VarR.d(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return drj0VarR.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.F(parcel, 1, this.a);
        j541.z(parcel, 2, this.b);
        j541.C(parcel, 3, j());
        j541.s(parcel, 4, this.d);
        j541.n(iJ, parcel);
    }

    public pl10(String str, long j) {
        this(-1, j, str, false);
    }
}
