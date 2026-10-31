package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lrp0 implements Parcelable {
    public static final Parcelable.Creator<lrp0> CREATOR = new ump0((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public lrp0(boolean z, boolean z2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrp0)) {
            return false;
        }
        lrp0 lrp0Var = (lrp0) obj;
        return u890.j(this.a, lrp0Var.a) && u890.j(this.b, lrp0Var.b) && u890.j(this.c, lrp0Var.c) && this.d == lrp0Var.d && this.e == lrp0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
