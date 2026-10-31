package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ihi0 implements knt, Parcelable {
    public static final Parcelable.Creator<ihi0> CREATOR = new cyh0((byte) 21);
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public ihi0(int i, String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihi0)) {
            return false;
        }
        ihi0 ihi0Var = (ihi0) obj;
        return u890.j(this.a, ihi0Var.a) && u890.j(this.b, ihi0Var.b) && u890.j(this.c, ihi0Var.c) && this.d == ihi0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeInt(this.d);
    }
}
