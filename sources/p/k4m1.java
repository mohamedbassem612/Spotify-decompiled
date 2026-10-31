package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k4m1 implements Parcelable {
    public static final Parcelable.Creator<k4m1> CREATOR = new ylk1((byte) 25);
    public final String a;
    public final String b;

    public k4m1(String str, String str2) {
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
        if (!(obj instanceof k4m1)) {
            return false;
        }
        k4m1 k4m1Var = (k4m1) obj;
        return u890.j(this.a, k4m1Var.a) && u890.j(this.b, k4m1Var.b);
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
