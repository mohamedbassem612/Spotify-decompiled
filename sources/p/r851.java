package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r851 extends s851 {
    public static final Parcelable.Creator<r851> CREATOR = new uo41((byte) 18);
    public final xo20 a;
    public final String b;
    public final k651 c;
    public final boolean d;
    public final List e;

    public r851(xo20 xo20Var, String str, k651 k651Var, boolean z, List list) {
        this.a = xo20Var;
        this.b = str;
        this.c = k651Var;
        this.d = z;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r851)) {
            return false;
        }
        r851 r851Var = (r851) obj;
        return u890.j(this.a, r851Var.a) && u890.j(this.b, r851Var.b) && u890.j(this.c, r851Var.c) && this.d == r851Var.d && u890.j(this.e, r851Var.e);
    }

    public final int hashCode() {
        xo20 xo20Var = this.a;
        int iG = xcg1.g((this.c.hashCode() + cy30.d((xo20Var == null ? 0 : xo20Var.hashCode()) * 31, 31, this.b)) * 31, 31, this.d);
        List list = this.e;
        return iG + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeStringList(this.e);
    }
}
