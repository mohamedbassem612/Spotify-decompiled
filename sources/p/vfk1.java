package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vfk1 implements Parcelable {
    public static final Parcelable.Creator<vfk1> CREATOR = new tfk1((byte) 1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public vfk1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfk1)) {
            return false;
        }
        vfk1 vfk1Var = (vfk1) obj;
        return u890.j(this.a, vfk1Var.a) && u890.j(this.b, vfk1Var.b) && u890.j(this.c, vfk1Var.c) && u890.j(this.d, vfk1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
