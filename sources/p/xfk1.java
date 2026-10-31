package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xfk1 implements Parcelable {
    public static final Parcelable.Creator<xfk1> CREATOR = new tfk1((byte) 3);
    public final String a;
    public final String b;

    public xfk1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfk1)) {
            return false;
        }
        xfk1 xfk1Var = (xfk1) obj;
        return u890.j(this.a, xfk1Var.a) && u890.j(this.b, xfk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
