package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tfu0 extends ei90 {
    public static final Parcelable.Creator<tfu0> CREATOR = new brt0((byte) 16);
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public tfu0(boolean z, boolean z2, List list, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfu0)) {
            return false;
        }
        tfu0 tfu0Var = (tfu0) obj;
        return this.a == tfu0Var.a && this.b == tfu0Var.b && this.c.equals(tfu0Var.c) && this.d == tfu0Var.d && this.e == tfu0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(f4i1.b(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeStringList(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
