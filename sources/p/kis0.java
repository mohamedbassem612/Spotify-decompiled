package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kis0 implements Parcelable {
    public static final Parcelable.Creator<kis0> CREATOR = new bis0((byte) 1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public kis0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kis0)) {
            return false;
        }
        kis0 kis0Var = (kis0) obj;
        return u890.j(this.a, kis0Var.a) && u890.j(this.b, kis0Var.b) && u890.j(this.c, kis0Var.c) && u890.j(this.d, kis0Var.d) && this.e == kis0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
