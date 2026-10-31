package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j4s0 implements Parcelable {
    public static final Parcelable.Creator<j4s0> CREATOR = new zsr0((byte) 16);
    public final String a;
    public final String b;

    public j4s0(String str, String str2) {
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
        if (!(obj instanceof j4s0)) {
            return false;
        }
        j4s0 j4s0Var = (j4s0) obj;
        return u890.j(this.a, j4s0Var.a) && u890.j(this.b, j4s0Var.b);
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
